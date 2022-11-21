package org.example;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;

public class JavaObjectToJson {
    String name;
    int id;
    int age;
    String department;
    JavaObjectToJson(String name,int id,int age, String department)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.department=department;
    }
    public static void main(String [] args)
    {
        JavaObjectToJson obj=new JavaObjectToJson("Tanmay",10,35,"Computer Science");
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try{
            System.out.println(objectMapper.writeValueAsString(obj));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
