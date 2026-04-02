package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdal;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzexk<R extends zzdal<? extends zzcxg>> {
    private final zzfcc zza;
    private final R zzb;
    private final Executor zzc;
    private zzexj zzd;

    public zzexk(zzfcc zzfccVar, R r, Executor executor) {
        this.zza = zzfccVar;
        this.zzb = r;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfcm zze() {
        zzfar zzN = this.zzb.zzN();
        return this.zza.zzd(zzN.zzd, zzN.zzf, zzN.zzj);
    }

    public final zzfsm<zzexj> zzc() {
        zzfsm zzf;
        zzexj zzexjVar = this.zzd;
        if (zzexjVar == null) {
            if (!zzbld.zza.zze().booleanValue()) {
                zzexj zzexjVar2 = new zzexj(null, zze(), null);
                this.zzd = zzexjVar2;
                zzf = zzfsd.zza(zzexjVar2);
            } else {
                zzf = zzfsd.zzf(zzfsd.zzj(zzfru.zzw((zzfsm) this.zzb.zzP().zzf(this.zza.zze())), new zzexh(this), this.zzc), zzeap.class, new zzexg(this), this.zzc);
            }
            return zzfsd.zzj(zzf, zzexf.zza, this.zzc);
        }
        return zzfsd.zza(zzexjVar);
    }
}
