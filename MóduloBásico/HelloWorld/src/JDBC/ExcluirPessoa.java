package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
		public static void main(String[] args) throws SQLException {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o código: ");
			int codigoEntrada = entrada.nextInt();
			Connection conexao = FabricaConexao.getConexao();
			String sql = "DELETE FROM pessoas WHERE codigo = ?";
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			stmt.setInt(1, codigoEntrada);
			
			if(stmt.executeUpdate() > 0) {
				System.out.println("Pesso excluída com sucesso!");
			} else {
				System.out.println("Sem sucesso.");
			}
			
			conexao.close();
			entrada.close();
			
		}
}
