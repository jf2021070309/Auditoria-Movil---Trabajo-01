package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzami implements zzaku {
    @Override // com.google.android.gms.internal.ads.zzaku
    public final zzalg zza(Looper looper, Handler.Callback callback) {
        return new zzaml(new Handler(looper, callback));
    }
}
