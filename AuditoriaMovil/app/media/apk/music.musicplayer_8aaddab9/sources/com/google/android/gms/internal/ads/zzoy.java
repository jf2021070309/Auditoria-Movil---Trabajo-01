package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzoy {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzoy(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        byte b2 = this.zza[this.zzc];
        int i2 = this.zzd;
        zzc(1);
        return 1 == (((b2 & 255) >> i2) & 1);
    }

    public final int zzb(int i2) {
        int i3 = this.zzc;
        int min = Math.min(i2, 8 - this.zzd);
        int i4 = i3 + 1;
        int i5 = ((this.zza[i3] & 255) >> this.zzd) & (255 >> (8 - min));
        while (min < i2) {
            i5 |= (this.zza[i4] & 255) << min;
            min += 8;
            i4++;
        }
        zzc(i2);
        return ((-1) >>> (32 - i2)) & i5;
    }

    public final void zzc(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.zzc + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            i5++;
            this.zzc = i5;
            i6 -= 8;
            this.zzd = i6;
        }
        boolean z = false;
        if (i5 >= 0 && (i5 < (i3 = this.zzb) || (i5 == i3 && i6 == 0))) {
            z = true;
        }
        zzakt.zzd(z);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
