package com.otto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String MESSAGE = "message";
    private EditText et_msg;
    private Button btn_ok;

    public static void start(Context context) {
        Intent starter = new Intent(context, OtherActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ok:
                BusProvider.getInstance().getBus().post(new Report(et_msg.getText().toString()));
                finish();
                break;
        }
    }
}
