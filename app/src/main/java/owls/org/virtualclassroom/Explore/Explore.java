package owls.org.virtualclassroom.Explore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import owls.org.virtualclassroom.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Explore#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Explore extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView rvHotTopics;
    private RecyclerView rvMyCourses;
    private ArrayList<Topic> hotTopics;
    private ArrayList<MyCourse> myCourses;
    private TopicAdapter topicAdapter;
    private MyCourseAdapter myCourseAdapter;

    public Explore() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Explore.
     */
    // TODO: Rename and change types and number of parameters
    public static Explore newInstance(String param1, String param2) {
        Explore fragment = new Explore();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hotTopics = new ArrayList<Topic>();
        myCourses = new ArrayList<MyCourse>();

        for (int i = 0; i < 10; i++) {
            hotTopics.add(new Topic("Topic " + (i + 1), "#008000"));
            myCourses.add(new MyCourse("Title" + i, "Edu title " + (i + 1), "Professional certificates", i + 0.9, 162 + i));
        }
        System.out.println(myCourses.size());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvHotTopics = (RecyclerView) view.findViewById(R.id.rvHotTopics);
        rvMyCourses = (RecyclerView) view.findViewById(R.id.rvMyCourse);

        topicAdapter = new TopicAdapter(hotTopics);
        rvHotTopics.setAdapter(topicAdapter);

        myCourseAdapter = new MyCourseAdapter(myCourses);
        rvMyCourses.setAdapter(myCourseAdapter);
        System.out.println(myCourseAdapter.getItemCount());

        LinearLayoutManager linearHotTopicLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvHotTopics.setLayoutManager(linearHotTopicLayoutManager);

        LinearLayoutManager linearMyCourseLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMyCourses.setLayoutManager(linearMyCourseLayoutManager);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}