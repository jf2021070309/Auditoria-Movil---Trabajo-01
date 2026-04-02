package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
/* loaded from: classes.dex */
public class k {
    private final StringBuilder a = new StringBuilder();

    public k a() {
        this.a.append("\n========================================");
        return this;
    }

    public k a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }

    public k a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", p.b(appLovinAdView.getVisibility()));
    }

    public k a(com.applovin.impl.mediation.a.a aVar) {
        return a("Network", aVar.Q()).a("Format", aVar.getFormat().getLabel()).a("Ad Unit ID", aVar.getAdUnitId()).a("Placement", aVar.getPlacement()).a("Network Placement", aVar.m()).a("Serve ID", aVar.f()).a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : "None").a("Server Parameters", aVar.X());
    }

    public k a(com.applovin.impl.sdk.ad.e eVar) {
        boolean z = eVar instanceof com.applovin.impl.a.a;
        a("Format", eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null).a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).a("Zone ID", eVar.getAdZone().a()).a("Source", eVar.getSource()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((com.applovin.impl.a.a) eVar).l());
        }
        return this;
    }

    public k a(com.applovin.impl.sdk.m mVar) {
        return a("Muted", Boolean.valueOf(mVar.p().isMuted())).a("ExoPlayer", Boolean.valueOf(Utils.checkExoPlayerEligibility(mVar)));
    }

    public k a(String str) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public k a(String str, Object obj) {
        return a(str, obj, "");
    }

    public k a(String str, Object obj, String str2) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public k b(com.applovin.impl.sdk.ad.e eVar) {
        a("Target", eVar.n()).a("close_style", eVar.s()).a("close_delay_graphic", Long.valueOf(eVar.q()), "s");
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
            a("HTML", aVar.b().substring(0, Math.min(aVar.b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(eVar.o()), "s").a("skip_style", eVar.u()).a("Streaming", Boolean.valueOf(eVar.e())).a("Video Location", eVar.c()).a("video_button_properties", eVar.A());
        }
        return this;
    }

    public k b(String str) {
        this.a.append(str);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }
}
