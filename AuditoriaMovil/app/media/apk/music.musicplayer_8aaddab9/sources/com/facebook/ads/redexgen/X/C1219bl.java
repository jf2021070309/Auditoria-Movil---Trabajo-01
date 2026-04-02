package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1219bl extends C4Y {
    public static String[] A02 = {"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1218bk A01;

    public C1219bl(AbstractC1218bk abstractC1218bk) {
        this.A01 = abstractC1218bk;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final void A0L(F6 f6, int i2) {
        super.A0L(f6, i2);
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final void A0M(F6 f6, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A02[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}
