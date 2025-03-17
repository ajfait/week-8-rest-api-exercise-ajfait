import com.api_ninjas.BreedItem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void testapi_ninjasJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.api-ninjas.com/v1/cats?name=persian&X-Api-Key=2tK0XA88SZRLo9DcriH2xA==UmGA1k2g6EneXpHR");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response);
        // Credit to Evan Weigel for help with code for actualBreedName
        String actualBreedName = root.get(0).get("name").asText();
        String expectedBreedName = "Persian";
        assertEquals(expectedBreedName, actualBreedName);
    }
}
