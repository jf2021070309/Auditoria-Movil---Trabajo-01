package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import e.a.d.a.a;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public final class zzalq {
    public static void zza(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(a.R(15, "csd-", i2), ByteBuffer.wrap(list.get(i2)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }
}
