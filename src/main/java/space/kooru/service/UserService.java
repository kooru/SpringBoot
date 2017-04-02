package space.kooru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import space.kooru.dao.LocalDao;
import space.kooru.vo.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kooru on 2017. 3. 6..
 */
@Service
public class UserService implements UserDetailsService{
//    @Autowired
//    LocalDao localDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //User user = localDao.readUser(username);
        User user = new User();
        user.setUsername("root");
        user.setPassword("12312312");
        user.setAuthorities(getAuthorities(username));
        return user;
    }
    public Collection<GrantedAuthority> getAuthorities(String username) {
        // List<String> string_authorities = localDao.readAuthority(username);
        List<String> string_authorities = new ArrayList<>();
        string_authorities.add("ADMIN");
        string_authorities.add("USER");
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String authority : string_authorities) {
            authorities.add(new SimpleGrantedAuthority(authority));
        }
        return authorities;
    }
}
