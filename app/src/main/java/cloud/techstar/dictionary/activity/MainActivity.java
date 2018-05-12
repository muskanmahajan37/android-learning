package cloud.techstar.dictionary.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import cloud.techstar.dictionary.R;
import cloud.techstar.dictionary.fragment.FavoriteFragment;
import cloud.techstar.dictionary.fragment.OptionsFragment;
import cloud.techstar.dictionary.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(SearchFragment.newInstance());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_search:
                    setFragment(SearchFragment.newInstance());
                    return true;
                case R.id.nav_favorite:
                    setFragment(FavoriteFragment.newInstance());
                    return true;
                case R.id.nav_menus:
                    setFragment(OptionsFragment.newInstance());
                    return true;
            }
            return false;
        }
    };

    private void setFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, fragment);
        transaction.commit();
    }
}
