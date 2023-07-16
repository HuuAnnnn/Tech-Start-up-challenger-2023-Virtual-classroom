package owls.org.virtualclassroom.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import owls.org.virtualclassroom.Config.Configuration;
import owls.org.virtualclassroom.Home.Home;
import owls.org.virtualclassroom.MainActivity;
import owls.org.virtualclassroom.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Home.class);
                startActivity(intent);
                finish();
            }
        }, Configuration.SPLASH_SCREEN_DELAY_TIME);
    }
}