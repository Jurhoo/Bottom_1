package com.example.administrator.bottom.frag;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.bottom.R;

/**
 * Created by Administrator on 2017/10/29.
 */

public class FragHome extends Fragment {
    private String context;
    private TextView mTextView;

    public FragHome(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home,container,false);
//        mTextView = (TextView)view.findViewById(R.id.txt_content);
//        mTextView.setText(R.string.home);
        return view;
    }
}
