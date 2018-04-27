package srp.section2;

/**
 *section1的接口拆分成两个
 *
 * @author Jaye
 * @date 2018/4/27
 *
 * 备注：
 * 1）java类是单继承的。classB Extends classA
 * 2）java接口可以多继承。Interface3 Extends Interface0, Interface1, interface……
 */
public interface IUserInfo extends IUserBiz, IUserBO{
}
