package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nextName;
    private int score; //для записи очков

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextName = findViewById(R.id.editText_name);
    }
    public void start(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2Varya.class);
        intent.putExtra("name", nextName.getText().toString());
        intent.putExtra("points", score);
        startActivity(intent);
    }
}