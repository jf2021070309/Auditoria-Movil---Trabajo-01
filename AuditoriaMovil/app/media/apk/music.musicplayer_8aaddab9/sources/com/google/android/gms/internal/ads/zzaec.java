package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes.dex */
public final class zzaec implements zzalp {
    private final zzamh zza;
    private final zzaeb zzb;
    private zzahv zzc;
    private zzalp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzaec(zzaeb zzaebVar, zzaku zzakuVar) {
        this.zzb = zzaebVar;
        this.zza = new zzamh(zzakuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        zzalp zzalpVar = this.zzd;
        return zzalpVar != null ? zzalpVar.zzA() : this.zza.zzA();
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j2) {
        this.zza.zzc(j2);
    }

    public final void zzd(zzahv zzahvVar) throws zzaeg {
        zzalp zzalpVar;
        zzalp zzi = zzahvVar.zzi();
        if (zzi == null || zzi == (zzalpVar = this.zzd)) {
            return;
        }
        if (zzalpVar != null) {
            throw zzaeg.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzi;
        this.zzc = zzahvVar;
        zzi.zzz(this.zza.zzA());
    }

    public final void zze(zzahv zzahvVar) {
        if (zzahvVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        zzahv zzahvVar = this.zzc;
        if (zzahvVar == null || zzahvVar.zzw() || (!this.zzc.zzx() && (z || this.zzc.zzak()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzalp zzalpVar = this.zzd;
            Objects.requireNonNull(zzalpVar);
            long zzy = zzalpVar.zzy();
            if (this.zze) {
                if (zzy < this.zza.zzy()) {
                    this.zza.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zza();
                    }
                }
            }
            this.zza.zzc(zzy);
            zzahf zzA = zzalpVar.zzA();
            if (!zzA.equals(this.zza.zzA())) {
                this.zza.zzz(zzA);
                this.zzb.zzb(zzA);
            }
        }
        if (this.zze) {
            return this.zza.zzy();
        }
        zzalp zzalpVar2 = this.zzd;
        Objects.requireNonNull(zzalpVar2);
        return zzalpVar2.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        zzalp zzalpVar = this.zzd;
        if (zzalpVar != null) {
            zzalpVar.zzz(zzahfVar);
            zzahfVar = this.zzd.zzA();
        }
        this.zza.zzz(zzahfVar);
    }
}
