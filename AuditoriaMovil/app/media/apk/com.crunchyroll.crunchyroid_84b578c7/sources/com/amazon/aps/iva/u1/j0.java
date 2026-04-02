package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
/* compiled from: NodeCoordinator.kt */
/* loaded from: classes.dex */
public final class j0 {
    public static final f.c a(h hVar, int i) {
        f.c cVar = hVar.V().g;
        if (cVar != null && (cVar.e & i) != 0) {
            while (cVar != null) {
                int i2 = cVar.d;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & i) == 0) {
                    cVar = cVar.g;
                } else {
                    return cVar;
                }
            }
        }
        return null;
    }
}
