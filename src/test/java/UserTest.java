import com.sshDemo.spring.model.User;
import com.sshDemo.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author changling
 * @creator 2020-04-05 10:53
 */
public class UserTest {

    @Autowired
    private UserService userService;
    @Test
    public void getAll() {
        System.out.println(userService.getAll());
    }
}
