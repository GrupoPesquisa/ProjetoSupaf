package dao;



import entity.Aluno;
import entity.Curso;
import entity.Endereco;
import entity.IPAQ;
import entity.ParentescoAluno;
import entity.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class IpaqDAO {
   

public void adicionarIpaq(IPAQ ipaq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO IPAQ VALUES(?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, ipaq.getCodigo());
            stmt.setInt(2, ipaq.getDiasCaminhou());
            stmt.setInt(3, ipaq.getAtivModerada());
            stmt.setInt(4, ipaq.getAtivVigorosa());
            stmt.setTime(5, ipaq.getHorasCaminhou());
            stmt.setTime(6, ipaq.getTempoAtivModerada());
            stmt.setTime(7, ipaq.getTempoAtivVigorosa());
            stmt.setTime(8, ipaq.getTempoGastoSentado1());
            stmt.setTime(9, ipaq.getTempoGastoSentadofds());
            stmt.setInt(10, ipaq.getAluno().getMatricula());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public List<IPAQ> listarIpaq() {
        List<IPAQ> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM ipaq i INNER JOIN Aluno a ON (i.fk_id_aluno = a.id_aluno) INNER JOIN Endereco e ON (i.fk_id_aluno = e.id_endereco) INNER JOIN Curso c ON (i.fk_id_aluno = c.id_curso) INNER JOIN Turma t ON (i.fk_id_aluno = t.id_turma) INNER JOIN ParentescoAluno p ON (i.fk_id_aluno = p.id_Parentesco)   INNER JOIN Contato c ON (i.fk_id_aluno = c.id_contato)");
            rs = stmt.executeQuery();

            while (rs.next()) {
                IPAQ ipaq;
                ipaq = new IPAQ(rs.getInt("codigo"),rs.getInt("dias_caminhou"),rs.getInt("ativ_moderada"),rs.getInt("ativ_vigorosa"),rs.getTime("horas_caminhou"),rs.getTime("tempo_ativ_moderada"),rs.getTime("tempo_ativ_vigorosa"),rs.getTime("tempo_gasto_sentado1"),rs.getTime("tempo_gasto_sentadofds"), 
                        new Aluno (rs.getInt("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getInt("celular"),rs.getString("email"),rs.getInt("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("complemento"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),                       
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                listaRetorno.add(ipaq);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }

    public IPAQ getIpaqPeloCodigo(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM IPAQ WHERE id_ipaq=?");
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                IPAQ ipaq;
                ipaq = new IPAQ(rs.getInt("codigo"),rs.getInt("dias_caminhou"),rs.getInt("ativ_moderada"),rs.getInt("ativ_vigorosa"),rs.getTime("horas_caminhou"),rs.getTime("tempo_ativ_moderada"),rs.getTime("tempo_ativ_vigorosa"),rs.getTime("tempo_gasto_sentado1"),rs.getTime("tempo_gasto_sentadofds"),  
                        new Aluno (rs.getInt("matricula"),rs.getString("nome"),rs.getDate("dataN"),rs.getInt("idade"),rs.getString("sexo"),rs.getInt("celular"),rs.getString("email"),rs.getInt("telefone"),
                        new Endereco(rs.getInt("id_endereco"), rs.getString("rua"), rs.getString("complemento"), rs.getString("cidade"), rs.getString("bairro"),rs.getString("estado"),rs.getInt("cep"), rs.getInt("numero")),
                        new Curso (rs.getInt("id_curso"),rs.getString("nome")), new Turma(rs.getInt("id_turma"),rs.getString("nome"), new Curso (rs.getInt("id_curso"), rs.getString("nome")))));
                return ipaq;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }



    public void updateIpaq(IPAQ ipaq) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE ipaq SET dias_caminhou=?, ativ_moderada=?, ativ_vigorosa=?, horas_caminhou=?, tempo_ativ_moderada=?, tempo_ativ_vigorosa=?, tempo_gasto_sentado1=?, tempo_gasto_sentado_fds=?, fk_matricula=? WHERE id_ipaq=?");
            stmt.setInt(1, ipaq.getDiasCaminhou());
            stmt.setInt(2, ipaq.getAtivModerada());
            stmt.setInt(3, ipaq.getAtivVigorosa());
            stmt.setTime(4, ipaq.getHorasCaminhou());
            stmt.setTime(5, ipaq.getTempoAtivModerada());
            stmt.setTime(6, ipaq.getTempoAtivVigorosa());
            stmt.setTime(7, ipaq.getTempoGastoSentado1());
            stmt.setTime(8, ipaq.getTempoGastoSentadofds());
            stmt.setInt(9, ipaq.getAluno().getMatricula());
            stmt.setInt(10, ipaq.getCodigo());


            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    public void deletarIpaq(int codigo) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM ipaq WHERE id_ipaq=?");
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}