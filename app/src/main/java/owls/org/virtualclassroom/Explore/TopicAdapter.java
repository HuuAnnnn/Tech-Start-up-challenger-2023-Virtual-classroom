package owls.org.virtualclassroom.Explore;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import owls.org.virtualclassroom.R;

public class TopicAdapter extends BaseAdapter {
    private ArrayList<Topic> topics;

    public TopicAdapter(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public int getCount() {
        return this.topics.size();
    }

    @Override
    public Topic getItem(int i) {
        return this.topics.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View topicView = view;
        if (view == null) {
            topicView = View.inflate(viewGroup.getContext(), R.layout.component_hot_topics, null);
        }

        Topic topic = getItem(i);
        TextView topicCard = (TextView) topicView.findViewById(R.id.ttvHotTopicComponent);
        topicCard.setText(topic.getName());
        topicCard.setBackgroundColor(topic.getColor());

        return topicView;
    }
}
