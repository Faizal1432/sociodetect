package com.example.sociodetect;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class UserFeedback extends AppCompatActivity {

    EditText text1;
    EditText text2;
    EditText text3;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_feedback);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1   = (EditText)findViewById(R.id.PersonName);
                text2   = (EditText)findViewById(R.id.Email);
                text3   = (EditText)findViewById(R.id.Feedback);
            }
        });
    }
}