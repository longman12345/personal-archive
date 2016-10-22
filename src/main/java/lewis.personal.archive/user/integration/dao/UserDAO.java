package lewis.personal.archive.user.integration.dao;

import lewis.personal.archive.user.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;

/**
 * Created by LPF on 2016/10/22.
 */
public interface UserDAO {
    public void insert(UserDTO userDTO) throws SQLException;

    public void delete(@Param("name") String name, @Param("password") String password) throws SQLException;

    public UserDTO query(@Param("name") String name, @Param("password") String password) throws SQLException;

    public void update(UserDTO userDTO) throws SQLException;
}
