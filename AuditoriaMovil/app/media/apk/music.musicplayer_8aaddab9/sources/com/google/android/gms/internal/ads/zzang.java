package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzang {
    public final zzasp zza;
    public final Object zzb;
    public final int zzc;
    public final zzatb[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzang zzl;
    public zzatv zzm;
    private final zzanr[] zzn;
    private final zzans[] zzo;
    private final zzatu zzp;
    private final zzasr zzq;
    private zzatv zzr;
    private final zzcjy zzs;

    public zzang(zzanr[] zzanrVarArr, zzans[] zzansVarArr, long j2, zzatu zzatuVar, zzcjy zzcjyVar, zzasr zzasrVar, Object obj, int i2, int i3, boolean z, long j3, byte[] bArr) {
        this.zzn = zzanrVarArr;
        this.zzo = zzansVarArr;
        this.zzf = j2;
        this.zzp = zzatuVar;
        this.zzs = zzcjyVar;
        this.zzq = zzasrVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i2;
        this.zzg = i3;
        this.zzi = z;
        this.zzh = j3;
        this.zzd = new zzatb[2];
        this.zze = new boolean[2];
        this.zza = zzasrVar.zze(i3, zzcjyVar.zzl());
    }

    public final boolean zza() {
        return this.zzj && (!this.zzk || this.zza.zzq() == Long.MIN_VALUE);
    }

    public final boolean zzb() throws zzamy {
        zzatv zzd = this.zzp.zzd(this.zzo, this.zza.zzn());
        zzatv zzatvVar = this.zzr;
        if (zzatvVar != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (zzd.zza(zzatvVar, i2)) {
                }
            }
            return false;
        }
        this.zzm = zzd;
        return true;
    }

    public final long zzc(long j2, boolean z) {
        return zzd(j2, false, new boolean[2]);
    }

    public final long zzd(long j2, boolean z, boolean[] zArr) {
        zzats zzatsVar = this.zzm.zzb;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long zzB = this.zza.zzB(zzatsVar.zzb(), this.zze, this.zzd, zArr, j2);
        this.zzr = this.zzm;
        this.zzk = false;
        int i3 = 0;
        while (true) {
            zzatb[] zzatbVarArr = this.zzd;
            if (i3 >= 2) {
                this.zzs.zzb(this.zzn, this.zzm.zza, zzatsVar);
                return zzB;
            }
            if (zzatbVarArr[i3] != null) {
                zzaup.zzd(zzatsVar.zza(i3) != null);
                this.zzk = true;
            } else {
                zzaup.zzd(zzatsVar.zza(i3) == null);
            }
            i3++;
        }
    }

    public final void zze() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }
}
