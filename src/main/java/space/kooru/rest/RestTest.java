package space.kooru.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.kooru.service.RestService;

/**
 * Created by kooru on 2017. 3. 4..
 */
@RestController
public class RestTest {

    @Autowired
    RestService restService;

    @RequestMapping("/rest/data")
    public String getData() throws Exception{
        return restService.getData();
    }

    @RequestMapping("/rest/{parameter}")
    public String getParameter(@PathVariable String parameter) throws Exception{
        return parameter;
    }
}
