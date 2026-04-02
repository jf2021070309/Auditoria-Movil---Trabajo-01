package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.b6.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class o {
    public static int f;
    public final int b;
    public int c;
    public final ArrayList<com.amazon.aps.iva.u2.e> a = new ArrayList<>();
    public ArrayList<a> d = null;
    public int e = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(com.amazon.aps.iva.u2.e eVar, com.amazon.aps.iva.s2.d dVar) {
            new WeakReference(eVar);
            com.amazon.aps.iva.u2.d dVar2 = eVar.K;
            dVar.getClass();
            com.amazon.aps.iva.s2.d.n(dVar2);
            com.amazon.aps.iva.s2.d.n(eVar.L);
            com.amazon.aps.iva.s2.d.n(eVar.M);
            com.amazon.aps.iva.s2.d.n(eVar.N);
            com.amazon.aps.iva.s2.d.n(eVar.O);
        }
    }

    public o(int i) {
        this.b = -1;
        int i2 = f;
        f = i2 + 1;
        this.b = i2;
        this.c = i;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.e == oVar.b) {
                    c(this.c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(com.amazon.aps.iva.s2.d dVar, int i) {
        int n;
        int n2;
        ArrayList<com.amazon.aps.iva.u2.e> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        com.amazon.aps.iva.u2.f fVar = (com.amazon.aps.iva.u2.f) arrayList.get(0).W;
        dVar.s();
        fVar.c(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).c(dVar, false);
        }
        if (i == 0 && fVar.B0 > 0) {
            com.amazon.aps.iva.u2.b.a(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.C0 > 0) {
            com.amazon.aps.iva.u2.b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new a(arrayList.get(i3), dVar));
        }
        if (i == 0) {
            n = com.amazon.aps.iva.s2.d.n(fVar.K);
            n2 = com.amazon.aps.iva.s2.d.n(fVar.M);
            dVar.s();
        } else {
            n = com.amazon.aps.iva.s2.d.n(fVar.L);
            n2 = com.amazon.aps.iva.s2.d.n(fVar.N);
            dVar.s();
        }
        return n2 - n;
    }

    public final void c(int i, o oVar) {
        Iterator<com.amazon.aps.iva.u2.e> it = this.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = oVar.b;
            if (hasNext) {
                com.amazon.aps.iva.u2.e next = it.next();
                ArrayList<com.amazon.aps.iva.u2.e> arrayList = oVar.a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i == 0) {
                    next.q0 = i2;
                } else {
                    next.r0 = i2;
                }
            } else {
                this.e = i2;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String f2 = defpackage.e.f(sb, this.b, "] <");
        Iterator<com.amazon.aps.iva.u2.e> it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder b = x.b(f2, " ");
            b.append(it.next().k0);
            f2 = b.toString();
        }
        return com.amazon.aps.iva.c80.a.f(f2, " >");
    }
}
