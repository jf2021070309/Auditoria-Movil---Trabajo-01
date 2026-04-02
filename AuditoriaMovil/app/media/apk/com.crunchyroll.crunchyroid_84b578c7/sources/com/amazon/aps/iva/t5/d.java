package com.amazon.aps.iva.t5;

import android.os.Handler;
import android.os.Looper;
/* compiled from: Clock.java */
/* loaded from: classes.dex */
public interface d {
    public static final y a = new y();

    long a();

    z b(Looper looper, Handler.Callback callback);

    void c();

    long elapsedRealtime();
}
