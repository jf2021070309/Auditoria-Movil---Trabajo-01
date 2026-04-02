package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* renamed from: com.facebook.ads.redexgen.X.Bd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0493Bd implements VI {
    public static String[] A06 = {"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    public long A00;
    public long A01;
    public AnonymousClass30 A02;
    public final ArrayDeque<AnonymousClass30> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0500Bk> A04;
    public final PriorityQueue<AnonymousClass30> A05;

    public abstract GY A0L();

    public abstract void A0P(C0503Bn c0503Bn);

    public abstract boolean A0R();

    public AbstractC0493Bd() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new AnonymousClass30());
        }
        this.A04 = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.A04.add(new C02982z(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(AnonymousClass30 anonymousClass30) {
        anonymousClass30.A07();
        this.A03.add(anonymousClass30);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Bv
    /* renamed from: A0M */
    public C0503Bn A4j() throws GZ {
        IJ.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Bv
    /* renamed from: A0N */
    public AbstractC0500Bk A4k() throws GZ {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1024Ws) this.A05.peek()).A00 <= this.A00) {
            AnonymousClass30 poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0500Bk pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                A06[4] = "hAEA";
                A0K(poll);
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                GY A0L = A0L();
                if (!poll.A03()) {
                    AbstractC0500Bk pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1024Ws) poll).A00, A0L, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Bv
    /* renamed from: A0O */
    public void ADT(C0503Bn c0503Bn) throws GZ {
        IJ.A03(c0503Bn == this.A02);
        if (c0503Bn.A03()) {
            AnonymousClass30 anonymousClass30 = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0K(anonymousClass30);
        } else {
            AnonymousClass30 anonymousClass302 = this.A02;
            long j2 = this.A01;
            this.A01 = 1 + j2;
            anonymousClass302.A00 = j2;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0500Bk abstractC0500Bk) {
        abstractC0500Bk.A07();
        this.A04.add(abstractC0500Bk);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Bv
    public void ADj() {
    }

    @Override // com.facebook.ads.redexgen.X.VI
    public void AEl(long j2) {
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Bv
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        AnonymousClass30 anonymousClass30 = this.A02;
        if (anonymousClass30 != null) {
            A0K(anonymousClass30);
            this.A02 = null;
        }
    }
}
