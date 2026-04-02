package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.c5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1237c5 implements InterfaceC03023e {
    public final /* synthetic */ FA A00;
    public final /* synthetic */ C3Z A01;

    public C1237c5(FA fa, C3Z c3z) {
        this.A00 = fa;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03023e
    public final Object A4C(int i2) {
        C3X A00 = this.A01.A00(i2);
        if (A00 == null) {
            return null;
        }
        return A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03023e
    public final List<Object> A5N(String str, int i2) {
        List<C3X> A03 = this.A01.A03(str, i2);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = A03.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(A03.get(i3).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03023e
    public final Object A5O(int i2) {
        C3X A01 = this.A01.A01(i2);
        if (A01 == null) {
            return null;
        }
        return A01.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03023e
    public final boolean AD6(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
