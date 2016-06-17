package model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by THANHHUNGPHAT on 16/06/2016.
 */
public class User {
    @SerializedName("location")
    public String location;
    @SerializedName("oderby")
    public String oderby;
    @SerializedName("gender")
    public String gender;
    @SerializedName("social_id")

    public String social_id;
    @SerializedName("password")

    public String password;
    @SerializedName("thumbnail")

    public String thumbnail;
    @SerializedName("username")

    public String username;
    @SerializedName("email")

    public String email;
    @SerializedName("name")

    public String name;
    @SerializedName("roles")

    public String roles;
    @SerializedName("social_token")

    public String social_token;
    @SerializedName("birthday")

    public String birthday;
    @SerializedName("balances")

    public String balances;
    @SerializedName("id")
    public String id;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOderby() {
        return oderby;
    }

    public void setOderby(String oderby) {
        this.oderby = oderby;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSocial_id() {
        return social_id;
    }

    public void setSocial_id(String social_id) {
        this.social_id = social_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getSocial_token() {
        return social_token;
    }

    public void setSocial_token(String social_token) {
        this.social_token = social_token;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBalances() {
        return balances;
    }

    public void setBalances(String balances) {
        this.balances = balances;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
