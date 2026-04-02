package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.vungle.warren.AdLoader;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public zzahs(zzahq zzahqVar, zzahr zzahrVar, zzaiq zzaiqVar, int i, zzaku zzakuVar, Looper looper) {
        this.zzb = zzahqVar;
        this.zza = zzahrVar;
        this.zzd = zzaiqVar;
        this.zzg = looper;
        this.zzc = zzakuVar;
        this.zzh = i;
    }

    public final zzahr zza() {
        return this.zza;
    }

    public final zzahs zzb(int i) {
        zzakt.zzd(!this.zzi);
        this.zze = i;
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

    public final synchronized boolean zzj(long j) throws InterruptedException, TimeoutException {
        zzakt.zzd(this.zzi);
        zzakt.zzd(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = AdLoader.RETRY_DELAY;
        long j3 = elapsedRealtime + AdLoader.RETRY_DELAY;
        while (!this.zzk) {
            if (j2 > 0) {
                wait(j2);
                j2 = j3 - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }
}
