package com.amazon.aps.iva.i4;

import java.nio.ByteBuffer;
/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes.dex */
public final class j {
    public static final ThreadLocal<com.amazon.aps.iva.j4.a> d = new ThreadLocal<>();
    public final int a;
    public final androidx.emoji2.text.h b;
    public volatile int c = 0;

    public j(androidx.emoji2.text.h hVar, int i) {
        this.b = hVar;
        this.a = i;
    }

    public final int a(int i) {
        com.amazon.aps.iva.j4.a c = c();
        int a = c.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = c.b;
            int i2 = a + c.a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public final int b() {
        com.amazon.aps.iva.j4.a c = c();
        int a = c.a(16);
        if (a != 0) {
            int i = a + c.a;
            return c.b.getInt(c.b.getInt(i) + i);
        }
        return 0;
    }

    public final com.amazon.aps.iva.j4.a c() {
        ThreadLocal<com.amazon.aps.iva.j4.a> threadLocal = d;
        com.amazon.aps.iva.j4.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new com.amazon.aps.iva.j4.a();
            threadLocal.set(aVar);
        }
        com.amazon.aps.iva.j4.b bVar = this.b.a;
        int a = bVar.a(6);
        if (a != 0) {
            int i = a + bVar.a;
            int i2 = (this.a * 4) + bVar.b.getInt(i) + i + 4;
            aVar.b(bVar.b.getInt(i2) + i2, bVar.b);
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        com.amazon.aps.iva.j4.a c = c();
        int a = c.a(4);
        if (a != 0) {
            i = c.b.getInt(a + c.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b = b();
        for (int i2 = 0; i2 < b; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
