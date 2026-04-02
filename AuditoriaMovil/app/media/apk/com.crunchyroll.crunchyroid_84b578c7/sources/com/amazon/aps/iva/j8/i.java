package com.amazon.aps.iva.j8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.j8.a;
/* compiled from: PagedListAdapter.java */
/* loaded from: classes.dex */
public abstract class i<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {
    public final com.amazon.aps.iva.j8.a<T> a;

    /* compiled from: PagedListAdapter.java */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public i(n.e<T> eVar) {
        a aVar = new a();
        com.amazon.aps.iva.j8.a<T> aVar2 = new com.amazon.aps.iva.j8.a<>(this, eVar);
        this.a = aVar2;
        aVar2.c = aVar;
    }

    public final T d(int i) {
        com.amazon.aps.iva.j8.a<T> aVar = this.a;
        h<T> hVar = aVar.e;
        if (hVar == null) {
            h<T> hVar2 = aVar.f;
            if (hVar2 != null) {
                return hVar2.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        hVar.g = hVar.f.e + i;
        hVar.o(i);
        hVar.k = Math.min(hVar.k, i);
        hVar.l = Math.max(hVar.l, i);
        hVar.u(true);
        return aVar.e.get(i);
    }

    public final void e(h<T> hVar) {
        n nVar;
        int size;
        com.amazon.aps.iva.j8.a<T> aVar = this.a;
        if (hVar != null) {
            if (aVar.e == null && aVar.f == null) {
                aVar.d = hVar.k();
            } else if (hVar.k() != aVar.d) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = aVar.g + 1;
        aVar.g = i;
        h<T> hVar2 = aVar.e;
        if (hVar != hVar2) {
            androidx.recyclerview.widget.b bVar = aVar.a;
            a.C0405a c0405a = aVar.h;
            if (hVar == null) {
                if (hVar2 != null) {
                    size = hVar2.size();
                } else {
                    h<T> hVar3 = aVar.f;
                    if (hVar3 == null) {
                        size = 0;
                    } else {
                        size = hVar3.size();
                    }
                }
                h<T> hVar4 = aVar.e;
                if (hVar4 != null) {
                    hVar4.r(c0405a);
                    aVar.e = null;
                } else if (aVar.f != null) {
                    aVar.f = null;
                }
                bVar.b(0, size);
                a aVar2 = aVar.c;
                if (aVar2 != null) {
                    i.this.getClass();
                }
            } else if (hVar2 == null && aVar.f == null) {
                aVar.e = hVar;
                hVar.b(null, c0405a);
                bVar.a(0, hVar.size());
                a aVar3 = aVar.c;
                if (aVar3 != null) {
                    i.this.getClass();
                }
            } else {
                if (hVar2 != null) {
                    hVar2.r(c0405a);
                    h<T> hVar5 = aVar.e;
                    if (!hVar5.n()) {
                        hVar5 = new n(hVar5);
                    }
                    aVar.f = hVar5;
                    aVar.e = null;
                }
                h<T> hVar6 = aVar.f;
                if (hVar6 != null && aVar.e == null) {
                    if (hVar.n()) {
                        nVar = hVar;
                    } else {
                        nVar = new n(hVar);
                    }
                    aVar.b.a.execute(new b(aVar, hVar6, nVar, i, hVar));
                    return;
                }
                throw new IllegalStateException("must be in snapshot state to diff");
            }
        }
    }

    public x getItem(int i) {
        return (x) d(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        com.amazon.aps.iva.j8.a<T> aVar = this.a;
        h<T> hVar = aVar.e;
        if (hVar != null) {
            return hVar.size();
        }
        h<T> hVar2 = aVar.f;
        if (hVar2 == null) {
            return 0;
        }
        return hVar2.size();
    }
}
