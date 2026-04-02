package com.amazon.aps.iva.o4;

import androidx.fragment.app.Fragment;
/* compiled from: RetainInstanceUsageViolation.kt */
/* loaded from: classes.dex */
public abstract class i extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i, Fragment fragment, String str) {
        super(fragment, str);
        if (i != 1) {
            com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
            return;
        }
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        super(fragment, str);
    }
}
