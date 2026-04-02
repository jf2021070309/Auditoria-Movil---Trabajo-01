package com.amazon.aps.iva.t5;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: MediaFormatUtil.java */
/* loaded from: classes.dex */
public final class r {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void b(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(com.amazon.aps.iva.q.c0.a("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }
}
