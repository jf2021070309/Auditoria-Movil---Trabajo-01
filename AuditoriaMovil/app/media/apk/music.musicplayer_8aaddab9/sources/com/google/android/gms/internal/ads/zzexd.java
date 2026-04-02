package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzexd<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    @GuardedBy("this")
    private RequestComponentT zza;

    @Override // com.google.android.gms.internal.ads.zzexo
    /* renamed from: zza */
    public final synchronized RequestComponentT zzd() {
        return this.zza;
    }

    public final synchronized zzfsm<AdT> zzb(zzexp zzexpVar, zzexn<RequestComponentT> zzexnVar, RequestComponentT requestcomponentt) {
        zzcyj<AdT> zzP;
        if (requestcomponentt != null) {
            this.zza = requestcomponentt;
        } else {
            this.zza = zzexnVar.zza(zzexpVar.zzb).zzf();
        }
        zzP = this.zza.zzP();
        return zzP.zzd(zzP.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }
}
