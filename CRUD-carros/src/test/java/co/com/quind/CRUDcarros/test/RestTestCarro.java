package co.com.quind.CRUDcarros.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.codehaus.groovy.classgen.asm.OperandStack;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.HttpStatusCodeException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

class RestTestCarro {

	@Before
	public void before(){
		// RestAssured.baseURI = "localhost:8080/ap/carros";
	
		/*String body= RestAssured.given()
		 .when().get("/").then().extract().body().asString();*/
	}

	@Test
    public void getTest(){
		 
				 
		
		given().get("/ap/carros/").then().statusCode(200).log().all();
		
		/*
		JsonPath jsonPath = given().log().all()
		    	.accept(ContentType.JSON)
		    	.body("{id}")
		    	.get("127.0.0.1:8080/ap/carros/16")
		    	.then()
		    	.extract().jsonPath();
		
		
		*/
		
	}
 
    @Test
    public void postTest(){
    	
    	
    	
    	JsonPath jsonPath = given().log().all()
    	    	.accept(ContentType.JSON)
    	    	.body("{id}")
    	    	.post("127.0.0.1:8080/ap/carros/")
    	    	.then()
    	    	.extract().jsonPath();
    }
     
    @Test
    public void putTest(){ 
    	
    	
    	JsonPath jsonPath  = given()
    	        .accept(ContentType.JSON)
    	        . body("{\"marca\":\"renaul\", \"modelo\":\"hoooo\",\"color\":\"hdfooofgo\",\"placa\":\"5465\",\"tipo\":\"sdfsfoooo\",\"modelo\":\"hoooo\",}")
    	        .post("/users")
    	    .then()
    	        .extract().jsonPath();
    	    ;
    	
    	
    	JsonPath jsonPath = given().log().all()
    	    	.accept(ContentType.JSON)
    	    	.body("{id}")
    	    	.put("http://localhost:8080/ap/carros/16")
    	    	.then()
    	    	.extract().jsonPath();
    }
  
    
    
    
     
    @Test
    public void delete(){

    	/*
    	
    	
        JsonPath jsonPath  = given().log().all()
                .accept(ContentType.JSON)
                .body("{id"})
                .post("/")
            .then()
                .extract().jsonPath();
            ;
             
            String idCreated = ( jsonPath.get("id").toString() );
         
        //se elimina el recurso
        given().log().all()
            .accept(ContentType.JSON)
            .param("id", idCreated)
            .delete("/users")
        .then().log().ifValidationFails()
            .statusCode(204);   */
    	
    	
    	JsonPath jsonPath = given().log().all()
    	.accept(ContentType.JSON)
    	.body(16)
    	.delete("127.0.0.1:8080/ap/carros/")
    	.then().log()
    	.ifValidationFails()
    	//.statusCode(200)
    	.extract().jsonPath();
    	
    	
    	/*
    	 RestAssured.given().log()
    	 .param("/", 2)
    	 .delete("localhost:8080/ap/carros/")
		 .then()
		 .statusCode(200)
		 .log()
		 .ifError();
		System.out.println("el resultado es ");
		*/
    }

}