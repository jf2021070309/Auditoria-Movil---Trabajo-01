package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Ul  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0968Ul implements InterfaceC0632He {
    public final int A00;
    public final InterfaceC0632He A01;
    public final C0664Im A02;

    public C0968Ul(InterfaceC0632He interfaceC0632He, C0664Im c0664Im, int i2) {
        this.A01 = (InterfaceC0632He) IJ.A01(interfaceC0632He);
        this.A02 = (C0664Im) IJ.A01(c0664Im);
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    @Nullable
    public final Uri A7j() {
        return this.A01.A7j();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final long ACt(C0636Hi c0636Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACt(c0636Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i2, i3);
    }
}
