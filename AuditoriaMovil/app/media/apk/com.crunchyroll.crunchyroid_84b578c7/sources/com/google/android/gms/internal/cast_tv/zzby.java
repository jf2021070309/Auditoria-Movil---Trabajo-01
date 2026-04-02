package com.google.android.gms.internal.cast_tv;

import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzby extends Handler {
    private final Looper zza;

    public zzby() {
        this.zza = Looper.getMainLooper();
    }

    public zzby(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
