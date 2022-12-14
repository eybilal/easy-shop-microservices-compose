package io.coodle.easyshop.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.binder.kafka.streams.endpoint.KafkaStreamsTopologyEndpointAutoConfiguration;

/**
 * @author Bilal El Yousfi
 */
// Bug: Unable to map duplicate endpoint operations:
// [MBean call 'kafkaStreamsTopology'] to topologyEndpoint
// As a workaround I excluded KafkaStreamsTopologyEndpointAutoConfiguration.class
// in @SpringBootApplication annotation
@SpringBootApplication(exclude= {KafkaStreamsTopologyEndpointAutoConfiguration.class})
/**
 * @EnableDiscoveryClient vs @EnableEurekaClient ?
 *
 * There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper).
 *
 * @EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath.
 *
 * @EnableEurekaClient lives in spring-cloud-netflix and only works for eureka.
 *
 * If eureka is on your classpath, they are effectively the same.
 */
@EnableDiscoveryClient
@EnableFeignClients
public class EasyShopOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyShopOrderServiceApplication.class, args);
	}
}
