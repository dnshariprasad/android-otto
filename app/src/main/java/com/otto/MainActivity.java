package com.otto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OtherActivity.start(this);
        BusProvider.getInstance().getBus().register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusProvider.getInstance().getBus().unregister(this);
    }

    @Subscribe
    public void getMessage(Report s) {
        Toast.makeText(this, s.toString(), Toast.LENGTH_LONG).show();
    }
}
