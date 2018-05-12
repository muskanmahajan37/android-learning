package cloud.techstar.dictionary;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;

import cloud.techstar.dictionary.database.DatabaseHelper;
import cloud.techstar.dictionary.database.DatabaseManager;

public class AppMain extends Application{

    private static Context context;
    @Override
    public void onCreate(){
        super.onCreate();
        context = this.getApplicationContext();
        DatabaseHelper dbHelper = new DatabaseHelper();
        DatabaseManager.initializeInstance(dbHelper);
        com.orhanobut.logger.Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public static Context getContext(){
        return context;
    }
}
