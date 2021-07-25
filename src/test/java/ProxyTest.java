import com.lank.proxy.CglibDynamicProxy;
import com.lank.proxy.IUserService;
import com.lank.proxy.JdkDynamicProxy;
import com.lank.proxy.UserService;
import org.junit.Test;

/**
 * @author lank
 * @since 2021/7/21 22:13
 */
public class ProxyTest {

    @Test
    public void dynamicProxyTest() {

        UserService userService = new UserService();

        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(userService);

        IUserService proxy = (IUserService) jdkDynamicProxy.bind();
        proxy.login("lank", "123456");
    }

    @Test
    public void cglibProxyTest() {
        UserService userService = new UserService();
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(userService);
        IUserService proxy = (IUserService) cglibDynamicProxy.bind();
        proxy.register("lank","123456");
    }
}
