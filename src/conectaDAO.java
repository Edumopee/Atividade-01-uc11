
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    // Boa prática: declarar as credenciais como constantes privadas
    private static final String URL = "jdbc:mysql://localhost:3306/uc11?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Du010890*";

    public Connection conectarDB() {
        Connection conn = null;
        try {
           
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Mensagem para confirmar a conexão, útil durante o desenvolvimento.
             JOptionPane.showMessageDialog(null, "Conexão com o banco de dados estabelecida com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: " + erro.getMessage());
        }
        return conn;
    }
}
