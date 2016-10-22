package lewis.personal.archive.user.controller;

import lewis.personal.archive.user.service.UserService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.apache.logging.log4j.LogManager.getLogger;

/**
 * Created by LPF on 2016/9/29.
 */
@Controller
@RequestMapping("/user")
public class UserManagerController {
    private static Logger LOGGER = getLogger(UserManagerController.class);

    @Autowired
    @Qualifier("lewis.personal.archive.user.service.UserService")
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public DeferredResult<Boolean> checkLogin(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            HttpServletRequest httpServletRequest, HttpServletResponse response)
    {
        DeferredResult<Boolean> result = new DeferredResult<Boolean>();
        LOGGER.info("username: {}, password: {}", username, password);
        try {
             result.setResult(userService.checkLogin(username, password));
            return result;
        } catch (Exception e) {
            LOGGER.error("UserManagerController.checkLogin e:{}", e);
            result.setResult(false);
            return result;
        }
    }
}