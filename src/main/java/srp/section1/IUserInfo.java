package srp.section1;

/**
 *单一职责
 *
 * @author Jaye
 * @date 2018/4/27
 */
public interface IUserInfo {


    void setUserID(String userID);

    String getUserID();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();

    boolean changePassword(String oldPassword);

    boolean deleteUser();

    void mapUser();
}
