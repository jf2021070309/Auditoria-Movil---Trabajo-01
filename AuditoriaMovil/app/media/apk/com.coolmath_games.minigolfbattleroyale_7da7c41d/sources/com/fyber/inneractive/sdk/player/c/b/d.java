package com.fyber.inneractive.sdk.player.c.b;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class d extends a {
    public ByteBuffer c;
    public long d;
    public final b b = new b();
    public final int e = 0;

    public final boolean e() {
        return a(1073741824);
    }

    @Override // com.fyber.inneractive.sdk.player.c.b.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final ByteBuffer b(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
