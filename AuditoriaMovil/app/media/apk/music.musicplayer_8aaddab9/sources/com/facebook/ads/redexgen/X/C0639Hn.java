package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Hn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0639Hn extends IOException {
    public final int A00;
    public final C0636Hi A01;

    public C0639Hn(IOException iOException, C0636Hi c0636Hi, int i2) {
        super(iOException);
        this.A01 = c0636Hi;
        this.A00 = i2;
    }

    public C0639Hn(String str, C0636Hi c0636Hi, int i2) {
        super(str);
        this.A01 = c0636Hi;
        this.A00 = i2;
    }

    public C0639Hn(String str, IOException iOException, C0636Hi c0636Hi, int i2) {
        super(str, iOException);
        this.A01 = c0636Hi;
        this.A00 = i2;
    }
}
