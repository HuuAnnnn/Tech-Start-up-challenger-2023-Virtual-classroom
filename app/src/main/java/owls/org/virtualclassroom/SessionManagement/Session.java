package owls.org.virtualclassroom.SessionManagement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Session {
    public final static String STORE_NAME = "V-classroom";
    public static void saveSession(HashMap<String, String> information, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(STORE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            for (String key : information.keySet()) {
                editor.putString(key, information.get(key));
            }
            editor.commit();
        }
    }
}
