package com.amazon.aps.iva.d2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class k0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Layout d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final boolean j;
    public final Paint.FontMetricsInt k;
    public final int l;
    public final com.amazon.aps.iva.f2.h[] m;
    public final Rect n;
    public final com.amazon.aps.iva.kb0.e o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(java.lang.CharSequence r45, float r46, com.amazon.aps.iva.k2.f r47, int r48, android.text.TextUtils.TruncateAt r49, int r50, boolean r51, int r52, int r53, int r54, int r55, int r56, int r57, com.amazon.aps.iva.d2.j r58) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d2.k0.<init>(java.lang.CharSequence, float, com.amazon.aps.iva.k2.f, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, com.amazon.aps.iva.d2.j):void");
    }

    public final int a() {
        int height;
        boolean z = this.c;
        Layout layout = this.d;
        if (z) {
            height = layout.getLineBottom(this.e - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.f + this.g + this.l;
    }

    public final float b(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = this.f;
        if (i == this.e - 1 && (fontMetricsInt = this.k) != null) {
            lineBaseline = e(i) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.d.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float c(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.e;
        int i4 = i3 - 1;
        Layout layout = this.d;
        if (i == i4 && (fontMetricsInt = this.k) != null) {
            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f + layout.getLineBottom(i);
        if (i == i3 - 1) {
            i2 = this.g;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int d(int i) {
        return this.d.getLineForOffset(i);
    }

    public final float e(int i) {
        int i2;
        float lineTop = this.d.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f;
        }
        return lineTop + i2;
    }

    public final float f(int i, boolean z) {
        float f;
        float a = ((i) this.o.getValue()).a(i, true, z);
        if (d(i) == this.e - 1) {
            f = this.h + this.i;
        } else {
            f = 0.0f;
        }
        return f + a;
    }

    public final float g(int i, boolean z) {
        float f;
        float a = ((i) this.o.getValue()).a(i, false, z);
        if (d(i) == this.e - 1) {
            f = this.h + this.i;
        } else {
            f = 0.0f;
        }
        return f + a;
    }

    public final CharSequence h() {
        CharSequence text = this.d.getText();
        com.amazon.aps.iva.yb0.j.e(text, "layout.text");
        return text;
    }
}
