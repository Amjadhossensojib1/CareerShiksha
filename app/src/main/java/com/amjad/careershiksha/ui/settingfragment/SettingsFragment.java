package com.amjad.careershiksha.ui.settingfragment;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.amjad.careershiksha.R;

public class SettingsFragment extends Fragment {

    private ImageView imageView;

    public SettingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        imageView = view.findViewById(R.id.iv_profile_coverimg);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            imageView.setRenderEffect(
                    RenderEffect.createBlurEffect(5f, 5f, Shader.TileMode.CLAMP)
            );
        }

        return view;
    }
}
