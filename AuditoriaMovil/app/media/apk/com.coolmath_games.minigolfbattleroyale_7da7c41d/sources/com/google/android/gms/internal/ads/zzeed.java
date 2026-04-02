package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeed<DelegateT, AdapterT> implements zzeec<AdapterT> {
    public final zzeec<DelegateT> zza;
    private final zzfln<DelegateT, AdapterT> zzb;

    public zzeed(zzeec<DelegateT> zzeecVar, zzfln<DelegateT, AdapterT> zzflnVar) {
        this.zza = zzeecVar;
        this.zzb = zzflnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        return this.zza.zza(zzfalVar, zzezzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<AdapterT> zzb(zzfal zzfalVar, zzezz zzezzVar) {
        return zzfsd.zzj(this.zza.zzb(zzfalVar, zzezzVar), this.zzb, zzchg.zza);
    }
}
