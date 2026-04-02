package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzvt {
    private final Executor zza;

    public zzvt(Handler handler) {
        this.zza = new zzvr(this, handler);
    }

    public final void zza(zzwc<?> zzwcVar, zzwi<?> zzwiVar, Runnable runnable) {
        zzwcVar.zzq();
        zzwcVar.zzd("post-response");
        Executor executor = this.zza;
        ((zzvr) executor).zza.post(new zzvs(zzwcVar, zzwiVar, runnable));
    }

    public final void zzb(zzwc<?> zzwcVar, zzwl zzwlVar) {
        zzwcVar.zzd("post-error");
        zzwi zzb = zzwi.zzb(zzwlVar);
        Executor executor = this.zza;
        ((zzvr) executor).zza.post(new zzvs(zzwcVar, zzb, null));
    }
}
