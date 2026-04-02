package com.amazon.aps.iva.b30;

import com.amazon.aps.iva.ks.j;
import com.amazon.aps.iva.rs.m;
/* compiled from: CrPlusSubscriptionProductModel.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final com.amazon.aps.iva.js.i a(c cVar) {
        if (cVar != null && cVar.i != null) {
            return com.amazon.aps.iva.js.i.CR_VOD_INTRO_OFFER;
        }
        return com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION;
    }

    public static final com.amazon.aps.iva.ks.j b(c cVar) {
        com.amazon.aps.iva.rs.m mVar = cVar.i;
        if (mVar != null) {
            return c(mVar);
        }
        return null;
    }

    public static final com.amazon.aps.iva.ks.j c(com.amazon.aps.iva.rs.m mVar) {
        if (mVar instanceof m.b.c) {
            return j.d.a;
        }
        if (mVar instanceof m.b.C0682b) {
            return j.b.a;
        }
        if (mVar instanceof m.b.a) {
            return j.a.a;
        }
        if (mVar instanceof m.a) {
            return j.c.a;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    public static final com.amazon.aps.iva.js.q d(c cVar) {
        String c;
        com.amazon.aps.iva.rs.m mVar = cVar.i;
        if (mVar != null && (c = mVar.c()) != null) {
            return new com.amazon.aps.iva.js.q(c);
        }
        return null;
    }
}
