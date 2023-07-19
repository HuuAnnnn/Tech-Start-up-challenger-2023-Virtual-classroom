package owls.org.virtualclassroom.MyCourse;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import owls.org.virtualclassroom.R;

public class EnrollCourseAdapter extends RecyclerView.Adapter<EnrollCourseViewHolder> {
    private List<EnrollCourse> enrollCourseList;
    private LayoutInflater inflater;
    private Context context;
    public EnrollCourseAdapter(Context context, List<EnrollCourse> enrollCourseList){
        this.context = context;
        this.enrollCourseList = enrollCourseList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount(){
        if (enrollCourseList==null){
            return 0;
        }
        return enrollCourseList.size();
    }
    @NonNull
    @Override
    public EnrollCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View enrollCourse = inflater.inflate(R.layout.component_enroll_course, parent, false);
        EnrollCourseViewHolder enrollCourseViewHolder = new EnrollCourseViewHolder(enrollCourse);
        return enrollCourseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EnrollCourseViewHolder holder, int position) {
        EnrollCourse enrollCourse = (EnrollCourse) enrollCourseList.get(position);
        holder.tvProgress.setText("Progress: "+enrollCourse.getProgress());
        holder.tvOrgEduName.setText(enrollCourse.getEduOrgName());
        holder.tvTitle.setText(enrollCourse.getTitle());
        /*byte[] decodedString = Base64.decode(enrollCourse.getThumbnail(), Base64.DEFAULT);
        Bitmap thumbnailCourse = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        holder.thumbnail.setImageBitmap(thumbnailCourse);*/
    }

}
