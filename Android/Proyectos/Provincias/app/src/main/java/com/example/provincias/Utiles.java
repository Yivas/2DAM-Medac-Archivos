package com.example.provincias;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utiles {

    public static String leerJson(Context context, String fileName) throws IOException {

        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(context.getAssets().open(fileName)));

        String content = "";
        String line;

        while ((line = reader.readLine()) != null) {

        }

    }


}
