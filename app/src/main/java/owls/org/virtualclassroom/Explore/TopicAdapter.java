package owls.org.virtualclassroom.Explore;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import owls.org.virtualclassroom.R;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {
    public static class TopicViewHolder extends RecyclerView.ViewHolder {
        private TextView topicCard;
        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
            topicCard = (TextView) itemView.findViewById(R.id.ttvHotTopicComponent);
        }
    }

    private ArrayList<Topic> topics;

    public TopicAdapter(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    @NonNull
    @Override
    public TopicAdapter.TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View hotTopicView = inflater.inflate(R.layout.component_hot_topics, parent, false);

        TopicAdapter.TopicViewHolder viewTopicHolder = new TopicAdapter.TopicViewHolder(hotTopicView);
        return viewTopicHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicViewHolder holder, int position) {
        Topic topic = topics.get(position);
        holder.topicCard.setText(topic.getName());
        holder.topicCard.setBackgroundColor(topic.getColor());
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
}
