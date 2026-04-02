package com.amazon.aps.iva.ce;

import android.text.Editable;
import android.text.TextWatcher;
import com.crunchyroll.auth.otpview.OtpTextLayout;
/* compiled from: TextViewExtensions.kt */
/* loaded from: classes.dex */
public final class g implements TextWatcher {
    public final /* synthetic */ OtpTextLayout b;
    public final /* synthetic */ int c;

    public g(OtpTextLayout otpTextLayout, int i) {
        this.b = otpTextLayout;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            charSequence.length();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        j jVar = this.b.c;
        int i4 = this.c;
        jVar.b = i4;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            jVar.getView().setBackground(i4);
        } else {
            jVar.getView().Je(i4);
            int i5 = jVar.b + 1;
            jVar.getView().Hh(i5);
            jVar.b = i5;
        }
        jVar.getView().o4();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
