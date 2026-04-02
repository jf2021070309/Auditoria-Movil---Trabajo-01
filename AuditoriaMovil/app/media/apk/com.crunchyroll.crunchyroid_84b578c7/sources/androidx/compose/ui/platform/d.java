package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.w0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.v1.g1;
import com.amazon.aps.iva.v1.h1;
import com.amazon.aps.iva.v1.i1;
import com.amazon.aps.iva.v1.j1;
import com.amazon.aps.iva.v1.m0;
import com.amazon.aps.iva.v1.o0;
import com.amazon.aps.iva.v1.p0;
import com.amazon.aps.iva.x0.k;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: AndroidCompositionLocals.android.kt */
/* loaded from: classes.dex */
public final class d {
    public static final w0 a = l0.b(a.h);
    public static final q3 b = l0.c(b.h);
    public static final q3 c = l0.c(c.h);
    public static final q3 d = l0.c(C0022d.h);
    public static final q3 e = l0.c(e.h);
    public static final q3 f = l0.c(f.h);

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Configuration> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Configuration invoke() {
            d.b("LocalConfiguration");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<Context> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Context invoke() {
            d.b("LocalContext");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.z1.a> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.z1.a invoke() {
            d.b("LocalImageVectorCache");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* renamed from: androidx.compose.ui.platform.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0022d extends l implements com.amazon.aps.iva.xb0.a<o> {
        public static final C0022d h = new C0022d();

        public C0022d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o invoke() {
            d.b("LocalLifecycleOwner");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s8.c> {
        public static final e h = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.s8.c invoke() {
            d.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<View> {
        public static final f h = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final View invoke() {
            d.b("LocalView");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.l<Configuration, q> {
        public final /* synthetic */ q1<Configuration> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q1<Configuration> q1Var) {
            super(1);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Configuration configuration) {
            Configuration configuration2 = configuration;
            com.amazon.aps.iva.yb0.j.f(configuration2, "it");
            this.h.setValue(new Configuration(configuration2));
            return q.a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ g1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g1 g1Var) {
            super(1);
            this.h = g1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            return new m0(this.h);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ AndroidComposeView h;
        public final /* synthetic */ com.amazon.aps.iva.v1.v0 i;
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AndroidComposeView androidComposeView, com.amazon.aps.iva.v1.v0 v0Var, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
            super(2);
            this.h = androidComposeView;
            this.i = v0Var;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.v1.v0 v0Var = this.i;
                p<com.amazon.aps.iva.o0.i, Integer, q> pVar = this.j;
                d1.a(this.h, v0Var, pVar, iVar2, ((this.k << 3) & 896) | 72);
            }
            return q.a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class j extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ AndroidComposeView h;
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(AndroidComposeView androidComposeView, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
            super(2);
            this.h = androidComposeView;
            this.i = pVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            d.a(this.h, this.i, iVar, I);
            return q.a;
        }
    }

    public static final void a(AndroidComposeView androidComposeView, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, com.amazon.aps.iva.o0.i iVar, int i2) {
        String str;
        LinkedHashMap linkedHashMap;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "owner");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g2 = iVar.g(1396852028);
        e0.b bVar = e0.a;
        Context context = androidComposeView.getContext();
        g2.s(-492369756);
        Object e0 = g2.e0();
        i.a.C0550a c0550a = i.a.a;
        if (e0 == c0550a) {
            e0 = com.amazon.aps.iva.cq.b.c0(new Configuration(context.getResources().getConfiguration()));
            g2.K0(e0);
        }
        g2.U(false);
        q1 q1Var = (q1) e0;
        g2.s(1157296644);
        boolean H = g2.H(q1Var);
        Object e02 = g2.e0();
        if (H || e02 == c0550a) {
            e02 = new g(q1Var);
            g2.K0(e02);
        }
        g2.U(false);
        androidComposeView.setConfigurationChangeObserver((com.amazon.aps.iva.xb0.l) e02);
        g2.s(-492369756);
        Object e03 = g2.e0();
        if (e03 == c0550a) {
            com.amazon.aps.iva.yb0.j.e(context, "context");
            e03 = new com.amazon.aps.iva.v1.v0(context);
            g2.K0(e03);
        }
        g2.U(false);
        com.amazon.aps.iva.v1.v0 v0Var = (com.amazon.aps.iva.v1.v0) e03;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            g2.s(-492369756);
            Object e04 = g2.e0();
            com.amazon.aps.iva.s8.c cVar = viewTreeOwners.b;
            if (e04 == c0550a) {
                com.amazon.aps.iva.yb0.j.f(cVar, "owner");
                ViewParent parent = androidComposeView.getParent();
                com.amazon.aps.iva.yb0.j.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                com.amazon.aps.iva.yb0.j.f(str, "id");
                String str2 = com.amazon.aps.iva.x0.i.class.getSimpleName() + ':' + str;
                androidx.savedstate.a savedStateRegistry = cVar.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(str2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    Set<String> keySet = a2.keySet();
                    com.amazon.aps.iva.yb0.j.e(keySet, "this.keySet()");
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        Iterator it2 = it;
                        ArrayList parcelableArrayList = a2.getParcelableArrayList(str3);
                        com.amazon.aps.iva.yb0.j.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        com.amazon.aps.iva.yb0.j.e(str3, "key");
                        linkedHashMap.put(str3, parcelableArrayList);
                        it = it2;
                        a2 = a2;
                    }
                } else {
                    linkedHashMap = null;
                }
                q3 q3Var = k.a;
                j1 j1Var = j1.h;
                com.amazon.aps.iva.yb0.j.f(j1Var, "canBeSaved");
                com.amazon.aps.iva.x0.j jVar = new com.amazon.aps.iva.x0.j(linkedHashMap, j1Var);
                try {
                    savedStateRegistry.c(str2, new i1(jVar));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                g1 g1Var = new g1(jVar, new h1(z, savedStateRegistry, str2));
                g2.K0(g1Var);
                e04 = g1Var;
            }
            g2.U(false);
            g1 g1Var2 = (g1) e04;
            x0.a(q.a, new h(g1Var2), g2);
            com.amazon.aps.iva.yb0.j.e(context, "context");
            Configuration configuration = (Configuration) q1Var.getValue();
            g2.s(-485908294);
            e0.b bVar2 = e0.a;
            g2.s(-492369756);
            Object e05 = g2.e0();
            if (e05 == c0550a) {
                e05 = new com.amazon.aps.iva.z1.a();
                g2.K0(e05);
            }
            g2.U(false);
            com.amazon.aps.iva.z1.a aVar = (com.amazon.aps.iva.z1.a) e05;
            g2.s(-492369756);
            Object e06 = g2.e0();
            Configuration configuration2 = e06;
            if (e06 == c0550a) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                g2.K0(configuration3);
                configuration2 = configuration3;
            }
            g2.U(false);
            Configuration configuration4 = (Configuration) configuration2;
            g2.s(-492369756);
            Object e07 = g2.e0();
            if (e07 == c0550a) {
                e07 = new p0(configuration4, aVar);
                g2.K0(e07);
            }
            g2.U(false);
            x0.a(aVar, new o0(context, (p0) e07), g2);
            g2.U(false);
            l0.a(new h2[]{a.b((Configuration) q1Var.getValue()), b.b(context), d.b(viewTreeOwners.a), e.b(cVar), k.a.b(g1Var2), f.b(androidComposeView.getView()), c.b(aVar)}, com.amazon.aps.iva.v0.b.b(g2, 1471621628, new i(androidComposeView, v0Var, pVar, i2)), g2, 56);
            j2 X = g2.X();
            if (X != null) {
                X.d = new j(androidComposeView, pVar, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
