package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.65  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final AnonymousClass66 A00;
    public final AnonymousClass67 A01;
    public final C1045Xn A02;
    public final RK A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = AnonymousClass65.class.getSimpleName();
    }

    public AnonymousClass65(C1045Xn c1045Xn, GR gr, AnonymousClass66 anonymousClass66, AnonymousClass67 anonymousClass67) {
        this.A02 = c1045Xn;
        this.A03 = gr.A4N(RL.A06);
        this.A00 = anonymousClass66;
        this.A01 = anonymousClass67;
        this.A03.A3E(new C1179b7(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (C0726Kz.A02(this)) {
            return;
        }
        if (!this.A03.A8c()) {
            this.A02.A03().A8P();
            return;
        }
        String optString = this.A03.A6I().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(optString)) {
            this.A00.A04(this.A02, optString);
            if (!A04 || JQ.A0g(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
