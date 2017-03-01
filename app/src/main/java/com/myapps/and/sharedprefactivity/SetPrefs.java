package com.myapps.and.sharedprefactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Efrat on 1/3/2017.
 */

public class SetPrefs extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }


}
