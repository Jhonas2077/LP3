/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabri
 */
import java.sql.*;
import java.util.*;

public class AlunoDAO {
    private final String URL = "jdbc:mysql://localhost:3306/escola";
    private final String USER = "root";
    private final String PASSWORD = "";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public boolean adicionar(String nome, int idade) {
        String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        } 
    }

    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM aluno";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade")));
            }
        } catch (SQLException e) {
        }
        return lista;
    }

    public boolean atualizar(int id, String nome, int idade) {
        String sql = "UPDATE aluno SET nome = ?, idade = ? WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setInt(3, id);
            stmt.executeUpdate(); 
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean remover(int id) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}

