package id.kal.setupandroidproject.service;

import com.watoon.ingathutang.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Kristiawan on 21/04/18.
 */
public interface UserApi {

    @POST
    Call<User> login(@Url String url,
                     @Field("username") String username,
                     @Field("password") String password);
}
