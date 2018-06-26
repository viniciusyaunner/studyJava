package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class principal{
	public static void main (String[]args)throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/postoGas","root","");
        Statement pesquisa = conexao.createStatement();
        String consulta = "SELECT * FROM postogas.combustivel c;";
        ResultSet rs = pesquisa.executeQuery(consulta);
        while(rs.next()){
        	System.out.println(rs.getInt("codcomb") + " - " + rs.getString("nome")+ " - "+ rs.getString("fornecedor")+ " - " +rs.getDouble("preco"));
        }
}
}