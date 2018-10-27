package hello.distributedSystem.queue;

import com.hello.dubbo.common.queue.ActiveMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ActiveMQConfig.class})
public class HelloDistributedSystemQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDistributedSystemQueueApplication.class, args);
	}
}
