package conexao;

import java.sql.SQLException;

import javax.activation.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.sun.corba.se.pept.transport.Connection;

public class ConexaoBd {
private static BasicDataSource dataSource = null;
	
	private static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUsername("root");
			dataSource.setPassword("");
			dataSource.setUrl("jdbc:mysql://localhost:3306/sistemapim");	
			dataSource.setInitialSize(50);
			dataSource.setMaxIdle(100);
			dataSource.setMaxTotal(1000);
			dataSource.setMaxWaitMillis(5000);
		}
		
		return (DataSource) dataSource;
	}
	public static Connection getConnection() throws SQLException {
		return (Connection) ((BasicDataSource) getDataSource()).getConnection();
		
	}
}
