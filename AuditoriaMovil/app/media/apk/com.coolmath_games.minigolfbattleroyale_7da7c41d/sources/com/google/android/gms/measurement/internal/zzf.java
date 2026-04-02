package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class zzf extends zze {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzfu zzfuVar) {
        super(zzfuVar);
        this.zzs.zzJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb() {
        if (!zza()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzc() {
        if (!this.zza) {
            if (zze()) {
                return;
            }
            this.zzs.zzK();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected abstract boolean zze();

    protected void zzf() {
    }

    public final void zzd() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzf();
        this.zzs.zzK();
        this.zza = true;
    }
}
