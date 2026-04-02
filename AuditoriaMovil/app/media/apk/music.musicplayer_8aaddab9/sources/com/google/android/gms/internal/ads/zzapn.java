package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzapn {
    private static final byte[] zza = new byte[4096];
    private final zzatz zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[65536];
    private int zzf;
    private int zzg;

    public zzapn(zzatz zzatzVar, long j2, long j3) {
        this.zzb = zzatzVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final int zzj(int i2) {
        int min = Math.min(this.zzg, i2);
        zzl(min);
        return min;
    }

    private final int zzk(byte[] bArr, int i2, int i3) {
        int i4 = this.zzg;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.zze, 0, bArr, i2, min);
        zzl(min);
        return min;
    }

    private final void zzl(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    private final int zzm(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int zzb = this.zzb.zzb(bArr, i2 + i4, i3 - i4);
        if (zzb == -1) {
            if (i4 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i4 + zzb;
    }

    private final void zzn(int i2) {
        if (i2 != -1) {
            this.zzd += i2;
        }
    }

    public final int zza(byte[] bArr, int i2, int i3) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i2, i3);
        if (zzk == 0) {
            zzk = zzm(bArr, i2, i3, 0, true);
        }
        zzn(zzk);
        return zzk;
    }

    public final boolean zzb(byte[] bArr, int i2, int i3, boolean z) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i2, i3);
        while (zzk < i3 && zzk != -1) {
            zzk = zzm(bArr, i2, i3, zzk, z);
        }
        zzn(zzk);
        return zzk != -1;
    }

    public final int zzc(int i2) throws IOException, InterruptedException {
        int zzj = zzj(i2);
        if (zzj == 0) {
            zzj = zzm(zza, 0, Math.min(i2, 4096), 0, true);
        }
        zzn(zzj);
        return zzj;
    }

    public final boolean zzd(int i2, boolean z) throws IOException, InterruptedException {
        int zzj = zzj(i2);
        while (zzj < i2 && zzj != -1) {
            zzj = zzm(zza, -zzj, Math.min(i2, zzj + 4096), zzj, false);
        }
        zzn(zzj);
        return zzj != -1;
    }

    public final boolean zze(byte[] bArr, int i2, int i3, boolean z) throws IOException, InterruptedException {
        if (zzf(i3, false)) {
            System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
            return true;
        }
        return false;
    }

    public final boolean zzf(int i2, boolean z) throws IOException, InterruptedException {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            this.zze = Arrays.copyOf(this.zze, zzave.zzf(length + length, 65536 + i3, i3 + 524288));
        }
        int min = Math.min(this.zzg - this.zzf, i2);
        while (min < i2) {
            min = zzm(this.zze, this.zzf, i2, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.zzf + i2;
        this.zzf = i4;
        this.zzg = Math.max(this.zzg, i4);
        return true;
    }

    public final void zzg() {
        this.zzf = 0;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final long zzi() {
        return this.zzc;
    }
}
