package Data_Mapper;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    private static Connection connection;

    public Main(Connection connection) {
        Main.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) throws SQLException {
       PersonMapper mapper= new PersonMapper(connection);

        System.out.println( mapper.findById(1));
    }


//    public Person findById(int idPerson) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement(
//                "SELECT IDPERSON, FIRSTNAME, LASTNAME FROM PERSON WHERE IDPERSON = ?");
//        statement.setInt(1,idPerson);
//
//
//        return null;
//    }
}
