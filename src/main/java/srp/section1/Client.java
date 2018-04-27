package srp.section1;

/**
 *单一职责
 *
 * @author Jaye
 * @date 2018/4/27
 */
public class Client {

    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        userInfo.changePassword("abc");
    }
}
