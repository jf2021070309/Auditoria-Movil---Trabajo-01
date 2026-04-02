package com.amazon.aps.iva.i4;

import android.os.Handler;
import android.os.Looper;
/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
public final class c {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
