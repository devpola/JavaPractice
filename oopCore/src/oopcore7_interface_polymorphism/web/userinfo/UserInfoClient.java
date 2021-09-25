package oopcore7_interface_polymorphism.web.userinfo;

import oopcore7_interface_polymorphism.domain.userinfo.UserInfo;
import oopcore7_interface_polymorphism.domain.userinfo.dao.UserInfoDao;
import oopcore7_interface_polymorphism.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import oopcore7_interface_polymorphism.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword(("!@#$%"));
        userInfo.setUserName("Minsu Kim");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
