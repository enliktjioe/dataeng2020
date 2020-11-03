package ee.ut.cs.dsg.lt02007.kafka.task1;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.IntegerDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


public class Task1B {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your Configuration Code Here
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
                ConsumerRecords<Integer, Integer> poll = consumer.poll(Duration.ofMillis(10));

                poll.forEach(record ->
                {
                    ConsumerRecord<Integer, Integer> record1 = record;

                    System.out.printf("offset = %s, key = %s, value = %s\n",
                            record1.offset(), record1.key(), record1.value());
                });


            }
        } finally {
            //TODO close the consumer
            consumer.close();
        }
    }

}
