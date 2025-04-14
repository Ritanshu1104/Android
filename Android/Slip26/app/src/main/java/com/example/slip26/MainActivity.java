package com.example.slip26;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;         // ImageView to display the image
    private Button b1;            // Button to trigger the image change
    private int i = 0;            // Index to track current image
    private int[] images = {      // Array of images
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageView and Button
        iv = findViewById(R.id.imageView);
        b1 = findViewById(R.id.changeImageButton);

        // Set an initial image
        iv.setImageResource(images[i]);

        // Set the button click listener
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the image
                iv.setImageResource(images[i]);

                // Move to the next image
                i++;

                // If i reaches the end of the array, reset to 0
                if (i == images.length) {
                    i = 0;
                }
            }
        });
    }
}
