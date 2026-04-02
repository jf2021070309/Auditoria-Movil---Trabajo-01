package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.q.c0;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzso extends zzsr {
    private final int zzc;

    public zzso(byte[] bArr, int i, int i2) {
        super(bArr);
        zzsu.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(c0.a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(j0.e("Index > length: ", i, ", ", i2));
        }
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.cast.zzsr
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzsr, com.google.android.gms.internal.cast.zzsu
    public final int zzd() {
        return this.zzc;
    }
}
