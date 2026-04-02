package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.eD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1363eD<ModelType, StateType> {
    public static byte[] A05;
    public static final C1363eD A06;
    public final C1363eD A00;
    public final ModelType A01;
    public final StateType A02;
    public final String A03;
    public final List<InterfaceC1358e8<ModelType, StateType>> A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A06 = new C1363eD(null, null, A01(0, 5, 123), Collections.emptyList(), A06);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eC != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eD != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1363eD(com.facebook.ads.redexgen.X.C1362eC<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C1362eC.A01(r7)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C1362eC.A02(r7)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C1362eC.A03(r7)
            java.util.List r0 = com.facebook.ads.redexgen.X.C1362eC.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.eD r5 = com.facebook.ads.redexgen.X.C1362eC.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.facebook.ads.redexgen.X.C1362eC.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1363eD.<init>(com.facebook.ads.redexgen.X.eC):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eD != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1363eD(ModelType model, StateType state, String str, List<InterfaceC1358e8<ModelType, StateType>> list, C1363eD c1363eD) {
        this.A01 = model;
        this.A02 = state;
        this.A03 = str;
        this.A00 = c1363eD;
        this.A04 = list;
    }

    public static <ModelType, StateType> C1362eC<ModelType, StateType> A00(ModelType modeltype, StateType statetype, String str) {
        return new C1362eC<>(modeltype, statetype, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e8 != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eD != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final void A03(InterfaceC1352e2 interfaceC1352e2) {
        for (InterfaceC1358e8<ModelType, StateType> interfaceC1358e8 : this.A04) {
            interfaceC1358e8.A5H(this, interfaceC1352e2);
        }
    }
}
