package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class zztj {
    private final zzox zza;
    private final zzamg zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray<zzalv> zzb = new SparseArray<>();
    private final SparseArray<zzalu> zzc = new SparseArray<>();
    private final zzti zzi = new zzti(null);
    private final zzti zzj = new zzti(null);
    private boolean zzk = false;

    public zztj(zzox zzoxVar, boolean z, boolean z2) {
        this.zza = zzoxVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzamg(bArr, 0, 0);
    }

    public final void zza(zzalv zzalvVar) {
        this.zzb.append(zzalvVar.zzd, zzalvVar);
    }

    public final void zzb(zzalu zzaluVar) {
        this.zzc.append(zzaluVar.zza, zzaluVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j2, int i2, long j3) {
        this.zzf = i2;
        this.zzh = j3;
        this.zzg = j2;
    }

    public final boolean zze(long j2, int i2, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j3 = this.zzg;
                int i3 = i2 + ((int) (j2 - j3));
                long j4 = this.zzm;
                if (j4 != -9223372036854775807L) {
                    boolean z4 = this.zzn;
                    long j5 = this.zzl;
                    this.zza.zzv(j4, z4 ? 1 : 0, (int) (j3 - j5), i3, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z5 = this.zzn;
        int i4 = this.zzf;
        if (i4 == 5 || (z2 && i4 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzn = z6;
        return z6;
    }
}
