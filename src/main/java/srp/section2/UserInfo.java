package srp.section2;

/**
 *
 *
 * @author Jaye
 * @date 2018/4/27
 */
public class UserInfo implements IUserInfo{

    private String userName;

    private String userID;

    private String password;

    @Override
    public void setUserID(String userID) {

    }

    @Override
    public boolean changePassword(String oldPassword) {
        return false;
    }

    @Override
    public String getUserID() {
        return null;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public void mapUser() {

    }

    @Override
    public void addOrg(IUserBO userBO, int orgID) {

    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public void addRole(IUserBO userBO, int roleID) {

    }

    @Override
    public String getUserName() {
        return null;
    }
}
