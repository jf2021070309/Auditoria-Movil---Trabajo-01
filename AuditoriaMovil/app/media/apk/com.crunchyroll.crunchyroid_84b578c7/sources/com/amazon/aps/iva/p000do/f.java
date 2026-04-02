package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
/* compiled from: LayoutOverlayUserMigrationProgressBinding.java */
/* renamed from: com.amazon.aps.iva.do.f  reason: invalid package */
/* loaded from: classes2.dex */
public final class f implements a {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;

    public /* synthetic */ f(View view, View view2, int i) {
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
                return (RelativeLayout) view;
            default:
                return (TextView) view;
        }
    }
}
