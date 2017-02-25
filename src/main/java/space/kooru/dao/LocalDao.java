package space.kooru.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by kooru on 2017. 2. 20..
 */
@Repository
public interface LocalDao {


     String getCurrentDateTime() throws Exception;
     String getTestData() throws Exception;

}
