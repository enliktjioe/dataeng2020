package ee.ut.cs.dsg.lt02007.kafka.task2;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;

import java.util.Arrays;
import java.util.Properties;

// Total number of people Per Floor
//keep the local count of people on each floor. Floor are uniquely identified by building and floor number.
public class Task2B {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your Configuration Code Here
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);

        props.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer1");
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);


        // TODO: Consumer code here
        Consumer<Integer, Integer> consumer = new KafkaConsumer<>(props);

        // TODO: Subscribe to the topic
        consumer.subscribe(Arrays.asList("obs"));


        try {
            for (int i = 0; i < 1000; i++) {
                //TODO consuming code here


            }
        } finally {
            //TODO close the consumer
            consumer.close();
        }
    }

}
