package ${package}.${artifactId.replaceAll("-","")};

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
public class HelloRestController {

    @Value("${appVersion}")
    private String appVersion;

    @RequestMapping("/index")
    public String hello() {
        return "Hello. This is an index page for testing.";
    }

    @RequestMapping("/version")
    public String getVersion() {
        return appVersion;
    }
}