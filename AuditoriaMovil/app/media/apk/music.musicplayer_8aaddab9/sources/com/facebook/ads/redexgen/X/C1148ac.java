package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.ac  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1148ac implements InterfaceC03956v {
    public final /* synthetic */ C1134aO A00;

    public C1148ac(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws Throwable {
        C6C c6c;
        C7F c7f;
        c6c = this.A00.A02;
        if (c6c.A0a() != EnumC03996z.A0I) {
            c7f = this.A00.A03;
            String A06 = c7f.A06(10010);
            if (A06 != null) {
                return this.A00.A08(A06);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A04);
    }
}
