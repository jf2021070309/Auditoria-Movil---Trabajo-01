package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzadp {
    private final Context zza;
    private final zzadn zzb;

    public zzadp(Context context, Handler handler, zzado zzadoVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzadn(this, handler, zzadoVar);
    }
}
