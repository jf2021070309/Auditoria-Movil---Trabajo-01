package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
/* compiled from: ActivityAcceptTermsAndPrivacyPolicyBinding.java */
/* renamed from: com.amazon.aps.iva.do.a  reason: invalid package */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final CheckBox b;
    public final DataInputButton c;

    public a(ConstraintLayout constraintLayout, CheckBox checkBox, DataInputButton dataInputButton) {
        this.a = constraintLayout;
        this.b = checkBox;
        this.c = dataInputButton;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
