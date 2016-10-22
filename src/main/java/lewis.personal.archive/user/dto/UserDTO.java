package lewis.personal.archive.user.dto;

import java.util.Date;

/**
 * Created by LPF on 2016/10/22.
 */
public class UserDTO {
    String name;
    String password;
    String email;
    String qq;
    String wechat;
    Date created_date;
    Date updated_date;

    public UserDTO() {
    }

    public UserDTO(String name, String password, String email, String qq, String wechat) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.qq = qq;
        this.wechat = wechat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", created_date=" + created_date +
                ", updated_date=" + updated_date +
                '}';
    }
}
