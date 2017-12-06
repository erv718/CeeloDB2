package com.androiddev.brianrecuero.androidfinalproject;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Erventz on 12/4/2017.
 */

public class ModifyAccountView extends LinearLayout {
    // TextViews to serve as labels
    private TextView newUserNamePrompt;
    private TextView newEmailPrompt;
    private TextView newPasswordPrompt;
    private TextView oldUserNameLabel;
    private TextView oldEmailLabel;
    private TextView oldPasswordLabel;
    private TextView oldUserNameField;
    private TextView oldEmailField;

    // EditTexts to collect the Info
    private EditText oldPasswordEntry;
    private EditText newUserNameEntry;
    private EditText newEmailEntry;
    private EditText newPasswordEntry;

    // Button to add account to database
    private Button modifyAccount;

    // TableLayout and TableRows to format the create account form
    private TableLayout table;
    private TableRow oldUserNameRow;
    private TableRow oldEmailRow;
    private TableRow oldPasswordRow;

    private TableRow newUserNameRow;
    private TableRow newEmailRow;
    private TableRow newPasswordRow;

    public ModifyAccountView(Context context, OnClickListener listener) {
        super(context);
        this.setOrientation(LinearLayout.VERTICAL);
        this.setBackgroundColor(Color.parseColor("#EEEEEE")); // very light gray

        // TableLayout Layout parameters
        LayoutParams tableParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        tableParams.weight = 1.0f;

        // TableRow Layout parameters
        TableLayout.LayoutParams tableRowParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        tableRowParams.setMargins(0, 40, 0, 10);

        //EditText and TextView Layout parameters
        TableRow.LayoutParams editParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        editParams.weight = 0.20f;
        editParams.setMargins(5, 0, 0, 0);

        TableRow.LayoutParams textParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT);
        textParams.weight = 0.40f;
        textParams.setMargins(0, 0, 5, 0);

        // Button Layout parameters
        LayoutParams buttonParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        buttonParams.weight = 0.25f;
        buttonParams.setMargins(140, 0, 140, 75);

        // add TableLayout to LinearLayout
        table = new TableLayout(context);
        table.setLayoutParams(tableParams);
        addView(table);

        // add TableRow
        oldUserNameRow = new TableRow(context);
        oldUserNameRow.setLayoutParams(tableRowParams);
        table.addView(oldUserNameRow);

        // TextView for username
        oldUserNameLabel = new TextView(context);
        oldUserNameLabel.setText("Current Username: ");
        oldUserNameLabel.setTextSize(16);
        oldUserNameLabel.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldUserNameLabel.setTextColor(Color.parseColor("#444444"));
        oldUserNameLabel.setLayoutParams(textParams);
        oldUserNameRow.addView(newUserNamePrompt);

        // TextView for current username
        oldUserNameField = new TextView(context);
        oldUserNameField.setMaxLines(1);
        oldUserNameField.setText("");
        oldUserNameLabel.setTextSize(16);
        oldUserNameLabel.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldUserNameLabel.setTextColor(Color.parseColor("#444444"));
        oldUserNameLabel.setLayoutParams(textParams);
        oldUserNameRow.addView(oldUserNameField);


        oldEmailRow = new TableRow(context);
        oldEmailRow.setLayoutParams(tableRowParams);
        table.addView(oldEmailRow);

