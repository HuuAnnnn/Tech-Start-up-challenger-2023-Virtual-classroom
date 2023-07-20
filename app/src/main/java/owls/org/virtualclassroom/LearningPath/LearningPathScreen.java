package owls.org.virtualclassroom.LearningPath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import owls.org.virtualclassroom.MyCourse.EnrollCourse;
import owls.org.virtualclassroom.MyCourse.EnrollCourseAdapter;
import owls.org.virtualclassroom.R;

public class LearningPathScreen extends AppCompatActivity {
    private TabLayout tabLayoutLession;
    private ViewPager viewPagerLession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_path_screen1);
        tabLayoutLession = findViewById(R.id.tabLayoutLession);
        viewPagerLession = findViewById(R.id.viewPagerLession);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerLession.setAdapter(viewPagerAdapter);
        tabLayoutLession.setupWithViewPager(viewPagerLession);

    }
}