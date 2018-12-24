package xyz.hotrain.app.snowyvillagewallpaper;

import android.os.Bundle;

import com.novoda.snowyvillagewallpaper.BuildConfig;
import com.novoda.snowyvillagewallpaper.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class PreferenceActivity extends AppCompatActivity {

    public static final boolean DEBUG = BuildConfig.DEBUG;

    public static final String PREF_BACKGROUND = "pref_background";

    public static final String BACKGROUND_DEEP_BLUE = "deep_blue";
    public static final String BACKGROUND_PURE_BLACK = "pure_black";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new PreferenceFragment())
                .commit();
    }

    public static class PreferenceFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
