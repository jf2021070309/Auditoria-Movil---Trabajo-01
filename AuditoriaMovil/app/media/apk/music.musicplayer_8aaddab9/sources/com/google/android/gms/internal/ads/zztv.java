package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zztv extends zznl {
    public zztv(zzamn zzamnVar, long j2, long j3) {
        super(new zzng(), new zztu(zzamnVar, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
