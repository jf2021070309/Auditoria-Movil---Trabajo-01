package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzcoj;
import com.google.android.gms.internal.ads.zzcoo;
import com.google.android.gms.internal.ads.zzcox;
import com.google.android.gms.internal.ads.zzdrh;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzfbj;
import com.google.android.gms.internal.ads.zzffc;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzfsn;
import com.google.android.gms.internal.ads.zzgla;
import com.google.android.gms.internal.ads.zzgli;
import com.google.android.gms.internal.ads.zzgln;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzw implements zzgla<zzv> {
    private final zzgln<zzcoj> zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzaas> zzc;
    private final zzgln<zzfbj<zzdrh>> zzd;
    private final zzgln<zzfsn> zze;
    private final zzgln<ScheduledExecutorService> zzf;
    private final zzgln<zzdvi> zzg;
    private final zzgln<zzffc> zzh;
    private final zzgln<zzffu> zzi;
    private final zzgln<zzcgz> zzj;

    public zzw(zzgln<zzcoj> zzglnVar, zzgln<Context> zzglnVar2, zzgln<zzaas> zzglnVar3, zzgln<zzfbj<zzdrh>> zzglnVar4, zzgln<zzfsn> zzglnVar5, zzgln<ScheduledExecutorService> zzglnVar6, zzgln<zzdvi> zzglnVar7, zzgln<zzffc> zzglnVar8, zzgln<zzffu> zzglnVar9, zzgln<zzcgz> zzglnVar10) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
        this.zzg = zzglnVar7;
        this.zzh = zzglnVar8;
        this.zzi = zzglnVar9;
        this.zzj = zzglnVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzv(this.zza.zzb(), ((zzcoo) this.zzb).zza(), this.zzc.zzb(), this.zzd.zzb(), zzfsnVar, this.zzf.zzb(), this.zzg.zzb(), this.zzh.zzb(), this.zzi.zzb(), ((zzcox) this.zzj).zza());
    }
}
