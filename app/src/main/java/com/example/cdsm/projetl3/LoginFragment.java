package com.example.cdsm.projetl3;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cdsm.projetl3.entities.AppUser;
import com.example.cdsm.projetl3.entities.AppUserDao;
import com.example.cdsm.projetl3.utils.OnLoginAttemptListener;

import org.greenrobot.greendao.query.QueryBuilder;


public class LoginFragment extends Fragment /*implements OnLoginAttemptListener*/ {

    //private OnLoginAttemptListener mListener;
    private LoginActivity parentActivity;
    private EditText editMail;
    private EditText editPwd;

    public LoginFragment() {
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        parentActivity = (LoginActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void onLoginPressed() {
        String mail = editMail.getText().toString();
        String pwd = editPwd.getText().toString();

        if (mail.isEmpty() || pwd.isEmpty()) {
            Toast.makeText(getContext(), R.string.error_field_required, Toast.LENGTH_SHORT);
            return;
        }

        if (!isEmailValid(mail)) {
            Toast.makeText(getContext(), R.string.error_invalid_email, Toast.LENGTH_SHORT);
            return;
        }

        /*if (mListener != null) {
            mListener.onLocalLoginAttempt(mail, pwd);
        }*/
    }

    private boolean isEmailValid(String email) {
        return email.matches(".{1,}@{1}.{1,}[.]{1}.{2,}");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
       /* if (context instanceof OnLoginAttemptListener) {
            mListener = (OnLoginAttemptListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //mListener = null;
    }

   /* @Override
    public void onLocalLoginAttempt(String m, String p) {

    }*/

    class LoginAsyncTask extends AsyncTask<String, Void, Boolean> {


        @Override
        protected Boolean doInBackground(String... strings) {
// TODO: attempt authentication against a network service.
            if (validateLocalCredentials(strings[0], strings[1])) {
                Intent intent = new Intent(parentActivity, MainActivity.class);
                startActivity(intent);
            }

            try {
                // Simulate network access.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return false;
            }


            // TODO: register the new account here.
            return true;
        }

        private boolean validateLocalCredentials(String m, String p) {
            QueryBuilder<AppUser> qb = parentActivity.getAppUserDao().queryBuilder();
            qb.where(AppUserDao.Properties.AppUserMail.eq(m));
            AppUser luser = qb.unique();

            if (luser != null) {    // if account found

                if (luser.getAppUserPassword().equals(p)) {  // if password correct
                    Toast.makeText(getContext(), "Connected", Toast.LENGTH_LONG).show();
                    return true;
                } else {
                    Toast.makeText(getContext(), "Identifiants incorrects, mot de " +
                            "passe incorrect", Toast.LENGTH_LONG).show();
                    return false;
                }

            } else {
                Toast.makeText(getContext(), "Identifiants incorrects, utilisateur " +
                        "inexistant !", Toast.LENGTH_LONG).show();
                return false;
            }
        }
    }
}
