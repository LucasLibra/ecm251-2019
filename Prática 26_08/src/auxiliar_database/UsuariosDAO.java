package auxiliar_database;

import model.Usuario;
import utilities.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utilities.Constants.TABELA_USUARIO;

public class UsuariosDAO {
    private Connection connection;

    public UsuariosDAO(String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);

        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }

    public boolean insertUsuario(Usuario user){
        PreparedStatement comandSQL;
        try {
            comandSQL = connection.prepareStatement(Constants.getInsert(TABELA_USUARIO,4));
            comandSQL.setString(2,user.nome);
            comandSQL.setString(3,user.email);
            comandSQL.setString(4,user.senha);
            comandSQL.setNull(1, Types.INTEGER);
            comandSQL.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (NullPointerException e){
            e.printStackTrace();
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Usuario> getAllUsuario(){
        List<Usuario> users = new ArrayList<>();

        try {
            Statement comandSql = connection.createStatement();
            ResultSet rs = comandSql.executeQuery(Constants.selectAll(Constants.TABELA_USUARIO));
            while (rs.next()) {
                Usuario user = new Usuario(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("senha")
                );
                user.id = rs.getInt("id");
                users.add(user);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }
}
