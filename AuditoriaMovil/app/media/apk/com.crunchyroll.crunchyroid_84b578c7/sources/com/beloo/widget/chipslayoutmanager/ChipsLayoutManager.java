package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.eb.e;
import com.amazon.aps.iva.eb.f;
import com.amazon.aps.iva.fb.d;
import com.amazon.aps.iva.ib.c0;
import com.amazon.aps.iva.ib.d0;
import com.amazon.aps.iva.ib.g;
import com.amazon.aps.iva.ib.j;
import com.amazon.aps.iva.ib.l;
import com.amazon.aps.iva.ib.u;
import com.amazon.aps.iva.ib.v;
import com.beloo.widget.chipslayoutmanager.b;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public class ChipsLayoutManager extends RecyclerView.p implements b.a {
    public g a;
    public e b;
    public com.amazon.aps.iva.hb.g e;
    public boolean j;
    public final com.amazon.aps.iva.gb.c k;
    public final SparseArray<View> m;
    public com.amazon.aps.iva.eb.g n;
    public final com.amazon.aps.iva.nb.a o;
    public boolean p;
    public final int q;
    public com.amazon.aps.iva.fb.b r;
    public l s;
    public final v t;
    public d u;
    public f v;
    public final com.amazon.aps.iva.lb.g w;
    public final com.amazon.aps.iva.ob.a x;
    public boolean y;
    public final com.amazon.aps.iva.eb.a c = new com.amazon.aps.iva.eb.a(this);
    public final SparseArray<View> d = new SparseArray<>();
    public boolean f = true;
    public final com.amazon.aps.iva.u0.b g = new com.amazon.aps.iva.u0.b(4);
    @Orientation
    public int h = 1;
    public int i = 1;
    public Integer l = null;

    /* loaded from: classes.dex */
    public class a {
        public Integer a;

        public a() {
        }

        public final ChipsLayoutManager a() {
            l eVar;
            ChipsLayoutManager chipsLayoutManager = ChipsLayoutManager.this;
            if (chipsLayoutManager.e == null) {
                Integer num = this.a;
                if (num != null) {
                    chipsLayoutManager.e = new com.amazon.aps.iva.hb.f(num.intValue());
                } else {
                    chipsLayoutManager.e = new com.amazon.aps.iva.ob0.f();
                }
            }
            if (chipsLayoutManager.h == 1) {
                eVar = new c0(chipsLayoutManager);
            } else {
                eVar = new com.amazon.aps.iva.ib.e(chipsLayoutManager);
            }
            chipsLayoutManager.s = eVar;
            chipsLayoutManager.a = chipsLayoutManager.s.j();
            chipsLayoutManager.u = chipsLayoutManager.s.a();
            chipsLayoutManager.v = chipsLayoutManager.s.g();
            ((com.amazon.aps.iva.fb.a) chipsLayoutManager.u).getClass();
            chipsLayoutManager.r = new com.amazon.aps.iva.fb.b();
            chipsLayoutManager.b = new com.amazon.aps.iva.eb.b(chipsLayoutManager.a, chipsLayoutManager.c, chipsLayoutManager.s);
            return chipsLayoutManager;
        }
    }

    /* loaded from: classes.dex */
    public class b extends a {
        public b(ChipsLayoutManager chipsLayoutManager) {
            super();
        }
    }

    public ChipsLayoutManager(Context context) {
        SparseArray<View> sparseArray = new SparseArray<>();
        this.m = sparseArray;
        this.n = new com.amazon.aps.iva.eb.g();
        this.p = false;
        this.w = new com.amazon.aps.iva.lb.g(this);
        this.x = new com.amazon.aps.iva.ob.a();
        this.q = context.getResources().getConfiguration().orientation;
        this.o = new com.amazon.aps.iva.nb.a(sparseArray);
        this.k = new com.amazon.aps.iva.gb.c(this);
        this.t = new v(this);
        setAutoMeasureEnabled(true);
    }

    public final void a(RecyclerView.w wVar, com.amazon.aps.iva.ib.a aVar, com.amazon.aps.iva.ib.a aVar2) {
        SparseArray<View> sparseArray;
        boolean z;
        int intValue = this.r.b.intValue();
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            sparseArray = this.m;
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            sparseArray.put(getPosition(childAt), childAt);
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            detachView(sparseArray.valueAt(i2));
        }
        int i3 = intValue - 1;
        com.amazon.aps.iva.nb.a aVar3 = this.o;
        aVar3.a(i3);
        if (this.r.c != null) {
            b(wVar, aVar, i3);
        }
        aVar3.a(intValue);
        b(wVar, aVar2, intValue);
        SparseArray<View> sparseArray2 = aVar3.a;
        aVar3.e = sparseArray2.size();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            removeAndRecycleView(sparseArray.valueAt(i4), wVar);
            sparseArray2.keyAt(i4);
            com.amazon.aps.iva.nb.b.b(3);
            aVar3.e++;
        }
        ((d0) this.a).e();
        SparseArray<View> sparseArray3 = this.d;
        sparseArray3.clear();
        com.amazon.aps.iva.eb.a aVar4 = this.c;
        aVar4.getClass();
        int i5 = 0;
        while (true) {
            RecyclerView.p pVar = aVar4.b;
            if (i5 < pVar.getChildCount()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i6 = i5 + 1;
                View childAt2 = pVar.getChildAt(i5);
                sparseArray3.put(getPosition(childAt2), childAt2);
                i5 = i6;
            } else {
                sparseArray.clear();
                com.amazon.aps.iva.nb.b.b(3);
                return;
            }
        }
    }

    public final void b(RecyclerView.w wVar, com.amazon.aps.iva.ib.a aVar, int i) {
        com.amazon.aps.iva.nb.a aVar2;
        if (i < 0) {
            return;
        }
        com.amazon.aps.iva.ib.b bVar = aVar.u;
        if (i < bVar.c) {
            if (i >= 0) {
                bVar.b = i;
                while (true) {
                    boolean hasNext = bVar.hasNext();
                    aVar2 = this.o;
                    if (!hasNext) {
                        break;
                    }
                    int intValue = bVar.next().intValue();
                    SparseArray<View> sparseArray = this.m;
                    View view = sparseArray.get(intValue);
                    boolean z = true;
                    if (view == null) {
                        try {
                            View d = wVar.d(intValue);
                            aVar2.b++;
                            if (!aVar.o(d)) {
                                wVar.j(d);
                                aVar2.c++;
                                break;
                            }
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    } else {
                        ChipsLayoutManager chipsLayoutManager = aVar.k;
                        aVar.b = chipsLayoutManager.getDecoratedMeasuredHeight(view);
                        aVar.a = chipsLayoutManager.getDecoratedMeasuredWidth(view);
                        aVar.c = chipsLayoutManager.getPosition(view);
                        if (aVar.i(view)) {
                            Iterator it = aVar.s.iterator();
                            while (it.hasNext()) {
                                ((j) it.next()).a(aVar);
                            }
                            aVar.i = 0;
                        }
                        aVar.m(view);
                        if (aVar.o.c(aVar)) {
                            z = false;
                        } else {
                            aVar.i++;
                            aVar.k.attachView(view);
                        }
                        if (!z) {
                            break;
                        }
                        sparseArray.remove(intValue);
                    }
                }
                aVar2.getClass();
                String.format(Locale.getDefault(), "reattached items = %d : requested items = %d recycledItems = %d", Integer.valueOf(aVar2.d - aVar2.a.size()), Integer.valueOf(aVar2.b), Integer.valueOf(aVar2.c));
                com.amazon.aps.iva.nb.b.b(3);
                aVar.k();
                return;
            }
            throw new IllegalArgumentException("can't move to negative position");
        }
        throw new IllegalArgumentException("you can't move above of maxItemCount");
    }

    public final void c(int i) {
        com.amazon.aps.iva.nb.b.a();
        com.amazon.aps.iva.gb.c cVar = this.k;
        cVar.b(i);
        Integer floor = cVar.b.floor(Integer.valueOf(i));
        if (floor == null) {
            floor = Integer.valueOf(i);
        }
        int intValue = floor.intValue();
        Integer num = this.l;
        if (num != null) {
            intValue = Math.min(num.intValue(), intValue);
        }
        this.l = Integer.valueOf(intValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollHorizontally() {
        return this.v.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollVertically() {
        return this.v.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.c()) {
            return bVar.d(b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.c()) {
            return bVar.e(b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (!bVar.c() || bVar.a.getChildCount() == 0 || b0Var.b() == 0) {
            return 0;
        }
        return b0Var.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.a()) {
            return bVar.d(b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.a()) {
            return bVar.e(b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (!bVar.a() || bVar.a.getChildCount() == 0 || b0Var.b() == 0) {
            return 0;
        }
        return b0Var.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void detachAndScrapAttachedViews(RecyclerView.w wVar) {
        super.detachAndScrapAttachedViews(wVar);
        this.d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getItemCount() {
        return super.getItemCount() + ((com.amazon.aps.iva.eb.b) this.b).d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        v vVar = this.t;
        if (hVar != null && vVar.e) {
            try {
                vVar.e = false;
                hVar.unregisterAdapterDataObserver(vVar);
            } catch (IllegalStateException unused) {
            }
        }
        if (hVar2 != null) {
            vVar.e = true;
            hVar2.registerAdapterDataObserver(vVar);
        }
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.nb.b.b(1);
        super.onItemsAdded(recyclerView, i, i2);
        c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsChanged(RecyclerView recyclerView) {
        com.amazon.aps.iva.nb.b.b(1);
        super.onItemsChanged(recyclerView);
        com.amazon.aps.iva.gb.c cVar = this.k;
        cVar.b.clear();
        cVar.c.clear();
        c(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        String.format(Locale.US, "from = %d, to = %d, itemCount = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        com.amazon.aps.iva.nb.b.b(1);
        super.onItemsMoved(recyclerView, i, i2, i3);
        c(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.nb.b.b(1);
        super.onItemsRemoved(recyclerView, i, i2);
        c(i);
        v vVar = this.t;
        vVar.getClass();
        vVar.a.postOnAnimation(new u(vVar, recyclerView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.nb.b.b(1);
        super.onItemsUpdated(recyclerView, i, i2);
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x023b, code lost:
        if (r7 < 0) goto L141;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.b0 r19) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beloo.widget.chipslayoutmanager.ChipsLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onRestoreInstanceState(Parcelable parcelable) {
        com.amazon.aps.iva.eb.g gVar = (com.amazon.aps.iva.eb.g) parcelable;
        this.n = gVar;
        com.amazon.aps.iva.fb.b bVar = gVar.b;
        this.r = bVar;
        int i = gVar.e;
        int i2 = this.q;
        if (i2 != i) {
            int intValue = bVar.b.intValue();
            ((com.amazon.aps.iva.fb.a) this.u).getClass();
            com.amazon.aps.iva.fb.b bVar2 = new com.amazon.aps.iva.fb.b();
            this.r = bVar2;
            bVar2.b = Integer.valueOf(intValue);
        }
        Parcelable parcelable2 = (Parcelable) this.n.c.get(i2);
        com.amazon.aps.iva.gb.c cVar = this.k;
        cVar.getClass();
        if (parcelable2 != null) {
            if (parcelable2 instanceof com.amazon.aps.iva.gb.a) {
                com.amazon.aps.iva.gb.a aVar = (com.amazon.aps.iva.gb.a) parcelable2;
                cVar.b = aVar.b;
                cVar.c = aVar.c;
            } else {
                throw new IllegalStateException("wrong parcelable passed");
            }
        }
        this.l = (Integer) this.n.d.get(i2);
        cVar.a();
        com.amazon.aps.iva.nb.b.a();
        Integer num = this.l;
        if (num != null) {
            cVar.b(num.intValue());
        }
        cVar.b(this.r.b.intValue());
        Integer num2 = this.r.b;
        com.amazon.aps.iva.nb.b.a();
        com.amazon.aps.iva.nb.b.a();
        cVar.a();
        com.amazon.aps.iva.nb.b.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final Parcelable onSaveInstanceState() {
        com.amazon.aps.iva.eb.g gVar = this.n;
        gVar.b = this.r;
        com.amazon.aps.iva.gb.c cVar = this.k;
        com.amazon.aps.iva.gb.a aVar = new com.amazon.aps.iva.gb.a(cVar.b, cVar.c);
        SparseArray<Object> sparseArray = gVar.c;
        int i = this.q;
        sparseArray.put(i, aVar);
        this.n.e = i;
        cVar.a();
        com.amazon.aps.iva.nb.b.a();
        Integer num = this.l;
        if (num == null) {
            num = cVar.a();
        }
        com.amazon.aps.iva.nb.b.a();
        this.n.d.put(i, num);
        return this.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.c()) {
            return bVar.g(i, wVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void scrollToPosition(int i) {
        if (i < getItemCount() && i >= 0) {
            com.amazon.aps.iva.gb.c cVar = this.k;
            Integer a2 = cVar.a();
            Integer num = this.l;
            if (num == null) {
                num = a2;
            }
            this.l = num;
            if (a2 != null && i < a2.intValue()) {
                Integer floor = cVar.b.floor(Integer.valueOf(i));
                if (floor == null) {
                    floor = Integer.valueOf(i);
                }
                i = floor.intValue();
            }
            ((com.amazon.aps.iva.fb.a) this.u).getClass();
            com.amazon.aps.iva.fb.b bVar = new com.amazon.aps.iva.fb.b();
            this.r = bVar;
            bVar.b = Integer.valueOf(i);
            super.requestLayout();
            return;
        }
        getItemCount();
        com.amazon.aps.iva.nb.b.b.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollVerticallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        com.beloo.widget.chipslayoutmanager.b bVar = (com.beloo.widget.chipslayoutmanager.b) this.v;
        if (bVar.a()) {
            return bVar.g(i, wVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void setMeasuredDimension(int i, int i2) {
        v vVar = this.t;
        if (vVar.b) {
            vVar.c = Math.max(i, vVar.f.intValue());
            vVar.d = Math.max(i2, vVar.h.intValue());
        } else {
            vVar.c = i;
            vVar.d = i2;
        }
        com.amazon.aps.iva.nb.b.b.getClass();
        super.setMeasuredDimension(vVar.c, vVar.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i) {
        if (i < getItemCount() && i >= 0) {
            RecyclerView.a0 b2 = this.v.b(recyclerView.getContext(), i, this.r);
            b2.setTargetPosition(i);
            startSmoothScroll(b2);
            return;
        }
        getItemCount();
        com.amazon.aps.iva.nb.b.b.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }
}
