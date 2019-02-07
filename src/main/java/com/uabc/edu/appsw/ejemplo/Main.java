package com.uabc.edu.appsw.ejemplo;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

         Alumno alumno=new Alumno(
                 3232,
                 "Venancio Ramuel",
                 "Salazar",
                 "Romanof",
                 "venancio.4545@hotmail.com");
        Gson gson=new Gson();
        String alumnoEnJSON =gson.toJson(alumno);

        System.err.println(alumnoEnJSON);

    }


}
