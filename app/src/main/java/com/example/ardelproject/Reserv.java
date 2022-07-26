package com.example.ardelproject;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Reserv extends Fragment {

    private View view;
    private EditText resfromPhone;
    private EditText restoPhone;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.reserv,container,false);

        resfromPhone = (EditText) view.findViewById(R.id.res_from_phone);
        resfromPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        restoPhone = (EditText) view.findViewById(R.id.res_to_phone);
        restoPhone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        return view;
    }
}
