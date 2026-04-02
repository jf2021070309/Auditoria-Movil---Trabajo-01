package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.88  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass88 extends C0796Nt {
    public int A00;
    public boolean A01;
    public final AbstractC04429c<AnonymousClass86> A02;
    public final AbstractC04429c<AnonymousClass85> A03;
    public final AbstractC04429c<C0731Le> A04;
    public final AbstractC04429c<AnonymousClass84> A05;
    public final AbstractC04429c<C0723Kw> A06;
    public final AbstractC04429c<C0718Kq> A07;
    public final AbstractC04429c<C0716Ko> A08;
    public final AbstractC04429c<KZ> A09;
    public final AbstractC04429c<KY> A0A;
    public final Q8 A0B;
    public final L2 A0C;
    public final AbstractC0704Ka A0D;

    public AnonymousClass88(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, Q8 q8, String str) {
        this(c1046Xo, interfaceC0684Jg, q8, new ArrayList(), str);
    }

    public AnonymousClass88(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, Q8 q8, String str, @Nullable Bundle bundle) {
        this(c1046Xo, interfaceC0684Jg, q8, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass88(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, Q8 q8, String str, @Nullable Map<String, String> extraParams) {
        this(c1046Xo, interfaceC0684Jg, q8, new ArrayList(), str, null, extraParams);
    }

    public AnonymousClass88(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, Q8 q8, List<C2A> list, String str) {
        super(c1046Xo, interfaceC0684Jg, q8, list, str, !q8.A0h(), new NK(c1046Xo, q8));
        this.A0D = new AbstractC0704Ka() { // from class: com.facebook.ads.redexgen.X.89
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0705Kb c0705Kb) {
                AnonymousClass88.this.A0Z();
            }
        };
        this.A07 = new Q5(this);
        this.A03 = new Q4(this);
        this.A04 = new Q3(this);
        this.A05 = new C0842Po(this);
        this.A02 = new PQ(this);
        this.A06 = new PP(this);
        this.A09 = new C0812Oj(this);
        this.A0A = new OV(this);
        this.A08 = new Q7(this);
        this.A0C = new L2() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(L3 l3) {
                Q8 q82;
                AnonymousClass88 anonymousClass88 = AnonymousClass88.this;
                q82 = anonymousClass88.A0B;
                anonymousClass88.A00 = q82.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = q8;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public AnonymousClass88(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, Q8 q8, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> extraParams) {
        super(c1046Xo, interfaceC0684Jg, q8, list, str, !q8.A0h(), bundle, extraParams, new NK(c1046Xo, q8));
        this.A0D = new AbstractC0704Ka() { // from class: com.facebook.ads.redexgen.X.89
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0705Kb c0705Kb) {
                AnonymousClass88.this.A0Z();
            }
        };
        this.A07 = new Q5(this);
        this.A03 = new Q4(this);
        this.A04 = new Q3(this);
        this.A05 = new C0842Po(this);
        this.A02 = new PQ(this);
        this.A06 = new PP(this);
        this.A09 = new C0812Oj(this);
        this.A0A = new OV(this);
        this.A08 = new Q7(this);
        this.A0C = new L2() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(L3 l3) {
                Q8 q82;
                AnonymousClass88 anonymousClass88 = AnonymousClass88.this;
                q82 = anonymousClass88.A0B;
                anonymousClass88.A00 = q82.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = q8;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        this.A0B.getStateHandler().post(new Q6(this));
    }
}
