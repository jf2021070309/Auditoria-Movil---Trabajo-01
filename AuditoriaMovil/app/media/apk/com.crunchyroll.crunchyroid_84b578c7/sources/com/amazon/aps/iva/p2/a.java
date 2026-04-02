package com.amazon.aps.iva.p2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.p1.h0;
import com.amazon.aps.iva.p1.k0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.s;
import com.amazon.aps.iva.p3.t;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.v1.j3;
import com.amazon.aps.iva.v1.r;
import com.amazon.aps.iva.y0.y;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes.dex */
public class a extends ViewGroup implements s, com.amazon.aps.iva.o0.g {
    public final com.amazon.aps.iva.o1.b b;
    public final View c;
    public com.amazon.aps.iva.xb0.a<q> d;
    public boolean e;
    public com.amazon.aps.iva.xb0.a<q> f;
    public com.amazon.aps.iva.xb0.a<q> g;
    public com.amazon.aps.iva.a1.f h;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.a1.f, q> i;
    public com.amazon.aps.iva.o2.c j;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, q> k;
    public com.amazon.aps.iva.i5.o l;
    public com.amazon.aps.iva.s8.c m;
    public final y n;
    public final i o;
    public final n p;
    public com.amazon.aps.iva.xb0.l<? super Boolean, q> q;
    public final int[] r;
    public int s;
    public int t;
    public final t u;
    public final androidx.compose.ui.node.e v;

