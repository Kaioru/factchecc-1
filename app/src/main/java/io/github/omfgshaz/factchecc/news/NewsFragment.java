package io.github.omfgshaz.factchecc.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.omfgshaz.factchecc.R;
import io.github.omfgshaz.factchecc.data.repository.DemoRepository;

public class NewsFragment extends Fragment {

    NewsRecyclerAdapter newsRecyclerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_news, container, false);

        setUpRecyclerView(view);

        return view;
    }

    public void setUpRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        newsRecyclerAdapter = new NewsRecyclerAdapter(getContext());
        recyclerView.setAdapter(newsRecyclerAdapter);

        newsRecyclerAdapter.setData(DemoRepository.data);
        newsRecyclerAdapter.notifyDataSetChanged();

    }
}
