package com.amazon.aps.iva.g8;

import java.util.ArrayList;
import java.util.List;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<String>> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final List<String> invoke() {
        List<String> list;
        com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) this.h.j.getValue();
        if (jVar == null || (list = (List) jVar.b) == null) {
            return new ArrayList();
        }
        return list;
    }
}
