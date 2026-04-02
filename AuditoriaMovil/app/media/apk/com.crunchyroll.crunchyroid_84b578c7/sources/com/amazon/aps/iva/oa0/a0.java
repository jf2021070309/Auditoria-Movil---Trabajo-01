package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.c0;
import com.amazon.aps.iva.oa0.u;
import java.util.HashMap;
import java.util.Map;
/* compiled from: GeneralHttpService.java */
/* loaded from: classes4.dex */
public final class a0 implements Runnable {
    public final /* synthetic */ Map c;
    public final /* synthetic */ c0.a e;
    public final /* synthetic */ b0 f;
    public final /* synthetic */ String b = "/config";
    public final /* synthetic */ Map d = null;

    public a0(b0 b0Var, HashMap hashMap, u.a aVar) {
        this.f = b0Var;
        this.c = hashMap;
        this.e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.b(this.b, this.c, this.d, this.e);
    }
}
