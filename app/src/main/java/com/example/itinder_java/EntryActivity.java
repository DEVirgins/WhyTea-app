package com.example.itinder_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;


public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_entry);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestServerAuthCode("614743996912-ectf4r4sj222m10lrmn3lo2pd3c4sjm3.apps.googleusercontent.com")
                .build();
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        updateUI(account);
        GoogleSignInClient signInClient = GoogleSignIn.getClient(this, gso);
        findViewById(R.id.signIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(EntryActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                signIn(signInClient);
            }
        });
    }
    private void signIn(GoogleSignInClient signInClient) {
        Intent signInIntent = signInClient.getSignInIntent();
        startActivityForResult(signInIntent, 007);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 007) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private void updateUI(GoogleSignInAccount account) {
        Intent intent = new Intent(EntryActivity.this, SwipeActivity.class);
        intent.putExtra("acc", account);
        startActivity(intent);
    }
    private void handleSignInResult(Task<GoogleSignInAccount> task) {
        try {
            GoogleSignInAccount account = task.getResult(ApiException.class);
            updateUI(account);
        } catch (ApiException e) {
            Log.w(EntryActivity.class.getSimpleName(), "signInResult:failed code=" + e.getStatusCode());
            Toast.makeText(this, "hellooo", Toast.LENGTH_SHORT).show();
            updateUI(null);
        }
    }

}
