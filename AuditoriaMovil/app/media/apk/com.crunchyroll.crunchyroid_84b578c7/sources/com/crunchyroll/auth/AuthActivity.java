package com.crunchyroll.auth;

import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yd.q;
import com.amazon.aps.iva.yd.v;
import com.crunchyroll.auth.c;
import kotlin.Metadata;
/* compiled from: AuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/auth/AuthActivity;", "Lcom/amazon/aps/iva/k/c;", "<init>", "()V", "a", "auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AuthActivity extends com.amazon.aps.iva.k.c {
    public final com.amazon.aps.iva.ez.a b = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.ui.c.class, new g(this), new d());
    public final com.amazon.aps.iva.ee.e c = new com.amazon.aps.iva.ee.e(new com.amazon.aps.iva.ee.f(), new f(), com.amazon.aps.iva.ee.g.h);
    public final v d = new v(new com.amazon.aps.iva.yd.d(), new b(), q.h);
    public final j e;
    public static final /* synthetic */ l<Object>[] g = {com.amazon.aps.iva.k.q.a(AuthActivity.class, "navigator", "getNavigator()Lcom/crunchyroll/mvvm/navigation/ViewModelNavigator;", 0)};
    public static final a f = new a();

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.i.a<com.amazon.aps.iva.yd.g, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<com.amazon.aps.iva.yd.g>> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.h.c<com.amazon.aps.iva.yd.g> invoke(com.amazon.aps.iva.i.a<com.amazon.aps.iva.yd.g, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
            com.amazon.aps.iva.i.a<com.amazon.aps.iva.yd.g, Integer> aVar2 = aVar;
            com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "contract");
            com.amazon.aps.iva.yb0.j.f(bVar2, "result");
            com.amazon.aps.iva.h.c<com.amazon.aps.iva.yd.g> registerForActivityResult = AuthActivity.this.registerForActivityResult(aVar2, bVar2);
            com.amazon.aps.iva.yb0.j.e(registerForActivityResult, "registerForActivityResult(contract, result)");
            return registerForActivityResult;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class c implements h {
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a>> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> invoke(androidx.lifecycle.p pVar) {
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            Intent intent = AuthActivity.this.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            return new com.amazon.aps.iva.ui.c<>(pVar2, c.a.a(intent));
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 544432404, new com.crunchyroll.auth.b(AuthActivity.this)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a>> {
        public f() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a> invoke(com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
            com.amazon.aps.iva.i.a<com.amazon.aps.iva.ee.a, Integer> aVar2 = aVar;
            com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "contract");
            com.amazon.aps.iva.yb0.j.f(bVar2, "result");
            com.amazon.aps.iva.h.c<com.amazon.aps.iva.ee.a> registerForActivityResult = AuthActivity.this.registerForActivityResult(aVar2, bVar2);
            com.amazon.aps.iva.yb0.j.e(registerForActivityResult, "registerForActivityResult(contract, result)");
            return registerForActivityResult;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    public AuthActivity() {
        com.amazon.aps.iva.vd.e eVar = l1.f;
        if (eVar != null) {
            this.e = eVar.e().invoke(this, new c(), com.amazon.aps.iva.ls.a.LOGIN);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.c(this, com.amazon.aps.iva.v0.b.c(1068569319, new e(), true));
    }
}
