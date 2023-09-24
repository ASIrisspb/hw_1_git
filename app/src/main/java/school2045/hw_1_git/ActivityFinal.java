package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityFinal extends AppCompatActivity {
    private String name;
    private int score;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");
        resultText = findViewById(R.id.textView_final);
        resultText.setText(R.string.result_1);
        resultText.append(name + getString(R.string.result_2) +
                " " + score + " баллов");
    }
}