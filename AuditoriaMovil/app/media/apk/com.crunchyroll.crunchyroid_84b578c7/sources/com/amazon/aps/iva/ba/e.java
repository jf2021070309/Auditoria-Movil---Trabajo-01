package com.amazon.aps.iva.ba;

import android.graphics.Path;
import android.graphics.PointF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.ha.r;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public final class e implements l, a.InterfaceC0165a, j {
    public final String b;
    public final d0 c;
    public final com.amazon.aps.iva.ca.k d;
    public final com.amazon.aps.iva.ca.a<?, PointF> e;
    public final com.amazon.aps.iva.ha.a f;
    public boolean h;
    public final Path a = new Path();
    public final i0 g = new i0();

    public e(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.a aVar) {
        this.b = aVar.a;
        this.c = d0Var;
        com.amazon.aps.iva.ca.a<?, ?> d = aVar.c.d();
        this.d = (com.amazon.aps.iva.ca.k) d;
        com.amazon.aps.iva.ca.a<PointF, PointF> d2 = aVar.b.d();
        this.e = d2;
        this.f = aVar;
        bVar.g(d);
        bVar.g(d2);
        d.a(this);
        d2.a(this);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        com.amazon.aps.iva.ha.a aVar = this.f;
        if (aVar.e) {
            this.h = true;
            return path;
        }
        PointF f = this.d.f();
        float f2 = f.x / 2.0f;
        float f3 = f.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = f3 * 0.55228f;
        path.reset();
        if (aVar.d) {
            float f6 = -f3;
            path.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            path.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            path.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            path.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            path.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            path.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            path.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            path.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            path.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            path.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF f18 = this.e.f();
        path.offset(f18.x, f18.y);
        path.close();
        this.g.a(path);
        this.h = true;
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
                        ((List) this.g.b).add(tVar);
                        tVar.d(this);
                    }
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
        return this.b;
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.k) {
            this.d.k(cVar);
        } else if (obj == h0.n) {
            this.e.k(cVar);
        }
    }
}
