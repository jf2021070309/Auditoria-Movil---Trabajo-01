package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class SN extends O0 {
    public static byte[] A01;
    public final /* synthetic */ P4 A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN(P4 p4, C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A00 = p4;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int specMode, int specSize, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int specMode2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return specMode;
                }
                return specMode2;
            }
            return Math.min(specMode, specSize);
        }
        return Math.min(Math.min(specMode, specMode2), specSize);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final WebChromeClient A0D() {
        return new C0827Oz(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final WebViewClient A0E() {
        return new P0(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return P4.A01(this.A00).A0c().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return P4.A01(this.A00).A0c().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int w, int h2) {
        int widthSpecMode = getDynamicWebViewWidth();
        int heightSpecMode = getDynamicWebViewHeight();
        if (widthSpecMode <= 0 || heightSpecMode <= 0) {
            super.onMeasure(w, h2);
            return;
        }
        float f2 = widthSpecMode / heightSpecMode;
        int mode = View.MeasureSpec.getMode(w);
        int mode2 = View.MeasureSpec.getMode(h2);
        boolean z = true;
        boolean z2 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z = false;
        }
        int i2 = getResources().getDisplayMetrics().widthPixels;
        int i3 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int maxWidth = viewGroup.getWidth();
            i3 = Integer.MAX_VALUE;
            i2 = maxWidth != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            int maxWidth2 = viewGroup.getHeight();
            if (maxWidth2 != 0) {
                i3 = viewGroup.getHeight();
            }
        }
        int A012 = A01(widthSpecMode, i2, w);
        int widthSpecMode2 = A01(heightSpecMode, i3, h2);
        if (z || z2) {
            int maxWidth3 = A012 / widthSpecMode2;
            if (Math.abs(maxWidth3 - f2) > 1.0E-7d) {
                boolean done = false;
                if (z) {
                    widthSpecMode2 = (int) (A012 / f2);
                    done = true;
                }
                if (!done && z2) {
                    A012 = (int) (widthSpecMode2 * f2);
                }
            }
        }
        setMeasuredDimension(A012, widthSpecMode2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (P4.A06(this.A00) != null) {
            P4.A06(this.A00).ACU(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
