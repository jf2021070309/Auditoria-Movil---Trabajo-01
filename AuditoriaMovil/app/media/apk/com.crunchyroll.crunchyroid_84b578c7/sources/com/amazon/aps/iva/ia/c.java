package com.amazon.aps.iva.ia;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ia.b;
import com.amazon.aps.iva.ia.e;
import com.amazon.aps.iva.ma.g;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public final class c extends b {
    public com.amazon.aps.iva.ca.a<Float, Float> C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public boolean H;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(d0 d0Var, e eVar, List<e> list, com.amazon.aps.iva.z9.h hVar) {
        super(d0Var, eVar);
        b bVar;
        b gVar;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.H = true;
        com.amazon.aps.iva.ga.b bVar2 = eVar.s;
        if (bVar2 != null) {
            com.amazon.aps.iva.ca.a<Float, Float> d = bVar2.d();
            this.C = d;
            g(d);
            this.C.a(this);
        } else {
            this.C = null;
        }
        com.amazon.aps.iva.x.f fVar = new com.amazon.aps.iva.x.f(hVar.i.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = list.get(size);
                switch (b.a.a[eVar2.e.ordinal()]) {
                    case 1:
                        gVar = new g(hVar, d0Var, this, eVar2);
                        break;
                    case 2:
                        gVar = new c(d0Var, eVar2, hVar.c.get(eVar2.g), hVar);
                        break;
                    case 3:
                        gVar = new h(d0Var, eVar2);
                        break;
                    case 4:
                        gVar = new d(d0Var, eVar2);
                        break;
                    case 5:
                        gVar = new f(d0Var, eVar2);
                        break;
                    case 6:
                        gVar = new i(d0Var, eVar2);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(eVar2.e);
                        com.amazon.aps.iva.ma.c.b(sb.toString());
                        gVar = null;
                        break;
                }
                if (gVar != null) {
                    fVar.f(gVar.p.d, gVar);
                    if (bVar3 != null) {
                        bVar3.s = gVar;
                        bVar3 = null;
                    } else {
                        this.D.add(0, gVar);
                        int i = a.a[eVar2.u.ordinal()];
                        if (i == 1 || i == 2) {
                            bVar3 = gVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < fVar.h(); i2++) {
                    b bVar4 = (b) fVar.d(fVar.e(i2), null);
                    if (bVar4 != null && (bVar = (b) fVar.d(bVar4.p.f, null)) != null) {
                        bVar4.t = bVar;
                    }
                }
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).f(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        if (obj == h0.E) {
            if (cVar == null) {
                com.amazon.aps.iva.ca.a<Float, Float> aVar = this.C;
                if (aVar != null) {
                    aVar.k(null);
                    return;
                }
                return;
            }
            r rVar = new r(cVar, null);
            this.C = rVar;
            rVar.a(this);
            g(this.C);
        }
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void l(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        RectF rectF = this.F;
        e eVar = this.p;
        rectF.set(0.0f, 0.0f, eVar.o, eVar.p);
        matrix.mapRect(rectF);
        boolean z4 = this.o.u;
        ArrayList arrayList = this.D;
        if (z4 && arrayList.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Paint paint = this.G;
            paint.setAlpha(i);
            g.a aVar = com.amazon.aps.iva.ma.g.a;
            canvas.saveLayer(rectF, paint);
            z.s();
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.H && "__container".equals(eVar.c)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !rectF.isEmpty()) {
                z3 = canvas.clipRect(rectF);
            } else {
                z3 = true;
            }
            if (z3) {
                ((b) arrayList.get(size)).h(canvas, matrix, i);
            }
        }
        canvas.restore();
        z.s();
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void r(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i2 < arrayList2.size()) {
                ((b) arrayList2.get(i2)).d(eVar, i, arrayList, eVar2);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void s(boolean z) {
        super.s(z);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).s(z);
        }
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void t(float f) {
        super.t(f);
        com.amazon.aps.iva.ca.a<Float, Float> aVar = this.C;
        e eVar = this.p;
        if (aVar != null) {
            com.amazon.aps.iva.z9.h hVar = this.o.b;
            f = ((aVar.f().floatValue() * eVar.b.m) - eVar.b.k) / ((hVar.l - hVar.k) + 0.01f);
        }
        if (this.C == null) {
            com.amazon.aps.iva.z9.h hVar2 = eVar.b;
            f -= eVar.n / (hVar2.l - hVar2.k);
        }
        if (eVar.m != 0.0f && !"__container".equals(eVar.c)) {
            f /= eVar.m;
        }
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).t(f);
            } else {
                return;
            }
        }
    }
}
