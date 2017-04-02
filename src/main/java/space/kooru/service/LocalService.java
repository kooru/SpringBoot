package space.kooru.service;

import space.kooru.dao.LocalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kooru on 2017. 2. 20..
 */
@Service
public class LocalService {

    @Autowired
    private LocalDao localDao;

    public String getCurrentDataTime() throws Exception{
        return localDao.getCurrentDateTime();
    }

//    public String getTestData() throws Exception{
//        return localDao.getTestData();
//    }
}
