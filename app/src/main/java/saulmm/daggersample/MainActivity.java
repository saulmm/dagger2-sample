package saulmm.daggersample;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;


public class MainActivity extends Activity {

    private MainComponent mainComponent;
    @Inject MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this))
            .build();

        mainComponent.inject(this);

        mainPresenter.onCreate();
    }
}
