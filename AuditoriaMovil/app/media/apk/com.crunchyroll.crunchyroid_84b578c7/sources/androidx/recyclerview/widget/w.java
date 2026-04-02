package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.j0;
/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes.dex */
public final class w {
    public final j0.c a;
    public final g0.d b;
    public final RecyclerView.h<RecyclerView.f0> c;
    public final b d;
    public int e;
    public final a f;

    /* compiled from: NestedAdapterWrapper.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public w(RecyclerView.h hVar, g gVar, j0 j0Var, g0.d dVar) {
        a aVar = new a();
        this.f = aVar;
        this.c = hVar;
        this.d = gVar;
        this.a = j0Var.b(this);
        this.b = dVar;
        this.e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(aVar);
    }

    /* compiled from: NestedAdapterWrapper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            w wVar = w.this;
            wVar.e = wVar.c.getItemCount();
            g gVar = (g) wVar.d;
            gVar.a.notifyDataSetChanged();
            gVar.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2) {
            w wVar = w.this;
            g gVar = (g) wVar.d;
            gVar.a.notifyItemRangeChanged(i + gVar.b(wVar), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i, int i2) {
            w wVar = w.this;
            wVar.e += i2;
            g gVar = (g) wVar.d;
            gVar.a.notifyItemRangeInserted(i + gVar.b(wVar), i2);
            if (wVar.e > 0 && wVar.c.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                ((g) wVar.d).a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            com.amazon.aps.iva.cq.b.u(z, "moving more than 1 item is not supported in RecyclerView");
            w wVar = w.this;
            g gVar = (g) wVar.d;
            int b = gVar.b(wVar);
            gVar.a.notifyItemMoved(i + b, i2 + b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i, int i2) {
            w wVar = w.this;
            wVar.e -= i2;
            g gVar = (g) wVar.d;
            gVar.a.notifyItemRangeRemoved(i + gVar.b(wVar), i2);
            if (wVar.e < 1 && wVar.c.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                ((g) wVar.d).a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onStateRestorationPolicyChanged() {
            ((g) w.this.d).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            w wVar = w.this;
            g gVar = (g) wVar.d;
            gVar.a.notifyItemRangeChanged(i + gVar.b(wVar), i2, obj);
        }
    }
}
