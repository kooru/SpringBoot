package space.kooru.vo;

import java.io.Serializable;

/**
 * Created by kooru on 2017. 3. 12..
 */
public class Login implements Serializable {
    private String id;
    private String password;
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
