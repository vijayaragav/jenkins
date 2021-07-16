package apiTesting;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestExample {

   public void getRequestex() throws UnirestException {
     HttpResponse<JsonNode> jsonresponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
      System.out.println(jsonresponse.getStatus());
      System.out.println(jsonresponse.getStatusText());
      System.out.println(jsonresponse.getBody());
   }
    public void postRequestex() throws UnirestException {
        HttpResponse<JsonNode> jsonresponse = Unirest.post("http://dummy.restapiexample.com/api/v1/employees").body("").asJson();
        System.out.println(jsonresponse.getStatus());
        System.out.println(jsonresponse.getStatusText());
        System.out.println(jsonresponse.getBody());
    }

   public static void main(String[] args) throws UnirestException {
      UnirestExample unirestExample = new UnirestExample();
      unirestExample.getRequestex();
   }
}
