package com.example.innojam.sapinnojam;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NewRouteActivity extends ActionBarActivity {

    EditText name;
    EditText origin;
    EditText destination;
    EditText hour;
    Button createBtn;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_route);
        context = this;
        name = (EditText) findViewById(R.id.route_name_edit);
        origin = (EditText) findViewById(R.id.origin_edit);
        destination = (EditText) findViewById(R.id.destination_edit);
        hour = (EditText) findViewById(R.id.time_edit);
        createBtn = (Button) findViewById(R.id.button_create);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, NewRouteActivity.class);
                intent.putExtra("origin", origin.getText().toString());
                intent.putExtra("destination", destination.getText().toString());
                intent.putExtra("name", name.getText().toString());
                setResult(RESULT_OK, intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_route, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
