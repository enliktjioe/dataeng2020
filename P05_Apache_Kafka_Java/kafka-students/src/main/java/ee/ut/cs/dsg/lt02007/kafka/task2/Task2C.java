package ee.ut.cs.dsg.lt02007.kafka.task2;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//Let's save the aggregated result in a topic and progress from there.

public class Task2C {

    public void createProducer() throws InterruptedException, IOException {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your Producer Configuration Code Here
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);

        //TODO Your Producer Here
        KafkaProducer<Integer, Integer> producer = new KafkaProducer<>(props);

        try {
            for (int i = 0; i < 1000; i++) {
                //TODO consuming code here
                ProducerRecord<Integer, Integer> record = new ProducerRecord<>("obs", i, i);
                producer.send(record);
                System.out.printf("key = %d, value = %d\n", i, i);

                Thread.sleep(5000);

            }
        } finally {
            //TODO close the consumer
            producer.close();
        }

    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Task2C helloProducer = new Task2C();
        helloProducer.createProducer();
    }
}
