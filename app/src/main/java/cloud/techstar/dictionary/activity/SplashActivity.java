package cloud.techstar.dictionary.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.orhanobut.logger.Logger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.database.WordsTable;
import cloud.techstar.dictionary.models.Words;
import cloud.techstar.dictionary.utils.DicConstants;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SplashActivity extends AppCompatActivity {

    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler(Looper.getMainLooper());

        getWordsServer();
//        mHandler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashActivity.this, MainActivity.class));
//            }
//        }, 1000);
    }

    public void getWordsServer(){
        OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder()
                .url(DicConstants.API_URL)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Logger.e("Server connect error "+e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String res = response.body().string();
                Logger.json(res);

                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject ob = new JSONObject(res);
                            JSONArray memorize = ob.getJSONArray("memorize");
                            if (memorize.length() > 0) {
                                WordsTable wordsTable = new WordsTable();

                                for (int i = 0; i < memorize.length(); i++){
                                    Words words = new Words();
                                    words.setId(memorize.getJSONObject(i).getString("_id"));
                                    words.setCharacter(memorize.getJSONObject(i).getString("character"));
                                    words.setMeaning(memorize.getJSONObject(i).getString("meanings"));
                                    words.setMeaningMon(memorize.getJSONObject(i).getString("meaningsMongolia"));
                                    words.setPartOfSpeech(memorize.getJSONObject(i).getString("partOfSpeech"));
                                    words.setKanji(memorize.getJSONObject(i).getString("kanji"));
                                    words.setLevel(memorize.getJSONObject(i).getString("level"));
                                    words.setIsMemorize(memorize.getJSONObject(i).getString("isMemorize"));
                                    words.setIsFavorite(memorize.getJSONObject(i).getString("isFavorite"));
                                    words.setCreated(memorize.getJSONObject(i).getString("created"));
                                    wordsTable.insert(words);
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}
