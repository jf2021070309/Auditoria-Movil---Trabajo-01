package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzxo {
    public static long zza(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b) {
        return b < 0 ? b + UByte.MIN_VALUE : b;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long zza = zza(byteBuffer) << 32;
        if (zza < 0) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        return zza + zza(byteBuffer);
    }

    public static double zze(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) | (bArr[3] & UByte.MAX_VALUE)) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) | (bArr[3] & UByte.MAX_VALUE)) / 1.073741824E9d;
    }
}
