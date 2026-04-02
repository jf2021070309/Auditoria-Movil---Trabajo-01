package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
/* loaded from: classes2.dex */
public final class d extends b {
    private static d v;
    private String w;

    private d() {
        this.r = "ironbeast";
        this.q = 2;
        this.s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.w = "";
    }

    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            if (v == null) {
                d dVar2 = new d();
                v = dVar2;
                dVar2.a();
            }
            dVar = v;
        }
        return dVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final void b() {
        this.t.add(2001);
        this.t.add(2002);
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS));
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS));
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.t.add(3001);
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD_FAILED));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.t.add(3002);
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD));
        this.t.add(3005);
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean c(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final String d(int i) {
        return this.w;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean d(com.ironsource.mediationsdk.adunit.a.a aVar) {
        int a = aVar.a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3005 || a == 3015;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final int e(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return n.a().b(e(aVar.a()) == b.a.BANNER.f ? 3 : 2);
    }
}
