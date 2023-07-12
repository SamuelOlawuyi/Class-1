package org.example.Entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.example.Entities.Store.availableUnit;
import static org.example.Entities.Store.products;

public class ProductReader {
    public ProductReader() throws IOException {
        String fileName = "C:\\Users\\olasa\\IdeaProjects\\TaskWeekThreeNew\\src\\main\\java\\org\\example\\productOrder\\ProducList.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = bufferedReader.readLine()) !=null){
                String commaAdder[] = line.split(",");
                if (commaAdder[0].contains("Unit"))continue;

                //System.out.println(Arrays.toString(commaAdder));

                Product product = new Product();
                product.setDescription(commaAdder[1]);
                product.setUnitPrice(Double.parseDouble(commaAdder[2]));
                product.setAmount(Double.parseDouble(commaAdder[3]));
                products.add(product);
                availableUnit.put(commaAdder[1], Integer.valueOf(commaAdder[0]));

            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ProductReader());
    }
}

