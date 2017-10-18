package com.kevinrak.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Kevin.Rak on 9/25/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
