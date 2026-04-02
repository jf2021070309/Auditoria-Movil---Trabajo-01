package com.amazon.aps.iva.j8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.j8.i;
/* compiled from: AsyncPagedListDiffer.java */
/* loaded from: classes.dex */
public final class a<T> {
    public final androidx.recyclerview.widget.b a;
    public final androidx.recyclerview.widget.c<T> b;
    public i.a c;
    public boolean d;
    public h<T> e;
    public h<T> f;
    public int g;
    public final C0405a h = new C0405a();

    /* compiled from: AsyncPagedListDiffer.java */
    /* renamed from: com.amazon.aps.iva.j8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0405a extends h.e {
        public C0405a() {
        }

        @Override // com.amazon.aps.iva.j8.h.e
        public final void a(int i, int i2) {
            a.this.a.c(i, i2, null);
        }

        @Override // com.amazon.aps.iva.j8.h.e
        public final void b(int i, int i2) {
            a.this.a.a(i, i2);
        }
    }

    public a(RecyclerView.h hVar, n.e<T> eVar) {
        this.a = new androidx.recyclerview.widget.b(hVar);
        this.b = new c.a(eVar).a();
    }
}
