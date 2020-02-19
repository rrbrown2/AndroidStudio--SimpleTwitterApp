package com.codepath.apps.restclienttemplate.models;

import android.widget.ImageView;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    public String name;
    public String screenName;
    public String publicImgURL;

    public User(){}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.publicImgURL = jsonObject.getString("profile_image_url_https");

        return user;
    }
}
