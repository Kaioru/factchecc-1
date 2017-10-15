package io.github.omfgshaz.factchecc.news;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import io.github.omfgshaz.factchecc.R;
import io.github.omfgshaz.factchecc.data.model.Article;
import io.github.omfgshaz.factchecc.details.DetailsActivity;

public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Article> data;

    public NewsRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(context);
        }

        View view = layoutInflater.inflate(R.layout.item_news, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Article article = data.get(position);

        Glide.with(context).load(article.getImageURL()).into(holder.imageIv);
        holder.titleTv.setText(article.getTitle());
        holder.ratingBar.setRating((article.getRating() / 100.0f) * 5.0f);
        holder.ratingTv.setText(article.getRating() + "%");
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void setData(List<Article> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageIv;
        public TextView titleTv;
        public RatingBar ratingBar;
        public TextView ratingTv;

        public ViewHolder(View itemView) {
            super(itemView);

            imageIv = itemView.findViewById(R.id.image);
            titleTv = itemView.findViewById(R.id.title);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            ratingTv = itemView.findViewById(R.id.rating_text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);

                    view.getContext().startActivity(intent);
                }
            });
        }
    }

}
