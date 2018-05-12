package cloud.techstar.dictionary.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.database.WordsTable;
import cloud.techstar.dictionary.models.Words;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder> {

    private List<Words> words;
    private WordsTable wordsTable;

    public WordListAdapter(Context context, List<Words> words) {
        this.words = words;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView characterText;
        private TextView meaningText;
        private TextView meaningMnText;

        public ViewHolder(View itemView) {
            super(itemView);
            wordsTable = new WordsTable();
            characterText = itemView.findViewById(R.id.character_text);
            meaningText = itemView.findViewById(R.id.meaning_text);
            meaningMnText = itemView.findViewById(R.id.meaning_mn_text);
        }
    }

    @NonNull
    @Override
    public WordListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_recycler_item, parent, false);
        WordListAdapter.ViewHolder vh = new WordListAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.characterText.setText(words.get(position).getCharacter());
        holder.meaningText.setText(words.get(position).getMeaning());
        holder.meaningMnText.setText(words.get(position).getMeaningMon());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

}
