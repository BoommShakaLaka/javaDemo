package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test2 {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/boom_pub";

//     MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
/*
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql_local?useSSL=false&serverTimezone=UTC";
*/

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "12345678";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//
//            // 展开结果集数据库
//            while (rs.next()) {
//                System.out.println(rs.getInt("id") + rs.getString("username") + rs.getString("nickname"));
//            }
//            System.out.println("---------");
//            rs = stmt.executeQuery("SELECT * FROM stu");
//            while (rs.next()) {
//                System.out.println(rs.getInt("id") + rs.getString("name") + rs.getString("age"));
//            }

            stmt.execute("insert into users VALUES (\"4\",\"aa\",\"aaa\",\"\",\"\",\"zz\",\"\",\"\",1,\"2020-01-01\",\"2020-01-01\",\"2020-01-01\")");
            stmt.execute("insert into users VALUES (\"4\",\"aa\",\"aaa\",\"\",\"\",\"zz\",\"\",\"\",1,\"2020-01-01\",\"2020-01-01\",\"2020-01-01\")");
            conn.commit();
            // 完成后关闭
//            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } catch (SQLException e) {
            // 处理 JDBC 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
