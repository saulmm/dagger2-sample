package saulmm.daggersample;

import android.app.Activity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity homeActivity);

    Activity activity(); // Expose the activity to sub-graphs.

}
