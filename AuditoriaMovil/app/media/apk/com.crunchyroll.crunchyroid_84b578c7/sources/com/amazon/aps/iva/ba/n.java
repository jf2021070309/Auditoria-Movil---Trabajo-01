package com.amazon.aps.iva.ba;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.ha.r;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public final class n implements a.InterfaceC0165a, j, l {
    public final String c;
    public final boolean d;
    public final d0 e;
    public final com.amazon.aps.iva.ca.a<?, PointF> f;
    public final com.amazon.aps.iva.ca.a<?, PointF> g;
    public final com.amazon.aps.iva.ca.d h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final i0 i = new i0();
    public com.amazon.aps.iva.ca.a<Float, Float> j = null;

    public n(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.j jVar) {
        this.c = jVar.a;
        this.d = jVar.e;
        this.e = d0Var;
        com.amazon.aps.iva.ca.a<PointF, PointF> d = jVar.b.d();
        this.f = d;
        com.amazon.aps.iva.ca.a<PointF, PointF> d2 = jVar.c.d();
        this.g = d2;
        com.amazon.aps.iva.ca.a<?, ?> d3 = jVar.d.d();
        this.h = (com.amazon.aps.iva.ca.d) d3;
        bVar.g(d);
        bVar.g(d2);
        bVar.g(d3);
        d.a(this);
        d2.a(this);
        d3.a(this);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        float l;
        com.amazon.aps.iva.ca.a<Float, Float> aVar;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF f = this.g.f();
        float f2 = f.x / 2.0f;
        float f3 = f.y / 2.0f;
        com.amazon.aps.iva.ca.d dVar = this.h;
        if (dVar == null) {
            l = 0.0f;
        } else {
            l = dVar.l();
        }
        if (l == 0.0f && (aVar = this.j) != null) {
            l = Math.min(aVar.f().floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (l > min) {
            l = min;
        }
        PointF f4 = this.f.f();
        path.moveTo(f4.x + f2, (f4.y - f3) + l);
        path.lineTo(f4.x + f2, (f4.y + f3) - l);
        int i = (l > 0.0f ? 1 : (l == 0.0f ? 0 : -1));
        RectF rectF = this.b;
        if (i > 0) {
            float f5 = f4.x + f2;
            float f6 = l * 2.0f;
            float f7 = f4.y + f3;
            rectF.set(f5 - f6, f7 - f6, f5, f7);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((f4.x - f2) + l, f4.y + f3);
        if (i > 0) {
            float f8 = f4.x - f2;
            float f9 = f4.y + f3;
            float f10 = l * 2.0f;
            rectF.set(f8, f9 - f10, f10 + f8, f9);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f4.x - f2, (f4.y - f3) + l);
        if (i > 0) {
            float f11 = f4.x - f2;
            float f12 = f4.y - f3;
            float f13 = l * 2.0f;
            rectF.set(f11, f12, f11 + f13, f13 + f12);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f4.x + f2) - l, f4.y - f3);
        if (i > 0) {
            float f14 = f4.x + f2;
            float f15 = l * 2.0f;
            float f16 = f4.y - f3;
            rectF.set(f14 - f15, f16, f14, f15 + f16);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                if (bVar instanceof t) {
                    t tVar = (t) bVar;
                    if (tVar.c == r.a.SIMULTANEOUSLY) {
                        ((List) this.i.b).add(tVar);
                        tVar.d(this);
                        i++;
                    }
                }
                if (bVar instanceof p) {
                    this.j = ((p) bVar).b;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.l) {
            this.g.k(cVar);
        } else if (obj == h0.n) {
            this.f.k(cVar);
        } else if (obj == h0.m) {
            this.h.k(cVar);
        }
    }
}
