package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.9H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9H {
    public static byte[] A05;
    public C9I A01;
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public int A00 = 0;
    public List<C9F> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{79, 88};
    }

    public C9H(C9I c9i, @Nullable String str, @Nullable String str2) {
        this.A01 = c9i;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C9I c9i = this.A01;
        if (c9i != null) {
            return c9i.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C9F A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C9I A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        int i2 = this.A00;
        if (i2 > 0 && i2 <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    public final void A09(C9F c9f) {
        this.A04.add(c9f);
    }

    public final boolean A0A() {
        return this.A01 == null || MC.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
