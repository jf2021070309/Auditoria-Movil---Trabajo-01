package com.amazon.aps.iva.s6;

import android.os.SystemClock;
import com.amazon.aps.iva.t6.j;
/* compiled from: TrackSelectionUtil.java */
/* loaded from: classes.dex */
public final class v {
    public static j.a a(r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (rVar.b(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new j.a(1, 0, length, i);
    }
}
