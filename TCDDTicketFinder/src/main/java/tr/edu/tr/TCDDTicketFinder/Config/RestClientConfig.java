package tr.edu.tr.TCDDTicketFinder.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient restClientBean(){
        return RestClient.create();
    }
}
