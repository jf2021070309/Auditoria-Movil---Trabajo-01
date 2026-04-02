package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
import com.ellation.widgets.input.password.PasswordInputView;
/* compiled from: ActivityCrOwnershipVerificationBinding.java */
/* renamed from: com.amazon.aps.iva.do.b  reason: invalid package */
/* loaded from: classes2.dex */
public final class b implements a {
    public final ConstraintLayout a;
    public final EmailInputView b;
    public final TextView c;
    public final DataInputButton d;
    public final PasswordInputView e;
    public final f f;
    public final ScrollView g;
    public final Toolbar h;

    public b(ConstraintLayout constraintLayout, EmailInputView emailInputView, TextView textView, DataInputButton dataInputButton, PasswordInputView passwordInputView, f fVar, ScrollView scrollView, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = emailInputView;
        this.c = textView;
        this.d = dataInputButton;
        this.e = passwordInputView;
        this.f = fVar;
        this.g = scrollView;
        this.h = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
