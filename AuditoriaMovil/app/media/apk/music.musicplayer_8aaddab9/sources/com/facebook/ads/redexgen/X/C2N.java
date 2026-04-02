package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.2N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2N extends BG {
    public final int A00;
    public final int A01;
    public final InterfaceC0651Hz<? super InterfaceC0632He> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, InterfaceC0651Hz<? super InterfaceC0632He> interfaceC0651Hz) {
        this(str, interfaceC0651Hz, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, InterfaceC0651Hz<? super InterfaceC0632He> interfaceC0651Hz, int i2, int i3, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0651Hz;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.BG
    /* renamed from: A00 */
    public final BH A01(C0640Ho c0640Ho) {
        return new BH(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0640Ho);
    }
}
