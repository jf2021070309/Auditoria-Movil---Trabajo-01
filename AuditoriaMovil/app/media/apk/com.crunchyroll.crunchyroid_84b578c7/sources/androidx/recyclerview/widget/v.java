package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.n;
import java.util.List;
/* compiled from: ListAdapter.java */
/* loaded from: classes.dex */
public abstract class v<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {
    public final d<T> a;

    /* compiled from: ListAdapter.java */
    /* loaded from: classes.dex */
    public class a implements d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public final void a() {
            v.this.getClass();
        }
    }

    public v(n.e<T> eVar) {
        a aVar = new a();
        d<T> dVar = new d<>(new b(this), new c.a(eVar).a());
        this.a = dVar;
        dVar.d.add(aVar);
    }

    public final T d(int i) {
        return this.a.f.get(i);
    }

    public final void e(List<T> list) {
        this.a.b(list, null);
    }

    public com.amazon.aps.iva.du.x getItem(int i) {
        return (com.amazon.aps.iva.du.x) d(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.a.f.size();
    }
}
