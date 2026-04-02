package com.amazon.aps.iva.b1;

import android.view.ViewStructure;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public final int a(ViewStructure viewStructure, int i) {
        j.f(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        j.f(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        j.f(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        j.f(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
