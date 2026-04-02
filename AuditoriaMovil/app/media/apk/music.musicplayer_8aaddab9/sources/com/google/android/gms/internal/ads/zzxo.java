package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzxo {
    public static long zza(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return zzc(byteBuffer.get()) + (zzc(byteBuffer.get()) << 8);
    }

    public static int zzc(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long zza = zza(byteBuffer) << 32;
        if (zza >= 0) {
            return zza(byteBuffer) + zza;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d2 = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d2);
        return d2 / 1.073741824E9d;
    }
}
