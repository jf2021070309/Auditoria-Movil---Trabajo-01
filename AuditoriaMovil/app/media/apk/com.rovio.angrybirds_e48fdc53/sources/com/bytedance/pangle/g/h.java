package com.bytedance.pangle.g;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class h implements k {
    private final ByteBuffer a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.a.capacity();
    }

    @Override // com.bytedance.pangle.g.k
    public final void a(j jVar, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            this.a.position(0);
            int i2 = (int) j;
            this.a.limit(i + i2);
            this.a.position(i2);
            slice = this.a.slice();
        }
        jVar.a(slice);
    }
}
