package com.amazon.aps.iva.on;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutCurrentFiltersBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final View c;
    public final View d;

    public /* synthetic */ d(ViewGroup viewGroup, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            default:
                return (FrameLayout) viewGroup;
        }
    }
}
