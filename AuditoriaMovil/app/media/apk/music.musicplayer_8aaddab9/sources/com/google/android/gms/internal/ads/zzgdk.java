package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgdk {
    private final byte[] zza;

    private zzgdk(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static zzgdk zza(byte[] bArr, int i2, int i3) {
        return new zzgdk(bArr, 0, i3);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
