package com.crunchyroll.auth;

import com.amazon.aps.iva.be.h;
import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.AuthActivity;
/* compiled from: AuthActivity.kt */
/* loaded from: classes.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ AuthActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AuthActivity authActivity) {
        super(2);
        this.h = authActivity;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            m0 k = d.k(new r0[0], iVar2);
            q qVar = q.a;
            AuthActivity authActivity = this.h;
            x0.c(qVar, new a(k, authActivity, null), iVar2);
            AuthActivity.a aVar = AuthActivity.f;
            authActivity.getClass();
            h.a(k, (com.amazon.aps.iva.ui.c) authActivity.b.getValue(authActivity, AuthActivity.g[0]), new com.amazon.aps.iva.be.i(), iVar2, 8);
        }
        return q.a;
    }
}
