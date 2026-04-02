package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.4q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03394q {
    public C03364n A00 = new C03364n();
    public final InterfaceC03374o A01;

    public C03394q(InterfaceC03374o interfaceC03374o) {
        this.A01 = interfaceC03374o;
    }

    public final View A00(int end, int next, int i2, int i3) {
        int childStart = this.A01.A77();
        int A76 = this.A01.A76();
        int i4 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View A5y = this.A01.A5y(end);
            this.A00.A03(childStart, A76, this.A01.A61(A5y), this.A01.A60(A5y));
            if (i2 != 0) {
                this.A00.A01();
                this.A00.A02(i2);
                if (this.A00.A04()) {
                    return A5y;
                }
            }
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    view = A5y;
                }
            }
            end += i4;
        }
        return view;
    }
}
