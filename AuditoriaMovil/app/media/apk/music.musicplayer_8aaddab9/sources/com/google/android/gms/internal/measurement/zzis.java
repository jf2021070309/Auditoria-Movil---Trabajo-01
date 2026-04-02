package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzis extends zziv {
    private final int zzc;

    public zzis(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzix.zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(a.R(22, "Index < 0: ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(a.S(40, "Index > length: ", i2, ", ", i3));
        }
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final int zzd() {
        return this.zzc;
    }
}
