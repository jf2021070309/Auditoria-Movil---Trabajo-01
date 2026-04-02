package com.amazon.aps.iva.j8;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.j8.a;
import com.amazon.aps.iva.j8.i;
/* compiled from: AsyncPagedListDiffer.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ h b;
    public final /* synthetic */ h c;
    public final /* synthetic */ int d;
    public final /* synthetic */ h e;
    public final /* synthetic */ com.amazon.aps.iva.j8.a f;

    /* compiled from: AsyncPagedListDiffer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ n.d b;

        public a(n.d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int max;
            int i;
            int i2;
            b bVar = b.this;
            com.amazon.aps.iva.j8.a aVar = bVar.f;
            if (aVar.g == bVar.d) {
                int i3 = bVar.b.g;
                h<T> hVar = aVar.f;
                if (hVar != 0 && aVar.e == null) {
                    h<T> hVar2 = bVar.e;
                    aVar.e = hVar2;
                    aVar.f = null;
                    j<T> jVar = hVar2.f;
                    j<T> jVar2 = hVar.f;
                    int e = jVar2.e();
                    int e2 = jVar.e();
                    int d = jVar2.d();
                    int d2 = jVar.d();
                    androidx.recyclerview.widget.b bVar2 = aVar.a;
                    n.d dVar = this.b;
                    if (e == 0 && e2 == 0 && d == 0 && d2 == 0) {
                        dVar.a(bVar2);
                    } else {
                        if (e > e2) {
                            int i4 = e - e2;
                            bVar2.b(jVar2.size() - i4, i4);
                        } else if (e < e2) {
                            bVar2.a(jVar2.size(), e2 - e);
                        }
                        if (d > d2) {
                            bVar2.b(0, d - d2);
                        } else if (d < d2) {
                            bVar2.a(0, d2 - d);
                        }
                        if (d2 != 0) {
                            dVar.a(new l(d2, bVar2));
                        } else {
                            dVar.a(bVar2);
                        }
                    }
                    a.C0405a c0405a = aVar.h;
                    h hVar3 = bVar.c;
                    hVar2.b(hVar3, c0405a);
                    j<T> jVar3 = hVar3.f;
                    int d3 = jVar2.d();
                    int i5 = i3 - d3;
                    int size = (jVar2.size() - d3) - jVar2.e();
                    if (i5 >= 0 && i5 < size) {
                        for (int i6 = 0; i6 < 30; i6++) {
                            int i7 = i6 / 2;
                            if (i6 % 2 == 1) {
                                i = -1;
                            } else {
                                i = 1;
                            }
                            int i8 = (i7 * i) + i5;
                            if (i8 >= 0 && i8 < jVar2.f) {
                                int i9 = dVar.e;
                                if (i8 >= 0 && i8 < i9) {
                                    int i10 = dVar.b[i8];
                                    if ((i10 & 15) == 0) {
                                        i2 = -1;
                                    } else {
                                        i2 = i10 >> 4;
                                    }
                                    if (i2 != -1) {
                                        max = i2 + jVar3.b;
                                        break;
                                    }
                                } else {
                                    throw new IndexOutOfBoundsException(j0.e("Index out of bounds - passed position = ", i8, ", old list size = ", i9));
                                }
                            }
                        }
                    }
                    max = Math.max(0, Math.min(i3, jVar3.size() - 1));
                    h<T> hVar4 = aVar.e;
                    hVar4.g = Math.max(0, Math.min(hVar4.size(), max));
                    i.a aVar2 = aVar.c;
                    if (aVar2 != null) {
                        i.this.getClass();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("must be in snapshot state to apply diff");
            }
        }
    }

    public b(com.amazon.aps.iva.j8.a aVar, h hVar, h hVar2, int i, h hVar3) {
        this.f = aVar;
        this.b = hVar;
        this.c = hVar2;
        this.d = i;
        this.e = hVar3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j<T> jVar = this.b.f;
        j<T> jVar2 = this.c.f;
        n.e<T> eVar = this.f.b.b;
        int d = jVar.d();
        com.amazon.aps.iva.r.c.s().u(new a(androidx.recyclerview.widget.n.a(new k(jVar, d, jVar2, eVar, (jVar.size() - d) - jVar.e(), (jVar2.size() - jVar2.d()) - jVar2.e()))));
    }
}
