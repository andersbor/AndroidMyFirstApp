package dk.easj.anbo.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       int shoe=  data.getIntExtra(SecondActivity.SHOESIZE, 0);
       Log.d("MINE", "shoe" + shoe);
    }

    public void buttonClicked(View view) {
        Log.d("MINE", "Knap trykket");
        Toast toast = Toast.makeText(this, "Du ramte knappen", Toast.LENGTH_LONG);
        toast.show();

        TextView messageView = findViewById(R.id.mainMessageTextView);
        ++counter;
        messageView.setText("Du har trykket! " + counter + " Gange");
    }

    public void goButtonClicked(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText nameView = findViewById(R.id.mainNameEditText);
        String name = nameView.getText().toString();
        intent.putExtra(SecondActivity.NAME, name);
        //startActivity(intent);
        startActivityForResult(intent, 14593);
    }
}
