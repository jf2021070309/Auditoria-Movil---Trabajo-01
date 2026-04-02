package com.amazon.aps.iva.ia;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.o;
import com.amazon.aps.iva.ca.p;
import com.amazon.aps.iva.ca.r;
import com.amazon.aps.iva.fa.b;
import com.amazon.aps.iva.ga.j;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.ia.b {
    public final StringBuilder C;
    public final RectF D;
    public final Matrix E;
    public final a F;
    public final b G;
    public final HashMap H;
    public final com.amazon.aps.iva.x.f<String> I;
    public final ArrayList J;
    public final p K;
    public final d0 L;
    public final com.amazon.aps.iva.z9.h M;
    public final com.amazon.aps.iva.ca.b N;
    public r O;
    public final com.amazon.aps.iva.ca.b P;
    public r Q;
    public final com.amazon.aps.iva.ca.d R;
    public r S;
    public final com.amazon.aps.iva.ca.d T;
    public r U;
    public r V;
    public r W;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static class d {
        public String a = "";
        public float b = 0.0f;
    }

    public i(d0 d0Var, e eVar) {
        super(d0Var, eVar);
        com.amazon.aps.iva.ga.b bVar;
        com.amazon.aps.iva.ga.b bVar2;
        com.amazon.aps.iva.ga.a aVar;
        com.amazon.aps.iva.ga.a aVar2;
        this.C = new StringBuilder(2);
        this.D = new RectF();
        this.E = new Matrix();
        this.F = new a();
        this.G = new b();
        this.H = new HashMap();
        this.I = new com.amazon.aps.iva.x.f<>();
        this.J = new ArrayList();
        this.L = d0Var;
        this.M = eVar.b;
        p pVar = new p((List) eVar.q.c);
        this.K = pVar;
        pVar.a(this);
        g(pVar);
        j jVar = eVar.r;
        if (jVar != null && (aVar2 = jVar.a) != null) {
            com.amazon.aps.iva.ca.a<?, ?> d2 = aVar2.d();
            this.N = (com.amazon.aps.iva.ca.b) d2;
            d2.a(this);
            g(d2);
        }
        if (jVar != null && (aVar = jVar.b) != null) {
            com.amazon.aps.iva.ca.a<?, ?> d3 = aVar.d();
            this.P = (com.amazon.aps.iva.ca.b) d3;
            d3.a(this);
            g(d3);
        }
        if (jVar != null && (bVar2 = jVar.c) != null) {
            com.amazon.aps.iva.ca.a<?, ?> d4 = bVar2.d();
            this.R = (com.amazon.aps.iva.ca.d) d4;
            d4.a(this);
            g(d4);
        }
        if (jVar != null && (bVar = jVar.d) != null) {
            com.amazon.aps.iva.ca.a<?, ?> d5 = bVar.d();
            this.T = (com.amazon.aps.iva.ca.d) d5;
            d5.a(this);
            g(d5);
        }
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static List x(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public static void y(Canvas canvas, com.amazon.aps.iva.fa.b bVar, int i, float f) {
        float f2;
        float f3;
        PointF pointF = bVar.l;
        PointF pointF2 = bVar.m;
        float c2 = com.amazon.aps.iva.ma.g.c();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (bVar.f * c2) + pointF.y;
        }
        float f5 = (i * bVar.f * c2) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = c.a[bVar.d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f5);
                    return;
                }
                return;
            }
            canvas.translate((f3 + f4) - f, f5);
            return;
        }
        canvas.translate(f3, f5);
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        com.amazon.aps.iva.z9.h hVar = this.M;
        rectF.set(0.0f, 0.0f, hVar.j.width(), hVar.j.height());
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        if (obj == h0.a) {
            r rVar = this.O;
            if (rVar != null) {
                q(rVar);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            r rVar2 = new r(cVar, null);
            this.O = rVar2;
            rVar2.a(this);
            g(this.O);
        } else if (obj == h0.b) {
            r rVar3 = this.Q;
            if (rVar3 != null) {
                q(rVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            r rVar4 = new r(cVar, null);
            this.Q = rVar4;
            rVar4.a(this);
            g(this.Q);
        } else if (obj == h0.s) {
            r rVar5 = this.S;
            if (rVar5 != null) {
                q(rVar5);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            r rVar6 = new r(cVar, null);
            this.S = rVar6;
            rVar6.a(this);
            g(this.S);
        } else if (obj == h0.t) {
            r rVar7 = this.U;
            if (rVar7 != null) {
                q(rVar7);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            r rVar8 = new r(cVar, null);
            this.U = rVar8;
            rVar8.a(this);
            g(this.U);
        } else if (obj == h0.F) {
            r rVar9 = this.V;
            if (rVar9 != null) {
                q(rVar9);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            r rVar10 = new r(cVar, null);
            this.V = rVar10;
            rVar10.a(this);
            g(this.V);
        } else if (obj == h0.M) {
            r rVar11 = this.W;
            if (rVar11 != null) {
                q(rVar11);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            r rVar12 = new r(cVar, null);
            this.W = rVar12;
            rVar12.a(this);
            g(this.W);
        } else if (obj == h0.O) {
            p pVar = this.K;
            pVar.getClass();
            pVar.k(new o(new com.amazon.aps.iva.na.b(), cVar, new com.amazon.aps.iva.fa.b()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    @Override // com.amazon.aps.iva.ia.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ia.i.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final d w(int i) {
        ArrayList arrayList = this.J;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new d());
        }
        return (d) arrayList.get(i - 1);
    }

    public final List<d> z(String str, float f, com.amazon.aps.iva.fa.c cVar, float f2, float f3, boolean z) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                com.amazon.aps.iva.fa.d dVar = (com.amazon.aps.iva.fa.d) this.M.g.d(cVar.c.hashCode() + com.amazon.aps.iva.c80.a.b(cVar.a, charAt * 31, 31), null);
                if (dVar != null) {
                    measureText = (com.amazon.aps.iva.ma.g.c() * ((float) dVar.c) * f2) + f3;
                }
            } else {
                measureText = this.F.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = measureText;
            } else {
                f5 += measureText;
            }
            f4 += measureText;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                d w = w(i);
                if (i3 == i2) {
                    w.a = str.substring(i2, i4).trim();
                    w.b = (f4 - measureText) - ((trim2.length() - substring2.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    w.a = str.substring(i2, i3 - 1).trim();
                    w.b = ((f4 - f5) - ((substring.length() - trim.length()) * f6)) - f6;
                    i2 = i3;
                    f4 = f5;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            d w2 = w(i);
            w2.a = str.substring(i2);
            w2.b = f4;
        }
        return this.J.subList(0, i);
    }
}
