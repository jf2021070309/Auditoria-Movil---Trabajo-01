package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class T2 extends C4H<C0900Ru> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0761Mk A03;
    public C0869Qp A04;
    public String A05;
    public List<PU> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1046Xo A0A;
    public final InterfaceC0684Jg A0B;
    public final U1 A0C;
    public final MD A0D;
    public final AE A0E;
    public final C0665In A0F;

    public T2(C1046Xo c1046Xo, List<PU> list, AnonymousClass18 anonymousClass18, InterfaceC0684Jg interfaceC0684Jg, U1 u1, InterfaceC0761Mk interfaceC0761Mk, String str, AE ae, @Nullable C0665In c0665In) {
        this.A0A = c1046Xo;
        this.A0B = interfaceC0684Jg;
        this.A0C = u1;
        this.A09 = u1.A12();
        this.A04 = u1.A1C();
        this.A0D = u1.A1B();
        this.A03 = interfaceC0761Mk;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A05 = str;
        this.A0E = ae;
        this.A0F = c0665In;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0900Ru A06(ViewGroup viewGroup, int i2) {
        return new C0900Ru(OI.A00(new C0805Oc(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0900Ru c0900Ru, int i2) {
        c0900Ru.A0m(this.A04);
        c0900Ru.A0l(this.A06.get(i2), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i2, int i3, int i4) {
        boolean z = i2 != this.A00;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        if (z) {
            A07();
        }
    }

    public final void A0G(C0869Qp c0869Qp) {
        this.A04 = c0869Qp;
    }
}
