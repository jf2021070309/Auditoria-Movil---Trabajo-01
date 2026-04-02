package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: assets/audience_network.dex */
public interface BL {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A46(int i2, int i3, int i4) throws BK;

    ByteBuffer A72();

    int A73();

    int A74();

    int A75();

    boolean A8N();

    boolean A8R();

    void ADR();

    void ADS(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
