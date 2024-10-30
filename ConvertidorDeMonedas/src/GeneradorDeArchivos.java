import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivos {

    public void  guardarJson(Conversion conversion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(conversion.base_code()+ conversion.target_code()+ conversion.conversion_rate()+".json");
        escritura.write(gson.toJson(conversion));
        escritura.close();


    }
}


