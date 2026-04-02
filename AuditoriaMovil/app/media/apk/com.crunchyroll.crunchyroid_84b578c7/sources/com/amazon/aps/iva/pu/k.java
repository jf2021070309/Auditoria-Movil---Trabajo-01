package com.amazon.aps.iva.pu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutCommentsToolbarBinding.java */
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;

    public /* synthetic */ k(ViewGroup viewGroup, View view, View view2, View view3, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
        this.e = view3;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (LinearLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }
}
