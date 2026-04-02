package com.amazon.aps.iva.t20;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.g30.g;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.q20.a;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.ManageMembershipActivity;
/* compiled from: ManageMembershipModule.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.t20.a {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(b.class, "productsViewModel", "getProductsViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscription/viewmodel/CrPlusSubscriptionProductsViewModel;", 0), com.amazon.aps.iva.k.q.a(b.class, "manageMembershipViewModel", "getManageMembershipViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/manage/ManageMembershipViewModelImpl;", 0)};
    public final com.amazon.aps.iva.kb0.m b;
    public final com.amazon.aps.iva.f20.e c;
    public final com.amazon.aps.iva.kb0.m d;
    public final com.amazon.aps.iva.ez.a e;
    public final com.amazon.aps.iva.t20.e f;

    /* compiled from: ManageMembershipModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sh.a> {
        public final /* synthetic */ ManageMembershipActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ManageMembershipActivity manageMembershipActivity) {
            super(0);
            this.h = manageMembershipActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.sh.a invoke() {
            com.amazon.aps.iva.sh.a aVar;
            Object obj;
            Intent intent = this.h.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("manage_membership_input", com.amazon.aps.iva.sh.a.class);
                } else {
                    obj = (com.amazon.aps.iva.sh.a) extras.getSerializable("manage_membership_input");
                }
                aVar = (com.amazon.aps.iva.sh.a) obj;
            } else {
                aVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(aVar);
            return aVar;
        }
    }

    /* compiled from: ManageMembershipModule.kt */
    /* renamed from: com.amazon.aps.iva.t20.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0727b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i20.g> {
        public static final C0727b h = new C0727b();

        public C0727b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i20.g invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MANAGE_MEMBERSHIP_ACCOUNT;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            return new com.amazon.aps.iva.i20.h(aVar, null);
        }
    }

    /* compiled from: ManageMembershipModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, u> {
        public final /* synthetic */ ManageMembershipActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ManageMembershipActivity manageMembershipActivity) {
            super(1);
            this.i = manageMembershipActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            b bVar = b.this;
            com.amazon.aps.iva.d30.d a = bVar.a();
            Resources resources = this.i.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "activity.resources");
            com.amazon.aps.iva.q20.b a2 = a.C0634a.a(resources);
            String str = ((com.amazon.aps.iva.sh.a) bVar.b.getValue()).b;
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                return new u(a, new com.amazon.aps.iva.j30.i(a2, new p(str, iVar.f().invoke().O0())));
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ManageMembershipModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.d30.e> {
        public final /* synthetic */ ManageMembershipActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ManageMembershipActivity manageMembershipActivity) {
            super(1);
            this.i = manageMembershipActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.d30.e invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            b bVar = b.this;
            com.amazon.aps.iva.rs.f c = bVar.c.c();
            com.amazon.aps.iva.f20.e eVar = bVar.c;
            com.amazon.aps.iva.b30.a a = eVar.a();
            com.amazon.aps.iva.rs.l d = eVar.d(this.i);
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                return new com.amazon.aps.iva.d30.e(c, a, d, iVar.o(), ((com.amazon.aps.iva.sh.a) bVar.b.getValue()).b, new com.amazon.aps.iva.t20.c(bVar), (com.amazon.aps.iva.i20.e) bVar.d.getValue(), 32);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ManageMembershipModule.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i20.e> {
        public static final g h = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i20.e invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MANAGE_MEMBERSHIP_ACCOUNT;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            return e.a.a(aVar);
        }
    }

    public b(ManageMembershipActivity manageMembershipActivity) {
        com.amazon.aps.iva.kb0.m b = com.amazon.aps.iva.kb0.f.b(new a(manageMembershipActivity));
        this.b = b;
        this.c = e.a.a(manageMembershipActivity);
        com.amazon.aps.iva.kb0.m b2 = com.amazon.aps.iva.kb0.f.b(g.h);
        this.d = b2;
        com.amazon.aps.iva.kb0.m b3 = com.amazon.aps.iva.kb0.f.b(C0727b.h);
        com.amazon.aps.iva.k20.g gVar = new com.amazon.aps.iva.k20.g(new com.amazon.aps.iva.k20.q(), LifecycleExtensionsKt.a(manageMembershipActivity), com.amazon.aps.iva.k20.h.h);
        this.e = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.d30.e.class, new e(manageMembershipActivity), new d(manageMembershipActivity));
        c cVar = new c(manageMembershipActivity);
        f fVar = new f(manageMembershipActivity);
        com.amazon.aps.iva.sh.a aVar = (com.amazon.aps.iva.sh.a) b.getValue();
        com.amazon.aps.iva.yb0.j.f(g[1], "property");
        u uVar = (u) com.amazon.aps.iva.ez.l.a(fVar.invoke(), u.class, cVar);
        com.amazon.aps.iva.i20.e eVar = (com.amazon.aps.iva.i20.e) b2.getValue();
        com.amazon.aps.iva.i20.g gVar2 = (com.amazon.aps.iva.i20.g) b3.getValue();
        com.amazon.aps.iva.k50.m mVar = new com.amazon.aps.iva.k50.m(manageMembershipActivity);
        com.amazon.aps.iva.g30.g a2 = g.a.a(manageMembershipActivity, null, null, 14);
        com.amazon.aps.iva.f20.i iVar = i.a.a;
        if (iVar != null) {
            com.amazon.aps.iva.xb0.a<Boolean> m = iVar.m();
            com.amazon.aps.iva.yb0.j.f(aVar, "input");
            com.amazon.aps.iva.yb0.j.f(eVar, "subscriptionAnalytics");
            com.amazon.aps.iva.yb0.j.f(gVar2, "manageMembershipAnalytics");
            com.amazon.aps.iva.yb0.j.f(m, "hasStoreDiscount");
            this.f = new com.amazon.aps.iva.t20.e(manageMembershipActivity, aVar, uVar, eVar, gVar2, mVar, a2, gVar, m);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.t20.a
    public final com.amazon.aps.iva.d30.d a() {
        return (com.amazon.aps.iva.d30.d) this.e.getValue(this, g[0]);
    }

    @Override // com.amazon.aps.iva.t20.a
    public final com.amazon.aps.iva.t20.e getPresenter() {
        return this.f;
    }
}
