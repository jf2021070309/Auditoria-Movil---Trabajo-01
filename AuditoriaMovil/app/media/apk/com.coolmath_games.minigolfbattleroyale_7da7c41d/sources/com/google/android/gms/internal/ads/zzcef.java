package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcef {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcfa zzd;

    private zzcef() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcef(zzceg zzcegVar) {
    }

    public final zzcef zza(Context context) {
        if (context != null) {
            this.zza = context;
            return this;
        }
        throw null;
    }

    public final zzcef zzb(Clock clock) {
        if (clock != null) {
            this.zzb = clock;
            return this;
        }
        throw null;
    }

    public final zzcef zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcef zzd(zzcfa zzcfaVar) {
        this.zzd = zzcfaVar;
        return this;
    }

    public final zzcfb zze() {
        zzgli.zzc(this.zza, Context.class);
        zzgli.zzc(this.zzb, Clock.class);
        zzgli.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgli.zzc(this.zzd, zzcfa.class);
        return new zzceh(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
