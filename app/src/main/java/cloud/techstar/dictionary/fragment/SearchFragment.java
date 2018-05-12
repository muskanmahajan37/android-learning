package cloud.techstar.dictionary.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;

import java.util.List;

import cloud.techstar.dictionary.AppMain;
import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.adapter.WordListAdapter;
import cloud.techstar.dictionary.database.WordsTable;
import cloud.techstar.dictionary.models.Words;

public class SearchFragment extends Fragment {

    public static SearchFragment newInstance() {
        // Required empty public constructor
        SearchFragment searchFragment = new SearchFragment();
        return searchFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_search, container, false);

        WordsTable wordsTable = new WordsTable();

        List<Words> words = wordsTable.selectAll();
        Logger.e(String.valueOf(words));
        RecyclerView recyclerView = root.findViewById(R.id.word_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AppMain.getContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new WordListAdapter(AppMain.getContext(), words);
        recyclerView.setAdapter(adapter);
        return root;
    }

}
