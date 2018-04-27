package srp.section1;

/**
 * Created by Jaye on 2018/4/27.
 */
public class UserInfo implements IUserInfo {
    private String userName;
    private String userID;
    private String password;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserID() {
        return userID;
    }

    @Override
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean changePassword(String oldPassword) {
        System.out.println(oldPassword);
        return true;
    }

    @Override
    public boolean deleteUser() {
        System.out.println("删除用户");
        return true;
    }

    @Override
    public void mapUser() {
        System.out.println("other");
    }

}