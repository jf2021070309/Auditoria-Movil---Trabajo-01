package com.amazon.aps.iva.t5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public final class y implements d {
    @Override // com.amazon.aps.iva.t5.d
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.amazon.aps.iva.t5.d
    public final z b(Looper looper, Handler.Callback callback) {
        return new z(new Handler(looper, callback));
    }

    @Override // com.amazon.aps.iva.t5.d
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.amazon.aps.iva.t5.d
    public final void c() {
    }
}
