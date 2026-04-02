package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
/* loaded from: classes.dex */
public class j {
    private final StringBuilder a = new StringBuilder();

    public j a() {
        this.a.append("\n========================================");
        return this;
    }

    public j a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", o.b(appLovinAdView.getVisibility()));
    }

    public j a(com.applovin.impl.mediation.a.a aVar) {
        return a("Network", aVar.L()).a("Format", aVar.getFormat().getLabel()).a("Ad Unit ID", aVar.getAdUnitId()).a("Placement", aVar.getPlacement()).a("Network Placement", aVar.j()).a("Serve ID", aVar.e()).a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : "None").a("Server Parameters", aVar.R());
    }

    public j a(com.applovin.impl.sdk.a.g gVar) {
        boolean z = gVar instanceof com.applovin.impl.a.a;
        a("Format", gVar.getAdZone().b() != null ? gVar.getAdZone().b().getLabel() : null).a("Ad ID", Long.valueOf(gVar.getAdIdNumber())).a("Zone ID", gVar.getAdZone().a()).a("Source", gVar.getSource()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String r = gVar.r();
        if (StringUtils.isValidString(r)) {
            a("DSP Name", r);
        }
        if (z) {
            a("VAST DSP", ((com.applovin.impl.a.a) gVar).i());
        }
        return this;
    }

    public j a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.p().isMuted())).a("ExoPlayer", Boolean.valueOf(Utils.checkExoPlayerEligibility(kVar)));
    }

    public j a(String str) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public j a(String str, Object obj) {
        return a(str, obj, "");
    }

    public j a(String str, Object obj, String str2) {
        StringBuilder sb = this.a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public j b(com.applovin.impl.sdk.a.g gVar) {
        a("Target", gVar.q()).a("close_style", gVar.v()).a("close_delay_graphic", Long.valueOf(gVar.u()), "s");
        if (gVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(gVar.s()), "s").a("skip_style", gVar.w()).a("Streaming", Boolean.valueOf(gVar.f())).a("Video Location", gVar.d()).a("video_button_properties", gVar.C());
        }
        return this;
    }

    public j b(String str) {
        this.a.append(str);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }
}
