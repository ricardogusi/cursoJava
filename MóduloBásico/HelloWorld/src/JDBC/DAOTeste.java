package JDBC;

public class DAOTeste {
		public static void main(String[] args) {
			
			DAO dao = new DAO();
			
			String sql = "INSERT INTO pessoas (nome) VALUES (?)";
			
			dao.incluir(sql, "Jo�o");
			dao.incluir(sql, "Maria");
			dao.incluir(sql, "Beatriz");
						
		}
}
