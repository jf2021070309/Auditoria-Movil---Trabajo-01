package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzexe<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    private final zzexo<RequestComponentT, AdT> zza;
    private RequestComponentT zzb;

    public zzexe(zzexo<RequestComponentT, AdT> zzexoVar) {
        this.zza = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    /* renamed from: zza */
    public final synchronized RequestComponentT zzd() {
        return this.zzb;
    }

    public final synchronized zzfsm<AdT> zzb(zzexp zzexpVar, zzexn<RequestComponentT> zzexnVar, RequestComponentT requestcomponentt) {
        this.zzb = requestcomponentt;
        if (zzexpVar.zza != null) {
            zzcyj<AdT> zzP = this.zzb.zzP();
            return zzP.zzd(zzP.zzb(zzfsd.zza(zzexpVar.zza)));
        }
        return ((zzexd) this.zza).zzb(zzexpVar, zzexnVar, requestcomponentt);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }
}
