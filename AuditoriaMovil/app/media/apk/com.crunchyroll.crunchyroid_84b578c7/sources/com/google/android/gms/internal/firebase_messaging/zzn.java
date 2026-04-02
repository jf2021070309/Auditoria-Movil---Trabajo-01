package com.google.android.gms.internal.firebase_messaging;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes3.dex */
public final class zzn {
    private static final byte[] zza = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    private static final int[] zzb = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    private static final int[] zzc = {3, 31, MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] zzd = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    private static int[] zze = {Integer.MAX_VALUE, Integer.MAX_VALUE, Cast.MAX_MESSAGE_LENGTH, 2345, 477, 193, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int zza(int i, int i2) {
        long j = i << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
