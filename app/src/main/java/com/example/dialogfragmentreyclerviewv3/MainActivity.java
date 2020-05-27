package com.example.dialogfragmentreyclerviewv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_dialog;
    private RecgargeCheckBoxFragment recgargeCheckBoxFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();
        recgargeCheckBoxFragment = new RecgargeCheckBoxFragment();

        btn_dialog = findViewById(R.id.btn_dialog);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recgargeCheckBoxFragment.show(fragmentManager,"TV");
            }
        });
    }
}
