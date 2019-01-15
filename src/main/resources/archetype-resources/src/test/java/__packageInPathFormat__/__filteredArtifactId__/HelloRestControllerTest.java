package ${package}.${artifactId.replaceAll("-","")};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by pl49716 on 9/26/18.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(HelloRestController.class)
@TestPropertySource(locations="classpath:test.properties")
public class HelloRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloResponse() throws Exception {
        this.mockMvc.perform(get("/index")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello. This is an index page for testing.")));
    }

    @Test
    public void getVersion() throws Exception {
        this.mockMvc.perform(get("/version")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("1.0.1")));
    }
}