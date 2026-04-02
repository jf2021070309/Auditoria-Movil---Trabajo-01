package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
/* loaded from: classes2.dex */
public final class h extends b {
    private static h v;
    private String w;

    private h() {
        this.r = "outcome";
        this.q = 3;
        this.s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.w = "";
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            if (v == null) {
                h hVar2 = new h();
                v = hVar2;
                hVar2.a();
            }
            hVar = v;
        }
        return hVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final void b() {
        this.t.add(1000);
        this.t.add(1001);
        this.t.add(1002);
        this.t.add(1003);
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.t.add(Integer.valueOf((int) IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean c(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return aVar.a() == 305;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final String d(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.w : "";
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean d(com.ironsource.mediationsdk.adunit.a.a aVar) {
        int a = aVar.a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final int e(com.ironsource.mediationsdk.adunit.a.a aVar) {
        return n.a().b((e(aVar.a()) == b.a.OFFERWALL.f ? 1 : 0) ^ 1);
    }
}
