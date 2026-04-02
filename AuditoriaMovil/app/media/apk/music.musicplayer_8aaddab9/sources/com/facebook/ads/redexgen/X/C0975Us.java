package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Us  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0975Us implements InterfaceC0631Hd {
    public final InterfaceC0651Hz<? super C0976Ut> A00;

    public C0975Us() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C0975Us(InterfaceC0651Hz<? super C0976Ut> interfaceC0651Hz) {
        this.A00 = interfaceC0651Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0631Hd
    public final InterfaceC0632He A4D() {
        return new C0976Ut(this.A00);
    }
}
