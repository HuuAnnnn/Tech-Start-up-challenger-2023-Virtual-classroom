package owls.org.virtualclassroom.LearningPath;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Objects;

import owls.org.virtualclassroom.R;

public class LessionViewAdapter extends RecyclerView.Adapter<LessionViewAdapter.ViewHolderTitle> {
    private List<Title> lessionList;
    private LayoutInflater inflater;
    private Context context;

    public LessionViewAdapter(List<Title> lessionList, Context context) {
        this.lessionList = lessionList;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderTitle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View lession = inflater.inflate(R.layout.component_title_lession, parent, false);
        LessionViewAdapter.ViewHolderTitle viewHolderTitle = new LessionViewAdapter.ViewHolderTitle(lession);
        return viewHolderTitle;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTitle holder, int position) {
        Title title = (Title) lessionList.get(position);
        holder.tvTitleLession.setText(title.getName());
    }

    @Override
    public int getItemCount() {
        if(lessionList==null){
            return 0;
        }
        return lessionList.size();
    }


    class ViewHolderTitle extends RecyclerView.ViewHolder{
        TextView tvTitleLession;
        public ViewHolderTitle(@NonNull View itemView) {
            super(itemView);
            tvTitleLession = itemView.findViewById(R.id.tvTitleLession);
        }
    }
}
