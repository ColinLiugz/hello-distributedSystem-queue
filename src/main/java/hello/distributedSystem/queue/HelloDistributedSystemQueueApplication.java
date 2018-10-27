package hello.distributedSystem.queue;

import hello.distributedSystem.common.queue.ActiveMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @Author: Colin
 * @Date: 2018/10/27 22:23
 */
@SpringBootApplication
@Import({ActiveMQConfig.class})
public class HelloDistributedSystemQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDistributedSystemQueueApplication.class, args);
	}
}
