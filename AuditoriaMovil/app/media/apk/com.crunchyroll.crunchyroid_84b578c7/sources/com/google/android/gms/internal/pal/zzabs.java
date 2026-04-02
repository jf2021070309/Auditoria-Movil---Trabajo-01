package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.q.c0;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzabs extends zzabv {
    private final int zzc;

    public zzabs(byte[] bArr, int i, int i2) {
        super(bArr);
        zzaby.zzl(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
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

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.pal.zzabv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }
}
