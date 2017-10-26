import factorywarehouse.UserFactory;
import factorywarehouse.UserWarehouse;
import org.junit.Assert;
import org.junit.Test;
import user.User;

public class UserFactoryTests {

    @Test
    public void createUserTest() {
        User user = UserFactory.createUser("rob");
        Assert.assertTrue(UserWarehouse.hasUser(user));
    }

}
