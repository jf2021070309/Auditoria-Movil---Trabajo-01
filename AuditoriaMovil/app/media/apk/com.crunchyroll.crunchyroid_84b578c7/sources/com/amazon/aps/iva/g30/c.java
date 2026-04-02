package com.amazon.aps.iva.g30;

import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.j;
import com.amazon.aps.iva.rs.p;
/* compiled from: SubscriptionSuccessAnalytics.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: SubscriptionSuccessAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(c cVar, p pVar, l0 l0Var, String str, String str2, j jVar, int i) {
            j jVar2;
            i iVar = null;
            if ((i & 16) != 0) {
                jVar2 = null;
            } else {
                jVar2 = jVar;
            }
            if ((i & 32) != 0) {
                iVar = i.CR_VOD_ACQUISITION;
            }
            cVar.b(pVar, l0Var, str, str2, jVar2, iVar);
        }
    }

    void b(p pVar, l0 l0Var, String str, String str2, j jVar, i iVar);
}
