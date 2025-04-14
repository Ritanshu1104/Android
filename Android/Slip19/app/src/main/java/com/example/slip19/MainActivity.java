package com.example.slip19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendEmailButton = findViewById(R.id.sendEmailButton);
        sendEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        // Set up the email intent
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"samruddhipangare8@gmail.com"}); // Replace with recipient's email
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello from Shravani");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is a test email from the Shravani!");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send email using"));
        } catch (android.content.ActivityNotFoundException ex) {
            // Handle the error if no email client is found
            ex.printStackTrace();
        }
    }
}
