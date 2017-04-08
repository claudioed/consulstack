package domain.service;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.catalog.model.CatalogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author claudioed on 08/04/17. Project consulstack
 */
@Component
public class ServiceDiscovery {

  private final ConsulClient consulClient;

  @Autowired
  public ServiceDiscovery(ConsulClient consulClient) {
    this.consulClient = consulClient;
  }

  public String serviceEndpoint(final String serviceName) {
    QueryParams queryParams = new QueryParams("dc1");
    final Response<List<CatalogService>> catalogService = this.consulClient
        .getCatalogService(serviceName, null, queryParams);
    final List<CatalogService> serviceList = catalogService.getValue();
    return serviceList.get(0).getServiceAddress();
  }

}