    /* compiled from: AndroidViewHolder.android.kt */
    /* renamed from: com.amazon.aps.iva.p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0594a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a1.f, q> {
        public final /* synthetic */ androidx.compose.ui.node.e h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0594a(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.a1.f fVar) {
            super(1);
            this.h = eVar;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.a1.f fVar) {
            com.amazon.aps.iva.a1.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "it");
            this.h.g(fVar2.o(this.i));
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, q> {
        public final /* synthetic */ androidx.compose.ui.node.e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.node.e eVar) {
            super(1);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.o2.c cVar) {
            com.amazon.aps.iva.o2.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "it");
            this.h.Y(cVar2);
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.p, q> {
        public final /* synthetic */ a h;
        public final /* synthetic */ androidx.compose.ui.node.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = gVar;
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.compose.ui.node.p pVar) {
            AndroidComposeView androidComposeView;
            androidx.compose.ui.node.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "owner");
            if (pVar2 instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) pVar2;
            } else {
                androidComposeView = null;
            }
            a aVar = this.h;
            if (androidComposeView != null) {
                com.amazon.aps.iva.yb0.j.f(aVar, "view");
                androidx.compose.ui.node.e eVar = this.i;
                com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
                androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(aVar, eVar);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(aVar);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(eVar, aVar);
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.d.s(aVar, 1);
                g0.n(aVar, new com.amazon.aps.iva.v1.q(eVar, androidComposeView, androidComposeView));
            }
            if (aVar.getView().getParent() != aVar) {
                aVar.addView(aVar.getView());
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.p, q> {
        public final /* synthetic */ a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.compose.ui.node.p pVar) {
            AndroidComposeView androidComposeView;
            androidx.compose.ui.node.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "owner");
            if (pVar2 instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) pVar2;
            } else {
                androidComposeView = null;
            }
            a aVar = this.h;
            if (androidComposeView != null) {
                com.amazon.aps.iva.yb0.j.f(aVar, "view");
                androidComposeView.h(new r(androidComposeView, aVar));
            }
            aVar.removeAllViewsInLayout();
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class e implements d0 {
        public final /* synthetic */ a a;
        public final /* synthetic */ androidx.compose.ui.node.e b;

        /* compiled from: AndroidViewHolder.android.kt */
        /* renamed from: com.amazon.aps.iva.p2.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0595a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, q> {
            public static final C0595a h = new C0595a();

            public C0595a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                return q.a;
            }
        }

        /* compiled from: AndroidViewHolder.android.kt */
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, q> {
            public final /* synthetic */ a h;
            public final /* synthetic */ androidx.compose.ui.node.e i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(androidx.compose.ui.node.e eVar, a aVar) {
                super(1);
                this.h = aVar;
                this.i = eVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(u0.a aVar) {
                com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
                com.amazon.aps.iva.p2.c.a(this.h, this.i);
                return q.a;
            }
        }

        public e(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.p2.g gVar) {
            this.a = gVar;
            this.b = eVar;
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int a(androidx.compose.ui.node.o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = this.a;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams);
            aVar.measure(makeMeasureSpec, a.c(aVar, 0, i, layoutParams.height));
            return aVar.getMeasuredWidth();
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int b(androidx.compose.ui.node.o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            a aVar = this.a;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams);
            aVar.measure(a.c(aVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int c(androidx.compose.ui.node.o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            a aVar = this.a;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams);
            aVar.measure(a.c(aVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final e0 d(f0 f0Var, List<? extends c0> list, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
            com.amazon.aps.iva.yb0.j.f(list, "measurables");
            a aVar = this.a;
            int childCount = aVar.getChildCount();
            a0 a0Var = a0.b;
            if (childCount == 0) {
                return f0Var.F0(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.i(j), a0Var, C0595a.h);
            }
            if (com.amazon.aps.iva.o2.a.j(j) != 0) {
                aVar.getChildAt(0).setMinimumWidth(com.amazon.aps.iva.o2.a.j(j));
            }
            if (com.amazon.aps.iva.o2.a.i(j) != 0) {
                aVar.getChildAt(0).setMinimumHeight(com.amazon.aps.iva.o2.a.i(j));
            }
            int j2 = com.amazon.aps.iva.o2.a.j(j);
            int h = com.amazon.aps.iva.o2.a.h(j);
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams);
            int c = a.c(aVar, j2, h, layoutParams.width);
            int i = com.amazon.aps.iva.o2.a.i(j);
            int g = com.amazon.aps.iva.o2.a.g(j);
            ViewGroup.LayoutParams layoutParams2 = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams2);
            aVar.measure(c, a.c(aVar, i, g, layoutParams2.height));
            return f0Var.F0(aVar.getMeasuredWidth(), aVar.getMeasuredHeight(), a0Var, new b(this.b, aVar));
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = this.a;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            com.amazon.aps.iva.yb0.j.c(layoutParams);
            aVar.measure(makeMeasureSpec, a.c(aVar, 0, i, layoutParams.height));
            return aVar.getMeasuredWidth();
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, q> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
            com.amazon.aps.iva.yb0.j.f(c0Var, "$this$semantics");
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.e, q> {
        public final /* synthetic */ androidx.compose.ui.node.e h;
        public final /* synthetic */ a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = eVar;
            this.i = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.h1.e eVar) {
            AndroidComposeView androidComposeView;
            com.amazon.aps.iva.h1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$drawBehind");
            u a = eVar2.R0().a();
            androidx.compose.ui.node.p pVar = this.h.j;
            if (pVar instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) pVar;
            } else {
                androidComposeView = null;
            }
            if (androidComposeView != null) {
                Canvas canvas = com.amazon.aps.iva.f1.h.a;
                com.amazon.aps.iva.yb0.j.f(a, "<this>");
                Canvas canvas2 = ((com.amazon.aps.iva.f1.g) a).a;
                a aVar = this.i;
                com.amazon.aps.iva.yb0.j.f(aVar, "view");
                com.amazon.aps.iva.yb0.j.f(canvas2, "canvas");
                androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                aVar.draw(canvas2);
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, q> {
        public final /* synthetic */ a h;
        public final /* synthetic */ androidx.compose.ui.node.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = gVar;
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.s1.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "it");
            com.amazon.aps.iva.p2.c.a(this.h, this.i);
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, q> {
        public final /* synthetic */ a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "it");
            a aVar2 = this.h;
            aVar2.getHandler().post(new com.amazon.aps.iva.e.d(aVar2.p, 3));
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {522, 527}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ a j;
        public final /* synthetic */ long k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z, a aVar, long j, com.amazon.aps.iva.ob0.d<? super j> dVar) {
            super(2, dVar);
            this.i = z;
            this.j = aVar;
            this.k = j;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new j(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                boolean z = this.i;
                a aVar2 = this.j;
                if (!z) {
                    com.amazon.aps.iva.o1.b bVar = aVar2.b;
                    int i2 = com.amazon.aps.iva.o2.o.c;
                    long j = com.amazon.aps.iva.o2.o.b;
                    long j2 = this.k;
                    this.h = 1;
                    if (bVar.a(j, j2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    com.amazon.aps.iva.o1.b bVar2 = aVar2.b;
                    long j3 = this.k;
                    int i3 = com.amazon.aps.iva.o2.o.c;
                    long j4 = com.amazon.aps.iva.o2.o.b;
                    this.h = 2;
                    if (bVar2.a(j3, j4, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {540}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, com.amazon.aps.iva.ob0.d<? super k> dVar) {
            super(2, dVar);
            this.j = j;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new k(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((k) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.o1.b bVar = a.this.b;
                this.h = 1;
                if (bVar.c(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final l h = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final m h = new m();

        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.amazon.aps.iva.p2.g gVar) {
            super(0);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a aVar = this.h;
            if (aVar.e) {
                aVar.n.c(aVar, aVar.o, aVar.getUpdate());
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<? extends q>, q> {
        public final /* synthetic */ a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.amazon.aps.iva.p2.g gVar) {
            super(1);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xb0.a<? extends q> aVar) {
            com.amazon.aps.iva.xb0.a<? extends q> aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "command");
            a aVar3 = this.h;
            if (aVar3.getHandler().getLooper() == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                aVar3.getHandler().post(new com.amazon.aps.iva.p2.b(0, aVar2));
            }
            return q.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final p h = new p();

        public p() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.amazon.aps.iva.o0.g0 g0Var, int i2, com.amazon.aps.iva.o1.b bVar, View view) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(bVar, "dispatcher");
        com.amazon.aps.iva.yb0.j.f(view, "view");
        this.b = bVar;
        this.c = view;
        if (g0Var != null) {
            LinkedHashMap linkedHashMap = j3.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, g0Var);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.d = p.h;
        this.f = m.h;
        this.g = l.h;
        f.a aVar = f.a.c;
        this.h = aVar;
        this.j = new com.amazon.aps.iva.o2.d(1.0f, 1.0f);
        com.amazon.aps.iva.p2.g gVar = (com.amazon.aps.iva.p2.g) this;
        this.n = new y(new o(gVar));
        this.o = new i(gVar);
        this.p = new n(gVar);
        this.r = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.u = new t();
        androidx.compose.ui.node.e eVar = new androidx.compose.ui.node.e(3, false);
        eVar.k = this;
        com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a2.o.a(androidx.compose.ui.input.nestedscroll.a.a(aVar, com.amazon.aps.iva.p2.c.a, bVar), true, f.h);
        com.amazon.aps.iva.yb0.j.f(a, "<this>");
        com.amazon.aps.iva.p1.g0 g0Var2 = new com.amazon.aps.iva.p1.g0();
        g0Var2.c = new h0(gVar);
        k0 k0Var = new k0();
        k0 k0Var2 = g0Var2.d;
        if (k0Var2 != null) {
            k0Var2.b = null;
        }
        g0Var2.d = k0Var;
        k0Var.b = g0Var2;
        setOnRequestDisallowInterceptTouchEvent$ui_release(k0Var);
        com.amazon.aps.iva.a1.f a2 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.a.a(a.o(g0Var2), new g(eVar, gVar)), new h(eVar, gVar));
        eVar.g(this.h.o(a2));
        this.i = new C0594a(eVar, a2);
        eVar.Y(this.j);
        this.k = new b(eVar);
        eVar.F = new c(eVar, gVar);
        eVar.G = new d(gVar);
        eVar.h(new e(eVar, gVar));
        this.v = eVar;
    }

    public static final int c(a aVar, int i2, int i3, int i4) {
        aVar.getClass();
        if (i4 < 0 && i2 != i3) {
            if (i4 == -2 && i3 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
            if (i4 == -1 && i3 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i3, Ints.MAX_POWER_OF_TWO);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(com.amazon.aps.iva.aq.j.j(i4, i2, i3), Ints.MAX_POWER_OF_TWO);
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void a() {
        this.g.invoke();
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void b() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void e() {
        View view = this.c;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.r;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    public final com.amazon.aps.iva.o2.c getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.c;
    }

    public final androidx.compose.ui.node.e getLayoutNode() {
        return this.v;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final com.amazon.aps.iva.i5.o getLifecycleOwner() {
        return this.l;
    }

    public final com.amazon.aps.iva.a1.f getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.u;
        return tVar.b | tVar.a;
    }

    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, q> getOnDensityChanged$ui_release() {
        return this.k;
    }

    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a1.f, q> getOnModifierChanged$ui_release() {
        return this.i;
    }

    public final com.amazon.aps.iva.xb0.l<Boolean, q> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.q;
    }

    public final com.amazon.aps.iva.xb0.a<q> getRelease() {
        return this.g;
    }

    public final com.amazon.aps.iva.xb0.a<q> getReset() {
        return this.f;
    }

    public final com.amazon.aps.iva.s8.c getSavedStateRegistryOwner() {
        return this.m;
    }

    public final com.amazon.aps.iva.xb0.a<q> getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.v.B();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.d();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        com.amazon.aps.iva.yb0.j.f(view, "child");
        com.amazon.aps.iva.yb0.j.f(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.v.B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y yVar = this.n;
        com.amazon.aps.iva.y0.g gVar = yVar.g;
        if (gVar != null) {
            gVar.dispose();
        }
        yVar.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.c.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.c;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.s = i2;
        this.t = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        com.amazon.aps.iva.yb0.j.f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        com.amazon.aps.iva.se0.i.d(this.b.d(), null, null, new j(z, this, defpackage.i.g(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        com.amazon.aps.iva.yb0.j.f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        com.amazon.aps.iva.se0.i.d(this.b.d(), null, null, new k(defpackage.i.g(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        long j2;
        com.amazon.aps.iva.yb0.j.f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        float f2 = i2;
        float f3 = -1;
        long d2 = com.amazon.aps.iva.e1.d.d(f2 * f3, i3 * f3);
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        com.amazon.aps.iva.o1.c e2 = this.b.e();
        if (e2 != null) {
            j2 = e2.L(i5, d2);
        } else {
            j2 = com.amazon.aps.iva.e1.c.b;
        }
        iArr[0] = defpackage.i.n(com.amazon.aps.iva.e1.c.c(j2));
        iArr[1] = defpackage.i.n(com.amazon.aps.iva.e1.c.d(j2));
    }

    @Override // com.amazon.aps.iva.p3.s
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        com.amazon.aps.iva.yb0.j.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f2 = i2;
            float f3 = -1;
            long b2 = this.b.b(i6 == 0 ? 1 : 2, com.amazon.aps.iva.e1.d.d(f2 * f3, i3 * f3), com.amazon.aps.iva.e1.d.d(i4 * f3, i5 * f3));
            iArr[0] = defpackage.i.n(com.amazon.aps.iva.e1.c.c(b2));
            iArr[1] = defpackage.i.n(com.amazon.aps.iva.e1.c.d(b2));
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(view, "child");
        com.amazon.aps.iva.yb0.j.f(view2, "target");
        this.u.a(i2, i3);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(view, "child");
        com.amazon.aps.iva.yb0.j.f(view2, "target");
        if ((i2 & 2) != 0 || (i2 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onStopNestedScroll(View view, int i2) {
        com.amazon.aps.iva.yb0.j.f(view, "target");
        t tVar = this.u;
        if (i2 == 1) {
            tVar.b = 0;
        } else {
            tVar.a = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        com.amazon.aps.iva.xb0.l<? super Boolean, q> lVar = this.q;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(com.amazon.aps.iva.o2.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "value");
        if (cVar != this.j) {
            this.j = cVar;
            com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, q> lVar = this.k;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(com.amazon.aps.iva.i5.o oVar) {
        if (oVar != this.l) {
            this.l = oVar;
            i0.b(this, oVar);
        }
    }

    public final void setModifier(com.amazon.aps.iva.a1.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "value");
        if (fVar != this.h) {
            this.h = fVar;
            com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.a1.f, q> lVar = this.i;
            if (lVar != null) {
                lVar.invoke(fVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, q> lVar) {
        this.k = lVar;
    }

    public final void setOnModifierChanged$ui_release(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.a1.f, q> lVar) {
        this.i = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(com.amazon.aps.iva.xb0.l<? super Boolean, q> lVar) {
        this.q = lVar;
    }

    public final void setRelease(com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<set-?>");
        this.g = aVar;
    }

    public final void setReset(com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<set-?>");
        this.f = aVar;
    }

    public final void setSavedStateRegistryOwner(com.amazon.aps.iva.s8.c cVar) {
        if (cVar != this.m) {
            this.m = cVar;
            com.amazon.aps.iva.s8.d.b(this, cVar);
        }
    }

    public final void setUpdate(com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "value");
        this.d = aVar;
        this.e = true;
        this.p.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        com.amazon.aps.iva.yb0.j.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f2 = i2;
            float f3 = -1;
            this.b.b(i6 == 0 ? 1 : 2, com.amazon.aps.iva.e1.d.d(f2 * f3, i3 * f3), com.amazon.aps.iva.e1.d.d(i4 * f3, i5 * f3));
        }
    }
}
