package com.amazon.aps.iva.o4;

import androidx.fragment.app.Fragment;
/* compiled from: SetTargetFragmentUsageViolation.kt */
/* loaded from: classes.dex */
public final class k extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment, Fragment fragment2, int i) {
        super(1, fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.yb0.j.f(fragment2, "targetFragment");
    }
}
