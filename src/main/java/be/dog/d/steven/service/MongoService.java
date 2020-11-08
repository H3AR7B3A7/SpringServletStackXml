package be.dog.d.steven.service;

import be.dog.d.steven.model.EmployeeForm;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoService {

    public static void insert(EmployeeForm employeeForm) {
        MongoClient mongoClient = MongoClients.create(System.getenv("DB_LOCATION"));
        MongoDatabase db = mongoClient.getDatabase("Employee");

        MongoCollection<Document> collection = db.getCollection("employees");

        collection.insertOne(new Document()
                .append("first", employeeForm.getFirst())
                .append("last", employeeForm.getLast())
                .append("position", employeeForm.getPosition())
                .append("email", employeeForm.getEmail()));
    }

    public static String getAllAsHtml(){
        MongoClient mongoClient = MongoClients.create(System.getenv("DB_LOCATION"));
        MongoDatabase db = mongoClient.getDatabase("Employee");

        MongoCollection<Document> collection = db.getCollection("employees");

        StringBuilder sb = new StringBuilder();

        for (Document doc : collection.find()) {
            sb
                    .append("<tr><td class='first'>")
                    .append(doc.get("first").toString())
                    .append("</td><td class='last'>")
                    .append(doc.get("last").toString())
                    .append("</td><td class='position'>")
                    .append(doc.get("position").toString())
                    .append("</td><td class='email'>")
                    .append(doc.get("email").toString())
                    .append("</td></tr>");
        }

        return sb.toString();
    }
}
