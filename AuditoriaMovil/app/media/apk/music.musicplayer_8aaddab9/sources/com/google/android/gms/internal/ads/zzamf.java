package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzamf {
    private byte[] zza;
    private int zzb;
    private int zzc;

    public zzamf() {
        this.zza = zzamq.zzf;
    }

    public zzamf(int i2) {
        this.zza = new byte[i2];
        this.zzc = i2;
    }

    public zzamf(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }

    public zzamf(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
    }

    public final int zzA() {
        return (zzn() << 21) | (zzn() << 14) | (zzn() << 7) | zzn();
    }

    public final int zzB() {
        int zzv = zzv();
        if (zzv >= 0) {
            return zzv;
        }
        throw new IllegalStateException(a.R(29, "Top bit not zero: ", zzv));
    }

    public final int zzC() {
        int zzw = zzw();
        if (zzw >= 0) {
            return zzw;
        }
        throw new IllegalStateException(a.R(29, "Top bit not zero: ", zzw));
    }

    public final long zzD() {
        long zzx = zzx();
        if (zzx >= 0) {
            return zzx;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(zzx);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzE(int i2, Charset charset) {
        String str = new String(this.zza, this.zzb, i2, charset);
        this.zzb += i2;
        return str;
    }

    public final String zzF(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zzb;
        int i4 = (i3 + i2) - 1;
        String zzr = zzamq.zzr(this.zza, i3, (i4 >= this.zzc || this.zza[i4] != 0) ? i2 : i2 - 1);
        this.zzb += i2;
        return zzr;
    }

    public final String zzG(char c2) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        if (i2 - i3 != 0) {
            while (i3 < this.zzc && this.zza[i3] != 0) {
                i3++;
            }
            byte[] bArr = this.zza;
            int i4 = this.zzb;
            String zzr = zzamq.zzr(bArr, i4, i3 - i4);
            this.zzb = i3;
            if (i3 < this.zzc) {
                this.zzb = i3 + 1;
            }
            return zzr;
        }
        return null;
    }

    public final long zzH() {
        int i2;
        int i3;
        byte b2;
        int i4;
        long j2 = this.zza[this.zzb];
        int i5 = 7;
        while (true) {
            i2 = 0;
            if (i5 < 0) {
                break;
            }
            if (((1 << i5) & j2) != 0) {
                i5--;
            } else if (i5 < 6) {
                j2 &= i4 - 1;
                i2 = 7 - i5;
            } else if (i5 == 7) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        for (i3 = 1; i3 < i2; i3++) {
            if ((this.zza[this.zzb + i3] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | (b2 & 63);
        }
        this.zzb += i2;
        return j2;
    }

    public final void zza(int i2) {
        byte[] bArr = this.zza;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        zzb(bArr, i2);
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = 0;
    }

    public final void zzc(int i2) {
        byte[] bArr = this.zza;
        if (i2 > bArr.length) {
            this.zza = Arrays.copyOf(bArr, i2);
        }
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
        zzakt.zza(z);
        this.zzc = i2;
    }

    public final int zzg() {
        return this.zzb;
    }

    public final void zzh(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.zzc) {
            z = true;
        }
        zzakt.zza(z);
        this.zzb = i2;
    }

    public final byte[] zzi() {
        return this.zza;
    }

    public final int zzj() {
        return this.zza.length;
    }

    public final void zzk(int i2) {
        zzh(this.zzb + i2);
    }

    public final void zzl(zzame zzameVar, int i2) {
        zzm(zzameVar.zza, 0, i2);
        zzameVar.zzd(0);
    }

    public final void zzm(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.zza, this.zzb, bArr, i2, i3);
        this.zzb += i3;
    }

    public final int zzn() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int zzo() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 8);
    }

    public final int zzp() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b2 & 255);
    }

    public final short zzq() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        this.zzb = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b2 & 255) << 8));
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
        this.zzb = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int zzs() {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b3 = bArr[i3];
        this.zzb = i4 + 1;
        return (bArr[i4] & 255) | (((b2 & 255) << 24) >> 8) | ((b3 & 255) << 8);
    }

    public final long zzt() {
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

    public final long zzu() {
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

    public final int zzv() {
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

    public final int zzw() {
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
        return ((bArr[i5] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public final long zzx() {
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

    public final long zzy() {
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
        return ((b3 & 255) << 8) | (b2 & 255) | ((b4 & 255) << 16) | ((b5 & 255) << 24) | ((b6 & 255) << 32) | ((b7 & 255) << 40) | ((b8 & 255) << 48) | ((bArr[i9] & 255) << 56);
    }

    public final int zzz() {
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
}
