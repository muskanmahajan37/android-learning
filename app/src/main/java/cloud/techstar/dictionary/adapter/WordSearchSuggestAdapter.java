package cloud.techstar.dictionary.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import com.mancj.materialsearchbar.adapter.SuggestionsAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.models.Words;

public class WordSearchSuggestAdapter extends SuggestionsAdapter<Words, WordSearchSuggestAdapter.SuggestionHolder>{

    public WordSearchSuggestAdapter(LayoutInflater inflater) {
        super(inflater);
    }

    @Override
    public void onBindSuggestionHolder(Words suggestion, WordSearchSuggestAdapter.SuggestionHolder holder, int position) {
        holder.characterText.setText(suggestion.getCharacter());
        holder.meaningText.setText(suggestion.getMeaning());
    }

    @Override
    public int getSingleViewHeight() {
        return 80;
    }

    @NonNull
    @Override
    public WordSearchSuggestAdapter.SuggestionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.word_suggest_item, parent, false);
        return new SuggestionHolder(view);
    }

    public Filter getFilter(){
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                String term = constraint.toString();
                if (term.isEmpty())
                    suggestions = suggestions_clone;
                else {
                    suggestions = new ArrayList<>();
                    for (Words words : suggestions_clone)
                        if (words.getMeaning().toLowerCase().contains(term.toLowerCase()))
                            suggestions.add(words);
                }
                results.values = suggestions;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                suggestions = (ArrayList<Words>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public class SuggestionHolder extends RecyclerView.ViewHolder {
        protected TextView characterText;
        protected TextView meaningText;
        public SuggestionHolder(View itemView) {
            super(itemView);
            characterText = (TextView) itemView.findViewById(R.id.suggest_char);
            meaningText = (TextView) itemView.findViewById(R.id.suggest_meaning);
        }
    }
}
