package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzahs {
    private final zzahr zza;
    private final zzahq zzb;
    private final zzaku zzc;
    private final zzaiq zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzahs(zzahq zzahqVar, zzahr zzahrVar, zzaiq zzaiqVar, int i2, zzaku zzakuVar, Looper looper) {
        this.zzb = zzahqVar;
        this.zza = zzahrVar;
        this.zzd = zzaiqVar;
        this.zzg = looper;
        this.zzc = zzakuVar;
        this.zzh = i2;
    }

    public final zzahr zza() {
        return this.zza;
    }

    public final zzahs zzb(int i2) {
        zzakt.zzd(!this.zzi);
        this.zze = i2;
        return this;
    }

    public final int zzc() {
        return this.zze;
    }

    public final zzahs zzd(Object obj) {
        zzakt.zzd(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final Object zze() {
        return this.zzf;
    }

    public final Looper zzf() {
        return this.zzg;
    }

    public final zzahs zzg() {
        zzakt.zzd(!this.zzi);
        this.zzi = true;
        this.zzb.zzi(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzj(long j2) throws InterruptedException, TimeoutException {
        zzakt.zzd(this.zzi);
        zzakt.zzd(this.zzg.getThread() != Thread.currentThread());
        long j3 = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.zzk) {
            if (j3 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j3);
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }
}
