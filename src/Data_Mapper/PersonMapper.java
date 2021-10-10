package Data_Mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonMapper {
    public PersonMapper(Connection connection) {
        this.connection = connection;
    }

    Connection connection;

    public PreparedStatement findById(int idPerson) throws SQLException {

        return connection.prepareStatement(
                "Connect Telephone Boook DB" +
                        "SELECT * FROM  Telephone_Book.fio WHERE id = " + idPerson);

    }
}
