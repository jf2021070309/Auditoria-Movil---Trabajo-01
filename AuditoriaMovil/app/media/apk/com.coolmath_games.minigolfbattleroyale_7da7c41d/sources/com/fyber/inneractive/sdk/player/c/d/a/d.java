package com.fyber.inneractive.sdk.player.c.d.a;

import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.l;
/* loaded from: classes.dex */
abstract class d {
    protected final n b;

    protected abstract void a(k kVar, long j) throws l;

    protected abstract boolean a(k kVar) throws l;

    /* loaded from: classes.dex */
    public static final class a extends l {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(n nVar) {
        this.b = nVar;
    }

    public final void b(k kVar, long j) throws l {
        if (a(kVar)) {
            a(kVar, j);
        }
    }
}
