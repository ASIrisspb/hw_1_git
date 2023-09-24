package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4Dima extends AppCompatActivity {
    private String name;
    private int score; //для записи очков
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4_dima);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");
    }

    public void check (View view) {
        //метод требует доработки согласно заданию
        Intent intent = new Intent(Activity4Dima.this, Activity5Danimir.class);
        intent.putExtra("name", name);
        intent.putExtra("points", score);
        startActivity(intent);
    }
}