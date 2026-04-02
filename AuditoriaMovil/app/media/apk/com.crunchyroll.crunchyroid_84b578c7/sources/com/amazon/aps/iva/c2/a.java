package com.amazon.aps.iva.c2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import com.amazon.aps.iva.d2.i0;
import com.amazon.aps.iva.d2.k0;
import com.amazon.aps.iva.d2.l0;
import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.k2.b;
import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;
/* compiled from: AndroidParagraph.android.kt */
/* loaded from: classes.dex */
public final class a implements h {
    public final com.amazon.aps.iva.k2.d a;
    public final int b;
    public final long c;
    public final k0 d;
    public final CharSequence e;
    public final List<com.amazon.aps.iva.e1.e> f;
    public final com.amazon.aps.iva.kb0.e g;

    /* compiled from: AndroidParagraph.android.kt */
    /* renamed from: com.amazon.aps.iva.c2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0156a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.n2.g.values().length];
            try {
                iArr[com.amazon.aps.iva.n2.g.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.n2.g.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: AndroidParagraph.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e2.a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.e2.a invoke() {
            a aVar = a.this;
            Locale textLocale = aVar.a.g.getTextLocale();
            com.amazon.aps.iva.yb0.j.e(textLocale, "paragraphIntrinsics.textPaint.textLocale");
            return new com.amazon.aps.iva.e2.a(textLocale, aVar.d.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028c A[LOOP:1: B:228:0x028a->B:229:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ff  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.CharSequence, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.amazon.aps.iva.k2.d r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c2.a.<init>(com.amazon.aps.iva.k2.d, int, boolean, long):void");
    }

    @Override // com.amazon.aps.iva.c2.h
    public final com.amazon.aps.iva.n2.g a(int i) {
        k0 k0Var = this.d;
        if (k0Var.d.getParagraphDirection(k0Var.d(i)) == 1) {
            return com.amazon.aps.iva.n2.g.Ltr;
        }
        return com.amazon.aps.iva.n2.g.Rtl;
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float b(int i) {
        return this.d.e(i);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final com.amazon.aps.iva.e1.e c(int i) {
        boolean z;
        CharSequence charSequence = this.e;
        if (i >= 0 && i <= charSequence.length()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            k0 k0Var = this.d;
            float f = k0Var.f(i, false);
            int d = k0Var.d(i);
            return new com.amazon.aps.iva.e1.e(f, k0Var.e(d), f, k0Var.c(d));
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("offset(", i, ") is out of bounds (0,");
        d2.append(charSequence.length());
        throw new AssertionError(d2.toString());
    }

    @Override // com.amazon.aps.iva.c2.h
    public final long d(int i) {
        int i2;
        int preceding;
        int i3;
        int following;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.kb0.e eVar = this.g;
        com.amazon.aps.iva.e2.b bVar = ((com.amazon.aps.iva.e2.a) eVar.getValue()).a;
        bVar.a(i);
        boolean e = bVar.e(bVar.d.preceding(i));
        BreakIterator breakIterator = bVar.d;
        if (e) {
            bVar.a(i);
            i2 = i;
            while (i2 != -1) {
                if (bVar.e(i2) && !bVar.c(i2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                bVar.a(i2);
                i2 = breakIterator.preceding(i2);
            }
        } else {
            bVar.a(i);
            if (bVar.d(i)) {
                if (breakIterator.isBoundary(i) && !bVar.b(i)) {
                    i2 = i;
                } else {
                    preceding = breakIterator.preceding(i);
                    i2 = preceding;
                }
            } else if (bVar.b(i)) {
                preceding = breakIterator.preceding(i);
                i2 = preceding;
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = i;
        }
        com.amazon.aps.iva.e2.b bVar2 = ((com.amazon.aps.iva.e2.a) eVar.getValue()).a;
        bVar2.a(i);
        boolean c = bVar2.c(bVar2.d.following(i));
        BreakIterator breakIterator2 = bVar2.d;
        if (c) {
            bVar2.a(i);
            i3 = i;
            while (i3 != -1) {
                if (!bVar2.e(i3) && bVar2.c(i3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                bVar2.a(i3);
                i3 = breakIterator2.following(i3);
            }
        } else {
            bVar2.a(i);
            if (bVar2.b(i)) {
                if (breakIterator2.isBoundary(i) && !bVar2.d(i)) {
                    i3 = i;
                } else {
                    following = breakIterator2.following(i);
                    i3 = following;
                }
            } else if (bVar2.d(i)) {
                following = breakIterator2.following(i);
                i3 = following;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            i = i3;
        }
        return com.amazon.aps.iva.ab.x.f(i2, i);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float e() {
        return this.d.b(0);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final int f(long j) {
        float f;
        k0 k0Var = this.d;
        int lineForVertical = k0Var.d.getLineForVertical(((int) com.amazon.aps.iva.e1.c.d(j)) - k0Var.f);
        float c = com.amazon.aps.iva.e1.c.c(j);
        float f2 = -1;
        if (lineForVertical == k0Var.e - 1) {
            f = k0Var.h + k0Var.i;
        } else {
            f = 0.0f;
        }
        return k0Var.d.getOffsetForHorizontal(lineForVertical, (f * f2) + c);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final int g(int i) {
        return this.d.d.getLineStart(i);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float getHeight() {
        return this.d.a();
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float getWidth() {
        return com.amazon.aps.iva.o2.a.h(this.c);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final int h(int i, boolean z) {
        k0 k0Var = this.d;
        if (z) {
            Layout layout = k0Var.d;
            if (layout.getEllipsisStart(i) == 0) {
                return layout.getLineVisibleEnd(i);
            }
            return layout.getEllipsisStart(i) + layout.getLineStart(i);
        }
        Layout layout2 = k0Var.d;
        if (layout2.getEllipsisStart(i) == 0) {
            return layout2.getLineEnd(i);
        }
        return layout2.getText().length();
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float i(int i) {
        float f;
        k0 k0Var = this.d;
        float lineRight = k0Var.d.getLineRight(i);
        if (i == k0Var.e - 1) {
            f = k0Var.i;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    @Override // com.amazon.aps.iva.c2.h
    public final int j(float f) {
        k0 k0Var = this.d;
        return k0Var.d.getLineForVertical(((int) f) - k0Var.f);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final com.amazon.aps.iva.f1.m k(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        CharSequence charSequence = this.e;
        if (z && i2 <= charSequence.length()) {
            Path path = new Path();
            k0 k0Var = this.d;
            k0Var.getClass();
            k0Var.d.getSelectionPath(i, i2, path);
            int i3 = k0Var.f;
            if (i3 != 0 && !path.isEmpty()) {
                path.offset(0.0f, i3);
            }
            return new com.amazon.aps.iva.f1.m(path);
        }
        StringBuilder a = com.amazon.aps.iva.b6.x.a("Start(", i, ") or End(", i2, ") is out of Range(0..");
        a.append(charSequence.length());
        a.append("), or start > end!");
        throw new AssertionError(a.toString());
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float l(int i, boolean z) {
        k0 k0Var = this.d;
        if (z) {
            return k0Var.f(i, false);
        }
        return k0Var.g(i, false);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float m(int i) {
        float f;
        k0 k0Var = this.d;
        float lineLeft = k0Var.d.getLineLeft(i);
        if (i == k0Var.e - 1) {
            f = k0Var.h;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    @Override // com.amazon.aps.iva.c2.h
    public final void n(com.amazon.aps.iva.f1.u uVar, long j, t0 t0Var, com.amazon.aps.iva.n2.i iVar, com.amazon.aps.iva.h1.f fVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.k2.d dVar = this.a;
        com.amazon.aps.iva.k2.f fVar2 = dVar.g;
        int i2 = fVar2.a.b;
        fVar2.getClass();
        if (j != com.amazon.aps.iva.f1.x.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.f1.k kVar = fVar2.a;
            kVar.f(j);
            kVar.j(null);
        }
        fVar2.c(t0Var);
        fVar2.d(iVar);
        fVar2.b(fVar);
        fVar2.a.c(i);
        w(uVar);
        dVar.g.a.c(i2);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float o() {
        k0 k0Var = this.d;
        return k0Var.b(k0Var.e - 1);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final int p(int i) {
        return this.d.d(i);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final com.amazon.aps.iva.n2.g q(int i) {
        if (this.d.d.isRtlCharAt(i)) {
            return com.amazon.aps.iva.n2.g.Rtl;
        }
        return com.amazon.aps.iva.n2.g.Ltr;
    }

    @Override // com.amazon.aps.iva.c2.h
    public final float r(int i) {
        return this.d.c(i);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final com.amazon.aps.iva.e1.e s(int i) {
        boolean z;
        float g;
        float g2;
        float f;
        float f2;
        k0 k0Var = this.d;
        int d = k0Var.d(i);
        float e = k0Var.e(d);
        float c = k0Var.c(d);
        Layout layout = k0Var.d;
        if (layout.getParagraphDirection(d) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(i);
        if (z && !isRtlCharAt) {
            g = k0Var.f(i, false);
            g2 = k0Var.f(i + 1, true);
        } else {
            if (z && isRtlCharAt) {
                f = k0Var.g(i, false);
                f2 = k0Var.g(i + 1, true);
            } else if (isRtlCharAt) {
                f = k0Var.f(i, false);
                f2 = k0Var.f(i + 1, true);
            } else {
                g = k0Var.g(i, false);
                g2 = k0Var.g(i + 1, true);
            }
            float f3 = f;
            g = f2;
            g2 = f3;
        }
        RectF rectF = new RectF(g, e, g2, c);
        return new com.amazon.aps.iva.e1.e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.amazon.aps.iva.c2.h
    public final List<com.amazon.aps.iva.e1.e> t() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.c2.h
    public final void u(com.amazon.aps.iva.f1.u uVar, com.amazon.aps.iva.f1.s sVar, float f, t0 t0Var, com.amazon.aps.iva.n2.i iVar, com.amazon.aps.iva.h1.f fVar, int i) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.k2.d dVar = this.a;
        com.amazon.aps.iva.k2.f fVar2 = dVar.g;
        int i2 = fVar2.a.b;
        fVar2.a(sVar, com.amazon.aps.iva.ab.r.d(getWidth(), getHeight()), f);
        fVar2.c(t0Var);
        fVar2.d(iVar);
        fVar2.b(fVar);
        fVar2.a.c(i);
        w(uVar);
        dVar.g.a.c(i2);
    }

    public final k0 v(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        q qVar;
        CharSequence charSequence = this.e;
        float width = getWidth();
        com.amazon.aps.iva.k2.d dVar = this.a;
        com.amazon.aps.iva.k2.f fVar = dVar.g;
        int i8 = dVar.l;
        com.amazon.aps.iva.d2.j jVar = dVar.i;
        b.a aVar = com.amazon.aps.iva.k2.b.a;
        a0 a0Var = dVar.b;
        com.amazon.aps.iva.yb0.j.f(a0Var, "<this>");
        s sVar = a0Var.c;
        if (sVar != null && (qVar = sVar.b) != null) {
            z = qVar.a;
        } else {
            z = true;
        }
        return new k0(charSequence, width, fVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, jVar);
    }

    public final void w(com.amazon.aps.iva.f1.u uVar) {
        Canvas canvas = com.amazon.aps.iva.f1.h.a;
        com.amazon.aps.iva.yb0.j.f(uVar, "<this>");
        Canvas canvas2 = ((com.amazon.aps.iva.f1.g) uVar).a;
        k0 k0Var = this.d;
        if (k0Var.c) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        k0Var.getClass();
        com.amazon.aps.iva.yb0.j.f(canvas2, "canvas");
        if (canvas2.getClipBounds(k0Var.n)) {
            int i = k0Var.f;
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            i0 i0Var = l0.a;
            i0Var.getClass();
            i0Var.a = canvas2;
            k0Var.d.draw(i0Var);
            if (i != 0) {
                canvas2.translate(0.0f, (-1) * i);
            }
        }
        if (k0Var.c) {
            canvas2.restore();
        }
    }
}
