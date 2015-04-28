package saulmm.daggersample;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Inject;

public class AndroidApplication extends Application {

    @Inject
    LocationManager locationManager;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {

        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(new ApplicationModule(this))
            .build();

        applicationComponent.inject(this);
    }
}
