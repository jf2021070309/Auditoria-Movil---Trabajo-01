package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.LinearLayout;
/* compiled from: LayoutPostCommentBinding.java */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final View c;
    public final View d;
    public final View e;

    public /* synthetic */ l(LinearLayout linearLayout, View view, View view2, View view3, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = view;
        this.d = view2;
        this.e = view3;
    }

    public final LinearLayout a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
            default:
                return linearLayout;
        }
    }
}
