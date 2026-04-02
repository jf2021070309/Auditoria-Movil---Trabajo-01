package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzwf {
    private final AtomicInteger zza;
    private final Set<zzwc<?>> zzb;
    private final PriorityBlockingQueue<zzwc<?>> zzc;
    private final PriorityBlockingQueue<zzwc<?>> zzd;
    private final zzvm zze;
    private final zzvv zzf;
    private final zzvw[] zzg;
    private zzvo zzh;
    private final List<zzwe> zzi;
    private final List<zzwd> zzj;
    private final zzvt zzk;

    public zzwf(zzvm zzvmVar, zzvv zzvvVar, int i2) {
        zzvt zzvtVar = new zzvt(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue<>();
        this.zzd = new PriorityBlockingQueue<>();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzvmVar;
        this.zzf = zzvvVar;
        this.zzg = new zzvw[4];
        this.zzk = zzvtVar;
    }

    public final void zza() {
        zzvo zzvoVar = this.zzh;
        if (zzvoVar != null) {
            zzvoVar.zzb();
        }
        zzvw[] zzvwVarArr = this.zzg;
        for (int i2 = 0; i2 < 4; i2++) {
            zzvw zzvwVar = zzvwVarArr[i2];
            if (zzvwVar != null) {
                zzvwVar.zza();
            }
        }
        zzvo zzvoVar2 = new zzvo(this.zzc, this.zzd, this.zze, this.zzk, null);
        this.zzh = zzvoVar2;
        zzvoVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzvw zzvwVar2 = new zzvw(this.zzd, this.zzf, this.zze, this.zzk, null);
            this.zzg[i3] = zzvwVar2;
            zzvwVar2.start();
        }
    }

    public final <T> zzwc<T> zzb(zzwc<T> zzwcVar) {
        zzwcVar.zzg(this);
        synchronized (this.zzb) {
            this.zzb.add(zzwcVar);
        }
        zzwcVar.zzh(this.zza.incrementAndGet());
        zzwcVar.zzd("add-to-queue");
        zzd(zzwcVar, 0);
        this.zzc.add(zzwcVar);
        return zzwcVar;
    }

    public final <T> void zzc(zzwc<T> zzwcVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzwcVar);
        }
        synchronized (this.zzi) {
            for (zzwe zzweVar : this.zzi) {
                zzweVar.zza();
            }
        }
        zzd(zzwcVar, 5);
    }

    public final void zzd(zzwc<?> zzwcVar, int i2) {
        synchronized (this.zzj) {
            for (zzwd zzwdVar : this.zzj) {
                zzwdVar.zza();
            }
        }
    }
}
