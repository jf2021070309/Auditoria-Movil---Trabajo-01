package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class KV implements Q0 {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    @Nullable
    public Q8 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final ME A07 = new ME() { // from class: com.facebook.ads.redexgen.X.83
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC04429c
        /* renamed from: A00 */
        public final void A03(AnonymousClass85 anonymousClass85) {
            Handler handler;
            boolean A0D;
            handler = KV.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = KV.this.A0D(QL.A05);
            if (A0D) {
                KV.this.A03();
                KV.this.A06(true, false);
            }
            KV.this.A03 = true;
        }
    };
    public final N0 A06 = new N0() { // from class: com.facebook.ads.redexgen.X.82
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC04429c
        /* renamed from: A00 */
        public final void A03(AnonymousClass86 anonymousClass86) {
            KV.this.A03();
            KV.this.A06(false, false);
            KV.this.A03 = true;
        }
    };
    public final LF A08 = new AnonymousClass81(this);
    public final L0 A09 = new L0() { // from class: com.facebook.ads.redexgen.X.80
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC04429c
        /* renamed from: A00 */
        public final void A03(AnonymousClass84 anonymousClass84) {
            boolean z;
            boolean A0D;
            z = KV.this.A02;
            if (z) {
                return;
            }
            A0D = KV.this.A0D(QL.A05);
            if (!A0D) {
                return;
            }
            KV.this.A03();
            KV.this.A06(true, false);
        }
    };
    public final AbstractC0706Kc A0A = new C04187z(this);
    public final Handler A05 = new Handler();
    public final List<QM> A0B = new ArrayList();
    public int A00 = 2000;

    public KV(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(KV kv) {
        return kv.A00;
    }

    public static /* synthetic */ Handler A01(KV kv) {
        return kv.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<QM> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(KV kv) {
        kv.A03();
    }

    public static /* synthetic */ void A05(KV kv, boolean z, boolean z2) {
        kv.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (QM qm : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            qm.A3L(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(KV kv) {
        return kv.A03;
    }

    public static /* synthetic */ boolean A08(KV kv) {
        return kv.A02;
    }

    public static /* synthetic */ boolean A09(KV kv) {
        return kv.A04;
    }

    public static /* synthetic */ boolean A0A(KV kv, QL ql) {
        return kv.A0D(ql);
    }

    public static /* synthetic */ boolean A0B(KV kv, boolean z) {
        kv.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0C(KV kv, boolean z) {
        kv.A04 = z;
        return z;
    }

    public boolean A0D(QL ql) {
        for (QM qm : this.A0B) {
            if (qm.A7W() != ql) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i2) {
        this.A00 = i2;
    }

    public final void A0I(QM qm) {
        this.A0B.add(qm);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A8o(Q8 q8) {
        this.A01 = q8;
        q8.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AFL(Q8 q8) {
        A03();
        q8.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
