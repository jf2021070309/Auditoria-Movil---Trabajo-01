package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class zzmt {
    private final Handler zza;
    private final zzmu zzb;

    public zzmt(Handler handler, zzmu zzmuVar) {
        this.zza = zzmuVar == null ? null : handler;
        this.zzb = zzmuVar;
    }

    public final void zza(final zzaz zzazVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzazVar) { // from class: com.google.android.gms.internal.ads.zzmj
                private final zzmt zza;
                private final zzaz zzb;

                {
                    this.zza = this;
                    this.zzb = zzazVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(this.zzb);
                }
            });
        }
    }

    public final void zzb(final String str, final long j2, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str, j2, j3) { // from class: com.google.android.gms.internal.ads.zzmk
                private final zzmt zza;
                private final String zzb;
                private final long zzc;
                private final long zzd;

                {
                    this.zza = this;
                    this.zzb = str;
                    this.zzc = j2;
                    this.zzd = j3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(this.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzc(final zzafv zzafvVar, final zzba zzbaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzafvVar, zzbaVar) { // from class: com.google.android.gms.internal.ads.zzml
                private final zzmt zza;
                private final zzafv zzb;
                private final zzba zzc;

                {
                    this.zza = this;
                    this.zzb = zzafvVar;
                    this.zzc = zzbaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzd(final int i2, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, i2, j2) { // from class: com.google.android.gms.internal.ads.zzmm
                private final zzmt zza;
                private final int zzb;
                private final long zzc;

                {
                    this.zza = this;
                    this.zzb = i2;
                    this.zzc = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zze(final long j2, final int i2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, j2, i2) { // from class: com.google.android.gms.internal.ads.zzmn
                private final zzmt zza;
                private final long zzb;
                private final int zzc;

                {
                    this.zza = this;
                    this.zzb = j2;
                    this.zzc = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzf(final zzy zzyVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzyVar) { // from class: com.google.android.gms.internal.ads.zzmo
                private final zzmt zza;
                private final zzy zzb;

                {
                    this.zza = this;
                    this.zzb = zzyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(this.zzb);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable(this, obj, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzmp
                private final zzmt zza;
                private final Object zzb;
                private final long zzc;

                {
                    this.zza = this;
                    this.zzb = obj;
                    this.zzc = elapsedRealtime;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(this.zzb, this.zzc);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzmq
                private final zzmt zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(this.zzb);
                }
            });
        }
    }

    public final void zzi(final zzaz zzazVar) {
        zzazVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzazVar) { // from class: com.google.android.gms.internal.ads.zzmr
                private final zzmt zza;
                private final zzaz zzb;

                {
                    this.zza = this;
                    this.zzb = zzazVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(this.zzb);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzms
                private final zzmt zza;
                private final Exception zzb;

                {
                    this.zza = this;
                    this.zzb = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(this.zzb);
                }
            });
        }
    }

    public final /* synthetic */ void zzk(Exception exc) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzA(exc);
    }

    public final /* synthetic */ void zzl(zzaz zzazVar) {
        zzazVar.zza();
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzw(zzazVar);
    }

    public final /* synthetic */ void zzm(String str) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzv(str);
    }

    public final /* synthetic */ void zzn(Object obj, long j2) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzy(obj, j2);
    }

    public final /* synthetic */ void zzo(zzy zzyVar) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzx(zzyVar);
    }

    public final /* synthetic */ void zzp(long j2, int i2) {
        zzmu zzmuVar = this.zzb;
        int i3 = zzamq.zza;
        zzmuVar.zzz(j2, i2);
    }

    public final /* synthetic */ void zzq(int i2, long j2) {
        zzmu zzmuVar = this.zzb;
        int i3 = zzamq.zza;
        zzmuVar.zzu(i2, j2);
    }

    public final /* synthetic */ void zzr(zzafv zzafvVar, zzba zzbaVar) {
        int i2 = zzamq.zza;
        this.zzb.zzt(zzafvVar, zzbaVar);
    }

    public final /* synthetic */ void zzs(String str, long j2, long j3) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzs(str, j2, j3);
    }

    public final /* synthetic */ void zzt(zzaz zzazVar) {
        zzmu zzmuVar = this.zzb;
        int i2 = zzamq.zza;
        zzmuVar.zzr(zzazVar);
    }
}
