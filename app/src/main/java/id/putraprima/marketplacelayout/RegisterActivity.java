package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void handleBack (View view) {
        Intent intent = new Intent (RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void handleNext (View view) {
        Intent intent = new Intent (RegisterActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

}

