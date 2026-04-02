package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzfg implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzdu zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzr zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzfg(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2) {
        this.zzb = zzduVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzrVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zze();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zze() throws Exception {
        long nanoTime;
        Method zzj;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzcp zzd = this.zzb.zzd();
        if (zzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
