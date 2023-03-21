package mybatis.diy.dao;

import mybatis.diy.po.User;

public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

    User queryUserInfoById(Long uId);

}
