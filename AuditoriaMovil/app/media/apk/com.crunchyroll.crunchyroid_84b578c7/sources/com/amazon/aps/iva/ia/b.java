package com.amazon.aps.iva.ia;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.ca.q;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ga.k;
import com.amazon.aps.iva.ha.g;
import com.amazon.aps.iva.ia.e;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.ka.j;
import com.amazon.aps.iva.x.b;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements com.amazon.aps.iva.ba.d, a.InterfaceC0165a, com.amazon.aps.iva.fa.f {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final com.amazon.aps.iva.aa.a d = new com.amazon.aps.iva.aa.a(1);
    public final com.amazon.aps.iva.aa.a e = new com.amazon.aps.iva.aa.a(PorterDuff.Mode.DST_IN, 0);
    public final com.amazon.aps.iva.aa.a f = new com.amazon.aps.iva.aa.a(PorterDuff.Mode.DST_OUT, 0);
    public final com.amazon.aps.iva.aa.a g;
    public final com.amazon.aps.iva.aa.a h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final d0 o;
    public final e p;
    public final com.amazon.aps.iva.ca.h q;
    public com.amazon.aps.iva.ca.d r;
    public b s;
    public b t;
    public List<b> u;
    public final ArrayList v;
    public final q w;
    public boolean x;
    public boolean y;
    public com.amazon.aps.iva.aa.a z;

    /* compiled from: BaseLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.a.values().length];
            b = iArr;
            try {
                iArr[g.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(d0 d0Var, e eVar) {
        com.amazon.aps.iva.aa.a aVar = new com.amazon.aps.iva.aa.a(1);
        this.g = aVar;
        this.h = new com.amazon.aps.iva.aa.a(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = d0Var;
        this.p = eVar;
        defpackage.b.c(new StringBuilder(), eVar.c, "#draw");
        if (eVar.u == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        k kVar = eVar.i;
        kVar.getClass();
        q qVar = new q(kVar);
        this.w = qVar;
        qVar.b(this);
        List<com.amazon.aps.iva.ha.g> list = eVar.h;
        if (list != null && !list.isEmpty()) {
            com.amazon.aps.iva.ca.h hVar = new com.amazon.aps.iva.ca.h(list);
            this.q = hVar;
            Iterator it = hVar.a.iterator();
            while (it.hasNext()) {
                ((com.amazon.aps.iva.ca.a) it.next()).a(this);
            }
            Iterator it2 = this.q.b.iterator();
            while (it2.hasNext()) {
                com.amazon.aps.iva.ca.a<?, ?> aVar2 = (com.amazon.aps.iva.ca.a) it2.next();
                g(aVar2);
                aVar2.a(this);
            }
        }
        e eVar2 = this.p;
        if (!eVar2.t.isEmpty()) {
            com.amazon.aps.iva.ca.d dVar = new com.amazon.aps.iva.ca.d(eVar2.t);
            this.r = dVar;
            dVar.b = true;
            dVar.a(new a.InterfaceC0165a() { // from class: com.amazon.aps.iva.ia.a
                @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
                public final void a() {
                    boolean z;
                    b bVar = b.this;
                    if (bVar.r.l() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != bVar.x) {
                        bVar.x = z;
                        bVar.o.invalidateSelf();
                    }
                }
            });
            boolean z = this.r.f().floatValue() == 1.0f;
            if (z != this.x) {
                this.x = z;
                this.o.invalidateSelf();
            }
            g(this.r);
        } else if (true != this.x) {
            this.x = true;
            this.o.invalidateSelf();
        }
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        b bVar = this.s;
        e eVar3 = this.p;
        if (bVar != null) {
            String str = bVar.p.c;
            eVar2.getClass();
            com.amazon.aps.iva.fa.e eVar4 = new com.amazon.aps.iva.fa.e(eVar2);
            eVar4.a.add(str);
            if (eVar.a(i, this.s.p.c)) {
                b bVar2 = this.s;
                com.amazon.aps.iva.fa.e eVar5 = new com.amazon.aps.iva.fa.e(eVar4);
                eVar5.b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i, eVar3.c)) {
                this.s.r(eVar, eVar.b(i, this.s.p.c) + i, arrayList, eVar4);
            }
        }
        if (!eVar.c(i, eVar3.c)) {
            return;
        }
        String str2 = eVar3.c;
        if (!"__container".equals(str2)) {
            eVar2.getClass();
            com.amazon.aps.iva.fa.e eVar6 = new com.amazon.aps.iva.fa.e(eVar2);
            eVar6.a.add(str2);
            if (eVar.a(i, str2)) {
                com.amazon.aps.iva.fa.e eVar7 = new com.amazon.aps.iva.fa.e(eVar6);
                eVar7.b = this;
                arrayList.add(eVar7);
            }
            eVar2 = eVar6;
        }
        if (eVar.d(i, str2)) {
            r(eVar, eVar.b(i, str2) + i, arrayList, eVar2);
        }
    }

    @Override // com.amazon.aps.iva.ba.d
    public void f(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List<b> list = this.u;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(this.u.get(size).w.d());
                }
            } else {
                b bVar = this.t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.w.d());
                }
            }
        }
        matrix2.preConcat(this.w.d());
    }

    public final void g(com.amazon.aps.iva.ca.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.v.add(aVar);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.p.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0323  */
    @Override // com.amazon.aps.iva.ba.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r19, android.graphics.Matrix r20, int r21) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ia.b.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.amazon.aps.iva.fa.f
    public void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        this.w.c(cVar, obj);
    }

    public final void j() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList();
        for (b bVar = this.t; bVar != null; bVar = bVar.t) {
            this.u.add(bVar);
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        z.s();
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i);

    public i0 m() {
        return this.p.w;
    }

    public j n() {
        return this.p.x;
    }

    public final boolean o() {
        com.amazon.aps.iva.ca.h hVar = this.q;
        if (hVar != null && !hVar.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void p() {
        l0 l0Var = this.o.b.a;
        String str = this.p.c;
        if (l0Var.a) {
            HashMap hashMap = l0Var.c;
            com.amazon.aps.iva.ma.e eVar = (com.amazon.aps.iva.ma.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new com.amazon.aps.iva.ma.e();
                hashMap.put(str, eVar);
            }
            int i = eVar.a + 1;
            eVar.a = i;
            if (i == Integer.MAX_VALUE) {
                eVar.a = i / 2;
            }
            if (str.equals("__container")) {
                com.amazon.aps.iva.x.b bVar = l0Var.b;
                bVar.getClass();
                b.a aVar = new b.a();
                while (aVar.hasNext()) {
                    ((l0.a) aVar.next()).a();
                }
            }
        }
    }

    public final void q(com.amazon.aps.iva.ca.a<?, ?> aVar) {
        this.v.remove(aVar);
    }

    public void s(boolean z) {
        if (z && this.z == null) {
            this.z = new com.amazon.aps.iva.aa.a();
        }
        this.y = z;
    }

    public void t(float f) {
        q qVar = this.w;
        com.amazon.aps.iva.ca.a<Integer, Integer> aVar = qVar.j;
        if (aVar != null) {
            aVar.j(f);
        }
        com.amazon.aps.iva.ca.a<?, Float> aVar2 = qVar.m;
        if (aVar2 != null) {
            aVar2.j(f);
        }
        com.amazon.aps.iva.ca.a<?, Float> aVar3 = qVar.n;
        if (aVar3 != null) {
            aVar3.j(f);
        }
        com.amazon.aps.iva.ca.a<PointF, PointF> aVar4 = qVar.f;
        if (aVar4 != null) {
            aVar4.j(f);
        }
        com.amazon.aps.iva.ca.a<?, PointF> aVar5 = qVar.g;
        if (aVar5 != null) {
            aVar5.j(f);
        }
        com.amazon.aps.iva.ca.a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> aVar6 = qVar.h;
        if (aVar6 != null) {
            aVar6.j(f);
        }
        com.amazon.aps.iva.ca.a<Float, Float> aVar7 = qVar.i;
        if (aVar7 != null) {
            aVar7.j(f);
        }
        com.amazon.aps.iva.ca.d dVar = qVar.k;
        if (dVar != null) {
            dVar.j(f);
        }
        com.amazon.aps.iva.ca.d dVar2 = qVar.l;
        if (dVar2 != null) {
            dVar2.j(f);
        }
        int i = 0;
        com.amazon.aps.iva.ca.h hVar = this.q;
        if (hVar != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = hVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((com.amazon.aps.iva.ca.a) arrayList.get(i2)).j(f);
                i2++;
            }
        }
        com.amazon.aps.iva.ca.d dVar3 = this.r;
        if (dVar3 != null) {
            dVar3.j(f);
        }
        b bVar = this.s;
        if (bVar != null) {
            bVar.t(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i < arrayList2.size()) {
                ((com.amazon.aps.iva.ca.a) arrayList2.get(i)).j(f);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<com.amazon.aps.iva.ba.b> list, List<com.amazon.aps.iva.ba.b> list2) {
    }

    public void r(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
    }
}
