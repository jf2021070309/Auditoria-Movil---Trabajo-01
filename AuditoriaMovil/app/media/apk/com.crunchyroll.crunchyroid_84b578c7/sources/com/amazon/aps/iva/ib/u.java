package com.amazon.aps.iva.ib;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: MeasureSupporter.java */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ v c;

    /* compiled from: MeasureSupporter.java */
    /* loaded from: classes.dex */
    public class a implements RecyclerView.m.a {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public final void a() {
            v vVar = u.this.c;
            vVar.b = false;
            vVar.a.requestLayout();
        }
    }

    public u(v vVar, RecyclerView recyclerView) {
        this.c = vVar;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.b;
        if (recyclerView.getItemAnimator() != null) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            a aVar = new a();
            if (!itemAnimator.g()) {
                aVar.a();
                return;
            } else {
                itemAnimator.b.add(aVar);
                return;
            }
        }
        v vVar = this.c;
        vVar.b = false;
        vVar.a.requestLayout();
    }
}
