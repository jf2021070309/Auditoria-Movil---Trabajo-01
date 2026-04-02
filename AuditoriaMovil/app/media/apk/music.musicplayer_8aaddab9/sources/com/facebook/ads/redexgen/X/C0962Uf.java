package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Uf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0962Uf implements InterfaceC0631Hd {
    public final int A00;
    @Nullable
    public final InterfaceC0629Hb A01;
    public final InterfaceC0631Hd A02;
    public final InterfaceC0631Hd A03;
    public final I3 A04;
    @Nullable
    public final I5 A05;

    public C0962Uf(I3 i3, InterfaceC0631Hd interfaceC0631Hd, InterfaceC0631Hd interfaceC0631Hd2, InterfaceC0629Hb interfaceC0629Hb, int i2, I5 i5) {
        this.A04 = i3;
        this.A03 = interfaceC0631Hd;
        this.A02 = interfaceC0631Hd2;
        this.A01 = interfaceC0629Hb;
        this.A00 = i2;
        this.A05 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0631Hd
    /* renamed from: A00 */
    public final C0963Ug A4D() {
        I3 i3 = this.A04;
        InterfaceC0632He A4D = this.A03.A4D();
        InterfaceC0632He A4D2 = this.A02.A4D();
        InterfaceC0629Hb interfaceC0629Hb = this.A01;
        return new C0963Ug(i3, A4D, A4D2, interfaceC0629Hb != null ? interfaceC0629Hb.createDataSink() : null, this.A00, this.A05);
    }
}
