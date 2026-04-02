package com.amazon.aps.iva.xd;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
/* compiled from: ActivityEmailMandatoryBinding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final DataInputButton b;
    public final EmailInputView c;
    public final CheckBox d;
    public final LayoutErrorsBinding e;
    public final ProgressBar f;
    public final Toolbar g;

    public a(ConstraintLayout constraintLayout, DataInputButton dataInputButton, EmailInputView emailInputView, CheckBox checkBox, LayoutErrorsBinding layoutErrorsBinding, ProgressBar progressBar, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = dataInputButton;
        this.c = emailInputView;
        this.d = checkBox;
        this.e = layoutErrorsBinding;
        this.f = progressBar;
        this.g = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
