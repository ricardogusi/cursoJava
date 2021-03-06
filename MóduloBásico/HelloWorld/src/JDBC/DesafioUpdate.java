package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdate {
		public static void main(String[] args) throws SQLException {
			
			Connection conexao = FabricaConexao.getConexao();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o ID da pessoa que deseja alterar o nome:");
			String idEntrada = entrada.nextLine();			
			entrada.reset();
			System.out.println("Informe o novo nome:");
			String nomeEntrada = entrada.nextLine();
			entrada.reset();
			
			entrada.close();
			
			String sql = "UPDATE pessoas SET nome = ? where codigo = ?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nomeEntrada);
			stmt.setString(2, idEntrada);
			stmt.execute();
			
			System.out.println("Nome alterado chefe");
			
			
			conexao.close();
		}
}