        // TextView for email
        oldEmailLabel = new TextView(context);
        oldEmailLabel.setText("Current Email Address: ");
        oldEmailLabel.setTextSize(16);
        oldEmailField.setGravity(Gravity.CENTER);
        oldEmailField.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldEmailField.setHintTextColor(Color.parseColor("#444444"));
        oldEmailField.setTextColor(Color.parseColor("#000000"));
        oldEmailField.setLayoutParams(editParams);
        oldEmailRow.addView(oldEmailLabel);
        
        
        // TextView for old email
        oldEmailField = new TextView(context);
        oldEmailField.setMaxLines(1);
        oldEmailField.setText("");
        oldEmailLabel.setTextSize(16);
        oldEmailField.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS); // email input
        oldEmailField.setGravity(Gravity.CENTER);
        oldEmailField.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldEmailField.setHintTextColor(Color.parseColor("#444444"));
        oldEmailField.setTextColor(Color.parseColor("#000000"));
        oldEmailField.setLayoutParams(editParams);
        oldEmailRow.addView(oldEmailField);


        oldPasswordRow = new TableRow(context);
        oldPasswordRow.setLayoutParams(tableRowParams);
        table.addView(oldPasswordRow);

        // TextView for password
        oldPasswordLabel = new TextView(context);
        oldPasswordLabel.setText("Password: ");
        oldPasswordLabel.setTextSize(16);
        oldPasswordLabel.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldPasswordLabel.setTextColor(Color.parseColor("#444444"));
        oldPasswordLabel.setLayoutParams(textParams);
        oldPasswordRow.addView(oldPasswordLabel);
        
        // EditText for current password
        oldPasswordEntry = new EditText(context);
        oldPasswordEntry.setMaxLines(1);
        oldPasswordEntry.setText("");
        oldPasswordEntry.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD); // password input
        oldPasswordEntry.setHint("enter your current password");
        oldPasswordEntry.setGravity(Gravity.CENTER);
        oldPasswordEntry.setBackgroundColor(Color.parseColor("#CCCCCC"));
        oldPasswordEntry.setHintTextColor(Color.parseColor("#444444"));
        oldPasswordEntry.setTextColor(Color.parseColor("#000000"));
        oldPasswordEntry.setLayoutParams(editParams);
        oldPasswordRow.addView(oldPasswordEntry);

        // TextView for username
        newUserNamePrompt = new TextView(context);
        newUserNamePrompt.setText("New Username: ");
        newUserNamePrompt.setTextSize(16);
        newUserNamePrompt.setBackgroundColor(Color.parseColor("#CCCCCC"));
        newUserNamePrompt.setTextColor(Color.parseColor("#444444"));
        newUserNamePrompt.setLayoutParams(textParams);
        newUserNameRow.addView( newUserNamePrompt );

        // editText for username
        newUserNameEntry = new EditText(context);
        newUserNameEntry.setMaxLines(1);
        newUserNameEntry.setText("");
        newUserNameEntry.setHint("enter your new username");
        newUserNameEntry.setGravity(Gravity.CENTER);
        newUserNameEntry.setBackgroundColor(Color.parseColor("#CCCCCC"));// light gray
        newUserNameEntry.setHintTextColor(Color.parseColor("#444444")); // dark gray
        newUserNameEntry.setTextColor(Color.parseColor("#000000")); // black
        newUserNameEntry.setLayoutParams(editParams);
        newUserNameRow.addView( newUserNameEntry );


        newEmailRow = new TableRow(context);
        newEmailRow.setLayoutParams(tableRowParams);
        table.addView( newEmailRow );

        // TextView for newEmail
        newEmailPrompt = new TextView(context);
        newEmailPrompt.setText("New Email Address: ");
        newEmailPrompt.setTextSize(16);
        newEmailPrompt.setBackgroundColor(Color.parseColor("#CCCCCC"));
        newEmailPrompt.setTextColor(Color.parseColor("#444444"));
        newEmailPrompt.setLayoutParams(textParams);
        newEmailRow.addView( newEmailPrompt );

        newEmailEntry = new EditText(context);
        newEmailEntry.setMaxLines(1);
        newEmailEntry.setText("");
        newEmailEntry.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS); // newEmail input
        newEmailEntry.setHint("enter your new email address");
        newEmailEntry.setGravity(Gravity.CENTER);
        newEmailEntry.setBackgroundColor(Color.parseColor("#CCCCCC"));
        newEmailEntry.setHintTextColor(Color.parseColor("#444444"));
        newEmailEntry.setTextColor(Color.parseColor("#000000"));
        newEmailEntry.setLayoutParams(editParams);
        newEmailRow.addView( newEmailEntry );


        newPasswordRow = new TableRow(context);
        newPasswordRow.setLayoutParams(tableRowParams);
        table.addView( newPasswordRow );

        // TextView for newPassword
        newPasswordPrompt = new TextView(context);
        newPasswordPrompt.setText("New Password: ");
        newPasswordPrompt.setTextSize(16);
        newPasswordPrompt.setBackgroundColor(Color.parseColor("#CCCCCC"));
        newPasswordPrompt.setTextColor(Color.parseColor("#444444"));
        newPasswordPrompt.setLayoutParams(textParams);
        newPasswordRow.addView( newPasswordPrompt );

        newPasswordEntry = new EditText(context);
        newPasswordEntry.setMaxLines(1);
        newPasswordEntry.setText("");
        newPasswordEntry.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD); // newPassword input
        newPasswordEntry.setHint("enter your new password");
        newPasswordEntry.setGravity(Gravity.CENTER);
        newPasswordEntry.setBackgroundColor(Color.parseColor("#CCCCCC"));
        newPasswordEntry.setHintTextColor(Color.parseColor("#444444"));
        newPasswordEntry.setTextColor(Color.parseColor("#000000"));
        newPasswordEntry.setLayoutParams(editParams);
        newPasswordRow.addView( newPasswordEntry );



        modifyAccount = new Button(context);
        modifyAccount.setText("Update Account");
        modifyAccount.setGravity(Gravity.CENTER);
        modifyAccount.setBackgroundColor(Color.parseColor("#CCCCCC"));
        modifyAccount.setTextColor(Color.parseColor("#444444"));
        modifyAccount.setOnClickListener(listener);
        modifyAccount.setEnabled(true);
        modifyAccount.setMaxLines(1);
        modifyAccount.setLayoutParams(buttonParams);
        addView(modifyAccount);
    }

    public EditText getOldPW() {
        return oldPasswordEntry;
    }

    public EditText getName() {
        return newUserNameEntry;
    }

    public EditText getMail() {
        return newEmailEntry;
    }

    public EditText getPW() {
        return newPasswordEntry;
    }
}