package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzexd<RequestComponentT extends zzdal<AdT>, AdT> implements zzexo<RequestComponentT, AdT> {
    private RequestComponentT zza;

    @Override // com.google.android.gms.internal.ads.zzexo
    /* renamed from: zza */
    public final synchronized RequestComponentT zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }

    public final synchronized zzfsm<AdT> zzb(zzexp zzexpVar, zzexn<RequestComponentT> zzexnVar, RequestComponentT requestcomponentt) {
        zzcyj<AdT> zzP;
        if (requestcomponentt == null) {
            this.zza = zzexnVar.zza(zzexpVar.zzb).zzf();
        } else {
            this.zza = requestcomponentt;
        }
        zzP = this.zza.zzP();
        return zzP.zzd(zzP.zzc());
    }
}
