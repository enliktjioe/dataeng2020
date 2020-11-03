package ee.ut.cs.dsg.lt02007.kafka.task2;


import ee.ut.cs.dsg.lt02007.kafka.task1.Task1A;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


public class Task2A {
    private String OBS = "obs.csv";

    public void createProducer() throws InterruptedException, IOException {
        Properties pprops = new Properties();
        pprops.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your Producer Configuration Code Here
        pprops.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        pprops.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);

        String file = Task1A.class.getClassLoader().getResource(OBS).getPath();

        System.out.println(file);



        Properties cprops = new Properties();
        cprops.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your consumer Configuration Code Here
        cprops.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer1");
        cprops.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        cprops.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        cprops.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        cprops.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        cprops.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);


        //TODO  Your producer Code Here
        KafkaProducer<Integer, Integer> producer = new KafkaProducer<>(pprops);

        //TODO  Your consumer Code Here
        Consumer<Integer, Integer> consumer = new KafkaConsumer<>(pprops);
        consumer.subscribe(Arrays.asList("obs"));


        try {
            for (int i = 0; i < 1000; i++) {
                //TODO consuming and producing code here
                ProducerRecord<Integer, Integer> record = new ProducerRecord<>("obs", i, i);
                producer.send(record);
                System.out.printf("key = %d, value = %d\n", i, i);

                Thread.sleep(5000);

                ConsumerRecords<Integer, Integer> poll = consumer.poll(Duration.ofMillis(10));

                poll.forEach(record0 ->
                {
                    ConsumerRecord<Integer, Integer> record1 = record0;

                    System.out.printf("offset = %s, key = %s, value = %s\n",
                            record1.offset(), record1.key(), record1.value());
                });
            }
        } finally {
            //TODO close the consumer
            consumer.close();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Task2A helloProducer = new Task2A();
        helloProducer.createProducer();
    }
}
