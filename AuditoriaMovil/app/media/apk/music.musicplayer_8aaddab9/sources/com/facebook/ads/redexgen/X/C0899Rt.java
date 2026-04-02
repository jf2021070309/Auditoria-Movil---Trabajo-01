package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Rt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0899Rt extends C4H<C0893Rn> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    @Nullable
    public InterfaceC0761Mk A04;
    public String A05;
    public List<PU> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1046Xo A0A;
    public final InterfaceC0684Jg A0B;
    public final MD A0C;
    public final S1 A0D;
    public final C0869Qp A0E;

    public C0899Rt(C1046Xo c1046Xo, List<PU> list, AnonymousClass18 anonymousClass18, InterfaceC0684Jg interfaceC0684Jg, C7U c7u, C0869Qp c0869Qp, MD md, InterfaceC0761Mk interfaceC0761Mk, String str, int i2, int i3, int i4, int i5, S1 s1) {
        this.A0A = c1046Xo;
        this.A0B = interfaceC0684Jg;
        this.A09 = c7u;
        this.A0E = c0869Qp;
        this.A0C = md;
        this.A04 = interfaceC0761Mk;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i2;
        this.A03 = i5;
        this.A05 = str;
        this.A01 = i4;
        this.A02 = i3;
        this.A0D = s1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0893Rn A06(ViewGroup viewGroup, int i2) {
        return new C0893Rn(C0819Oq.A00(new C0805Oc(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0893Rn c0893Rn, int i2) {
        c0893Rn.A0l(this.A06.get(i2), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
