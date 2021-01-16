package cn.andylhl.crowd.constant;

/***
 * @Title: Const
 * @Description: 项目中用到的常量
 * @author: lhl
 * @date: 2020/12/20 16:23
 */
public class Constant {

    private Constant(){}

    // 日期全格式
    public static final String DATE_Format_ALL = "yyyy-MM-dd HH:mm:ss";

    // 年月日格式
    public static final String DATE_Format_YMD = "yyyy-MM-dd";


    public static final String MESSAGE_LOGIN_FAILED = "抱歉！账号密码错误！请重新输入！";
    public static final String MESSAGE_LOGIN_ACCT_ALREADY_IN_USE = "抱歉！这个账号已经被使用了！";
    public static final String MESSAGE_ACCESS_FORBIDDEN = "请登录以后再访问！";
    public static final String MESSAGE_STRING_INVALIDATE = "字符串不合法！请不要传入空字符串！";
    public static final String MESSAGE_SYSTEM_ERROR_LOGIN_NOT_UNIQUE = "系统错误：登录账号不唯一！";

    public static final String ATTR_NAME_EXCEPTION = "exception";
    public static final String ATTR_NAME_LOGIN_ADMIN = "loginAdmin";
    public static final String ATTR_NAME_PAGE_INFO = "pageInfo";
    public static final String ATTR_ERROR_MESSAGE = "message";

    public static final String REDIS_CODE_PREFIX = "crowd-register-";
}
