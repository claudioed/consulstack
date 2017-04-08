package domain.configuration;

import domain.integration.ProductApi;
import domain.integration.UserApi;
import domain.service.ServiceDiscovery;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author claudioed on 08/04/17. Project consulstack
 */
@Configuration
public class APIsClientsProducer {

  private final ServiceDiscovery serviceDiscovery;

  @Autowired
  public APIsClientsProducer(ServiceDiscovery serviceDiscovery) {
    this.serviceDiscovery = serviceDiscovery;
  }

  @Bean
  public UserApi createUserApi() {
    final String userMicroserviceEndpoint = serviceDiscovery.serviceEndpoint("consulstack_user_microservice");
    return Feign.builder().target(UserApi.class, userMicroserviceEndpoint);
  }

  @Bean
  public ProductApi createProductApi() {
    final String productMicroserviceEndpoint = serviceDiscovery
        .serviceEndpoint("consulstack_product_microservice");
    return Feign.builder().target(ProductApi.class, productMicroserviceEndpoint);
  }

}
