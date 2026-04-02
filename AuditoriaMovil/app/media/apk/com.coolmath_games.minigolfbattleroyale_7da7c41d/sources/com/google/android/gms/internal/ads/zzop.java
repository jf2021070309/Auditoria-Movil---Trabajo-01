package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzop {
    public static List<byte[]> zza(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzb(zzc(((b & UByte.MAX_VALUE) << 8) | (b2 & UByte.MAX_VALUE))));
        arrayList.add(zzb(zzc(3840L)));
        return arrayList;
    }

    private static byte[] zzb(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long zzc(long j) {
        return (j * 1000000000) / 48000;
    }
}
