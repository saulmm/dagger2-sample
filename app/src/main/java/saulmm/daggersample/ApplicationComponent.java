package saulmm.daggersample;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject (AndroidApplication application);

    Application application();
    LocationManager locationManager();
}
