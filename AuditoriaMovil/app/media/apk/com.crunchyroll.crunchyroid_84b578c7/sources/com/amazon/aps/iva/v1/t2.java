package com.amazon.aps.iva.v1;

import android.view.View;
/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public interface t2 {

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements t2 {
        public static final a a = new a();

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: com.amazon.aps.iva.v1.t2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0778a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.v1.a h;
            public final /* synthetic */ c i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0778a(com.amazon.aps.iva.v1.a aVar, c cVar) {
                super(0);
                this.h = aVar;
                this.i = cVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                this.h.removeOnAttachStateChangeListener(this.i);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>> d0Var) {
                super(0);
                this.h = d0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                this.h.b.invoke();
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        public static final class c implements View.OnAttachStateChangeListener {
            public final /* synthetic */ com.amazon.aps.iva.v1.a b;
            public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>> c;

            public c(com.amazon.aps.iva.v1.a aVar, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>> d0Var) {
                this.b = aVar;
                this.c = d0Var;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.amazon.aps.iva.v1.u2, T] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                com.amazon.aps.iva.yb0.j.f(view, "v");
                com.amazon.aps.iva.v1.a aVar = this.b;
                com.amazon.aps.iva.i5.o a = com.amazon.aps.iva.i5.i0.a(aVar);
                if (a != null) {
                    this.c.b = androidx.compose.ui.platform.e.a(aVar, a.getLifecycle());
                    aVar.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                com.amazon.aps.iva.yb0.j.f(view, "v");
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, com.amazon.aps.iva.v1.t2$a$a] */
        @Override // com.amazon.aps.iva.v1.t2
        public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a(com.amazon.aps.iva.v1.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "view");
            if (aVar.isAttachedToWindow()) {
                com.amazon.aps.iva.i5.o a2 = com.amazon.aps.iva.i5.i0.a(aVar);
                if (a2 != null) {
                    return androidx.compose.ui.platform.e.a(aVar, a2.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            c cVar = new c(aVar, d0Var);
            aVar.addOnAttachStateChangeListener(cVar);
            d0Var.b = new C0778a(aVar, cVar);
            return new b(d0Var);
        }
    }

    com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a(com.amazon.aps.iva.v1.a aVar);
}
