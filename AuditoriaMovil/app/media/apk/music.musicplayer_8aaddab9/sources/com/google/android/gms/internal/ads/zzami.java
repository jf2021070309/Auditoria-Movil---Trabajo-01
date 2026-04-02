package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class zzami implements zzaku {
    @Override // com.google.android.gms.internal.ads.zzaku
    public final zzalg zza(Looper looper, Handler.Callback callback) {
        return new zzaml(new Handler(looper, callback));
    }
}
