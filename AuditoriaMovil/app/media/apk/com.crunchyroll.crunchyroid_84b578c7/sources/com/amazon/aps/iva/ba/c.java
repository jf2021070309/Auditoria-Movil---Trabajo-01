package com.amazon.aps.iva.ba;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ma.g;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public final class c implements d, l, a.InterfaceC0165a, com.amazon.aps.iva.fa.f {
    public final com.amazon.aps.iva.aa.a a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<b> h;
    public final d0 i;
    public ArrayList j;
    public final com.amazon.aps.iva.ca.q k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.amazon.aps.iva.z9.d0 r8, com.amazon.aps.iva.ia.b r9, com.amazon.aps.iva.ha.o r10, com.amazon.aps.iva.z9.h r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List<com.amazon.aps.iva.ha.b> r10 = r10.b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            com.amazon.aps.iva.ha.b r2 = (com.amazon.aps.iva.ha.b) r2
            com.amazon.aps.iva.ba.b r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L40
            java.lang.Object r11 = r10.get(r0)
            com.amazon.aps.iva.ha.b r11 = (com.amazon.aps.iva.ha.b) r11
            boolean r1 = r11 instanceof com.amazon.aps.iva.ga.k
            if (r1 == 0) goto L3d
            com.amazon.aps.iva.ga.k r11 = (com.amazon.aps.iva.ga.k) r11
            r6 = r11
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ba.c.<init>(com.amazon.aps.iva.z9.d0, com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ha.o, com.amazon.aps.iva.z9.h):void");
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        Matrix matrix = this.c;
        matrix.reset();
        com.amazon.aps.iva.ca.q qVar = this.k;
        if (qVar != null) {
            matrix.set(qVar.d());
        }
        Path path = this.d;
        path.reset();
        if (this.g) {
            return path;
        }
        List<b> list = this.h;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof l) {
                path.addPath(((l) bVar).b(), matrix);
            }
        }
        return path;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        int size = list.size();
        List<b> list3 = this.h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            b bVar = list3.get(size2);
            bVar.c(arrayList, list3.subList(0, size2));
            arrayList.add(bVar);
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        String str = this.f;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2.getClass();
            com.amazon.aps.iva.fa.e eVar3 = new com.amazon.aps.iva.fa.e(eVar2);
            eVar3.a.add(str);
            if (eVar.a(i, str)) {
                com.amazon.aps.iva.fa.e eVar4 = new com.amazon.aps.iva.fa.e(eVar3);
                eVar4.b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (eVar.d(i, str)) {
            int b = eVar.b(i, str) + i;
            int i2 = 0;
            while (true) {
                List<b> list = this.h;
                if (i2 < list.size()) {
                    b bVar = list.get(i2);
                    if (bVar instanceof com.amazon.aps.iva.fa.f) {
                        ((com.amazon.aps.iva.fa.f) bVar).d(eVar, b, arrayList, eVar2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        com.amazon.aps.iva.ca.q qVar = this.k;
        if (qVar != null) {
            matrix2.preConcat(qVar.d());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<b> list = this.h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                b bVar = list.get(size);
                if (bVar instanceof d) {
                    ((d) bVar).f(rectF2, matrix2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final List<l> g() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                List<b> list = this.h;
                if (i >= list.size()) {
                    break;
                }
                b bVar = list.get(i);
                if (bVar instanceof l) {
                    this.j.add((l) bVar);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        com.amazon.aps.iva.ca.q qVar = this.k;
        if (qVar != null) {
            matrix2.preConcat(qVar.d());
            com.amazon.aps.iva.ca.a<Integer, Integer> aVar = qVar.j;
            if (aVar == null) {
                intValue = 100;
            } else {
                intValue = aVar.f().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = this.i.u;
        boolean z3 = false;
        List<b> list = this.h;
        if (z2) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < list.size()) {
                    if ((list.get(i2) instanceof d) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z && i != 255) {
                z3 = true;
            }
        }
        if (z3) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(rectF, matrix2, true);
            com.amazon.aps.iva.aa.a aVar2 = this.a;
            aVar2.setAlpha(i);
            g.a aVar3 = com.amazon.aps.iva.ma.g.a;
            canvas.saveLayer(rectF, aVar2);
            z.s();
        }
        if (z3) {
            i = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof d) {
                ((d) bVar).h(canvas, matrix2, i);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        com.amazon.aps.iva.ca.q qVar = this.k;
        if (qVar != null) {
            qVar.c(cVar, obj);
        }
    }

    public c(d0 d0Var, com.amazon.aps.iva.ia.b bVar, String str, boolean z, ArrayList arrayList, com.amazon.aps.iva.ga.k kVar) {
        this.a = new com.amazon.aps.iva.aa.a();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = d0Var;
        this.g = z;
        this.h = arrayList;
        if (kVar != null) {
            com.amazon.aps.iva.ca.q qVar = new com.amazon.aps.iva.ca.q(kVar);
            this.k = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar2 = (b) arrayList.get(size);
            if (bVar2 instanceof i) {
                arrayList2.add((i) bVar2);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            ((i) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }
}
