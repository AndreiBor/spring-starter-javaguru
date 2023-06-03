package by.javagur.spring.database.repository;

import by.javagur.spring.bpp.InjectBean;
import by.javagur.spring.database.repository.pool.ConnectionPool;
import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ToString
public class UserRepository {

    private ConnectionPool connectionPool1;
    private Integer poolSize;
    private List<ConnectionPool> connectionPool;

    public UserRepository(ConnectionPool connectionPool1) {
        this.connectionPool1 = connectionPool1;
    }
}
