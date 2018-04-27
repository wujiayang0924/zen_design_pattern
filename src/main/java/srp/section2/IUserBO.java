package srp.section2;

/**
 * 负责用户的属性
 *
 * @author Jaye
 * @date 2018/4/27
 */
public interface IUserBO {

    void setUserID(String userID);

    String getUserID();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();
}
