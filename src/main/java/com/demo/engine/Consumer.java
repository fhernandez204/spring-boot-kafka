package com.demo.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
	
	@Value("${kafka.topic.name}")
	private  String KAFKA_TOPIC;
	
	@Value("${spring.kafka.consumer.group-id}")
	public  String spring_kafka_consumer_group_id;
	
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        logger.info(String.format("#### -> Consumed KAFKA_TOPIC -> %s", KAFKA_TOPIC));
        logger.info(String.format("#### -> Consumed spring_kafka_consumer_group_id -> %s", spring_kafka_consumer_group_id));
    }
}
