package com.example.cdsm.projetl3;

import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.cdsm.projetl3.entities.AppUserDao;
import com.example.cdsm.projetl3.entities.DaoMaster;
import com.example.cdsm.projetl3.entities.DaoSession;
import com.example.cdsm.projetl3.utils.OnLoginAttemptListener;

public class LoginActivity extends AppCompatActivity implements OnLoginAttemptListener {

    //private UserLoginTask mAuthTask = null;

    // Database reference
    private DaoMaster.DevOpenHelper helper;
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    public static DaoSession daoSession;
    private AppUserDao appUserDao;

    private ProgressBar progressBar;
    private LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        progressBar = findViewById(R.id.ca_progress);

        /* Initialize database */
        helper = new DaoMaster.DevOpenHelper(this, "test", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        appUserDao = daoSession.getAppUserDao();

        //loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id
        //        .login_fragment);


    }

    @Override
    public void onLocalLoginAttempt(String m, String p) {

    }
}
