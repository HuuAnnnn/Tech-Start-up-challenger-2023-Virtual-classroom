package owls.org.virtualclassroom.Explore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import owls.org.virtualclassroom.Config.Utils;
import owls.org.virtualclassroom.R;

public class MyCourseAdapter extends RecyclerView.Adapter<MyCourseAdapter.MyCourseViewHolder> {

    public class MyCourseViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView eduOrg;
        TextView level;
        TextView rate;
        TextView numOfRated;

        public MyCourseViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.myCourseThumbnail);
            title = itemView.findViewById(R.id.myCourseTitle);
            eduOrg = itemView.findViewById(R.id.myCourseEducationOrg);
            level = itemView.findViewById(R.id.myCourseLevel);
            rate = itemView.findViewById(R.id.ttvMyCourseRate);
            numOfRated = itemView.findViewById(R.id.ttvNumberOfRated);
        }
    }

    private ArrayList<MyCourse> myCourses;

    public MyCourseAdapter(ArrayList<MyCourse> courses) {
        this.myCourses = courses;
    }

    @NonNull
    @Override
    public MyCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View myCourseView = inflater.inflate(R.layout.component_my_course, parent, false);
        return new MyCourseViewHolder(myCourseView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCourseViewHolder holder, int position) {
        MyCourse myCourse = myCourses.get(position);
        holder.title.setText(myCourse.getTitle());
        holder.eduOrg.setText(myCourse.getEduOrgName());
        holder.level.setText(myCourse.getLevel());
        holder.rate.setText(String.valueOf(myCourse.getRate()));
        holder.numOfRated.setText(String.format("(%d)", myCourse.getNumOfRated()));
        DownloadImageTask downloadImageTask = new DownloadImageTask(holder.thumbnail);
        downloadImageTask.execute(myCourse.getUrlThumbnail());
    }

    @Override
    public int getItemCount() {
        return myCourses.size();
    }
}
