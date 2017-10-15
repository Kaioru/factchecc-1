package io.github.omfgshaz.factchecc.feed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuyakaido.android.cardstackview.CardStackView;

import io.github.omfgshaz.factchecc.R;
import io.github.omfgshaz.factchecc.data.repository.DemoRepository;

public class FeedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_feed, container, false);

        CardStackView cardStackView = view.findViewById(R.id.card_stack_view);
        cardStackView.setAdapter(new FeedAdapter(getContext(), DemoRepository.data));

        return view;
    }
}
