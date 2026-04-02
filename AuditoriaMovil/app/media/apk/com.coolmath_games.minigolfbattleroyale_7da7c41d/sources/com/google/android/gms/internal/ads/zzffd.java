package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffd implements zzgla<zzffc> {
    private final zzgln<zzffi> zza;
    private final zzgln<zzffp> zzb;
    private final zzgln<ScheduledExecutorService> zzc;

    public zzffd(zzgln<zzffi> zzglnVar, zzgln<zzffp> zzglnVar2, zzgln<ScheduledExecutorService> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgku zzc = zzgkz.zzc(this.zza);
        zzgku zzc2 = zzgkz.zzc(this.zzb);
        ScheduledExecutorService zzb = this.zzc.zzb();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgj)).booleanValue()) {
            obj = new zzfff((zzffc) zzc.zzb(), zzb);
        } else {
            obj = (zzffc) zzc2.zzb();
        }
        zzgli.zzb(obj);
        return obj;
    }
}
