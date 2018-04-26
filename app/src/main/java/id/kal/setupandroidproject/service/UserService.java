package id.kal.setupandroidproject.service;


import id.kal.setupandroidproject.common.ApiUrl;
import id.kal.setupandroidproject.model.User;
import retrofit2.Call;

/**
 * Created by Kristiawan on 21/04/18.
 * this class for example
 */
public class UserService extends BaseService<UserApi> {

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }

        return instance;
    }

    public UserService() {
        setApi(UserApi.class);
    }

    public Call<User> login(String username, String password) {
        return getApi().login(ApiUrl.LOGIN_API, username, password);
    }
}
