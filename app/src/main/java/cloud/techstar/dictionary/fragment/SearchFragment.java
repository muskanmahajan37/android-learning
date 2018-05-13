package cloud.techstar.dictionary.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.orhanobut.logger.Logger;

import java.util.List;

import cloud.techstar.dictionary.AppMain;
import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.adapter.WordListAdapter;
import cloud.techstar.dictionary.adapter.WordSearchSuggestAdapter;
import cloud.techstar.dictionary.database.WordsTable;
import cloud.techstar.dictionary.models.Words;

public class SearchFragment extends Fragment {

    private MaterialSearchBar searchBar;
    private WordSearchSuggestAdapter wordSearchSuggestAdapter;
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

        wordSearchSuggestAdapter = new WordSearchSuggestAdapter(inflater);
        wordSearchSuggestAdapter.setSuggestions(words);

        searchBar = (MaterialSearchBar) root.findViewById(R.id.word_search_bar);
        searchBar.setMaxSuggestionCount(2);
        searchBar.setHint("Search word");
        searchBar.setCustomSuggestionAdapter(wordSearchSuggestAdapter);
        searchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                wordSearchSuggestAdapter.getFilter().filter(searchBar.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
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
