package com.vungle.publisher;

import android.os.SystemClock;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class zl {
    public long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }
}
