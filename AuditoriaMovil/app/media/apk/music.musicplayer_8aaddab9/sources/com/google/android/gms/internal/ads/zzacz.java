package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public abstract class zzacz implements Callable {
    public final String zza = getClass().getSimpleName();
    public final zzabr zzb;
    public final String zzc;
    public final String zzd;
    public final zzyj zze;
    public Method zzf;
    public final int zzg;
    public final int zzh;

    public zzacz(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        this.zzb = zzabrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzyjVar;
        this.zzg = i2;
        this.zzh = i3;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        long nanoTime;
        Method zzq;
        int i2;
        try {
            nanoTime = System.nanoTime();
            zzq = this.zzb.zzq(this.zzc, this.zzd);
            this.zzf = zzq;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzq == null) {
            return null;
        }
        zza();
        zzaan zzj = this.zzb.zzj();
        if (zzj != null && (i2 = this.zzg) != Integer.MIN_VALUE) {
            zzj.zzc(this.zzh, i2, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
