package domain.resource;

import domain.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author claudioed on 06/04/17. Project consulstack
 */
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductResource extends PagingAndSortingRepository<Product, Long> {
}
