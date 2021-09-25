package oopcore7_interface_polymorphism.domain.userinfo.dao;

import oopcore7_interface_polymorphism.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
