package me.vickychijwani.spectre.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.vickychijwani.spectre.R;

public class GhostV0ErrorFragment extends BaseFragment {

    @Bind(R.id.error_title)     TextView mErrorTitle;
    @Bind(R.id.error_content)   TextView mErrorContent;
    @Bind(R.id.error_tip)       TextView mErrorTip;

    public static GhostV0ErrorFragment newInstance() {
        GhostV0ErrorFragment fragment = new GhostV0ErrorFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public GhostV0ErrorFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ghost_v0_error, container, false);
        ButterKnife.bind(this, view);
        mErrorTitle.setText(Html.fromHtml(mErrorTitle.getText().toString()));
        mErrorContent.setText(Html.fromHtml(mErrorContent.getText().toString()));
        mErrorTip.setText(Html.fromHtml(mErrorTip.getText().toString()));
        mErrorTitle.setMovementMethod(LinkMovementMethod.getInstance());
        mErrorContent.setMovementMethod(LinkMovementMethod.getInstance());
        mErrorTip.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

}
