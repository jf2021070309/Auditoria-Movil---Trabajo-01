package com.amazon.aps.iva.vf;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutContentRatingControlsBinding.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final View c;
    public final View d;

    public /* synthetic */ b(ViewGroup viewGroup, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    public final ConstraintLayout a() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 1:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return (LinearLayoutCompat) this.b;
            case 1:
                return a();
            default:
                return a();
        }
    }
}
