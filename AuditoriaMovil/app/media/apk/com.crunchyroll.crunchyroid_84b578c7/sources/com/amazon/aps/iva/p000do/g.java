package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.d9.a;
import com.ellation.widgets.SettingsRadioGroup;
/* compiled from: LayoutWelcomeMigrationOptionsBinding.java */
/* renamed from: com.amazon.aps.iva.do.g  reason: invalid package */
/* loaded from: classes2.dex */
public final class g implements a {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final AppCompatTextView g;
    public final SettingsRadioGroup h;

    public g(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, AppCompatTextView appCompatTextView, SettingsRadioGroup settingsRadioGroup) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = appCompatTextView;
        this.h = settingsRadioGroup;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
