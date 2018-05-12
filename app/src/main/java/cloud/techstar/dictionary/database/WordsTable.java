package cloud.techstar.dictionary.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import cloud.techstar.dictionary.models.Words;

public class WordsTable {

    public WordsTable() {
        Words words = new Words();
    }

    public static String create(){
        return "CREATE TABLE "+Words.TABLE_WORDS+" (" +
                Words.WORD_ID + " TEXT PRIMARY KEY," +
                Words.WORD_CHARACTER + " TEXT," +
                Words.WORD_MEANING + " TEXT," +
                Words.WORD_MEANING_MN + " TEXT," +
                Words.WORD_KANJI + " TEXT," +
                Words.WORD_PART_OF_SPEECH + " TEXT," +
                Words.WORD_LEVEL + " TEXT," +
                Words.WORD_IS_MEMORIZE + " TEXT," +
                Words.WORD_IS_FAVORITE + " TEXT," +
                Words.WORD_CREATED + " TEXT);";
    }

    public void insert (Words words){
        if (words == null)
            return;

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        if (db == null)
            return;

        db.beginTransaction();
        try {
            ContentValues cv = new ContentValues();
            cv.put(Words.WORD_ID, words.getId());
            cv.put(Words.WORD_CHARACTER, words.getCharacter());
            cv.put(Words.WORD_MEANING, words.getMeaning());
            cv.put(Words.WORD_MEANING_MN, words.getMeaningMon());
            cv.put(Words.WORD_KANJI, words.getKanji());
            cv.put(Words.WORD_PART_OF_SPEECH, words.getPartOfSpeech());
            cv.put(Words.WORD_LEVEL, words.getLevel());
            cv.put(Words.WORD_IS_MEMORIZE, words.getIsMemorize());
            cv.put(Words.WORD_IS_FAVORITE, words.getIsFavorite());
            cv.put(Words.WORD_CREATED, words.getCreated());
            db.insert(Words.TABLE_WORDS, null, cv)'
            db.setTransactionSuccessful();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.endTransaction();
            DatabaseManager.getInstance().closeDatabase();
        }
    }

    public List<Words> selectAll(){
        List<Words> words = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + Words.TABLE_WORDS;

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()){
            do {
                Words word = new Words();
                word.setId(cursor.getString(Words.WORD_ID_INDEX));
                word.setCharacter(cursor.getString(Words.WORD_CHARACTER_INDEX));
                word.setMeaning(cursor.getString(Words.WORD_MEANING_INDEX));
                word.setMeaningMon(cursor.getString(Words.WORD_MEANING_MN_INDEX));
                word.setKanji(cursor.getString(Words.WORD_KANJI_INDEX));
                word.setPartOfSpeech(cursor.getString(Words.WORD_PART_OF_SPEECH_INDEX));
                word.setLevel(cursor.getString(Words.WORD_LEVEL_INDEX));
                word.setIsMemorize(cursor.getString(Words.WORD_IS_MEMORIZE_INDEX));
                word.setIsFavorite(cursor.getString(Words.WORD_IS_FAVORITE_INDEX));
                word.setCreated(cursor.getString(Words.WORD_CREATED_INDEX));
            } while (cursor.moveToNext());
        }
        return words;
    }
}






















