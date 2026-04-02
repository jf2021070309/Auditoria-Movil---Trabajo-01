package com.amazon.aps.iva.mj;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutReportProblemButtonBinding.java */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final EditText b;
    public final FrameLayout c;

    public e(ConstraintLayout constraintLayout, EditText editText, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = editText;
        this.c = frameLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
