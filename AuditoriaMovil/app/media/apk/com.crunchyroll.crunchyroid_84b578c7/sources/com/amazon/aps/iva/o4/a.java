package com.amazon.aps.iva.o4;

import androidx.fragment.app.Fragment;
/* compiled from: FragmentReuseViolation.kt */
/* loaded from: classes.dex */
public final class a extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.yb0.j.f(str, "previousFragmentId");
    }
}
