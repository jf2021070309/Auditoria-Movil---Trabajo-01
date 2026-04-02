package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ConcatAdapter.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.h<RecyclerView.f0> {
    public final g a;

    /* compiled from: ConcatAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a c = new a(true, EnumC0056a.NO_STABLE_IDS);
        public final boolean a;
        public final EnumC0056a b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0056a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public a(boolean z, EnumC0056a enumC0056a) {
            this.a = z;
            this.b = enumC0056a;
        }
    }

    public f() {
        throw null;
    }

    @SafeVarargs
    public f(RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        this(a.c, hVarArr);
    }

    public final void d(RecyclerView.h hVar) {
        boolean z;
        w wVar;
        g gVar = this.a;
        ArrayList arrayList = gVar.e;
        int size = arrayList.size();
        if (size >= 0 && size <= arrayList.size()) {
            if (gVar.g != a.EnumC0056a.NO_STABLE_IDS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.cq.b.u(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else {
                hVar.hasStableIds();
            }
            int e = gVar.e(hVar);
            if (e == -1) {
                wVar = null;
            } else {
                wVar = (w) arrayList.get(e);
            }
            if (wVar == null) {
                w wVar2 = new w(hVar, gVar, gVar.b, gVar.h.a());
                arrayList.add(size, wVar2);
                Iterator it = gVar.c.iterator();
                while (it.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                    if (recyclerView != null) {
                        hVar.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (wVar2.e > 0) {
                    gVar.a.notifyItemRangeInserted(gVar.b(wVar2), wVar2.e);
                }
                gVar.a();
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
    }

    public final void e(RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    public final void f(com.amazon.aps.iva.m70.b bVar) {
        g gVar = this.a;
        int e = gVar.e(bVar);
        if (e != -1) {
            ArrayList arrayList = gVar.e;
            w wVar = (w) arrayList.get(e);
            int b = gVar.b(wVar);
            arrayList.remove(e);
            gVar.a.notifyItemRangeRemoved(b, wVar.e);
            Iterator it = gVar.c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                if (recyclerView != null) {
                    bVar.onDetachedFromRecyclerView(recyclerView);
                }
            }
            wVar.c.unregisterAdapterDataObserver(wVar.f);
            wVar.a.dispose();
            gVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int findRelativeAdapterPositionIn(RecyclerView.h<? extends RecyclerView.f0> hVar, RecyclerView.f0 f0Var, int i) {
        g gVar = this.a;
        w wVar = gVar.d.get(f0Var);
        if (wVar == null) {
            return -1;
        }
        int b = i - gVar.b(wVar);
        RecyclerView.h<RecyclerView.f0> hVar2 = wVar.c;
        int itemCount = hVar2.getItemCount();
        if (b >= 0 && b < itemCount) {
            return hVar2.findRelativeAdapterPositionIn(hVar, f0Var, b);
        }
        StringBuilder a2 = com.amazon.aps.iva.b6.x.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", b, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        a2.append(f0Var);
        a2.append("adapter:");
        a2.append(hVar);
        throw new IllegalStateException(a2.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        Iterator it = this.a.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((w) it.next()).e;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        g gVar = this.a;
        g.a c = gVar.c(i);
        w wVar = c.a;
        long a2 = wVar.b.a(wVar.c.getItemId(c.b));
        c.c = false;
        c.a = null;
        c.b = -1;
        gVar.f = c;
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        g gVar = this.a;
        g.a c = gVar.c(i);
        w wVar = c.a;
        int b = wVar.a.b(wVar.c.getItemViewType(c.b));
        c.c = false;
        c.a = null;
        c.b = -1;
        gVar.f = c;
        return b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        g gVar = this.a;
        ArrayList arrayList = gVar.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((WeakReference) it.next()).get() == recyclerView) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            arrayList.add(new WeakReference(recyclerView));
            Iterator it2 = gVar.e.iterator();
            while (it2.hasNext()) {
                ((w) it2.next()).c.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        g gVar = this.a;
        g.a c = gVar.c(i);
        gVar.d.put(f0Var, c.a);
        w wVar = c.a;
        wVar.c.bindViewHolder(f0Var, c.b);
        c.c = false;
        c.a = null;
        c.b = -1;
        gVar.f = c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        w a2 = this.a.b.a(i);
        return a2.c.onCreateViewHolder(viewGroup, a2.a.a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        g gVar = this.a;
        ArrayList arrayList = gVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
        }
        Iterator it = gVar.e.iterator();
        while (it.hasNext()) {
            ((w) it.next()).c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        g gVar = this.a;
        IdentityHashMap<RecyclerView.f0, w> identityHashMap = gVar.d;
        w wVar = identityHashMap.get(f0Var);
        if (wVar != null) {
            boolean onFailedToRecycleView = wVar.c.onFailedToRecycleView(f0Var);
            identityHashMap.remove(f0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        this.a.d(f0Var).c.onViewAttachedToWindow(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewDetachedFromWindow(RecyclerView.f0 f0Var) {
        this.a.d(f0Var).c.onViewDetachedFromWindow(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        g gVar = this.a;
        IdentityHashMap<RecyclerView.f0, w> identityHashMap = gVar.d;
        w wVar = identityHashMap.get(f0Var);
        if (wVar != null) {
            wVar.c.onViewRecycled(f0Var);
            identityHashMap.remove(f0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public f(a aVar, RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        List<RecyclerView.h> asList = Arrays.asList(hVarArr);
        this.a = new g(this, aVar);
        for (RecyclerView.h hVar : asList) {
            d(hVar);
        }
        super.setHasStableIds(this.a.g != a.EnumC0056a.NO_STABLE_IDS);
    }
}
