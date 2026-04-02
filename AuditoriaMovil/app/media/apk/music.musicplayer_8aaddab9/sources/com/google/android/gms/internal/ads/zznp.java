package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zznp implements zznv {
    private final zzah zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    public zznp(zzah zzahVar, long j2, long j3) {
        this.zzb = zzahVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final void zzp(int i2) {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            this.zze = Arrays.copyOf(this.zze, zzamq.zzx(length + length, 65536 + i3, i3 + 524288));
        }
    }

    private final int zzq(int i2) {
        int min = Math.min(this.zzg, i2);
        zzs(min);
        return min;
    }

    private final int zzr(byte[] bArr, int i2, int i3) {
        int i4 = this.zzg;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.zze, 0, bArr, i2, min);
        zzs(min);
        return min;
    }

    private final void zzs(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i2, int i3, int i4, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int zzg = this.zzb.zzg(bArr, i2 + i4, i3 - i4);
        if (zzg == -1) {
            if (i4 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i4 + zzg;
    }

    private final void zzu(int i2) {
        if (i2 != -1) {
            this.zzd += i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final boolean zza(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        int zzr = zzr(bArr, i2, i3);
        while (zzr < i3 && zzr != -1) {
            zzr = zzt(bArr, i2, i3, zzr, z);
        }
        zzu(zzr);
        return zzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
        zza(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final int zzc(int i2) throws IOException {
        int zzq = zzq(1);
        if (zzq == 0) {
            zzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(zzq);
        return zzq;
    }

    public final boolean zzd(int i2, boolean z) throws IOException {
        int zzq = zzq(i2);
        while (zzq < i2 && zzq != -1) {
            zzq = zzt(this.zza, -zzq, Math.min(i2, zzq + 4096), zzq, false);
        }
        zzu(zzq);
        return zzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zze(int i2) throws IOException {
        zzd(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final int zzf(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        zzp(i3);
        int i4 = this.zzg;
        int i5 = this.zzf;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = zzt(this.zze, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i2, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zznv, com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        int zzr = zzr(bArr, i2, i3);
        if (zzr == 0) {
            zzr = zzt(bArr, i2, i3, 0, true);
        }
        zzu(zzr);
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final boolean zzh(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        if (zzj(i3, z)) {
            System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzi(byte[] bArr, int i2, int i3) throws IOException {
        zzh(bArr, i2, i3, false);
    }

    public final boolean zzj(int i2, boolean z) throws IOException {
        zzp(i2);
        int i3 = this.zzg - this.zzf;
        while (i3 < i2) {
            i3 = zzt(this.zze, this.zzf, i2, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.zzg = this.zzf + i3;
        }
        this.zzf += i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzk(int i2) throws IOException {
        zzj(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final long zzo() {
        return this.zzc;
    }
}
