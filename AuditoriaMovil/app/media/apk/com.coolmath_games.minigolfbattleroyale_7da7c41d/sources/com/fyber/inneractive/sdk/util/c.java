package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public final class c {
    private static c a = new c();
    private Queue<ByteBuffer> b = new ConcurrentLinkedQueue();

    public static c a() {
        return a;
    }

    private c() {
        for (int i = 0; i < 2; i++) {
            this.b.offer(ByteBuffer.allocateDirect(16384));
        }
    }

    public final ByteBuffer b() {
        ByteBuffer poll = this.b.poll();
        return poll == null ? ByteBuffer.allocateDirect(16384) : poll;
    }

    public final void a(ByteBuffer byteBuffer) {
        this.b.offer(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        return (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
    }
}
