package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.ru.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CommentsDataSourceDelegateFactory.kt */
/* loaded from: classes2.dex */
public final class e {
    public static /* synthetic */ c a(d dVar, com.amazon.aps.iva.vt.f fVar, e0 e0Var, p pVar, n nVar, int i) {
        l lVar;
        f fVar2 = e0Var;
        if ((i & 2) != 0) {
            fVar2 = f.h;
        }
        com.amazon.aps.iva.xb0.l lVar2 = fVar2;
        if ((i & 16) != 0) {
            lVar = l.a;
        } else {
            lVar = null;
        }
        return dVar.a(fVar, lVar, nVar, lVar2, pVar);
    }
}
