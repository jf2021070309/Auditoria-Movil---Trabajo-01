package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class U3 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8S {
    public static byte[] A02;
    public final C1046Xo A00;
    public final /* synthetic */ U1 A01;

    static {
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public U3(U1 u1, C1046Xo c1046Xo) {
        this.A01 = u1;
        this.A00 = c1046Xo;
    }

    public /* synthetic */ U3(U1 u1, C1046Xo c1046Xo, UC uc) {
        this(u1, c1046Xo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C0869Qp c0869Qp;
        MD md;
        K7 k7;
        boolean z;
        boolean z2;
        K7 k72;
        OA oa = new OA();
        c0869Qp = this.A01.A0R;
        OA A03 = oa.A03(c0869Qp);
        md = this.A01.A0f;
        Map<String, String> A05 = A03.A02(md).A05();
        k7 = this.A01.A0I;
        if (k7 != null) {
            k72 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(k72.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z2));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1046Xo A5a() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MD md;
        C1046Xo c1046Xo;
        MD md2;
        C1046Xo c1046Xo2;
        C1046Xo c1046Xo3;
        MD md3;
        MD md4;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            md = this.A01.A0f;
            boolean A08 = md.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1046Xo = this.A01.A0c;
            int A0E = JQ.A0E(c1046Xo);
            if (A0E >= 0) {
                md3 = this.A01.A0f;
                if (md3.A03() < A0E) {
                    md4 = this.A01.A0f;
                    if (!md4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            md2 = this.A01.A0f;
            c1046Xo2 = this.A01.A0c;
            if (!md2.A09(c1046Xo2)) {
                c1046Xo3 = this.A01.A0c;
                if (JQ.A12(c1046Xo3)) {
                    if (this.A01.A0a != null) {
                        this.A01.A0a.A0Q(A01());
                    }
                    C0738Ll.A00(new K0(this), new K1(this), ActivityUtils.A00());
                    return;
                }
                A05(A01());
            } else if (this.A01.A0a != null) {
                this.A01.A0a.A0N(A01());
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        O8 o8;
        O8 o82;
        View view3;
        View view4;
        O8 o83;
        O8 o84;
        view2 = this.A01.A04;
        if (view2 != null) {
            o8 = this.A01.A0L;
            if (o8 != null) {
                o82 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                o82.setBounds(0, 0, width, view4.getHeight());
                o83 = this.A01.A0L;
                o84 = this.A01.A0L;
                o83.A0D(!o84.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MD md;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        md = this.A01.A0f;
        view2 = this.A01.A04;
        md.A06(motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
