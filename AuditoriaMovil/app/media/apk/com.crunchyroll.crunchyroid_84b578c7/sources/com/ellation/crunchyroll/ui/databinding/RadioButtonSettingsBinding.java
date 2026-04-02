package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.amazon.aps.iva.d9.a;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class RadioButtonSettingsBinding implements a {
    public final RadioButton playerSettingsRadioButton;
    private final RadioButton rootView;

    private RadioButtonSettingsBinding(RadioButton radioButton, RadioButton radioButton2) {
        this.rootView = radioButton;
        this.playerSettingsRadioButton = radioButton2;
    }

    public static RadioButtonSettingsBinding bind(View view) {
        if (view != null) {
            RadioButton radioButton = (RadioButton) view;
            return new RadioButtonSettingsBinding(radioButton, radioButton);
        }
        throw new NullPointerException("rootView");
    }

    public static RadioButtonSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RadioButtonSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.radio_button_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public RadioButton getRoot() {
        return this.rootView;
    }
}
