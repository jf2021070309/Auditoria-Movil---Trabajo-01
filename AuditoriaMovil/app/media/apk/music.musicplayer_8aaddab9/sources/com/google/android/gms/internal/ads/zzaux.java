package com.google.android.gms.internal.ads;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzaux {
    public byte[] zza;
    private int zzb;
    private int zzc;

    public zzaux() {
    }

    public zzaux(int i2) {
        this.zza = new byte[i2];
        this.zzc = i2;
    }

    public zzaux(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }

    public final void zza(int i2) {
        zzb(zzh() < i2 ? new byte[i2] : this.zza, i2);
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = 0;
    }

    public final void zzc() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final int zzd() {
        return this.zzc - this.zzb;
    }

    public final int zze() {
        return this.zzc;
    }

    public final void zzf(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zza.length) {
            z = true;
        }
        zzaup.zza(z);
        this.zzc = i2;
    }

    public final int zzg() {
        return this.zzb;
    }

    public final int zzh() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void zzi(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zzc) {
            z = true;
        }
        zzaup.zza(z);
        this.zzb = i2;
    }

    public final void zzj(int i2) {
        zzi(this.zzb + i2);
    }

    public final void zzk(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.zza, this.zzb, bArr, i2, i3);
        this.zzb += i3;
    }

    public final int zzl() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int zzm() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 8);
    }

    public final int zzn() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b2 & 255);
    }

    public final short zzo() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b2 & 255) << 8));
    }

    public final long zzp() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b4 = bArr[i4];
        this.zzb = i5 + 1;
        return ((b3 & 255) << 16) | ((b2 & 255) << 24) | ((b4 & 255) << 8) | (bArr[i5] & 255);
    }

    public final long zzq() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b4 = bArr[i4];
        this.zzb = i5 + 1;
        return ((b3 & 255) << 8) | (b2 & 255) | ((b4 & 255) << 16) | ((bArr[i5] & 255) << 24);
    }

    public final int zzr() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b4 = bArr[i4];
        this.zzb = i5 + 1;
        return (bArr[i5] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public final long zzs() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.zzb = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.zzb = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.zzb = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.zzb = i9;
        byte b8 = bArr[i8];
        this.zzb = i9 + 1;
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (bArr[i9] & 255);
    }

    public final int zzt() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        this.zzb = i4 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public final int zzu() {
        int zzr = zzr();
        if (zzr >= 0) {
            return zzr;
        }
        throw new IllegalStateException(a.R(29, "Top bit not zero: ", zzr));
    }

    public final long zzv() {
        long zzs = zzs();
        if (zzs >= 0) {
            return zzs;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(zzs);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzw(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zzb;
        int i4 = (i3 + i2) - 1;
        String str = new String(this.zza, i3, (i4 >= this.zzc || this.zza[i4] != 0) ? i2 : i2 - 1);
        this.zzb += i2;
        return str;
    }
}
