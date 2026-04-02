package com.amazon.aps.iva.cm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: AvatarItemLayoutBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final View c;
    public final View d;

    public /* synthetic */ c(ViewGroup viewGroup, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    public final LinearLayout a() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 1:
                return (LinearLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return (ConstraintLayout) this.b;
            case 1:
                return a();
            default:
                return a();
        }
    }
}
