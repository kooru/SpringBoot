package space.kooru.dao;

import org.springframework.stereotype.Repository;
import space.kooru.vo.User;

import java.util.List;

/**
 * Created by kooru on 2017. 2. 20..
 */
@Repository
public interface LocalDao {

     String getCurrentDateTime() throws Exception;
//     String getTestData() throws Exception;
//     User readUser(String username);
//     List<String> readAuthority(String username);


}
