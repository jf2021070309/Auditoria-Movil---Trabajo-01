package com.amazon.aps.iva.z5;

import com.amazon.aps.iva.q.n;
import com.amazon.aps.iva.q5.c0;
import java.nio.ByteBuffer;
/* compiled from: DecoderInputBuffer.java */
/* loaded from: classes.dex */
public class f extends com.amazon.aps.iva.z5.a {
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final c c = new c();
    public final int i = 0;

    /* compiled from: DecoderInputBuffer.java */
    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {
        public a(int i, int i2) {
            super(n.a("Buffer too small (", i, " < ", i2, ")"));
        }
    }

    static {
        c0.a("media3.decoder");
    }

    public f(int i) {
        this.h = i;
    }

    public void k() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer l(int i) {
        int capacity;
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new a(capacity, i);
    }

    public final void m(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = l(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer l = l(i3);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.d = l;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
