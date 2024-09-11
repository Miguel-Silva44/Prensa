package com.siteSimples.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(BackendApplication.class, args);
//		Connection conexao  = null;
//		try {
//			Class.forName("org.postgresql.Driver");
//			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", 
//					"postgres", "1234");
//			ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM users");
//			while(rsCliente.next()) {
//				System.out.println("Nome: " + rsCliente.getString("name") + rsCliente.getString("address"));
//			}
//		} catch (ClassNotFoundException e) {
//			System.out.println("Driver do banco de dados nao encontrado");
//		} catch (SQLException e) {
//			System.out.println("Erro ao acessar ao banco: "+ e.getMessage());
//		}finally {
//			if(conexao != null) {
//				conexao.close();
//			}
//		}
	}
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/api/users")
//                        .allowedOrigins("http://localhost:3000") // Adapte para o seu frontend
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
//            }
//        };
//    }

}
