package jdbc;

import java.sql.*;

public class JDBC_Test {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.201.100:3306/mysql1";

//     MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
/*
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql_local?useSSL=false&serverTimezone=UTC";
*/

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "mysql";
    static final String PASS = "12345678";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM t_user";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()){
                System.out.println(rs.getInt("id")+rs.getString("user_name")+rs.getString("age") );
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } catch (SQLException e) {
            // 处理 JDBC 错误
            e.printStackTrace();
        }finally {
            // 关闭资源
            try{
                if(stmt!=null) {
                    stmt.close();
                }
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
