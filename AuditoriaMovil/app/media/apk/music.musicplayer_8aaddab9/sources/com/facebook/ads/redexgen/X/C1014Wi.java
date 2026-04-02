package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Wi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1014Wi implements InterfaceC0525Co {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Co
    public final void A5U(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Co
    public final int AEK(InterfaceC0518Cd interfaceC0518Cd, int i2, boolean z) throws IOException, InterruptedException {
        int AEv = interfaceC0518Cd.AEv(i2);
        if (AEv == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AEv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Co
    public final void AEL(C0660Ii c0660Ii, int i2) {
        c0660Ii.A0Z(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0525Co
    public final void AEM(long j2, int i2, int i3, int i4, C0524Cn c0524Cn) {
    }
}
