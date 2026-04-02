package com.facebook.ads.redexgen.X;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.LinkedList;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class KE {
    public final KC A0B;
    public final boolean A0F;
    public final String A0C = KE.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
    public final int A08 = FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = FacebookMediationAdapter.ERROR_NULL_CONTEXT;
    public final int A05 = 108;
    public final int A06 = FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<KD> A0D = new LinkedList();

    public KE(C8U c8u, KC kc) {
        int A0D = JS.A0D(c8u);
        if (A0D < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = A0D;
            this.A0F = c8u.A07().A00() < 1.0d / sessionRandom;
        }
        this.A0B = kc;
    }

    private int A00() {
        return this.A0B.A6D();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(KD kd) {
        synchronized (this.A0D) {
            this.A0D.add(kd);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new KD(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, A00(), null));
    }

    public final void A0C(C8U c8u, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new KD(A01(), FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, A00(), null));
        MQ.A06.execute(new KB(this, str, c8u));
    }
}
