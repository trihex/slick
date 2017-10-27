package com.trihex.slick;

import com.oracle.javafx.jmx.json.JSONDocument;
import com.oracle.javafx.jmx.json.JSONFactory;
import com.oracle.javafx.jmx.json.JSONReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

/**
 * Created by earmst207 on 10/26/17.
 */
public class AssetLoader {
    private final String assetBase = "/com/trihex/slick/assets";

    public void loadAssets()
    {
        try {
            InputStream is = getClass().getResourceAsStream(assetBase + "/things.json");
            Reader reader = new InputStreamReader(is);
            JSONReader jsonReader = JSONFactory.instance().makeReader(reader);
            JSONDocument document = jsonReader.build();
            List<Object> objects = document.array();

            objects.forEach((obj) -> {
                JSONDocument doc = (JSONDocument)obj;

                System.out.println(doc.getString("name"));
            });
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
