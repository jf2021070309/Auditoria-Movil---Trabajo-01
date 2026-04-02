package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxg;
import com.google.android.gms.internal.ads.zzdal;
import java.util.ArrayDeque;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfcy<R extends zzdal<AdT>, AdT extends zzcxg> {
    private final zzfcc zza;
    private final zzfcw<R, AdT> zzb;
    private final zzfby zzc;
    private zzfde<R, AdT> zze;
    private int zzf = 1;
    private final ArrayDeque<zzfcx<R, AdT>> zzd = new ArrayDeque<>();

    public zzfcy(zzfcc zzfccVar, zzfby zzfbyVar, zzfcw<R, AdT> zzfcwVar) {
        this.zza = zzfccVar;
        this.zzc = zzfbyVar;
        this.zzb = zzfcwVar;
        this.zzc.zza(new zzfbx(this) { // from class: com.google.android.gms.internal.ads.zzfct
            private final zzfcy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza() {
                this.zza.zzf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfde zzb(zzfcy zzfcyVar, zzfde zzfdeVar) {
        zzfcyVar.zze = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeD)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfcx<R, AdT> pollFirst = this.zzd.pollFirst();
                if (pollFirst == null || (pollFirst.zzb() != null && this.zza.zzc(pollFirst.zzb()))) {
                    zzfde<R, AdT> zzfdeVar = new zzfde<>(this.zza, this.zzb, pollFirst);
                    this.zze = zzfdeVar;
                    zzfdeVar.zza(new zzfcu(this, pollFirst));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zzc(zzfcx<R, AdT> zzfcxVar) {
        this.zzd.add(zzfcxVar);
    }

    public final synchronized zzfsm<zzfcv<R, AdT>> zzd(zzfcx<R, AdT> zzfcxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfcxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
