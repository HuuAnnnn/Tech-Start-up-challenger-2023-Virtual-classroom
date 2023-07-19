package owls.org.virtualclassroom.MyCourse;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import owls.org.virtualclassroom.R;

public class EnrollCourseViewHolder extends RecyclerView.ViewHolder {

    ImageView thumbnail;
    TextView tvTitle;
    TextView tvOrgEduName;
    TextView tvProgress;
    public EnrollCourseViewHolder(@NonNull View itemView) {
        super(itemView);
        thumbnail = itemView.findViewById(R.id.imgvThumbnail);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvOrgEduName = itemView.findViewById(R.id.tveduOrgName);
        tvProgress = itemView.findViewById(R.id.tvProgress);
    }
}
