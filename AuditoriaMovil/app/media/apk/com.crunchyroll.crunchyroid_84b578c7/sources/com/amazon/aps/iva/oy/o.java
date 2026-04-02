package com.amazon.aps.iva.oy;

import android.app.Activity;
/* compiled from: InAppUpdatesManagerProxy.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.inappupdates.manager.UpdateManagerProxyImplIn", f = "InAppUpdatesManagerProxy.kt", l = {46}, m = "downloadUpdate")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.c {
    public p h;
    public Activity i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ p m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(dVar);
        this.m = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(0, this);
    }
}
