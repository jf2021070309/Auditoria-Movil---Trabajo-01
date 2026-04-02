package com.unity3d.player;

import android.os.Build;
/* loaded from: classes2.dex */
public final class j {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    static final e d;

    static {
        a = Build.VERSION.SDK_INT >= 21;
        b = Build.VERSION.SDK_INT >= 23;
        c = Build.VERSION.SDK_INT >= 24;
        d = b ? new h() : null;
    }
}
