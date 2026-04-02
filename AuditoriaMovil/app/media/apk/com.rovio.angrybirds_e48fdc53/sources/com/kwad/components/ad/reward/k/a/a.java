package com.kwad.components.ad.reward.k.a;

import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.k.a {
    private b xZ = new b();
    private final C0168a ya = new C0168a(d.zB());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.k.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0168a extends com.kwad.components.ad.reward.k.b {
        public C0168a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            this.xX = String.format("进阶奖励：浏览详情页 %ss", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            this.xY = String.format("进阶奖励：浏览详情页 %ss", sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends com.kwad.components.ad.reward.k.b {
        public b() {
            this.xX = "基础奖励：观看视频";
            this.xY = "基础奖励：需再观看%ss视频";
        }
    }

    private void jK() {
        if (this.ya.isCompleted()) {
            jA();
        } else {
            jB();
        }
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.ad.reward.k.c
    public final boolean isCompleted() {
        return this.ya.isCompleted();
    }

    public final void jI() {
        c.d("LandPageOpenTask", "markWatchVideoCompleted");
        this.xZ.jA();
        jK();
    }

    public final boolean jJ() {
        return this.xZ.isCompleted();
    }

    @Override // com.kwad.components.ad.reward.k.a
    public final List<com.kwad.components.ad.reward.k.c> jy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.xZ);
        arrayList.add(this.ya);
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

    public final void markOpenNsCompleted() {
        c.d("LandPageOpenTask", "markOpenNsCompleted");
        this.ya.jA();
        jK();
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.sdk.core.b
    public final void parseJson(JSONObject jSONObject) {
        try {
            this.xZ.parseJson(jSONObject.optJSONObject("mWatchVideoTask"));
            this.ya.parseJson(jSONObject.optJSONObject("mOpenNsTask"));
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.ad.reward.k.b, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.a(jSONObject, "mWatchVideoTask", this.xZ);
        t.a(jSONObject, "mOpenNsTask", this.ya);
        return jSONObject;
    }
}
