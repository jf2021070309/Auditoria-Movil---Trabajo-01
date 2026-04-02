package com.amazon.aps.iva.i2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.j0.l1;
import com.amazon.aps.iva.j0.p2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes.dex */
public final class g0 implements z {
    public final View a;
    public final n b;
    public final t c;
    public final Executor d;
    public com.amazon.aps.iva.xb0.l<? super List<? extends f>, com.amazon.aps.iva.kb0.q> e;
    public com.amazon.aps.iva.xb0.l<? super k, com.amazon.aps.iva.kb0.q> f;
    public e0 g;
    public l h;
    public final ArrayList i;
    public final com.amazon.aps.iva.kb0.e j;
    public Rect k;
    public final com.amazon.aps.iva.p0.f<a> l;
    public com.amazon.aps.iva.v1.p m;

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends f>, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends f> list) {
            com.amazon.aps.iva.yb0.j.f(list, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final /* synthetic */ com.amazon.aps.iva.kb0.q invoke(k kVar) {
            int i = kVar.a;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public g0(AndroidComposeView androidComposeView, t tVar) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "view");
        p pVar = new p(androidComposeView);
        Choreographer choreographer = Choreographer.getInstance();
        com.amazon.aps.iva.yb0.j.e(choreographer, "getInstance()");
        l0 l0Var = new l0(choreographer, 0);
        this.a = androidComposeView;
        this.b = pVar;
        this.c = tVar;
        this.d = l0Var;
        this.e = j0.h;
        this.f = k0.h;
        this.g = new e0("", com.amazon.aps.iva.c2.z.b, 4);
        this.h = l.f;
        this.i = new ArrayList();
        this.j = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new h0(this));
        this.l = new com.amazon.aps.iva.p0.f<>(new a[16]);
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void a() {
        t tVar = this.c;
        if (tVar != null) {
            tVar.n0();
        }
        this.e = c.h;
        this.f = d.h;
        this.k = null;
        g(a.StopInput);
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void b() {
        g(a.HideKeyboard);
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void c(com.amazon.aps.iva.e1.e eVar) {
        Rect rect;
        this.k = new Rect(com.amazon.aps.iva.ob0.f.a(eVar.a), com.amazon.aps.iva.ob0.f.a(eVar.b), com.amazon.aps.iva.ob0.f.a(eVar.c), com.amazon.aps.iva.ob0.f.a(eVar.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void d(e0 e0Var, l lVar, l1 l1Var, p2.a aVar) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "value");
        com.amazon.aps.iva.yb0.j.f(lVar, "imeOptions");
        t tVar = this.c;
        if (tVar != null) {
            tVar.m0();
        }
        this.g = e0Var;
        this.h = lVar;
        this.e = l1Var;
        this.f = aVar;
        g(a.StartInput);
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void e() {
        g(a.ShowKeyboard);
    }

    @Override // com.amazon.aps.iva.i2.z
    public final void f(e0 e0Var, e0 e0Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j = this.g.b;
        long j2 = e0Var2.b;
        boolean a2 = com.amazon.aps.iva.c2.z.a(j, j2);
        boolean z2 = true;
        com.amazon.aps.iva.c2.z zVar = e0Var2.c;
        if (a2 && com.amazon.aps.iva.yb0.j.a(this.g.c, zVar)) {
            z = false;
        } else {
            z = true;
        }
        this.g = e0Var2;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a0 a0Var = (a0) ((WeakReference) arrayList.get(i4)).get();
            if (a0Var != null) {
                a0Var.d = e0Var2;
            }
        }
        boolean a3 = com.amazon.aps.iva.yb0.j.a(e0Var, e0Var2);
        n nVar = this.b;
        int i5 = -1;
        if (a3) {
            if (z) {
                int e = com.amazon.aps.iva.c2.z.e(j2);
                int d2 = com.amazon.aps.iva.c2.z.d(j2);
                com.amazon.aps.iva.c2.z zVar2 = this.g.c;
                if (zVar2 != null) {
                    i3 = com.amazon.aps.iva.c2.z.e(zVar2.a);
                } else {
                    i3 = -1;
                }
                com.amazon.aps.iva.c2.z zVar3 = this.g.c;
                if (zVar3 != null) {
                    i5 = com.amazon.aps.iva.c2.z.d(zVar3.a);
                }
                nVar.c(e, d2, i3, i5);
                return;
            }
            return;
        }
        if (e0Var == null || (com.amazon.aps.iva.yb0.j.a(e0Var.a.b, e0Var2.a.b) && (!com.amazon.aps.iva.c2.z.a(e0Var.b, j2) || com.amazon.aps.iva.yb0.j.a(e0Var.c, zVar)))) {
            z2 = false;
        }
        if (z2) {
            nVar.d();
            return;
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            a0 a0Var2 = (a0) ((WeakReference) arrayList.get(i6)).get();
            if (a0Var2 != null) {
                e0 e0Var3 = this.g;
                com.amazon.aps.iva.yb0.j.f(e0Var3, "state");
                com.amazon.aps.iva.yb0.j.f(nVar, "inputMethodManager");
                if (a0Var2.h) {
                    a0Var2.d = e0Var3;
                    if (a0Var2.f) {
                        nVar.a(a0Var2.e, com.amazon.aps.iva.ff0.b.G(e0Var3));
                    }
                    com.amazon.aps.iva.c2.z zVar4 = e0Var3.c;
                    if (zVar4 != null) {
                        i = com.amazon.aps.iva.c2.z.e(zVar4.a);
                    } else {
                        i = -1;
                    }
                    if (zVar4 != null) {
                        i2 = com.amazon.aps.iva.c2.z.d(zVar4.a);
                    } else {
                        i2 = -1;
                    }
                    long j3 = e0Var3.b;
                    nVar.c(com.amazon.aps.iva.c2.z.e(j3), com.amazon.aps.iva.c2.z.d(j3), i, i2);
                }
            }
        }
    }

    public final void g(a aVar) {
        this.l.b(aVar);
        if (this.m == null) {
            com.amazon.aps.iva.v1.p pVar = new com.amazon.aps.iva.v1.p(this, 1);
            this.d.execute(pVar);
            this.m = pVar;
        }
    }
}
