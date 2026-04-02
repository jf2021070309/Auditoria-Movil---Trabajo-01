package com.fyber.inneractive.sdk.player.c.i;

import com.fyber.inneractive.sdk.player.c.g.i;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.p;
/* loaded from: classes.dex */
public final class h {
    public final i a;
    public final f b;
    public final Object c;
    public final p[] d;

    public h(i iVar, f fVar, Object obj, p[] pVarArr) {
        this.a = iVar;
        this.b = fVar;
        this.c = obj;
        this.d = pVarArr;
    }

    public final boolean a(h hVar, int i) {
        return hVar != null && t.a(this.b.b[i], hVar.b.b[i]) && t.a(this.d[i], hVar.d[i]);
    }
}
