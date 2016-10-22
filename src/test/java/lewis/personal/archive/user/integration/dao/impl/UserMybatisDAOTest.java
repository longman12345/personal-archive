package lewis.personal.archive.user.integration.dao.impl;

import lewis.personal.archive.AbstractJunitTest;
import lewis.personal.archive.user.dto.UserDTO;
import lewis.personal.archive.user.integration.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by LPF on 2016/10/22.
 */

public class UserMybatisDAOTest extends AbstractJunitTest{
    @Autowired
    @Qualifier("lewis.personal.archive.user.integration.dao.UserDAO")
    UserDAO userDAO;

    @Test
    public void insert() throws Exception {
        UserDTO userDTO = new UserDTO("lewis", "pw123", "lewis@gmail.com", "qq123", "wechat123");
        userDAO.insert(userDTO);
    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void query() throws Exception {

    }

}