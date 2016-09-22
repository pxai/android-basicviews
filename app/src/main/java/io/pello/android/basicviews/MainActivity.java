package io.pello.android.basicviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        editText.setText("Modificado desde Java");
        textView.setText("DEsde Java");

    }

    public void cambiarTexto (View view) {
        editText.setText("Modificado desde botón");
        textView.setText("DEsde Java con el botón");
    }
}
