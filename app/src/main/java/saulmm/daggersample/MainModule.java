package saulmm.daggersample;

import android.app.Activity;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private final Activity activity;

    @Inject MainPresenter presenter;

    public MainModule (Activity activity) {

        this.activity = activity;
    }

    @Provides
    Activity activity() {
        return activity;
    }
}
