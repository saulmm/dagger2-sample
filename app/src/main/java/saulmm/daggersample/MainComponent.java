package saulmm.daggersample;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity homeActivity);
}
