package com.fyber.inneractive.sdk.player.c.k;

import android.os.Trace;
/* loaded from: classes.dex */
public final class s {
    public static void a(String str) {
        if (t.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (t.a >= 18) {
            Trace.endSection();
        }
    }
}
