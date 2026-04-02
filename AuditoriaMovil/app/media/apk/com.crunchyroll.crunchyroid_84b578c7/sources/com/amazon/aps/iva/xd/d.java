package com.amazon.aps.iva.xd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutOtpTextBinding.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;

    public /* synthetic */ d(View view, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = view2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) view;
            case 1:
                return (LinearLayout) view;
            default:
                return (TextView) view;
        }
    }
}
