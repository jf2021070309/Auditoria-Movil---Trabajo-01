package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class HU {
    public final int A00;
    public final HR A01;
    @Nullable
    public final Object A02;
    public final C0486Av[] A03;

    public HU(C0486Av[] c0486AvArr, HQ[] hqArr, @Nullable Object obj) {
        this.A03 = c0486AvArr;
        this.A01 = new HR(hqArr);
        this.A02 = obj;
        this.A00 = c0486AvArr.length;
    }

    public final boolean A00(int i2) {
        return this.A03[i2] != null;
    }

    public final boolean A01(HU hu) {
        if (hu == null || hu.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i2 = 0; i2 < this.A01.A01; i2++) {
            if (!A02(hu, i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HU hu, int i2) {
        return hu != null && C0676Iy.A0g(this.A03[i2], hu.A03[i2]) && C0676Iy.A0g(this.A01.A00(i2), hu.A01.A00(i2));
    }
}
