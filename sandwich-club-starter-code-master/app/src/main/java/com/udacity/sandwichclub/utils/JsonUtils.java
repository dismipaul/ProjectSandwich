package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {

        Sandwich s1=null;
        try
        {

            JSONObject Sdetails= new JSONObject(json);

            String name=Sdetails.getString("name");
            s1.setMainName(name);

            String alsoKnownAs=Sdetails.getString("alsoKnownAs");
            s1.setAlsoKnownAs(Collections.singletonList(alsoKnownAs));

            String placeOfOriginOrigin=Sdetails.getString("placeOfOrigin");
            s1.setPlaceOfOrigin(placeOfOriginOrigin);

            String description=Sdetails.getString("description");
            s1.setDescription(description);

            String image=Sdetails.getString("image");
            s1.setImage(description);

            String ingredients=Sdetails.getString("ingredients");
            s1.setIngredients(Collections.singletonList(ingredients));



        }
        catch (org.json.JSONException j)
        {

        }

        return s1;


    }
}
