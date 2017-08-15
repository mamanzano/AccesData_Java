package Mario.AccessingData;

import org.springframework.data.repository.CrudRepository;
import Mario.AccessingData.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
