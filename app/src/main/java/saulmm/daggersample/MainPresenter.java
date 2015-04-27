package saulmm.daggersample;


import android.app.Activity;

import javax.inject.Inject;

public class MainPresenter {

    private final Activity activity;

    @Inject public MainPresenter(Activity activity) {

        this.activity = activity;
    }

    public void onCreate () {}
}
