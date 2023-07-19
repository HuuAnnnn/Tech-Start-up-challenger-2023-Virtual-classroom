package owls.org.virtualclassroom.MyCourse;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import owls.org.virtualclassroom.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DisplayEnrollCourse#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DisplayEnrollCourse extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerViewEnrollCourse;
    private EnrollCourseAdapter enrollCourseAdapter;
    private ArrayList<EnrollCourse> enrollCourseArrayList;
    public DisplayEnrollCourse() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DisplayEnrollCourse.
     */
    // TODO: Rename and change types and number of parameters
    public static DisplayEnrollCourse newInstance(String param1, String param2) {
        DisplayEnrollCourse fragment = new DisplayEnrollCourse();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_enroll_course, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewEnrollCourse = view.findViewById(R.id.enrollCourseRecyclerView);
        enrollCourseArrayList = new ArrayList<EnrollCourse>();
        enrollCourseArrayList.add(new EnrollCourse("Financial Market", "Yale University", "String level", 56, "String thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Introdution to Statistics", " Standford University", " level", 33, "String "));
        enrollCourseArrayList.add(new EnrollCourse("IBM Data Analust", "IMB ", "String ", 78, " thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Financial Market", "Yale University", "String level", 56, "String thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Introdution to Statistics", " Standford University", " level", 33, "String "));
        enrollCourseArrayList.add(new EnrollCourse("IBM Data Analust", "IMB ", "String ", 78, " thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Financial Market", "Yale University", "String level", 56, "String thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Introdution to Statistics", " Standford University", " level", 33, "String "));
        enrollCourseArrayList.add(new EnrollCourse("IBM Data Analust", "IMB ", "String ", 78, " thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Financial Market", "Yale University", "String level", 56, "String thumbnail"));
        enrollCourseArrayList.add(new EnrollCourse("Introdution to Statistics", " Standford University", " level", 33, "String "));
        enrollCourseArrayList.add(new EnrollCourse("IBM Data Analust", "IMB ", "String ", 78, " thumbnail"));
        enrollCourseAdapter = new EnrollCourseAdapter(getActivity(), enrollCourseArrayList);
        recyclerViewEnrollCourse.setAdapter(enrollCourseAdapter);
        recyclerViewEnrollCourse.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}