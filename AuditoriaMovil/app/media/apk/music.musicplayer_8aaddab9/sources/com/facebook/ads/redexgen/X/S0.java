package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class S0 extends C4H<C0900Ru> {
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public InterfaceC0761Mk A03;
    public String A04;
    public List<PU> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AnonymousClass18 A07;
    public final C7U A08;
    public final C1046Xo A09;
    public final InterfaceC0684Jg A0A;
    public final MD A0B;
    public final S1 A0C;
    public final C0665In A0D;
    public final C0869Qp A0E;

    public S0(C1046Xo c1046Xo, List<PU> list, AnonymousClass18 anonymousClass18, InterfaceC0684Jg interfaceC0684Jg, C7U c7u, C0869Qp c0869Qp, MD md, InterfaceC0761Mk interfaceC0761Mk, String str, S1 s1, C0665In c0665In) {
        this.A09 = c1046Xo;
        this.A0A = interfaceC0684Jg;
        this.A08 = c7u;
        this.A0E = c0869Qp;
        this.A0B = md;
        this.A03 = interfaceC0761Mk;
        this.A07 = anonymousClass18;
        this.A05 = list;
        this.A04 = str;
        this.A0C = s1;
        this.A0D = c0665In;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    @Nullable
    /* renamed from: A01 */
    public final C0900Ru A06(ViewGroup viewGroup, int i2) {
        InterfaceC0761Mk interfaceC0761Mk = this.A03;
        if (interfaceC0761Mk == null || this.A00 == 0) {
            return null;
        }
        return new C0900Ru(OI.A01(new C0805Oc(this.A09, this.A0A, interfaceC0761Mk, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0900Ru c0900Ru, int i2) {
        c0900Ru.A0l(this.A05.get(i2), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i2, int i3, int i4) {
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }
}
