package com.fyber.inneractive.sdk.player.c.a;

import java.nio.ByteBuffer;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class g {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static com.fyber.inneractive.sdk.player.c.h a(byte[] bArr, String str, String str2) {
        com.fyber.inneractive.sdk.player.c.k.j jVar = new com.fyber.inneractive.sdk.player.c.k.j(bArr);
        jVar.b(60);
        int i = a[jVar.c(6)];
        int i2 = b[jVar.c(4)];
        int c2 = jVar.c(5);
        int[] iArr = c;
        int i3 = c2 >= iArr.length ? -1 : (iArr[c2] * 1000) / 2;
        jVar.b(10);
        return com.fyber.inneractive.sdk.player.c.h.a(str, "audio/vnd.dts", i3, -1, i + (jVar.c(2) > 0 ? 1 : 0), i2, null, null, str2);
    }

    public static int a(byte[] bArr) {
        return ((((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6)) + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
    }

    public static int b(byte[] bArr) {
        return (((bArr[7] & 240) >> 4) | ((bArr[5] & 2) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4)) + 1;
    }
}
