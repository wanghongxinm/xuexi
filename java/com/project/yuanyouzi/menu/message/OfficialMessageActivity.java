package com.project.laundryappui.menu.message;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.project.laundryappui.R;

public class OfficialMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_offcialmessage);

        back();
    }

    private void back() {
        ImageButton iBtn = findViewById(R.id.om_back);
        iBtn.setOnClickListener(view -> finish());
    }

}