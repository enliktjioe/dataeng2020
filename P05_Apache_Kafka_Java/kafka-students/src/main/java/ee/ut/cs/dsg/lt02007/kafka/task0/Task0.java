package ee.ut.cs.dsg.lt02007.kafka.task0;

import org.apache.kafka.clients.admin.*;
import org.apache.kafka.common.KafkaFuture;
import org.apache.kafka.common.config.ConfigResource;
import org.apache.kafka.common.config.TopicConfig;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Task0 {

    public static String TOPIC1p = "topic1p";
    public static String TOPIC2p = "topic2p";
    public static List<String> TOPIC_LIST;//TODO topics here

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //First we need to initialize Kafka properties
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "kafka1:9092;kafka2:9093");
        properties.put("client.id", "java-admin-client");

        //TODO Create Admin Client
        AdminClient client = AdminClient.create(properties);

        //TODO List Topics
        ListTopicsResult topics = client.listTopics();
        KafkaFuture<Set<String>> names = topics.names();
        Set<String> strings = names.get();
        strings.forEach(System.out::println);

        //TODO CREATE TOPICS
        //TODO: TOPIC 1P
        NewTopic topic1p = new NewTopic(TOPIC1p, 1, (short) 1);

        client.createTopics(Collections.singletonList(topic1p));
        DescribeTopicsResult res1 = client.describeTopics(Collections.singletonList(TOPIC1p));

        TopicDescription topicDescription = res1.values().get(TOPIC1p).get();

        System.out.println(("Name = " + topicDescription.name()));
        System.out.println("Partitions = " + topicDescription.partitions().size());

        //TODO: TOPIC 2P
        NewTopic topic2p = new NewTopic(TOPIC2p, 2, (short) 1);

        client.createTopics(Collections.singletonList(topic2p));
        DescribeTopicsResult res2 = client.describeTopics(Collections.singletonList(TOPIC2p));

        topicDescription = res2.values().get(TOPIC2p).get();

        System.out.println(("Name = " + topicDescription.name()));
        System.out.println("Partitions = " + topicDescription.partitions().size());

        //TODO Alter Topic

        //TODO Add partition to topic 1p
        Map<String, NewPartitions> newPartitions = new HashMap<>();
        newPartitions.put(TOPIC1p, NewPartitions.increaseTo(2));

        client.createPartitions(newPartitions);
        res1 = client.describeTopics(Collections.singletonList(TOPIC1p));
        topicDescription = res1.values().get(TOPIC1p).get();

        System.out.println("Name = " + topicDescription.name());
        System.out.println("Partitions = " + topicDescription.partitions().size());

        //TODO Make topic 1p compacted

        ConfigResource configResource = new ConfigResource(ConfigResource.Type.TOPIC, TOPIC1p);
        DescribeConfigsResult configsResult = client.describeConfigs(Collections.singletonList(configResource));
        Config configs = configsResult.all().get().get(configResource);

        // print non-default configs
        configs.entries().stream().filter(
                entry -> !entry.isDefault()).forEach(System.out::println);

        //TODO create config entry
        ConfigEntry compaction =
                new ConfigEntry(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_COMPACT);

        List<AlterConfigOp> alterConfigOps = new ArrayList<>();
        alterConfigOps.add(new AlterConfigOp(compaction, AlterConfigOp.OpType.SET));

        Map<ConfigResource, Collection<AlterConfigOp>> alterConfigs = new HashMap<>();

        alterConfigs.put(configResource, alterConfigOps);

        client.incrementalAlterConfigs(alterConfigs).all().get();

        configsResult = client.describeConfigs(Collections.singletonList(configResource));
        configs = configsResult.all().get().get(configResource);

        // print non-default configs
        configs.entries().stream().filter(
                entry -> !entry.isDefault()).forEach(System.out::println);

        System.out.println("Name = " + topicDescription.name());
        System.out.println("Partitions = " + topicDescription.partitions().size());
//        System.out.println("Compactions = " + topicDescription);


        //TODO TOPIC deletion

        client.deleteTopics(TOPIC_LIST).all().get();

        DescribeTopicsResult topics2 = client.describeTopics(TOPIC_LIST);
        topics2.values().forEach((s, descr) -> System.out.println(s));
    }

}

