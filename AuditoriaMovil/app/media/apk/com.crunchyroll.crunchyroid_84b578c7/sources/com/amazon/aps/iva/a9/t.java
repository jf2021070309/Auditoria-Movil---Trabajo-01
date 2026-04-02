package com.amazon.aps.iva.a9;

import android.os.Build;
/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class t {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        a = true;
        b = true;
        if (i < 28) {
            z = false;
        }
        c = z;
    }
}
