package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.h.m;
import com.fyber.inneractive.sdk.h.n;
/* loaded from: classes.dex */
public abstract class a<T> extends com.fyber.inneractive.sdk.dv.a<T> {
    protected com.fyber.inneractive.sdk.dv.d.a a;

    public abstract void a(com.fyber.inneractive.sdk.dv.d.a aVar, Activity activity);

    public a(u uVar, s sVar, f fVar) {
        super(uVar, sVar, fVar);
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        try {
            new n.a(m.EVENT_READY_ON_CLIENT, this.f, c()).b(null);
        } catch (Exception unused) {
        }
    }
}
