package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.rolling.helper.Compressor;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.4T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4T {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C03153r A01;
    @Nullable
    public AbstractC03294g A02;
    public F6 A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC03374o A0G = new C1225bs(this);
    public final InterfaceC03374o A0H = new C1224br(this);
    public C03394q A04 = new C03394q(this.A0G);
    public C03394q A05 = new C03394q(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, 30, 48, -35, 15, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, 30, 48, -35, 45, 30, 47, 34, 43, 49, -35, 31, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, 30, -35, 47, 34, 30, 41, -35, 32, 37, 38, 41, 33, -21, -35, 18, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, 14, -70, 7, 9, 16, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, 12, 9, 7, -70, 8, 9, 8, -57, -1, 18, 3, 13, 14, 3, 8, 1, -70, 3, 8, -2, -1, 18, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, 31, 37, -48, 29, 37, 35, 36, -48, 31, 38, 21, 34, 34, 25, 20, 21, -48, 31, 30, -4, 17, 41, 31, 37, 36, -13, 24, 25, 28, 20, 34, 21, 30, -40, 2, 21, 19, 41, 19, 28, 21, 34, -48, 34, 21, 19, 41, 19, 28, 21, 34, -36, -48, 3, 36, 17, 36, 21, -48, 35, 36, 17, 36, 21, -39, -48, -78, -56, -50, 121, -58, -50, -52, -51, 121, -56, -49, -66, -53, -53, -62, -67, -66, 121, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, 121, -51, -56, 121, -52, -50, -55, -55, -56, -53, -51, 121, -52, -58, -56, -56, -51, -63, 121, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract C4U A1s();

    static {
        A08();
    }

    public static int A00(int mode, int size, int i2) {
        int mode2 = View.MeasureSpec.getMode(mode);
        int size2 = View.MeasureSpec.getSize(mode);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                return Math.max(size, i2);
            }
            return size2;
        }
        return Math.min(size2, Math.max(size, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r7 != 1073741824) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            int r6 = r6 - r8
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
            r3 = 0
            r2 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2
            r0 = -1
            if (r10 == 0) goto L2b
            if (r9 < 0) goto L5b
            r3 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L87
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            if (r9 < 0) goto L31
            r3 = r9
            r2 = 1073741824(0x40000000, float:2.0)
            goto L90
        L31:
            if (r9 != r0) goto L36
            r3 = r6
            r2 = r7
            goto L90
        L36:
            if (r9 != r1) goto L90
            r3 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 0
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "mbdH64CAyADsqDHKi"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uvhJn14mL"
            r0 = 4
            r2[r0] = r1
            if (r7 == r4) goto L58
            if (r7 != r5) goto L85
        L58:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L90
        L5b:
            if (r9 != r0) goto L6a
            if (r7 == r4) goto L67
            if (r7 == 0) goto L64
            if (r7 == r5) goto L67
            goto L90
        L64:
            r3 = 0
            r2 = 0
            goto L90
        L67:
            r3 = r6
            r2 = r7
            goto L90
        L6a:
            if (r9 != r1) goto L90
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            r2 = 0
            goto L90
        L83:
            r2 = 0
            goto L90
        L85:
            r2 = 0
            goto L90
        L87:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            r2 = 1073741824(0x40000000, float:2.0)
        L90:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A01(int, int, int, int, boolean):int");
    }

    private final int A02(View view) {
        return ((C4U) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C4U) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C4U) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C4U) view.getLayoutParams()).A03.top;
    }

    private final int A06(C03244b c03244b, C03314i c03314i) {
        return 0;
    }

    private final void A09(int i2) {
        A0C(i2, A0t(i2));
    }

    private final void A0A(int i2) {
        if (A0t(i2) != null) {
            this.A01.A0D(i2);
        }
    }

    private final void A0B(int i2, int i3) {
        View A0t = A0t(i2);
        if (A0t != null) {
            A09(i2);
            A0E(A0t, i3);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i2 + this.A03.toString());
    }

    private void A0C(int i2, View view) {
        this.A01.A0C(i2);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i2) {
        A0F(view, i2, (C4U) view.getLayoutParams());
    }

    private final void A0F(View view, int i2, C4U c4u) {
        AbstractC03344l A0G = F6.A0G(view);
        if (A0G.A0c()) {
            this.A03.A0t.A09(A0G);
        } else {
            C03424t c03424t = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c03424t.A0A(A0G);
        }
        this.A01.A0H(view, i2, c4u, A0G.A0c());
    }

    private void A0G(View view, int currentIndex, boolean z) {
        AbstractC03344l A0G = F6.A0G(view);
        if (z || A0G.A0c()) {
            this.A03.A0t.A09(A0G);
        } else {
            this.A03.A0t.A0A(A0G);
        }
        C4U c4u = (C4U) view.getLayoutParams();
        if (A0G.A0i() || A0G.A0d()) {
            if (A0G.A0d()) {
                A0G.A0S();
            } else {
                A0G.A0O();
            }
            this.A01.A0H(view, currentIndex, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            F6 f6 = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == f6) {
                int A07 = this.A01.A07(view);
                if (currentIndex == -1) {
                    currentIndex = this.A01.A05();
                }
                if (A07 != -1) {
                    if (A07 != currentIndex) {
                        this.A03.A06.A0B(A07, currentIndex);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1I());
                }
            } else {
                this.A01.A0I(view, currentIndex, false);
                c4u.A01 = true;
                AbstractC03294g abstractC03294g = this.A02;
                if (abstractC03294g != null && abstractC03294g.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c4u.A02) {
            A0G.A0H.invalidate();
            c4u.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        F6.A0p(view, rect);
    }

    private void A0J(C03244b c03244b, int i2, View view) {
        AbstractC03344l A0G = F6.A0G(view);
        if (A0G.A0h()) {
            return;
        }
        if (A0G.A0b() && !A0G.A0c() && !this.A03.A04.A0B()) {
            A0A(i2);
            c03244b.A0b(A0G);
            return;
        }
        A09(i2);
        c03244b.A0W(view);
        this.A03.A0t.A0C(A0G);
    }

    private final void A0K(C03244b c03244b, C03314i c03314i, AccessibilityEvent accessibilityEvent) {
        F6 f6 = this.A03;
        if (f6 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!f6.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0D());
    }

    private final void A0L(C03244b c03244b, C03314i c03314i, C3X c3x) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c3x.A0N(Compressor.BUFFER_SIZE);
            c3x.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c3x.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c3x.A0R(true);
        }
        c3x.A0P(C3U.A00(A0r(c03244b, c03314i), A0q(c03244b, c03314i), A0P(c03244b, c03314i), A06(c03244b, c03314i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AbstractC03294g abstractC03294g) {
        if (this.A02 == abstractC03294g) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AbstractC03294g abstractC03294g = this.A02;
        return abstractC03294g != null && abstractC03294g.A0F();
    }

    public static boolean A0O(int specMode, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && specMode != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= specMode;
        } else if (mode != 0) {
            return mode == 1073741824 && size == specMode;
        } else {
            return true;
        }
    }

    private final boolean A0P(C03244b c03244b, C03314i c03314i) {
        return false;
    }

    private final boolean A0Q(C03244b c03244b, C03314i c03314i, int hScroll, Bundle bundle) {
        F6 f6 = this.A03;
        if (f6 == null) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        if (hScroll == 4096) {
            if (f6.canScrollVertically(1)) {
                i2 = (A0X() - A0g()) - A0d();
            }
            if (this.A03.canScrollHorizontally(1)) {
                int A0h = A0h();
                int A0e = A0e();
                if (A0J[7].length() == 8) {
                    throw new RuntimeException();
                }
                A0J[7] = "6TTpYbQ6a4";
                i3 = (A0h - A0e) - A0f();
            }
        } else if (hScroll == 8192) {
            if (f6.canScrollVertically(-1)) {
                i2 = -((A0X() - A0g()) - A0d());
            }
            if (this.A03.canScrollHorizontally(-1)) {
                i3 = -((A0h() - A0e()) - A0f());
            }
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.A03.scrollBy(i3, i2);
        return true;
    }

    private final boolean A0R(C03244b c03244b, C03314i c03314i, View view, int i2, Bundle bundle) {
        return false;
    }

    private boolean A0S(F6 f6, int parentLeft, int parentTop) {
        View focusedChild = f6.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int A0e = A0e();
        int A0g = A0g();
        int A0h = A0h() - A0f();
        int A0X = A0X() - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - parentLeft >= A0h || rect.right - parentLeft <= A0e || rect.top - parentTop >= A0X || rect.bottom - parentTop <= A0g) {
            return false;
        }
        if (A0J[3].length() != 28) {
            A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
            return true;
        }
        throw new RuntimeException();
    }

    @Deprecated
    private final boolean A0T(F6 f6, View view, View view2) {
        return A0N() || f6.A1u();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int childLeft = A0e();
        int childTop = A0g();
        int offScreenLeft = A0h() - A0f();
        int A0X = A0X();
        int parentRight = A0d();
        int offScreenRight = A0X - parentRight;
        int left = view.getLeft();
        int parentRight2 = rect.left;
        int i2 = left + parentRight2;
        int parentRight3 = view.getScrollX();
        int offScreenBottom = i2 - parentRight3;
        int top = view.getTop();
        int parentRight4 = rect.top;
        int i3 = top + parentRight4;
        int parentRight5 = view.getScrollY();
        int i4 = i3 - parentRight5;
        int width = rect.width() + offScreenBottom;
        int childBottom = offScreenBottom - childLeft;
        int min = Math.min(0, childBottom);
        int childBottom2 = i4 - childTop;
        int min2 = Math.min(0, childBottom2);
        int offScreenTop = width - offScreenLeft;
        int max = Math.max(0, offScreenTop);
        int max2 = Math.max(0, (rect.height() + i4) - offScreenRight);
        int parentTop = A0a();
        if (parentTop == 1) {
            if (max == 0) {
                max = Math.max(min, width - offScreenLeft);
            }
        } else {
            max = min != 0 ? min : Math.min(offScreenBottom - childLeft, max);
        }
        if (min2 == 0) {
            min2 = Math.min(i4 - childTop, max2);
        }
        iArr[0] = max;
        iArr[1] = min2;
        int parentTop2 = A0J[0].charAt(31);
        if (parentTop2 != 112) {
            A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
            return iArr;
        }
        throw new RuntimeException();
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C03153r c03153r = this.A01;
        if (c03153r != null) {
            return c03153r.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        F6 f6 = this.A03;
        C4H adapter = f6 != null ? f6.getAdapter() : null;
        if (adapter != null) {
            return adapter.A0D();
        }
        return 0;
    }

    public final int A0a() {
        return AnonymousClass38.A01(this.A03);
    }

    public final int A0b() {
        return AnonymousClass38.A02(this.A03);
    }

    public final int A0c() {
        return AnonymousClass38.A03(this.A03);
    }

    public final int A0d() {
        F6 f6 = this.A03;
        if (f6 != null) {
            return f6.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        F6 f6 = this.A03;
        if (f6 != null) {
            return f6.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        F6 f6 = this.A03;
        if (f6 != null) {
            return f6.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        F6 f6 = this.A03;
        if (f6 != null) {
            return f6.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C4U) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C4U) view.getLayoutParams()).A00();
    }

    public int A0q(C03244b c03244b, C03314i c03314i) {
        F6 f6 = this.A03;
        if (f6 == null || f6.A04 == null || !A24()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    public int A0r(C03244b c03244b, C03314i c03314i) {
        F6 f6 = this.A03;
        if (f6 == null || f6.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.F6 r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.3r r4 = r6.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4T.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4T.A0s():android.view.View");
    }

    public final View A0t(int i2) {
        C03153r c03153r = this.A01;
        if (c03153r != null) {
            return c03153r.A09(i2);
        }
        return null;
    }

    public final View A0u(View view, int i2) {
        return null;
    }

    public C4U A0v(Context context, AttributeSet attributeSet) {
        return new C4U(context, attributeSet);
    }

    public C4U A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4U) {
            return new C4U((C4U) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4U((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4U(layoutParams);
    }

    public final void A0x() {
        AbstractC03294g abstractC03294g = this.A02;
        if (abstractC03294g != null) {
            abstractC03294g.A09();
        }
    }

    public final void A0y() {
        F6 f6 = this.A03;
        if (f6 != null) {
            f6.requestLayout();
        }
    }

    public final void A0z(int i2) {
        F6 f6 = this.A03;
        if (f6 != null) {
            f6.A1T(i2);
        }
    }

    public final void A10(int i2) {
        F6 f6 = this.A03;
        if (f6 != null) {
            f6.A1U(i2);
        }
    }

    public final void A11(int i2, int i3) {
        this.A0C = View.MeasureSpec.getSize(i2);
        this.A0D = View.MeasureSpec.getMode(i2);
        if (this.A0D == 0 && !F6.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i3);
        this.A0B = View.MeasureSpec.getMode(i3);
        if (this.A0B == 0 && !F6.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int minX, int minY) {
        int maxX = A0W();
        if (maxX == 0) {
            this.A03.A1a(minX, minY);
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Level.ALL_INT;
        int i5 = Level.ALL_INT;
        for (int i6 = 0; i6 < maxX; i6++) {
            View A0t = A0t(i6);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int maxY = rect.left;
            if (maxY < i2) {
                i2 = rect.left;
            }
            int maxY2 = rect.right;
            if (maxY2 > i4) {
                i4 = rect.right;
            }
            int maxY3 = rect.top;
            if (maxY3 < i3) {
                i3 = rect.top;
            }
            int maxY4 = rect.bottom;
            if (maxY4 > i5) {
                i5 = rect.bottom;
            }
        }
        this.A03.A0p.set(i2, i3, i4, i5);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int length = str.length();
        int maxY5 = str2.length();
        if (length == maxY5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, minX, minY);
    }

    public final void A13(int i2, int i3) {
        this.A03.setMeasuredDimension(i2, i3);
    }

    public final void A14(int i2, C03244b c03244b) {
        View A0t = A0t(i2);
        A0A(i2);
        c03244b.A0X(A0t);
    }

    public void A15(Rect rect, int i2, int i3) {
        A13(A00(i2, rect.width() + A0e() + A0f(), A0c()), A00(i3, rect.height() + A0g() + A0d(), A0b()));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i2) {
        A0G(view, i2, true);
    }

    public final void A19(View view, int i2) {
        A0G(view, i2, false);
    }

    public final void A1A(View view, int i2, int i3) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect A1E = this.A03.A1E(view);
        int i4 = i2 + A1E.left + A1E.right;
        int i5 = i3 + A1E.top + A1E.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c4u.leftMargin + c4u.rightMargin + i4, c4u.width, A24());
        int A012 = A01(A0X(), A0Y(), A0g() + A0d() + c4u.topMargin + c4u.bottomMargin + i5, c4u.height, A25());
        if (A1a(view, A01, A012, c4u)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i2, int i3, int i4, int i5) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect rect = c4u.A03;
        view.layout(rect.left + i2 + c4u.leftMargin, rect.top + i3 + c4u.topMargin, (i4 - rect.right) - c4u.rightMargin, (i5 - rect.bottom) - c4u.bottomMargin);
    }

    public final void A1C(View view, C3X c3x) {
        AbstractC03344l A0G = F6.A0G(view);
        if (A0G != null && !A0G.A0c() && !this.A01.A0K(A0G.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c3x);
        }
    }

    public final void A1D(View view, C03244b c03244b) {
        A0D(view);
        c03244b.A0X(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C4U) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            float f2 = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(floor, floor2, (int) Math.ceil(f2), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C3X c3x) {
        A0L(this.A03.A0r, this.A03.A0s, c3x);
    }

    public final void A1G(C03244b c03244b) {
        int A0E = c03244b.A0E();
        for (int i2 = A0E - 1; i2 >= 0; i2--) {
            View A0F = c03244b.A0F(i2);
            AbstractC03344l A0G = F6.A0G(A0F);
            if (!A0G.A0h()) {
                A0G.A0Z(false);
                if (A0G.A0e()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0G);
                }
                A0G.A0Z(true);
                c03244b.A0V(A0F);
            }
        }
        c03244b.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C03244b c03244b) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            View v = A0t(A0W);
            A0J(c03244b, A0W, v);
        }
    }

    public final void A1I(C03244b c03244b) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!F6.A0G(A0t(A0W)).A0h()) {
                A14(A0W, c03244b);
            }
        }
    }

    public void A1J(C03244b c03244b, C03314i c03314i, int i2, int i3) {
        this.A03.A1a(i2, i3);
    }

    public void A1K(C03244b c03244b, C03314i c03314i, View view, C3X c3x) {
        int A0p = A25() ? A0p(view) : 0;
        int A0p2 = A24() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        c3x.A0Q(C3V.A00(A0p, 1, A0p2, 1, false, false));
    }

    public final void A1L(AbstractC03294g abstractC03294g) {
        AbstractC03294g abstractC03294g2 = this.A02;
        if (abstractC03294g2 != null && abstractC03294g != abstractC03294g2 && abstractC03294g2.A0F()) {
            this.A02.A09();
        }
        this.A02 = abstractC03294g;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(F6 f6) {
    }

    public final void A1N(F6 f6) {
        this.A07 = true;
    }

    public final void A1O(F6 f6) {
        A11(View.MeasureSpec.makeMeasureSpec(f6.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(f6.getHeight(), 1073741824));
    }

    public final void A1P(F6 f6) {
        if (f6 == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = f6;
            this.A01 = f6.A01;
            this.A0C = f6.getWidth();
            this.A0A = f6.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1Q(F6 f6, int i2, int i3) {
    }

    public void A1R(F6 f6, int i2, int i3) {
    }

    public void A1S(F6 f6, int i2, int i3, int i4) {
    }

    public void A1T(F6 f6, int i2, int i3, Object obj) {
    }

    public final void A1U(F6 f6, C03244b c03244b) {
        this.A07 = false;
        A20(f6, c03244b);
    }

    public final void A1V(boolean z) {
        this.A06 = z;
    }

    public final boolean A1W() {
        int i2 = A0W();
        for (int i3 = 0; i3 < i2; i3++) {
            ViewGroup.LayoutParams layoutParams = A0t(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1X() {
        F6 f6 = this.A03;
        return f6 != null && f6.A0B;
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i2, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i2, bundle);
    }

    public final boolean A1a(View view, int i2, int i3, C4U c4u) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i2, c4u.width) && A0O(view.getHeight(), i3, c4u.height)) ? false : true;
    }

    public final boolean A1b(View view, int i2, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i2, bundle);
    }

    public boolean A1c(C4U c4u) {
        return c4u != null;
    }

    public final boolean A1d(F6 f6, View view, Rect rect, boolean z) {
        return A1e(f6, view, rect, z, false);
    }

    public final boolean A1e(F6 f6, View view, Rect rect, boolean z, boolean z2) {
        int[] A0U = A0U(view, rect);
        int i2 = A0U[0];
        int i3 = A0U[1];
        if ((z2 && !A0S(f6, i2, i3)) || (i2 == 0 && i3 == 0)) {
            return false;
        }
        if (z) {
            f6.scrollBy(i2, i3);
        } else {
            f6.A1e(i2, i3);
        }
        return true;
    }

    public final boolean A1f(F6 f6, C03314i c03314i, View view, View view2) {
        return A0T(f6, view, view2);
    }

    public final boolean A1g(F6 f6, ArrayList<View> arrayList, int i2, int i3) {
        return false;
    }

    public int A1h(int i2, C03244b c03244b, C03314i c03314i) {
        return 0;
    }

    public int A1i(int i2, C03244b c03244b, C03314i c03314i) {
        return 0;
    }

    public int A1j(C03314i c03314i) {
        return 0;
    }

    public int A1k(C03314i c03314i) {
        return 0;
    }

    public int A1l(C03314i c03314i) {
        return 0;
    }

    public int A1m(C03314i c03314i) {
        return 0;
    }

    public int A1n(C03314i c03314i) {
        return 0;
    }

    public int A1o(C03314i c03314i) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    @Nullable
    public View A1q(int i2) {
        int A0W = A0W();
        for (int i3 = 0; i3 < A0W; i3++) {
            View A0t = A0t(i3);
            AbstractC03344l A0G = F6.A0G(A0t);
            if (A0G != null && A0G.A0I() == i2 && !A0G.A0h() && (this.A03.A0s.A07() || !A0G.A0c())) {
                return A0t;
            }
        }
        return null;
    }

    @Nullable
    public View A1r(View view, int i2, C03244b c03244b, C03314i c03314i) {
        return null;
    }

    public void A1t(int i2) {
    }

    public void A1u(int i2, int i3, C03314i c03314i, C4R c4r) {
    }

    public void A1v(int i2, C4R c4r) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C03244b c03244b, C03314i c03314i) {
        Log.e(A07(129, 12, 19), A07(141, 67, 101));
    }

    public void A1z(C03314i c03314i) {
    }

    @CallSuper
    public void A20(F6 f6, C03244b c03244b) {
    }

    public void A21(F6 f6, C03314i c03314i, int i2) {
        Log.e(A07(129, 12, 19), A07(208, 68, 14));
    }

    public void A22(String str) {
        F6 f6 = this.A03;
        if (f6 != null) {
            f6.A1p(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
