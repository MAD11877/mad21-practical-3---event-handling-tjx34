package sg.edu.np.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ImageView profileImageView = findViewById(R.id.imageView);
        profileImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick
        });
    }
}