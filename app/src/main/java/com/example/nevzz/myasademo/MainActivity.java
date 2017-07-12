package com.example.nevzz.myasademo;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends Activity {

    private static final String TAG="MAIN ACTIVITY";
    Button membersButton,servicesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        membersButton=(Button)findViewById(R.id.but_members);
        servicesButton=(Button)findViewById(R.id.but_services);
        membersButton.setOnClickListener(new View.OnClickListener() {
            @Override   //explicit
            public void onClick(View view) {
                Intent intent1=new Intent(this,MembersActivity.class);
                Log.d(TAG, "to Members from OnClick");
                startActivity(intent1);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void goToMembers(View view){
        Intent intent=new Intent(this,MembersActivity.class);
        Log.d(TAG, "to Members");
        startActivity(intent);

    }
    public void goToServices(View view){
        Intent intent=new Intent(this, ServicesActivity.class);
        Log.d(TAG, "to Services");
        startActivity(intent);

    }
}
