package com.amazon.aps.iva.f20;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
/* compiled from: CrPlusSubscriptionModule.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public static e e;
    public static int f;
    public final Context a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.rs.f> b;
    public final m c;
    public final m d;

    /* compiled from: CrPlusSubscriptionModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.rs.f> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.rs.f invoke() {
            return f.this.b.invoke();
        }
    }

    /* compiled from: CrPlusSubscriptionModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.b30.a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.b30.a invoke() {
            f fVar = f.this;
            com.amazon.aps.iva.rs.f c = fVar.c();
            Resources resources = fVar.a.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            com.amazon.aps.iva.a30.c cVar = new com.amazon.aps.iva.a30.c(resources);
            i iVar = i.a.a;
            if (iVar != null) {
                SubscriptionProcessorService subscriptionProcessorService = iVar.getSubscriptionProcessorService();
                com.amazon.aps.iva.yb0.j.f(subscriptionProcessorService, "subscriptionProcessorService");
                com.amazon.aps.iva.b30.g gVar = new com.amazon.aps.iva.b30.g(subscriptionProcessorService);
                com.amazon.aps.iva.yb0.j.f(c, "billingLifecycle");
                return new com.amazon.aps.iva.b30.b(c, cVar, gVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.rs.f> aVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = aVar;
        e = this;
        this.c = com.amazon.aps.iva.kb0.f.b(new a());
        this.d = com.amazon.aps.iva.kb0.f.b(new b());
    }

    @Override // com.amazon.aps.iva.f20.e
    public final com.amazon.aps.iva.b30.a a() {
        return (com.amazon.aps.iva.b30.a) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.f20.g
    public final void b() {
        com.amazon.aps.iva.rs.f c;
        int i = f - 1;
        f = i;
        if (i <= 0) {
            e eVar = e;
            if (eVar != null && (c = eVar.c()) != null) {
                c.destroy();
            }
            e = null;
        }
    }

    @Override // com.amazon.aps.iva.f20.g
    public final com.amazon.aps.iva.rs.f c() {
        return (com.amazon.aps.iva.rs.f) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.f20.e
    public final com.amazon.aps.iva.rs.l d(com.amazon.aps.iva.i60.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "activity");
        com.amazon.aps.iva.rs.f c = c();
        com.amazon.aps.iva.yb0.j.f(c, "billingLifecycle");
        return new com.amazon.aps.iva.rs.l(bVar, c);
    }
}
