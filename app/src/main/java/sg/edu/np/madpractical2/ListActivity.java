package sg.edu.np.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.AlertDialog;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        builder = new AlertDialog.Builder(this);
        final ImageView profileImageView = findViewById(R.id.imageView);
        profileImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("MADness")
                        .setCancelable(false)
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Random r = new Random();
                                int random_no = r.nextInt(999999999);
                                String random = String.valueOf(random_no);
                                Intent intent = new Intent(ListActivity.this,
                                        MainActivity.class);
                                intent.putExtra("RANDOM_INT", random);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Profile");
                alert.show();
            }
        });
    }
}