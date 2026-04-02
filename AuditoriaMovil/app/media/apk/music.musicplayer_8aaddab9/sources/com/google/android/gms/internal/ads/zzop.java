package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzop {
    public static List<byte[]> zza(byte[] bArr) {
        byte b2 = bArr[11];
        byte b3 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzb(zzc(((b2 & 255) << 8) | (b3 & 255))));
        arrayList.add(zzb(zzc(3840L)));
        return arrayList;
    }

    private static byte[] zzb(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    private static long zzc(long j2) {
        return (j2 * 1000000000) / 48000;
    }
}
