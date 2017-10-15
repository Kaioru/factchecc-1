package io.github.omfgshaz.factchecc.feed;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import io.github.omfgshaz.factchecc.details.DetailsActivity;
import io.github.omfgshaz.factchecc.R;
import io.github.omfgshaz.factchecc.data.model.Article;

public class FeedAdapter extends ArrayAdapter<Article> {

    public FeedAdapter(@NonNull Context context, List<Article> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_feed, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Article article = getItem(position);

        viewHolder.heading.setText(article.getTitle());
        Glide.with(getContext()).load(article.getImageURL()).into(viewHolder.image);

        return convertView;
    }

    private static class ViewHolder {
        public TextView heading;
        public ImageView image;

        public ViewHolder(View view) {
            this.heading = view.findViewById(R.id.heading);
            this.image = view.findViewById(R.id.image);

            // Open details activity
            this.heading.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);

                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
