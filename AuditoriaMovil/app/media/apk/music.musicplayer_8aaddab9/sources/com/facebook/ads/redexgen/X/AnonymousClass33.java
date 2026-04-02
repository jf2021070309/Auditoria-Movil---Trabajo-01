package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.33  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends AbstractC0546Ds implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public VI A03;
    public C0503Bn A04;
    public AbstractC0500Bk A05;
    public AbstractC0500Bk A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AZ A0A;
    public final InterfaceC0602Ga A0B;
    public final InterfaceC0603Gb A0C;

    public AnonymousClass33(InterfaceC0603Gb interfaceC0603Gb, Looper looper) {
        this(interfaceC0603Gb, looper, InterfaceC0602Ga.A00);
    }

    public AnonymousClass33(InterfaceC0603Gb interfaceC0603Gb, Looper looper, InterfaceC0602Ga interfaceC0602Ga) {
        super(3);
        this.A0C = (InterfaceC0603Gb) IJ.A01(interfaceC0603Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0602Ga;
        this.A0A = new AZ();
    }

    private long A00() {
        int i2 = this.A01;
        if (i2 == -1 || i2 >= this.A06.A6b()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6a(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0500Bk abstractC0500Bk = this.A06;
        if (abstractC0500Bk != null) {
            abstractC0500Bk.A08();
            this.A06 = null;
        }
        AbstractC0500Bk abstractC0500Bk2 = this.A05;
        if (abstractC0500Bk2 != null) {
            abstractC0500Bk2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADj();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4F(this.A02);
    }

    private void A05(List<GX> list) {
        this.A0C.AAQ(list);
    }

    private void A06(List<GX> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0546Ds
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0546Ds
    public final void A15(long j2, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        VI vi = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        vi.flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0546Ds
    public final void A17(Format[] formatArr, long j2) throws AM {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4F(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final boolean A8R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final boolean A8c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r6 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        A02();
        r9.A08 = true;
     */
    @Override // com.facebook.ads.redexgen.X.X6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADw(long r10, long r12) throws com.facebook.ads.redexgen.X.AM {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass33.ADw(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0485Au
    public final int AFC(Format format) {
        if (this.A0B.AFD(format)) {
            return AbstractC0546Ds.A0x(null, format.A0H) ? 4 : 2;
        } else if (C0653Ib.A0A(format.A0O)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
