package srp.section2;

/**
 * 负责用户的行为
 *
 * @author Jaye
 * @date 2018/4/27
 */
public interface IUserBiz {

    boolean changePassword(String oldPassword);

    boolean deleteUser();

    void mapUser();

    void addOrg(IUserBO userBO, int orgID);

    void addRole(IUserBO userBO, int roleID);
}
