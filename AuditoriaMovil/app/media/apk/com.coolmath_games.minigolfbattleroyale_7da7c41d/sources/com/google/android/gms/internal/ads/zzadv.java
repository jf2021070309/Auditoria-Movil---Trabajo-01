package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public zzadv(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public void zzE(int i, Object obj) throws zzaeg {
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public int zzG() throws zzaeg {
        return 0;
    }

    protected void zzL(zzafv[] zzafvVarArr, long j, long j2) throws zzaeg {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public void zzM(float f, float f2) throws zzaeg {
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
    public final void zzae(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzaf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzag(zzahx zzahxVar, zzafv[] zzafvVarArr, zziu zziuVar, long j, boolean z, boolean z2, long j2, long j3) throws zzaeg {
        zzakt.zzd(this.zze == 0);
        this.zzc = zzahxVar;
        this.zze = 1;
        zzq(z, z2);
        zzai(zzafvVarArr, zziuVar, j2, j3);
        zzr(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzah() throws zzaeg {
        zzakt.zzd(this.zze == 1);
        this.zze = 2;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzai(zzafv[] zzafvVarArr, zziu zziuVar, long j, long j2) throws zzaeg {
        zzakt.zzd(!this.zzj);
        this.zzf = zziuVar;
        if (this.zzi == Long.MIN_VALUE) {
            this.zzi = j;
        }
        this.zzg = zzafvVarArr;
        this.zzh = j2;
        zzL(zzafvVarArr, j, j2);
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
    public final void zzap(long j) throws zzaeg {
        this.zzj = false;
        this.zzi = j;
        zzr(j, false);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzafw zzat() {
        zzafw zzafwVar = this.zzb;
        zzafwVar.zzb = null;
        zzafwVar.zza = null;
        return zzafwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzafv[] zzau() {
        zzafv[] zzafvVarArr = this.zzg;
        if (zzafvVarArr == null) {
            throw null;
        }
        return zzafvVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzahx zzav() {
        zzahx zzahxVar = this.zzc;
        if (zzahxVar != null) {
            return zzahxVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaeg zzaw(Throwable th, zzafv zzafvVar, boolean z, int i) {
        int i2 = 4;
        if (zzafvVar != null && !this.zzk) {
            this.zzk = true;
            try {
                i2 = zzH(zzafvVar) & 7;
            } catch (zzaeg unused) {
            } finally {
                this.zzk = false;
            }
        }
        return zzaeg.zzb(th, zzc(), this.zzd, zzafvVar, i2, z, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzax(zzafw zzafwVar, zzaf zzafVar, int i) {
        zziu zziuVar = this.zzf;
        if (zziuVar != null) {
            int zzd = zziuVar.zzd(zzafwVar, zzafVar, i);
            if (zzd == -4) {
                if (zzafVar.zzc()) {
                    this.zzi = Long.MIN_VALUE;
                    return this.zzj ? -4 : -3;
                }
                long j = zzafVar.zzd + this.zzh;
                zzafVar.zzd = j;
                this.zzi = Math.max(this.zzi, j);
            } else if (zzd == -5) {
                zzafv zzafvVar = zzafwVar.zza;
                if (zzafvVar == null) {
                    throw null;
                }
                if (zzafvVar.zzp != LongCompanionObject.MAX_VALUE) {
                    zzaft zzaftVar = new zzaft(zzafvVar, null);
                    zzaftVar.zzR(zzafvVar.zzp + this.zzh);
                    zzafwVar.zza = new zzafv(zzaftVar);
                    return -5;
                }
            }
            return zzd;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public zzalp zzi() {
        return null;
    }

    protected void zzq(boolean z, boolean z2) throws zzaeg {
    }

    protected void zzr(long j, boolean z) throws zzaeg {
        throw null;
    }

    protected void zzs() throws zzaeg {
    }

    protected void zzt() {
    }

    protected void zzu() {
        throw null;
    }

    protected void zzv() {
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zzao() throws IOException {
        zziu zziuVar = this.zzf;
        if (zziuVar != null) {
            zziuVar.zzc();
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzay(long j) {
        zziu zziuVar = this.zzf;
        if (zziuVar != null) {
            return zziuVar.zze(j - this.zzh);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaz() {
        if (zzak()) {
            return this.zzj;
        }
        zziu zziuVar = this.zzf;
        if (zziuVar != null) {
            return zziuVar.zzb();
        }
        throw null;
    }
}
