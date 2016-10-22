package lewis.personal.archive.user.service.impl;

import lewis.personal.archive.user.dto.UserDTO;
import lewis.personal.archive.user.integration.dao.UserDAO;
import lewis.personal.archive.user.service.UserService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

import static org.apache.logging.log4j.LogManager.getLogger;


/**
 * Created by LPF on 2016/10/22.
 */
@Service("lewis.personal.archive.user.service.UserService")
public class UserServiceImpl implements UserService{
    private static Logger LOGGER = getLogger(UserServiceImpl.class);

    @Autowired
    @Qualifier("lewis.personal.archive.user.integration.dao.UserDAO")
    UserDAO userDAO;

    @Override
    public boolean checkLogin(String name, String password) {
        try {
            UserDTO userDTO = userDAO.query(name, password);
            LOGGER.info("UserServiceImpl.checkLogin userDTO:{}", userDTO.toString());
            if (userDTO != null) {
                return true;
            } else {
                LOGGER.error("UserServiceImpl.checkLogin the result of query is null");
                return false;
            }
        }catch (SQLException e) {
            LOGGER.error("UserServiceImpl.checkLogin error: {}", e);
            return false;
        }
    }
}
