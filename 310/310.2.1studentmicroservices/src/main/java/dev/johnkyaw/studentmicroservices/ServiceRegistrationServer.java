package dev.johnkyaw.studentmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
import com.netflix.discovery.Jersey3DiscoveryClientOptionalArgs;
import com.netflix.discovery.shared.transport.jersey.TransportClientFactories;
import com.netflix.discovery.shared.transport.jersey3.Jersey3TransportClientFactories;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {

	public static void main(String[] args) {
//		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(ServiceRegistrationServer.class, args);
	}

//	@Bean
//	@ConditionalOnMissingBean(AbstractDiscoveryClientOptionalArgs.class)
//	public Jersey3DiscoveryClientOptionalArgs jersey3DiscoveryClientOptionalArgs() {
//		return new Jersey3DiscoveryClientOptionalArgs();
//	}
//
//	@Bean
//	@ConditionalOnMissingBean(TransportClientFactories.class)
//	public Jersey3TransportClientFactories jersey3TransportClientFactories() {
//		return Jersey3TransportClientFactories.getInstance();
//	}

}
