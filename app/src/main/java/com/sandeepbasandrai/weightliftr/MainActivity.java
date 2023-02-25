package com.sandeepbasandrai.weightliftr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private Toast toast;
    private Button button;

    private void onStartClick() {
        this.toast = Toast.makeText(this.context, "Howdy", Toast.LENGTH_LONG);
        this.toast.show();
        ViewGroup viewGroup = (ViewGroup) this.button.getParent();
        viewGroup.removeView(this.button);
    }

    private void overrideButtonOnClick(Button button) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onStartClick();
                }
            });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = getApplicationContext();
        this.button = findViewById(R.id.button_submit);

        overrideButtonOnClick(this.button);
    }
}