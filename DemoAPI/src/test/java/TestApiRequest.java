import io.restassured.http.ContentType;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class TestApiRequest {

    @Test
    public void AddAPet(){

                given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                "  \"id\": 150,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"Thanos\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 150,\n" +
                "      \"name\": \"Thanos\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}")
                .post("https://petstore.swagger.io/v2/pet/")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", notNullValue());
        }

@Test
    public void GetAPet(){
        given()
                .contentType(ContentType.JSON)
                .get("https://petstore.swagger.io/v2/pet/145")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(145));
    }

@Test
    public void UpdateAPet(){
        String nameUpdated= given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 145,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"cats\"\n" +
                        "  },\n" +
                        "  \"name\": \"michifu\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"name\": \"michifu\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"unavailable\"\n" +
                        "}")
                .put("https://petstore.swagger.io/v2/pet")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .jsonPath().getString("name");
        assertThat(nameUpdated,equalTo("michifu"));
    }
}
