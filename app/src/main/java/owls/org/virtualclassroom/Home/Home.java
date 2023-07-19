package owls.org.virtualclassroom.Home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import owls.org.virtualclassroom.Explore.Explore;
import owls.org.virtualclassroom.MyCourse.DisplayEnrollCourse;
import owls.org.virtualclassroom.Profile.Profile;
import owls.org.virtualclassroom.R;

public class Home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.navigation);

        // make default item is selected is explore tab
        bottomNavigationView.setSelectedItemId(R.id.explore);
        changeFragment(new Explore());

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.settings:
                    changeFragment(new Profile());
                    break;
                case R.id.explore:
                    changeFragment(new Explore());
                    break;
                case R.id.my_course:
                    changeFragment(new DisplayEnrollCourse());
                    break;
            }

            return true;
        });
    }

    private void changeFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
}