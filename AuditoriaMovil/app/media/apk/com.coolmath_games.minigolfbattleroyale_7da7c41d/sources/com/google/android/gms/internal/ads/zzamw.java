package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzamw implements zzanr, zzans {
    private final int zza;
    private zzant zzb;
    private int zzc;
    private int zzd;
    private zzatb zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzamw(int i) {
        this.zza = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzA(zzann zzannVar, zzapg zzapgVar, boolean z) {
        int zzd = this.zze.zzd(zzannVar, zzapgVar, z);
        if (zzd == -4) {
            if (zzapgVar.zzc()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzapgVar.zzc += this.zzf;
        } else if (zzd == -5) {
            zzanm zzanmVar = zzannVar.zza;
            long j = zzanmVar.zzw;
            if (j != LongCompanionObject.MAX_VALUE) {
                zzannVar.zza = new zzanm(zzanmVar.zza, zzanmVar.zze, zzanmVar.zzf, zzanmVar.zzc, zzanmVar.zzb, zzanmVar.zzg, zzanmVar.zzj, zzanmVar.zzk, zzanmVar.zzl, zzanmVar.zzm, zzanmVar.zzn, zzanmVar.zzp, zzanmVar.zzo, zzanmVar.zzq, zzanmVar.zzr, zzanmVar.zzs, zzanmVar.zzt, zzanmVar.zzu, zzanmVar.zzv, zzanmVar.zzx, zzanmVar.zzy, zzanmVar.zzz, j + this.zzf, zzanmVar.zzh, zzanmVar.zzi, zzanmVar.zzd);
                return -5;
            }
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB(long j) {
        this.zze.zze(j - this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzanr, com.google.android.gms.internal.ads.zzans
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final zzans zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public zzaut zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzf(zzant zzantVar, zzanm[] zzanmVarArr, zzatb zzatbVar, long j, boolean z, long j2) throws zzamy {
        zzaup.zzd(this.zzd == 0);
        this.zzb = zzantVar;
        this.zzd = 1;
        zzs(z);
        zzh(zzanmVarArr, zzatbVar, j2);
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzg() throws zzamy {
        zzaup.zzd(this.zzd == 1);
        this.zzd = 2;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzh(zzanm[] zzanmVarArr, zzatb zzatbVar, long j) throws zzamy {
        zzaup.zzd(!this.zzh);
        this.zze = zzatbVar;
        this.zzg = false;
        this.zzf = j;
        zzt(zzanmVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final zzatb zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final boolean zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzk() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final boolean zzl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzn(long j) throws zzamy {
        this.zzh = false;
        this.zzg = false;
        zzu(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzo() throws zzamy {
        zzaup.zzd(this.zzd == 2);
        this.zzd = 1;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzp() {
        zzaup.zzd(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public int zzq() throws zzamy {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public void zzr(int i, Object obj) throws zzamy {
    }

    protected void zzs(boolean z) throws zzamy {
    }

    protected void zzt(zzanm[] zzanmVarArr, long j) throws zzamy {
    }

    protected void zzu(long j, boolean z) throws zzamy {
        throw null;
    }

    protected void zzv() throws zzamy {
    }

    protected void zzw() throws zzamy {
    }

    protected void zzx() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzant zzy() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzz() {
        return this.zzc;
    }
}
