package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzexe<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    private final zzexo<RequestComponentT, AdT> zza;
    @GuardedBy("this")
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
        if (zzexpVar.zza == null) {
            return ((zzexd) this.zza).zzb(zzexpVar, zzexnVar, requestcomponentt);
        }
        zzcyj<AdT> zzP = requestcomponentt.zzP();
        return zzP.zzd(zzP.zzb(zzfsd.zza(zzexpVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }
}
