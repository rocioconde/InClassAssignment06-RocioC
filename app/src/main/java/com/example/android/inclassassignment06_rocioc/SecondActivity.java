package com.example.android.inclassassignment06_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText familyLastName;
    private EditText numberOfMembers;
    private CheckBox comingToParty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        familyLastName = (EditText) findViewById(R.id.family_last_name);
        numberOfMembers = (EditText) findViewById(R.id.number_of_members);
        comingToParty = (CheckBox) findViewById(R.id.coming_to_party);
    }

    public void submitFamily(View view) {


        String familyLastName1 = familyLastName.getText().toString();
        String numberOfMembers1 = numberOfMembers.getText().toString();
        int numberOfMembers2 = Integer.parseInt(numberOfMembers1);
        boolean comingToParty1;
        comingToParty1 = comingToParty.isChecked();

        Family f = new Family(familyLastName1, numberOfMembers2, comingToParty1);
        Intent intent = new Intent();
        intent.putExtra(Keys.FAMILY, f);
        setResult(RESULT_OK, intent);
        finish();


    }
}
