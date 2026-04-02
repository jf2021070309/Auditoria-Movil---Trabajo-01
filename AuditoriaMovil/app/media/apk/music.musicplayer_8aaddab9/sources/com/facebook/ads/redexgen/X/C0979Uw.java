package com.facebook.ads.redexgen.X;

import android.content.Context;
/* renamed from: com.facebook.ads.redexgen.X.Uw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0979Uw implements InterfaceC0631Hd {
    public final Context A00;
    public final InterfaceC0631Hd A01;
    public final InterfaceC0651Hz<? super InterfaceC0632He> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C0979Uw(Context context, InterfaceC0651Hz<? super InterfaceC0632He> interfaceC0651Hz, InterfaceC0631Hd interfaceC0631Hd) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0651Hz;
        this.A01 = interfaceC0631Hd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C0979Uw(Context context, String str, InterfaceC0651Hz<? super InterfaceC0632He> interfaceC0651Hz) {
        this(context, interfaceC0651Hz, new C2N(str, interfaceC0651Hz));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0631Hd
    /* renamed from: A00 */
    public final C0980Ux A4D() {
        return new C0980Ux(this.A00, this.A02, this.A01.A4D());
    }
}
