package apiTesting;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

    public void getRequestMethod() throws IOException {
        URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        System.out.println("The status code is: "+ connection.getResponseCode());
        System.out.println("The Message is: "+ connection.getResponseMessage());

        InputStream stream=connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer message = new StringBuffer();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            message.append(line);
        }
        System.out.println(message);
    }

    public void postRequestMethod() throws IOException {
        URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type","application/json");
        connection.setDoOutput(true);

        String jsonbody = "{\"name\":\"VijayHrithik\",\"salary\":\"40000\",\"age\":\"27\"}";
        byte[] bytes = jsonbody.getBytes();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(bytes);

        System.out.println("The status code is: "+ connection.getResponseCode());
        System.out.println("The Message is: "+ connection.getResponseMessage());

        InputStream stream=connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer message = new StringBuffer();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            message.append(line);
        }
        System.out.println(message);
    }

    public void putRequestMethod() throws IOException {
        URL url = new URL("http://dummy.restapiexample.com/api/v1/update/4696");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("content-type","application/json");
        connection.setDoOutput(true);

        String jsonbody = "{\"name\":\"VijayHrithik\",\"salary\":\"60000\",\"age\":\"29\"}";
        byte[] bytes = jsonbody.getBytes();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(bytes);

        System.out.println("The status code is: "+ connection.getResponseCode());
        System.out.println("The Message is: "+ connection.getResponseMessage());

        InputStream stream=connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer message = new StringBuffer();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            message.append(line);
        }
        System.out.println(message);
    }

    public void deleteRequestMethod() throws IOException {
        URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/1");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.connect();

        System.out.println("The status code is: "+ connection.getResponseCode());
        System.out.println("The Message is: "+ connection.getResponseMessage());

        InputStream stream=connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer message = new StringBuffer();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            message.append(line);
        }
        System.out.println(message);
    }

    public static void main(String[] args) throws IOException {
        HttpURLConnectionExample example = new HttpURLConnectionExample();
      //  example.getRequestMethod();
      //  example.postRequestMethod();
      //  example.putRequestMethod();
        example.deleteRequestMethod();
    }
}
