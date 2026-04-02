package com.kwad.components.ad.interstitial.aggregate;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends PagerAdapter {
    private final KsAdVideoPlayConfig dJ;
    private final KsInterstitialAd.AdInteractionListener hB;
    private final com.kwad.components.ad.interstitial.d hI;
    private final boolean hJ;
    private b hK;
    private InterfaceC0152a hL;
    private final List<AdTemplate> mAdTemplateList = new ArrayList();

    /* renamed from: com.kwad.components.ad.interstitial.aggregate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0152a {
        void cm();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.kwad.components.ad.interstitial.f.c cVar, int i);
    }

    public a(AdTemplate adTemplate, com.kwad.components.ad.interstitial.d dVar, KsAdVideoPlayConfig ksAdVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener) {
        this.hI = dVar;
        this.dJ = ksAdVideoPlayConfig;
        this.hB = adInteractionListener;
        this.hJ = com.kwad.sdk.core.response.b.a.cd(com.kwad.sdk.core.response.b.d.ck(adTemplate)) == 1;
    }

    public final void a(InterfaceC0152a interfaceC0152a) {
        this.hL = interfaceC0152a;
    }

    public final void a(b bVar) {
        this.hK = bVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public final int getCount() {
        return this.mAdTemplateList.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        com.kwad.components.ad.interstitial.f.c cVar = new com.kwad.components.ad.interstitial.f.c(viewGroup.getContext());
        viewGroup.addView(cVar);
        cVar.setAggregateAdView(i > 0);
        if (i == 0) {
            cVar.setAdConvertListener(new c.a() { // from class: com.kwad.components.ad.interstitial.aggregate.a.1
                @Override // com.kwad.components.ad.interstitial.d.c.a
                public final void cl() {
                    if (a.this.hL != null) {
                        a.this.hL.cm();
                    }
                }
            });
        }
        if (i > 0) {
            int i2 = 7;
            if (i == 1 && this.hJ) {
                i2 = 8;
            }
            cVar.setAggregateShowTriggerType(i2);
        }
        cVar.a(this.mAdTemplateList.get(i), this.hI, this.dJ, this.hB);
        b bVar = this.hK;
        if (bVar != null) {
            bVar.a(cVar, i);
        }
        return cVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void setAdTemplateList(List<AdTemplate> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mAdTemplateList.clear();
        this.mAdTemplateList.addAll(list);
    }
}
