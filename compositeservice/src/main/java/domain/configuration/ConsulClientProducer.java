package domain.configuration;

import com.ecwid.consul.v1.ConsulClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author claudioed on 08/04/17. Project consulstack
 */
@Configuration
public class ConsulClientProducer {

  @Bean(name = "consulClient")
  public ConsulClient consulClient(){
    return new ConsulClient("localhost");
  }

}
