
package conexoes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/harugawa";
    private String usuario = "root";
    private String senha = "root";
    public Connection con;
    
}
