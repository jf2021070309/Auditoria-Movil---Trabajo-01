package com.kwad.components.ad.reward.k.b;

import android.content.Context;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.k.a {
    private c yb = new c();
    private C0169a yc = new C0169a();
    private final b yd = new b(com.kwad.components.ad.reward.a.b.gG());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.k.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0169a extends com.kwad.components.ad.reward.k.b {
        public C0169a() {
            this.xX = "安装应用";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends com.kwad.components.ad.reward.k.b {
        public b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            this.xX = String.format("进阶奖励：安装并激活APP %ss", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            this.xY = String.format("进阶奖励：安装并激活APP %ss", sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends com.kwad.components.ad.reward.k.b {
        public c() {
            this.xX = "基础奖励：观看视频";
            this.xY = "基础奖励：需再观看%ss视频";
        }
    }

    public static void a(a aVar, Context context, AdTemplate adTemplate) {
        if (ak.ak(context, com.kwad.sdk.core.response.b.a.aq(d.ck(adTemplate)))) {
            aVar.jL();
        } else {
            aVar.jM();
        }
    }

    private void jK() {
        if (this.yb.isCompleted() && this.yc.isCompleted() && this.yd.isCompleted()) {
            jA();
        } else {
            jB();
        }
    }

    private void jM() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markInstallUncompleted");
        this.yc.jB();
        jK();
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.ad.reward.k.c
    public final boolean isCompleted() {
        return this.yc.isCompleted() && this.yd.isCompleted();
    }

    public final void jI() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markWatchVideoCompleted");
        this.yb.jA();
        jK();
    }

    public final boolean jJ() {
        return this.yb.isCompleted();
    }

    public final void jL() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markInstallCompleted");
        this.yc.jA();
        jK();
    }

    public final void jN() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markUseAppCompleted");
        this.yd.jA();
        jK();
    }

    public final boolean jO() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "isInstallCompleted");
        return this.yc.isCompleted();
    }

    @Override // com.kwad.components.ad.reward.k.a
    public final List<com.kwad.components.ad.reward.k.c> jy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.yb);
        arrayList.add(this.yd);
        return arrayList;
    }

    @Override // com.kwad.components.ad.reward.k.a
    public final int jz() {
        int i = 0;
        for (com.kwad.components.ad.reward.k.c cVar : jy()) {
            if (!cVar.isCompleted()) {
                i++;
            }
        }
        return i;
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        try {
            this.yb.parseJson(jSONObject.optJSONObject("mWatchVideoTask"));
            this.yd.parseJson(jSONObject.optJSONObject("mUseAppTask"));
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.a(jSONObject, "mWatchVideoTask", this.yb);
        t.a(jSONObject, "mInstallAppTask", this.yc);
        t.a(jSONObject, "mUseAppTask", this.yd);
        return jSONObject;
    }
}
