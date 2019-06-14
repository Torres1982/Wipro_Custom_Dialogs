package com.wipro.wipro_custom_dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button alertButton, dateButton, timeButton;
    TextView textViewDate, textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertButton = findViewById(R.id.button_alert);
        dateButton = findViewById(R.id.button_date);
        timeButton = findViewById(R.id.button_time);
        textViewDate = findViewById(R.id.text_view_date);
        textViewTime = findViewById(R.id.text_view_time);

        setButtonListener(alertButton, this);
    }

    // Set the Listener for buttons
    private void setButtonListener(Button button, final Context context) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle);
                builder.setMessage("Alert Dialog Example");
                builder.setCancelable(false);
                builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
            }
        });
    }
}
