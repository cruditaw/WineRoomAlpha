package com.example.cdsm.projetl3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cdsm.projetl3.utils.OnLoginAttemptListener;


public class LoginFragment extends Fragment implements OnLoginAttemptListener {

    private OnLoginAttemptListener mListener;
    private EditText editMail;
    private EditText editPwd;

    // Required empty public constructor
    public LoginFragment() {}


    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
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

        if (mListener != null) {
            mListener.onLocalLoginAttempt(mail, pwd);
        }
    }

    private boolean isEmailValid(String email) {
        return email.matches(".{1,}@{1}.{1,}[.]{1}.{2,}");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnLoginAttemptListener) {
            mListener = (OnLoginAttemptListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onLocalLoginAttempt(String m, String p) {
        
    }
}
