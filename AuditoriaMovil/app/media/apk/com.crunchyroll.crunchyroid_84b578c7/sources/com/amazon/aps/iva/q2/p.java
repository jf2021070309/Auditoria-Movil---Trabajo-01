package com.amazon.aps.iva.q2;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.y1;
/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.v1.a {
    public final Window j;
    public final y1 k;
    public boolean l;
    public boolean m;

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            p.this.a(iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public p(Context context, Window window) {
        super(context, null, 6, 0);
        this.j = window;
        this.k = com.amazon.aps.iva.cq.b.c0(n.a);
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(1735448596);
        e0.b bVar = e0.a;
        ((com.amazon.aps.iva.xb0.p) this.k.getValue()).invoke(g, 0);
        j2 X = g.X();
        if (X != null) {
            X.d = new a(i);
        }
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.f(z, i, i2, i3, i4);
        if (this.l || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.j.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void g(int i, int i2) {
        if (this.l) {
            super.g(i, i2);
            return;
        }
        super.g(View.MeasureSpec.makeMeasureSpec(com.amazon.aps.iva.ob0.f.a(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(com.amazon.aps.iva.ob0.f.a(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // com.amazon.aps.iva.v1.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }
}
