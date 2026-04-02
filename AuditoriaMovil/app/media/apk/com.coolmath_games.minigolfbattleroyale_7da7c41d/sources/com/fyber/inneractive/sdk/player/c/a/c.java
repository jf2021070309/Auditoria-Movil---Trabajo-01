package com.fyber.inneractive.sdk.player.c.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface c {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i2, int i3) throws a;

    int b();

    int c();

    void d();

    ByteBuffer e();

    boolean f();

    void g();

    void h();

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }
}
