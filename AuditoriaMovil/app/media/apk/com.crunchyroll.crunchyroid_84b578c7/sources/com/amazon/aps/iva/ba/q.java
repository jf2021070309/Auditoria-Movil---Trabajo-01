package com.amazon.aps.iva.ba;

import android.graphics.Path;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.ha.r;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public final class q implements l, a.InterfaceC0165a {
    public final boolean b;
    public final d0 c;
    public final com.amazon.aps.iva.ca.m d;
    public boolean e;
    public final Path a = new Path();
    public final i0 f = new i0();

    public q(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.p pVar) {
        pVar.getClass();
        this.b = pVar.d;
        this.c = d0Var;
        com.amazon.aps.iva.ca.m mVar = new com.amazon.aps.iva.ca.m((List) pVar.c.c);
        this.d = mVar;
        bVar.g(mVar);
        mVar.a(this);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        boolean z = this.e;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path f = this.d.f();
        if (f == null) {
            return path;
        }
        path.set(f);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.e = true;
        return path;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i < arrayList2.size()) {
                b bVar = (b) arrayList2.get(i);
                if (bVar instanceof t) {
                    t tVar = (t) bVar;
                    if (tVar.c == r.a.SIMULTANEOUSLY) {
                        ((List) this.f.b).add(tVar);
                        tVar.d(this);
                        i++;
                    }
                }
                if (bVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((r) bVar);
                }
                i++;
            } else {
                this.d.k = arrayList;
                return;
            }
        }
    }
}
