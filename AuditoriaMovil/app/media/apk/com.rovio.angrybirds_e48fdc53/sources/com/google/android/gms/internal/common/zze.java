package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public class zze extends Handler {
    private static volatile zzf zzit = null;

    public zze() {
    }

    public zze(Looper looper) {
        super(looper);
    }

    public zze(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
