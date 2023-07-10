package javaproject.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleDBTest {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "scott";
		String password = "TIGER";
		String sql = "INSERT INTO books (id,title,author,price,qty) values (?,?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, 2);
			st.setString(2, "welcome2");
			st.setString(3, "kim2");
			st.setInt(4, 4000);
			st.setInt(5, 2500);
			
			int result = st.executeUpdate();
			
			System.out.print(result);
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
