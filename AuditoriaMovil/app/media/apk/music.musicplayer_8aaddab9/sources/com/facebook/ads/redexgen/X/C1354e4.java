package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.e4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1354e4 {
    public static byte[] A0C;
    public static String[] A0D = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    @Nullable
    public InterfaceC1368eI A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final S3 A05;
    public final InterfaceC1361eB A06;
    public final C1359e9 A07;
    public final GI A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-4, -5, -32, -16, -18, -5, -46, -5, -15};
    }

    static {
        A04();
    }

    public C1354e4(InterfaceC1361eB interfaceC1361eB, S3 s3, GI gi, C1359e9 c1359e9, Handler handler) {
        this(interfaceC1361eB, s3, gi, c1359e9, handler, 100);
    }

    public C1354e4(InterfaceC1361eB interfaceC1361eB, S3 s3, GI gi, C1359e9 c1359e9, Handler handler, int i2) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC1361eB;
        this.A05 = s3;
        this.A08 = gi;
        this.A07 = c1359e9;
        this.A04 = handler;
        this.A09 = new RunnableC1355e5(this, i2);
    }

    private void A05(long j2) {
        if (this.A0B.isEmpty()) {
            this.A06.A7r(this.A0A);
            this.A08.A3p(j2, this.A0A);
            this.A08.A5D();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(long j2) {
        this.A06.A7r(this.A0A);
        this.A08.A3p(j2, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C1363eD A00 = this.A07.A00(next);
                    for (Rect rect : this.A0A) {
                        Rect rect2 = this.A03;
                        Rect containerRect = this.A02;
                        if (C1347dx.A00(next, rect2, containerRect, rect) && A00 != C1363eD.A06) {
                            GI gi = this.A08;
                            Rect rect3 = this.A03;
                            Rect rect4 = this.A02;
                            if (A0D[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0D[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            gi.A3I(A00, rect3, rect4);
                        }
                    }
                } else {
                    this.A08.A5D();
                    if (this.A00 != null) {
                        throw new NullPointerException(A03(0, 9, 68));
                    }
                    this.A0B.clear();
                    String[] strArr = A0D;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0D;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A09() {
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A05(this.A05.A9h());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A0B(@Nullable InterfaceC1366eG interfaceC1366eG) {
        this.A08.AEp(interfaceC1366eG);
    }

    public final void A0C(@Nullable InterfaceC1368eI interfaceC1368eI) {
        this.A00 = interfaceC1368eI;
    }
}
