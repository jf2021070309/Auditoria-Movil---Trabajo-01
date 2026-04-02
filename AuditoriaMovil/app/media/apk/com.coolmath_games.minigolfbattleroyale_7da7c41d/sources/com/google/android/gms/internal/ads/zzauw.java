package com.google.android.gms.internal.ads;

import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzauw {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzauw() {
    }

    public zzauw(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i >> 3;
        boolean z = false;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.zzc;
            if (i9 != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzb;
                i5 = ((bArr[i10 + 1] & UByte.MAX_VALUE) >>> (8 - i9)) | ((bArr[i10] & UByte.MAX_VALUE) << i9);
            } else {
                i5 = this.zza[this.zzb];
            }
            i -= 8;
            i7 |= (i5 & 255) << i;
            this.zzb++;
        }
        if (i > 0) {
            int i11 = this.zzc + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.zza;
                int i12 = this.zzb;
                int i13 = i12 + 1;
                i4 = (b & (((bArr2[i13] & UByte.MAX_VALUE) >> (16 - i11)) | ((bArr2[i12] & UByte.MAX_VALUE) << (i11 - 8)))) | i7;
                this.zzb = i13;
            } else {
                byte[] bArr3 = this.zza;
                int i14 = this.zzb;
                i4 = (b & ((bArr3[i14] & UByte.MAX_VALUE) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.zzb = i14 + 1;
                }
            }
            i7 = i4;
            this.zzc = i11 % 8;
        }
        int i15 = this.zzb;
        if (i15 >= 0 && (i2 = this.zzc) >= 0 && (i15 < (i3 = this.zzd) || (i15 == i3 && i2 == 0))) {
            z = true;
        }
        zzaup.zzd(z);
        return i7;
    }
}
