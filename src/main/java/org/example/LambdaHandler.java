package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String Mes, Context context) {

        context.getLogger().log(">>>>>>>> Funcion lambda ejecutada");
        return "DONE";
    }
}
