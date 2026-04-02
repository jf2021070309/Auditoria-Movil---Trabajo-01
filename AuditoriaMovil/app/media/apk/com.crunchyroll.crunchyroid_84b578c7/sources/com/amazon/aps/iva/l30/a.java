package com.amazon.aps.iva.l30;

import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.j30.o;
import com.amazon.aps.iva.s40.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrPlusAuthenticationRouterImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.f20.b {
    public static final a a = new a();
    public static com.amazon.aps.iva.s40.c b;

    /* compiled from: CrPlusAuthenticationRouterImpl.kt */
    /* renamed from: com.amazon.aps.iva.l30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0464a extends l implements p<com.amazon.aps.iva.i.a<com.crunchyroll.auth.c, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<com.crunchyroll.auth.c>> {
        public final /* synthetic */ ComponentActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0464a(ComponentActivity componentActivity) {
            super(2);
            this.h = componentActivity;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.h.c<com.crunchyroll.auth.c> invoke(com.amazon.aps.iva.i.a<com.crunchyroll.auth.c, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
            com.amazon.aps.iva.i.a<com.crunchyroll.auth.c, Integer> aVar2 = aVar;
            com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
            j.f(aVar2, "contract");
            j.f(bVar2, "result");
            com.amazon.aps.iva.h.c<com.crunchyroll.auth.c> registerForActivityResult = this.h.registerForActivityResult(aVar2, bVar2);
            j.e(registerForActivityResult, "activity.registerForActi…yResult(contract, result)");
            return registerForActivityResult;
        }
    }

    @Override // com.amazon.aps.iva.f20.b
    public final void a() {
        com.amazon.aps.iva.s40.c cVar = b;
        if (cVar != null) {
            cVar.b(null, null, null);
        } else {
            j.m("signUpFlowRouter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.f20.b
    public final void b(ComponentActivity componentActivity, com.amazon.aps.iva.vw.a aVar) {
        j.f(componentActivity, "activity");
        C0464a c0464a = new C0464a(componentActivity);
        b = new h(new com.ellation.crunchyroll.presentation.signing.signup.a(), new com.amazon.aps.iva.s40.b(new com.crunchyroll.auth.c(true, false, aVar, null, true, 10)), c0464a);
    }

    @Override // com.amazon.aps.iva.f20.b
    public final void c(o.a aVar, o.b bVar, o.c cVar) {
        j.f(cVar, "onCancel");
        com.amazon.aps.iva.s40.c cVar2 = b;
        if (cVar2 != null) {
            cVar2.a(aVar, bVar, cVar);
        } else {
            j.m("signUpFlowRouter");
            throw null;
        }
    }
}
