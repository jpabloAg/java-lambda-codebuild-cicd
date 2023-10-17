package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Version 2.0");
        context.getLogger().log(">>>>>>>> Funcion lambda ejecutada");
        context.getLogger().log(">>>>>>>> Mensaje enviado: " + input);
        return "DONE";
    }
}
