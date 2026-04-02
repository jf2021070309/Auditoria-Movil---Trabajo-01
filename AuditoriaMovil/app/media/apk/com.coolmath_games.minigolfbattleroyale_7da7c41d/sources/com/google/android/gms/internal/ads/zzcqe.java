package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqe implements zzdwq {
    private final zzcqu zza;
    private Context zzb;
    private zzbqm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqe(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final zzdwr zza() {
        zzgli.zzc(this.zzb, Context.class);
        zzgli.zzc(this.zzc, zzbqm.class);
        return new zzcqf(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final /* bridge */ /* synthetic */ zzdwq zzb(zzbqm zzbqmVar) {
        if (zzbqmVar != null) {
            this.zzc = zzbqmVar;
            return this;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final /* bridge */ /* synthetic */ zzdwq zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }
}
