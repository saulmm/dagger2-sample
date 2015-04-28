package saulmm.daggersample;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {

        this.application = application;
    }

    @Provides @Singleton Application application() {
        return application;
    }

    @Provides @Singleton
    LocationManager provideLocationManager () {
        return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
    }
}
