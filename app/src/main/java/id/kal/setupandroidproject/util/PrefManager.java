package id.kal.setupandroidproject.util;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class PrefManager {

    public SharedPreferences sharedPreferences;
    public SharedPreferences.Editor editor;
    public String PREF_NAME= "default";

    public PrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE
        );
        editor = sharedPreferences.edit();
    }
}
