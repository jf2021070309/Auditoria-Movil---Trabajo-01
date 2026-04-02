package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdal;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzewp<R extends zzdal<AdT>, AdT extends zzcxg> implements zzexo<R, zzfcl<R, AdT>> {
    private R zza;
    private final Executor zzb = zzfst.zza();

    public final R zza() {
        return this.zza;
    }

    public final zzfsm<zzfcl<R, AdT>> zzb(zzexp zzexpVar, zzexn<R> zzexnVar, R r) {
        zzdak<R> zza = zzexnVar.zza(zzexpVar.zzb);
        zza.zzh(new zzexu(true));
        R zzf = zza.zzf();
        this.zza = zzf;
        final zzcyj zzP = zzf.zzP();
        final zzfcl zzfclVar = new zzfcl();
        return zzfsd.zzj(zzfsd.zzi(zzfru.zzw((zzfsm) zzP.zzc()), new zzfrk(this, zzfclVar, zzP) { // from class: com.google.android.gms.internal.ads.zzewn
            private final zzewp zza;
            private final zzfcl zzb;
            private final zzcyj zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzfclVar;
                this.zzc = zzP;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                zzfcl zzfclVar2 = this.zzb;
                zzcyj zzcyjVar = this.zzc;
                zzfal zzfalVar = (zzfal) obj;
                zzfclVar2.zzb = zzfalVar;
                Iterator<zzezz> it = zzfalVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : it.next().zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcyjVar.zzd(zzfsd.zza(zzfalVar));
                    }
                }
                return zzfsd.zza(null);
            }
        }, this.zzb), new zzfln(zzfclVar) { // from class: com.google.android.gms.internal.ads.zzewo
            private final zzfcl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzfclVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                zzfcl zzfclVar2 = this.zza;
                zzfclVar2.zzc = (AdT) obj;
                return zzfclVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ zzfsm zzc(zzexp zzexpVar, zzexn zzexnVar, Object obj) {
        return zzb(zzexpVar, zzexnVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexo
    public final /* bridge */ /* synthetic */ Object zzd() {
        return this.zza;
    }
}
