package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import ch.qos.logback.classic.Level;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzit implements zzox {
    private zzafv zzA;
    private boolean zzB;
    private boolean zzC;
    private zzfg zzD;
    private final zzin zza;
    private final zzff zzd;
    private final zzfa zze;
    private final Looper zzf;
    private zzis zzg;
    private zzafv zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzafv zzz;
    private final zziq zzb = new zziq();
    private int zzi = 1000;
    private int[] zzj = new int[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzow[] zzo = new zzow[1000];
    private final zzja<zzir> zzc = new zzja<>(zzio.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;

    public zzit(zzko zzkoVar, Looper looper, zzff zzffVar, zzfa zzfaVar, byte[] bArr) {
        this.zzf = looper;
        this.zzd = zzffVar;
        this.zze = zzfaVar;
        this.zza = new zzin(zzkoVar, null);
    }

    private final synchronized int zzA(zzafw zzafwVar, zzaf zzafVar, boolean z, boolean z2, zziq zziqVar) {
        zzafVar.zzc = false;
        if (!zzG()) {
            if (!z2 && !this.zzw) {
                zzafv zzafvVar = this.zzA;
                if (zzafvVar == null || (!z && zzafvVar == this.zzh)) {
                    return -3;
                }
                zzH(zzafvVar, zzafwVar);
                return -5;
            }
            zzafVar.zzf(4);
            return -4;
        }
        zzafv zzafvVar2 = this.zzc.zza(this.zzq + this.zzs).zza;
        if (!z && zzafvVar2 == this.zzh) {
            int zzL = zzL(this.zzs);
            if (!zzI(zzL)) {
                zzafVar.zzc = true;
                return -3;
            }
            zzafVar.zzf(this.zzm[zzL]);
            long j2 = this.zzn[zzL];
            zzafVar.zzd = j2;
            if (j2 < this.zzt) {
                zzafVar.zzg(Level.ALL_INT);
            }
            zziqVar.zza = this.zzl[zzL];
            zziqVar.zzb = this.zzk[zzL];
            zziqVar.zzc = this.zzo[zzL];
            return -4;
        }
        zzH(zzafvVar2, zzafwVar);
        return -5;
    }

    private final synchronized boolean zzB(zzafv zzafvVar) {
        this.zzy = false;
        if (zzamq.zzc(zzafvVar, this.zzA)) {
            return false;
        }
        if (this.zzc.zzf() || !this.zzc.zzc().zza.equals(zzafvVar)) {
            this.zzA = zzafvVar;
        } else {
            this.zzA = this.zzc.zzc().zza;
        }
        zzafv zzafvVar2 = this.zzA;
        this.zzB = zzalt.zzc(zzafvVar2.zzl, zzafvVar2.zzi);
        this.zzC = false;
        return true;
    }

    private final synchronized long zzC(long j2, boolean z, boolean z2) {
        int i2;
        int i3 = this.zzp;
        if (i3 != 0) {
            long[] jArr = this.zzn;
            int i4 = this.zzr;
            if (j2 >= jArr[i4]) {
                if (z2 && (i2 = this.zzs) != i3) {
                    i3 = i2 + 1;
                }
                int zzJ = zzJ(i4, i3, j2, false);
                if (zzJ == -1) {
                    return -1L;
                }
                return zzK(zzJ);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i2 = this.zzp;
        if (i2 == 0) {
            return -1L;
        }
        return zzK(i2);
    }

    private final void zzE() {
        if (this.zzD != null) {
            this.zzD = null;
            this.zzh = null;
        }
    }

    private final synchronized void zzF(long j2, int i2, long j3, int i3, zzow zzowVar) {
        int i4 = this.zzp;
        if (i4 > 0) {
            int zzL = zzL(i4 - 1);
            zzakt.zza(this.zzk[zzL] + ((long) this.zzl[zzL]) <= j3);
        }
        this.zzw = (536870912 & i2) != 0;
        this.zzv = Math.max(this.zzv, j2);
        int zzL2 = zzL(this.zzp);
        this.zzn[zzL2] = j2;
        this.zzk[zzL2] = j3;
        this.zzl[zzL2] = i3;
        this.zzm[zzL2] = i2;
        this.zzo[zzL2] = zzowVar;
        this.zzj[zzL2] = 0;
        if (this.zzc.zzf() || !this.zzc.zzc().zza.equals(this.zzA)) {
            zzfe zzfeVar = zzfe.zzb;
            zzja<zzir> zzjaVar = this.zzc;
            int i5 = this.zzq + this.zzp;
            zzafv zzafvVar = this.zzA;
            Objects.requireNonNull(zzafvVar);
            zzjaVar.zzb(i5, new zzir(zzafvVar, zzfeVar, null));
        }
        int i6 = this.zzp + 1;
        this.zzp = i6;
        int i7 = this.zzi;
        if (i6 == i7) {
            int i8 = i7 + 1000;
            int[] iArr = new int[i8];
            long[] jArr = new long[i8];
            long[] jArr2 = new long[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            zzow[] zzowVarArr = new zzow[i8];
            int i9 = this.zzr;
            int i10 = i7 - i9;
            System.arraycopy(this.zzk, i9, jArr, 0, i10);
            System.arraycopy(this.zzn, this.zzr, jArr2, 0, i10);
            System.arraycopy(this.zzm, this.zzr, iArr2, 0, i10);
            System.arraycopy(this.zzl, this.zzr, iArr3, 0, i10);
            System.arraycopy(this.zzo, this.zzr, zzowVarArr, 0, i10);
            System.arraycopy(this.zzj, this.zzr, iArr, 0, i10);
            int i11 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr, i10, i11);
            System.arraycopy(this.zzn, 0, jArr2, i10, i11);
            System.arraycopy(this.zzm, 0, iArr2, i10, i11);
            System.arraycopy(this.zzl, 0, iArr3, i10, i11);
            System.arraycopy(this.zzo, 0, zzowVarArr, i10, i11);
            System.arraycopy(this.zzj, 0, iArr, i10, i11);
            this.zzk = jArr;
            this.zzn = jArr2;
            this.zzm = iArr2;
            this.zzl = iArr3;
            this.zzo = zzowVarArr;
            this.zzj = iArr;
            this.zzr = 0;
            this.zzi = i8;
        }
    }

    private final boolean zzG() {
        return this.zzs != this.zzp;
    }

    private final void zzH(zzafv zzafvVar, zzafw zzafwVar) {
        zzafv zzafvVar2 = this.zzh;
        zzn zznVar = zzafvVar2 == null ? null : zzafvVar2.zzo;
        this.zzh = zzafvVar;
        zzn zznVar2 = zzafvVar.zzo;
        zzafwVar.zza = zzafvVar.zzb(this.zzd.zza(zzafvVar));
        zzafwVar.zzb = this.zzD;
        if (zzafvVar2 == null || !zzamq.zzc(zznVar, zznVar2)) {
            zzfg zzfgVar = zzafvVar.zzo != null ? new zzfg(new zzey(new zzfi(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzD = zzfgVar;
            zzafwVar.zzb = zzfgVar;
        }
    }

    private final boolean zzI(int i2) {
        if (this.zzD != null) {
            return (this.zzm[i2] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final int zzJ(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.zzn[i2];
            if (j3 > j2) {
                return i4;
            }
            if (!z || (this.zzm[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.zzi) {
                i2 = 0;
            }
        }
        return i4;
    }

    private final long zzK(int i2) {
        int i3;
        long j2 = this.zzu;
        long j3 = Long.MIN_VALUE;
        if (i2 != 0) {
            int zzL = zzL(i2 - 1);
            for (int i4 = 0; i4 < i2; i4++) {
                j3 = Math.max(j3, this.zzn[zzL]);
                if ((this.zzm[zzL] & 1) != 0) {
                    break;
                }
                zzL--;
                if (zzL == -1) {
                    zzL = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j2, j3);
        this.zzp -= i2;
        int i5 = this.zzq + i2;
        this.zzq = i5;
        int i6 = this.zzr + i2;
        this.zzr = i6;
        int i7 = this.zzi;
        if (i6 >= i7) {
            this.zzr = i6 - i7;
        }
        int i8 = this.zzs - i2;
        this.zzs = i8;
        if (i8 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i5);
        if (this.zzp == 0) {
            int i9 = this.zzr;
            if (i9 == 0) {
                i9 = this.zzi;
            }
            return this.zzk[i9 - 1] + this.zzl[i3];
        }
        return this.zzk[this.zzr];
    }

    private final int zzL(int i2) {
        int i3 = this.zzr + i2;
        int i4 = this.zzi;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private final synchronized void zzz() {
        this.zzs = 0;
        this.zza.zzb();
    }

    public final void zza() {
        zzb(true);
        zzE();
    }

    public final void zzb(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z) {
            this.zzz = null;
            this.zzA = null;
            this.zzy = true;
        }
    }

    public final void zzc(long j2) {
        this.zzt = j2;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    public final void zze() {
        zzq();
        zzE();
    }

    public final void zzf() throws IOException {
        zzfg zzfgVar = this.zzD;
        if (zzfgVar != null) {
            throw zzfgVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzafv zzh() {
        if (this.zzy) {
            return null;
        }
        return this.zzA;
    }

    public final synchronized long zzi() {
        return this.zzv;
    }

    public final synchronized boolean zzj() {
        return this.zzw;
    }

    public final synchronized boolean zzk(boolean z) {
        boolean z2 = true;
        if (zzG()) {
            if (this.zzc.zza(this.zzq + this.zzs).zza != this.zzh) {
                return true;
            }
            return zzI(zzL(this.zzs));
        }
        if (!z && !this.zzw) {
            zzafv zzafvVar = this.zzA;
            if (zzafvVar == null) {
                z2 = false;
            } else if (zzafvVar == this.zzh) {
                return false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzl(com.google.android.gms.internal.ads.zzafw r9, com.google.android.gms.internal.ads.zzaf r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zziq r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzA(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzc()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzin r9 = r8.zza
            com.google.android.gms.internal.ads.zziq r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzin r9 = r8.zza
            com.google.android.gms.internal.ads.zziq r11 = r8.zzb
            r9.zzc(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzs
            int r9 = r9 + r1
            r8.zzs = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzit.zzl(com.google.android.gms.internal.ads.zzafw, com.google.android.gms.internal.ads.zzaf, int, boolean):int");
    }

    public final synchronized boolean zzm(long j2, boolean z) {
        zzz();
        int zzL = zzL(this.zzs);
        if (!zzG() || j2 < this.zzn[zzL] || (j2 > this.zzv && !z)) {
            return false;
        }
        int zzJ = zzJ(zzL, this.zzp - this.zzs, j2, true);
        if (zzJ == -1) {
            return false;
        }
        this.zzt = j2;
        this.zzs += zzJ;
        return true;
    }

    public final synchronized int zzn(long j2, boolean z) {
        int zzL = zzL(this.zzs);
        if (zzG() && j2 >= this.zzn[zzL]) {
            if (j2 > this.zzv && z) {
                return this.zzp - this.zzs;
            }
            int zzJ = zzJ(zzL, this.zzp - this.zzs, j2, true);
            if (zzJ == -1) {
                return 0;
            }
            return zzJ;
        }
        return 0;
    }

    public final synchronized void zzo(int i2) {
        boolean z = false;
        if (i2 >= 0) {
            try {
                if (this.zzs + i2 <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzakt.zza(z);
        this.zzs += i2;
    }

    public final void zzp(long j2, boolean z, boolean z2) {
        this.zza.zze(zzC(j2, false, z2));
    }

    public final void zzq() {
        this.zza.zze(zzD());
    }

    public final void zzr(zzis zzisVar) {
        this.zzg = zzisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzs(zzafv zzafvVar) {
        this.zzz = zzafvVar;
        boolean zzB = zzB(zzafvVar);
        zzis zzisVar = this.zzg;
        if (zzisVar == null || !zzB) {
            return;
        }
        zzisVar.zzF(zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final int zzt(zzah zzahVar, int i2, boolean z, int i3) throws IOException {
        return this.zza.zzg(zzahVar, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzu(zzamf zzamfVar, int i2, int i3) {
        this.zza.zzh(zzamfVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzv(long j2, int i2, int i3, int i4, zzow zzowVar) {
        int i5 = i2 & 1;
        if (this.zzx) {
            if (i5 == 0) {
                return;
            }
            this.zzx = false;
        }
        if (this.zzB) {
            if (j2 < this.zzt) {
                return;
            }
            if (i5 == 0) {
                if (!this.zzC) {
                    String valueOf = String.valueOf(this.zzA);
                    valueOf.length();
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(valueOf));
                    this.zzC = true;
                }
                i2 |= 1;
            }
        }
        zzF(j2, i2, (this.zza.zzf() - i3) - i4, i3, zzowVar);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final int zzx(zzah zzahVar, int i2, boolean z) throws IOException {
        return zzov.zza(this, zzahVar, i2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzy(zzamf zzamfVar, int i2) {
        zzov.zzb(this, zzamfVar, i2);
    }
}
