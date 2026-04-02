package com.amazon.aps.iva.s40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.AuthActivity;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
/* compiled from: SignUpFlowRouter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h.c<com.crunchyroll.auth.c>, q> {
    public final /* synthetic */ com.crunchyroll.auth.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.crunchyroll.auth.c cVar) {
        super(1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.h.c<com.crunchyroll.auth.c> cVar) {
        com.amazon.aps.iva.h.c<com.crunchyroll.auth.c> cVar2 = cVar;
        j.f(cVar2, "launcher");
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.l.class, "otp");
            if (c != null) {
                boolean b = ((com.amazon.aps.iva.cx.l) c).b();
                com.crunchyroll.auth.c cVar3 = this.h;
                if (b) {
                    AuthActivity.f.getClass();
                    j.f(cVar3, "input");
                    cVar2.a(cVar3);
                } else {
                    SignUpFlowActivity.I.getClass();
                    j.f(cVar3, "input");
                    cVar2.a(cVar3);
                }
                return q.a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.OtpConfigImpl");
        }
        j.m("instance");
        throw null;
    }
}
