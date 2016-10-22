package lewis.personal.archive.user.integration.dao.impl;

import lewis.personal.archive.common.AbstractSimpleDAO;
import lewis.personal.archive.user.dto.UserDTO;
import lewis.personal.archive.user.integration.dao.UserDAO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by LPF on 2016/10/22.
 */
@Repository("lewis.personal.archive.user.integration.dao.UserDAO")
public class UserMybatisDAO extends AbstractSimpleDAO implements UserDAO {
    @Override
    public void insert(UserDTO userDTO) throws SQLException {
        try (SqlSession session = getSession()) {
            UserDAO mapper = (UserDAO) session.getMapper(UserDAO.class);
            mapper.insert(userDTO);
        }
    }

    @Override
    public void delete(@Param("name") String name, @Param("password") String password) throws SQLException {
        try (SqlSession session = getSession()){
            UserDAO mapper = (UserDAO) session.getMapper(UserDAO.class);
            mapper.delete(name, password);
        }
    }

    @Override
    public UserDTO query(@Param("name") String name, @Param("password") String password) throws SQLException {
        try (SqlSession session = getSession()){
            UserDAO mapper = (UserDAO) session.getMapper(UserDAO.class);
            return mapper.query(name, password);
        }
    }

    @Override
    public void update(UserDTO userDTO) throws SQLException {
        try (SqlSession session = getSession()){
            UserDAO mapper = (UserDAO) session.getMapper(UserDAO.class);
            mapper.update(userDTO);
        }
    }
}
