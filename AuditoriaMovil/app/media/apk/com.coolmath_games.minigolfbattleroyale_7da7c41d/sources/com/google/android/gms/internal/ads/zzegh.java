package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzegh implements zzdkn {
    private final zzezz zza;
    private final zzbxn zzb;
    private final boolean zzc;
    private zzdbu zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegh(zzezz zzezzVar, zzbxn zzbxnVar, boolean z) {
        this.zza = zzezzVar;
        this.zzb = zzbxnVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zza(boolean z, Context context, zzdbp zzdbpVar) throws zzdkm {
        try {
            if (this.zzc ? this.zzb.zzm(ObjectWrapper.wrap(context)) : this.zzb.zzk(ObjectWrapper.wrap(context))) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzba)).booleanValue() || this.zza.zzU != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdkm("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdkm(th);
        }
    }

    public final void zzb(zzdbu zzdbuVar) {
        this.zzd = zzdbuVar;
    }
}
