package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Rw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0902Rw extends AbstractC0868Qo {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC0684Jg A00;
    public final /* synthetic */ MD A01;
    public final /* synthetic */ PU A02;
    public final /* synthetic */ C0900Ru A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0902Rw(C0900Ru c0900Ru, String str, PU pu, InterfaceC0684Jg interfaceC0684Jg, Map map, MD md) {
        this.A03 = c0900Ru;
        this.A04 = str;
        this.A02 = pu;
        this.A00 = interfaceC0684Jg;
        this.A05 = map;
        this.A01 = md;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        C0869Qp c0869Qp;
        SparseBooleanArray sparseBooleanArray;
        C0869Qp c0869Qp2;
        SparseBooleanArray sparseBooleanArray2;
        c0869Qp = this.A03.A01;
        if (c0869Qp.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A04;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC0684Jg interfaceC0684Jg = this.A00;
                String str2 = this.A04;
                OA oa = new OA(this.A05);
                c0869Qp2 = this.A03.A02;
                interfaceC0684Jg.A93(str2, oa.A03(c0869Qp2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A04;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
