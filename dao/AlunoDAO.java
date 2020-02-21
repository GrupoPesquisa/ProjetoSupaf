package dao;

import entity.Aluno;
import entity.Curso;
import entity.Endereco;
import entity.ParentescoAluno;
import entity.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class AlunoDAO {
   

public void adicionarAluno(Aluno aluno) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Endereco VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, aluno.getEndereco().getCodigo());
            stmt.setString(2, aluno.getEndereco().getRua());
            stmt.setString(3, aluno.getEndereco().getCidade());
            stmt.setString(4, aluno.getEndereco().getBairro());
            stmt.setString(5, aluno.getEndereco().getComplemento());
            stmt.setString(6, aluno.getEndereco().getEstado());
            stmt.setInt(7, aluno.getEndereco().getCep());
            stmt.setInt(8, aluno.getEndereco().getNumero());
            

            stmt.executeUpdate();            


            stmt = conexao.prepareStatement("INSERT INTO Aluno VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setInt(3, aluno.getCelular());
            stmt.setString(4, aluno.getEmail());
            stmt.setInt(5, aluno.getTelefone());
            stmt.setInt(6, aluno.getEndereco().getCodigo()); 
            stmt.setInt(7, aluno.getCurso().getCodigo());
            stmt.setInt(8, aluno.getTurma().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<Aluno> listarAlunos() {
        List<Aluno> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Aluno a INNER JOIN Endereco e ON (a.fk_id_endereco = e.id_endereco) INNER JOIN Curso c ON (a.fk_id_curso = c.id_curso) INNER JOIN Turma t ON (a.fk_id_turma = t.id_turma) INNER JOIN Parentesco_Aluno p ON (a.fk_id_parentesco = p.id_parentesco)");
            rs = stmt.executeQuery();

            while (rs.next()) {
               Aluno aluno;
                aluno = new Aluno (rs.getInt("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getInt("celular"),rs.getString("email"),rs.getInt("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("complemento"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),                       
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome"))));
                listaRetorno.add(aluno);
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }

    public Aluno getAlunoPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM aluno a INNER JOIN Endereco e ON (a.fk_id_endereco = e.id_endereco) INNER JOIN Curso c ON (a.fk_id_curso = c.id_curso) INNER JOIN Turma t ON (a.fk_id_turma = t.id_turma) INNER JOIN Parentesco_Aluno p ON (a.fk_id_parentesco = p.id_parentesco) WHERE matricula=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Aluno aluno;
                aluno = new Aluno (rs.getInt("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"), rs.getInt("celular"),rs.getString("email"),rs.getInt("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("complemento"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),                       
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome"))));       
                return aluno;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }



    public void updateAluno(Aluno aluno) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Aluno SET nome=?,celular=?,email=?,telefone=?, fk_id_endereco=?, fk_id_curso=?, fk_id_turma=?, fk_id_parentesco=? WHERE matricula=?");
            stmt.setString(1, aluno.getNome());
            stmt.setInt(3, aluno.getCelular());
            stmt.setString(4, aluno.getEmail());
            stmt.setInt(5, aluno.getTelefone());
            stmt.setInt(2, aluno.getEndereco().getCodigo());
            stmt.setInt(3, aluno.getCurso().getCodigo());
            stmt.setInt(4, aluno.getTurma().getCodigo());
            stmt.setInt(6, aluno.getMatricula());
            stmt.executeUpdate();
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarAluno(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Aluno WHERE matricula=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
