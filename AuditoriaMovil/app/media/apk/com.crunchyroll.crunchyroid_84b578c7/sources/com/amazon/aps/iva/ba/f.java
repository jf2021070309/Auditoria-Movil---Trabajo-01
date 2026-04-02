package com.amazon.aps.iva.ba;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public final class f implements d, a.InterfaceC0165a, j {
    public final Path a;
    public final com.amazon.aps.iva.aa.a b;
    public final com.amazon.aps.iva.ia.b c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final com.amazon.aps.iva.ca.b g;
    public final com.amazon.aps.iva.ca.f h;
    public com.amazon.aps.iva.ca.r i;
    public final d0 j;
    public com.amazon.aps.iva.ca.a<Float, Float> k;
    public float l;
    public final com.amazon.aps.iva.ca.c m;

    public f(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.n nVar) {
        com.amazon.aps.iva.ga.d dVar;
        Path path = new Path();
        this.a = path;
        this.b = new com.amazon.aps.iva.aa.a(1);
        this.f = new ArrayList();
        this.c = bVar;
        this.d = nVar.c;
        this.e = nVar.f;
        this.j = d0Var;
        if (bVar.m() != null) {
            com.amazon.aps.iva.ca.a<Float, Float> d = ((com.amazon.aps.iva.ga.b) bVar.m().b).d();
            this.k = d;
            d.a(this);
            bVar.g(this.k);
        }
        if (bVar.n() != null) {
            this.m = new com.amazon.aps.iva.ca.c(this, bVar, bVar.n());
        }
        com.amazon.aps.iva.ga.a aVar = nVar.d;
        if (aVar != null && (dVar = nVar.e) != null) {
            path.setFillType(nVar.b);
            com.amazon.aps.iva.ca.a<Integer, Integer> d2 = aVar.d();
            this.g = (com.amazon.aps.iva.ca.b) d2;
            d2.a(this);
            bVar.g(d2);
            com.amazon.aps.iva.ca.a<Integer, Integer> d3 = dVar.d();
            this.h = (com.amazon.aps.iva.ca.f) d3;
            d3.a(this);
            bVar.g(d3);
            return;
        }
        this.g = null;
        this.h = null;
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            b bVar = list2.get(i);
            if (bVar instanceof l) {
                this.f.add((l) bVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                path.addPath(((l) arrayList.get(i)).b(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        com.amazon.aps.iva.ca.b bVar = this.g;
        int l = bVar.l(bVar.b(), bVar.d());
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        int i2 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.h.f().intValue()) / 100.0f) * 255.0f))) << 24) | (l & 16777215);
        com.amazon.aps.iva.aa.a aVar = this.b;
        aVar.setColor(max);
        com.amazon.aps.iva.ca.r rVar = this.i;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.f());
        }
        com.amazon.aps.iva.ca.a<Float, Float> aVar2 = this.k;
        if (aVar2 != null) {
            float floatValue = aVar2.f().floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.l) {
                com.amazon.aps.iva.ia.b bVar2 = this.c;
                if (bVar2.A == floatValue) {
                    blurMaskFilter = bVar2.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar2.B = blurMaskFilter2;
                    bVar2.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        com.amazon.aps.iva.ca.c cVar = this.m;
        if (cVar != null) {
            cVar.b(aVar);
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i2)).b(), matrix);
                i2++;
            } else {
                canvas.drawPath(path, aVar);
                z.s();
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.a) {
            this.g.k(cVar);
        } else if (obj == h0.d) {
            this.h.k(cVar);
        } else {
            ColorFilter colorFilter = h0.K;
            com.amazon.aps.iva.ia.b bVar = this.c;
            if (obj == colorFilter) {
                com.amazon.aps.iva.ca.r rVar = this.i;
                if (rVar != null) {
                    bVar.q(rVar);
                }
                if (cVar == null) {
                    this.i = null;
                    return;
                }
                com.amazon.aps.iva.ca.r rVar2 = new com.amazon.aps.iva.ca.r(cVar, null);
                this.i = rVar2;
                rVar2.a(this);
                bVar.g(this.i);
            } else if (obj == h0.j) {
                com.amazon.aps.iva.ca.a<Float, Float> aVar = this.k;
                if (aVar != null) {
                    aVar.k(cVar);
                    return;
                }
                com.amazon.aps.iva.ca.r rVar3 = new com.amazon.aps.iva.ca.r(cVar, null);
                this.k = rVar3;
                rVar3.a(this);
                bVar.g(this.k);
            } else {
                Integer num = h0.e;
                com.amazon.aps.iva.ca.c cVar2 = this.m;
                if (obj == num && cVar2 != null) {
                    cVar2.b.k(cVar);
                } else if (obj == h0.G && cVar2 != null) {
                    cVar2.c(cVar);
                } else if (obj == h0.H && cVar2 != null) {
                    cVar2.d.k(cVar);
                } else if (obj == h0.I && cVar2 != null) {
                    cVar2.e.k(cVar);
                } else if (obj == h0.J && cVar2 != null) {
                    cVar2.f.k(cVar);
                }
            }
        }
    }
}
