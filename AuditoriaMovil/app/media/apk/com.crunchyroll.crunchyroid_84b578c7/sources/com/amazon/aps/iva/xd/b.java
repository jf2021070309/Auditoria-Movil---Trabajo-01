package com.amazon.aps.iva.xd;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crunchyroll.auth.otpview.OtpTextLayout;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
/* compiled from: ActivityOtpBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final DataInputButton b;
    public final LayoutErrorsBinding c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final OtpTextLayout h;
    public final ProgressBar i;

    public b(ConstraintLayout constraintLayout, DataInputButton dataInputButton, LayoutErrorsBinding layoutErrorsBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, OtpTextLayout otpTextLayout, ProgressBar progressBar) {
        this.a = constraintLayout;
        this.b = dataInputButton;
        this.c = layoutErrorsBinding;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = otpTextLayout;
        this.i = progressBar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
