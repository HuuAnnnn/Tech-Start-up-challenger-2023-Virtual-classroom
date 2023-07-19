package owls.org.virtualclassroom.Explore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import owls.org.virtualclassroom.R;

public class RecommendCoursesAdapter extends RecyclerView.Adapter<RecommendCoursesAdapter.RecommendCourseViewHolder> {
    public class RecommendCourseViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView eduOrg;
        TextView level;
        TextView rate;
        TextView numOfRated;

        public RecommendCourseViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.recommendCourseThumbnail);
            title = itemView.findViewById(R.id.recommendCourseTitle);
            eduOrg = itemView.findViewById(R.id.recommendCourseEduOrg);
            level = itemView.findViewById(R.id.recommendCourseLevel);
            rate = itemView.findViewById(R.id.recommendCourseRate);
            numOfRated = itemView.findViewById(R.id.recommendCourseNumOfRated);
        }
    }

    private ArrayList<MyCourse> myCourses;

    public RecommendCoursesAdapter(ArrayList<MyCourse> courses) {
        this.myCourses = courses;
    }

    @NonNull
    @Override
    public RecommendCoursesAdapter.RecommendCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View myCourseView = inflater.inflate(R.layout.component_recommend_courses, parent, false);
        return new RecommendCoursesAdapter.RecommendCourseViewHolder(myCourseView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendCoursesAdapter.RecommendCourseViewHolder holder, int position) {
        MyCourse myCourse = myCourses.get(position);
        holder.title.setText(myCourse.getTitle());
        holder.eduOrg.setText(myCourse.getEduOrgName());
        holder.level.setText(myCourse.getLevel());
        holder.rate.setText(String.valueOf(myCourse.getRate()));
        holder.numOfRated.setText(String.format("(%dK)", myCourse.getNumOfRated()));
    }

    @Override
    public int getItemCount() {
        return myCourses.size();
    }
}
