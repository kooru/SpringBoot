package space.kooru.rest;

/**
 * Created by kooru on 2017. 2. 20..
 */
import space.kooru.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LocalRest
{
    @Autowired
    LocalService localService;

    @RequestMapping("/local/now")
    public String localTime() throws Exception{
        return localService.getCurrentDataTime();
    }
    @RequestMapping("/local/test")
    public String localTest() throws Exception{
        return localService.getTestData();
    }

}

