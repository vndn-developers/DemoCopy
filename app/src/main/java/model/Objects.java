package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by THANHHUNGPHAT on 16/06/2016.
 */
public class Objects {
    @SerializedName("items")
    @Expose
    private ArrayList<User> myBookses = new ArrayList<User>();

    public ArrayList<User> getMyBookses() {
        return myBookses;

    }

}
