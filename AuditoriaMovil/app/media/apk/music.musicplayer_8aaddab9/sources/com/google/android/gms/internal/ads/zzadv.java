package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzadv implements zzahv, zzahw {
    private final int zza;
    private zzahx zzc;
    private int zzd;
    private int zze;
    private zziu zzf;
    private zzafv[] zzg;
    private long zzh;
    private boolean zzj;
    private boolean zzk;
    private final zzafw zzb = new zzafw();
    private long zzi = Long.MIN_VALUE;

    public zzadv(int i2) {
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public void zzE(int i2, Object obj) throws zzaeg {
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public int zzG() throws zzaeg {
        return 0;
    }

    public void zzL(zzafv[] zzafvVarArr, long j2, long j3) throws zzaeg {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public void zzM(float f2, float f3) throws zzaeg {
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final int zzac() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final zzahw zzad() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzae(int i2) {
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzaf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzag(zzahx zzahxVar, zzafv[] zzafvVarArr, zziu zziuVar, long j2, boolean z, boolean z2, long j3, long j4) throws zzaeg {
        zzakt.zzd(this.zze == 0);
        this.zzc = zzahxVar;
        this.zze = 1;
        zzq(z, z2);
        zzai(zzafvVarArr, zziuVar, j3, j4);
        zzr(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzah() throws zzaeg {
        zzakt.zzd(this.zze == 1);
        this.zze = 2;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzai(zzafv[] zzafvVarArr, zziu zziuVar, long j2, long j3) throws zzaeg {
        zzakt.zzd(!this.zzj);
        this.zzf = zziuVar;
        if (this.zzi == Long.MIN_VALUE) {
            this.zzi = j2;
        }
        this.zzg = zzafvVarArr;
        this.zzh = j3;
        zzL(zzafvVarArr, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final zziu zzaj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final boolean zzak() {
        return this.zzi == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final long zzal() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzam() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final boolean zzan() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzao() throws IOException {
        zziu zziuVar = this.zzf;
        Objects.requireNonNull(zziuVar);
        zziuVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzap(long j2) throws zzaeg {
        this.zzj = false;
        this.zzi = j2;
        zzr(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzaq() {
        zzakt.zzd(this.zze == 2);
        this.zze = 1;
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzar() {
        zzakt.zzd(this.zze == 1);
        zzafw zzafwVar = this.zzb;
        zzafwVar.zzb = null;
        zzafwVar.zza = null;
        this.zze = 0;
        this.zzf = null;
        this.zzg = null;
        this.zzj = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzas() {
        zzakt.zzd(this.zze == 0);
        zzafw zzafwVar = this.zzb;
        zzafwVar.zzb = null;
        zzafwVar.zza = null;
        zzv();
    }

    public final zzafw zzat() {
        zzafw zzafwVar = this.zzb;
        zzafwVar.zzb = null;
        zzafwVar.zza = null;
        return zzafwVar;
    }

    public final zzafv[] zzau() {
        zzafv[] zzafvVarArr = this.zzg;
        Objects.requireNonNull(zzafvVarArr);
        return zzafvVarArr;
    }

    public final zzahx zzav() {
        zzahx zzahxVar = this.zzc;
        Objects.requireNonNull(zzahxVar);
        return zzahxVar;
    }

    public final zzaeg zzaw(Throwable th, zzafv zzafvVar, boolean z, int i2) {
        int i3;
        if (zzafvVar != null && !this.zzk) {
            this.zzk = true;
            try {
                int zzH = zzH(zzafvVar) & 7;
                this.zzk = false;
                i3 = zzH;
            } catch (zzaeg unused) {
                this.zzk = false;
            } catch (Throwable th2) {
                this.zzk = false;
                throw th2;
            }
            return zzaeg.zzb(th, zzc(), this.zzd, zzafvVar, i3, z, i2);
        }
        i3 = 4;
        return zzaeg.zzb(th, zzc(), this.zzd, zzafvVar, i3, z, i2);
    }

    public final int zzax(zzafw zzafwVar, zzaf zzafVar, int i2) {
        zziu zziuVar = this.zzf;
        Objects.requireNonNull(zziuVar);
        int zzd = zziuVar.zzd(zzafwVar, zzafVar, i2);
        if (zzd == -4) {
            if (zzafVar.zzc()) {
                this.zzi = Long.MIN_VALUE;
                return this.zzj ? -4 : -3;
            }
            long j2 = zzafVar.zzd + this.zzh;
            zzafVar.zzd = j2;
            this.zzi = Math.max(this.zzi, j2);
        } else if (zzd == -5) {
            zzafv zzafvVar = zzafwVar.zza;
            Objects.requireNonNull(zzafvVar);
            if (zzafvVar.zzp != Long.MAX_VALUE) {
                zzaft zzaftVar = new zzaft(zzafvVar, null);
                zzaftVar.zzR(zzafvVar.zzp + this.zzh);
                zzafwVar.zza = new zzafv(zzaftVar);
                return -5;
            }
        }
        return zzd;
    }

    public final int zzay(long j2) {
        zziu zziuVar = this.zzf;
        Objects.requireNonNull(zziuVar);
        return zziuVar.zze(j2 - this.zzh);
    }

    public final boolean zzaz() {
        if (zzak()) {
            return this.zzj;
        }
        zziu zziuVar = this.zzf;
        Objects.requireNonNull(zziuVar);
        return zziuVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public zzalp zzi() {
        return null;
    }

    public void zzq(boolean z, boolean z2) throws zzaeg {
    }

    public void zzr(long j2, boolean z) throws zzaeg {
        throw null;
    }

    public void zzs() throws zzaeg {
    }

    public void zzt() {
    }

    public void zzu() {
        throw null;
    }

    public void zzv() {
    }
}
