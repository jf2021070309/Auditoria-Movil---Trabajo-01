package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;
/* renamed from: com.facebook.ads.redexgen.X.do  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class Cdo implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public Cdo(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ACu(int i2) throws C1339dn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i2);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C1339dn {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C1339dn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C1339dn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
