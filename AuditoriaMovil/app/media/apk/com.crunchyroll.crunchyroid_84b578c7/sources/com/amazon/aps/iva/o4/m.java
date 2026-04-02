package com.amazon.aps.iva.o4;

import androidx.fragment.app.Fragment;
/* compiled from: Violation.kt */
/* loaded from: classes.dex */
public abstract class m extends RuntimeException {
    public final Fragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        this.b = fragment;
    }
}
