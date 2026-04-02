package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzgfe extends zzgfh {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzgfe(byte[] bArr, int i2, int i3) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zza(int i2, int i3) throws IOException {
        zzl((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzb(int i2, int i3) throws IOException {
        zzl(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzc(int i2, int i3) throws IOException {
        zzl(i2 << 3);
        zzl(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzd(int i2, int i3) throws IOException {
        zzl((i2 << 3) | 5);
        zzm(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zze(int i2, long j2) throws IOException {
        zzl(i2 << 3);
        zzn(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzf(int i2, long j2) throws IOException {
        zzl((i2 << 3) | 1);
        zzo(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzg(int i2, boolean z) throws IOException {
        zzl(i2 << 3);
        zzj(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzh(int i2, String str) throws IOException {
        zzl((i2 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzi(int i2, zzgex zzgexVar) throws IOException {
        zzl((i2 << 3) | 2);
        zzl(zzgexVar.zzc());
        zzgexVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzj(byte b2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzl(i2);
        } else {
            zzn(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzl(int i2) throws IOException {
        boolean z;
        z = zzgfh.zzc;
        if (z) {
            int i3 = zzgei.zza;
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr[i4] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzm(int i2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            int i4 = i3 + 1;
            this.zzd = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.zzd = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.zzd = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzn(long j2) throws IOException {
        boolean z;
        z = zzgfh.zzc;
        if (z && this.zzc - this.zzd >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                zzgiy.zzp(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            zzgiy.zzp(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr4 = this.zzb;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        bArr4[i5] = (byte) j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzo(long j2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i3 = i2 + 1;
            this.zzd = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.zzd = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.zzd = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzd = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    public final void zzp(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zzb, this.zzd, i3);
            this.zzd += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgfg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzq(byte[] bArr, int i2, int i3) throws IOException {
        zzp(bArr, 0, i3);
    }

    public final void zzr(String str) throws IOException {
        int i2 = this.zzd;
        try {
            int zzx = zzgfh.zzx(str.length() * 3);
            int zzx2 = zzgfh.zzx(str.length());
            if (zzx2 != zzx) {
                zzl(zzgjd.zzg(str));
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = zzgjd.zzh(str, bArr, i3, this.zzc - i3);
                return;
            }
            int i4 = i2 + zzx2;
            this.zzd = i4;
            int zzh = zzgjd.zzh(str, this.zzb, i4, this.zzc - i4);
            this.zzd = i2;
            zzl((zzh - i2) - zzx2);
            this.zzd = zzh;
        } catch (zzgjc e2) {
            this.zzd = i2;
            zzE(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzgfg(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final int zzs() {
        return this.zzc - this.zzd;
    }
}
