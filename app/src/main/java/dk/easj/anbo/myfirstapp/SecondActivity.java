package dk.easj.anbo.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String SHOESIZE = "shoesize";
    public static final String NAME = "navn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent data = getIntent();
        String navn = data.getStringExtra(NAME);
        Log.d("MINE", navn);
        TextView nameView = findViewById(R.id.secondNameTextView);
        nameView.setText(navn);
    }

    public void backButtonClicked(View view) {
        Intent intent = new Intent();
        intent.putExtra(SHOESIZE, 42);
        setResult(RESULT_OK, intent);
        finish();
    }
}
