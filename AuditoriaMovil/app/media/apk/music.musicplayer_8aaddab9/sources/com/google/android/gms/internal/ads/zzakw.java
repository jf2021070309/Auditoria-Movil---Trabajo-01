package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzakw {
    private final zzaku zza;
    private boolean zzb;

    public zzakw() {
        throw null;
    }

    public zzakw(zzaku zzakuVar) {
        this.zza = zzakuVar;
    }

    public final synchronized boolean zza() {
        if (this.zzb) {
            return false;
        }
        this.zzb = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z;
        z = this.zzb;
        this.zzb = false;
        return z;
    }

    public final synchronized void zzc() throws InterruptedException {
        while (!this.zzb) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z = false;
        while (!this.zzb) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze() {
        return this.zzb;
    }
}
