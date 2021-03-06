package ee.ut.cs.dsg.lt02007.kafka.task1;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Task1A {
    private String OBS = "obs.csv";

    public void createProducer() throws InterruptedException, IOException {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka1:9092,kafka2:9093");
        //TODO Your Producer Configuration Code Here
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);



        String file = Task1A.class.getClassLoader().getResource(OBS).getPath();

        System.out.println(file);

        //TODO Your Producer Here
        KafkaProducer<Integer, Integer> producer = new KafkaProducer<>(props);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = "";

        while ((line = br.readLine()) != null) {

            System.out.println(line);
            //TODO production code here
            int i = 0;
            try{
                while (true) {
                    i += 2;

                    ProducerRecord<Integer, Integer> record = new ProducerRecord<>("obs", i, i);
                    producer.send(record);
                    System.out.printf("key = %d, value = %d\n", i, i);

                    Thread.sleep(5000);
                }

            }finally {
                producer.close();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Task1A helloProducer = new Task1A();
        helloProducer.createProducer();
    }
}
