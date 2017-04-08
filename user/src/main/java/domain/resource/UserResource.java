package domain.resource;

import domain.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author claudioed on 06/04/17. Project consulstack
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserResource extends PagingAndSortingRepository<User, Long> {
}
