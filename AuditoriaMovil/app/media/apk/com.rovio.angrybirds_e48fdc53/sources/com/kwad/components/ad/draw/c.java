package com.kwad.components.ad.draw;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.core.AbstractKsDrawAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c extends AbstractKsDrawAd implements com.kwad.components.core.internal.api.a {
    private KsDrawAd.AdInteractionListener bD;
    private b bO;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.internal.api.c bP = new com.kwad.components.core.internal.api.c();
    private final com.kwad.sdk.core.h.b bJ = new com.kwad.sdk.core.h.b() { // from class: com.kwad.components.ad.draw.c.1
        @Override // com.kwad.sdk.core.h.b
        public final void af() {
            c.this.bP.h(c.this);
        }

        @Override // com.kwad.sdk.core.h.b
        public final void ag() {
            c.this.bP.i(c.this);
        }
    };
    private final KsDrawAd.AdInteractionListener bQ = new KsDrawAd.AdInteractionListener() { // from class: com.kwad.components.ad.draw.c.2
        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onAdClicked() {
            if (c.this.bD != null) {
                c.this.bD.onAdClicked();
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onAdShow() {
            if (c.this.bD != null) {
                c.this.bD.onAdShow();
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onVideoPlayEnd() {
            if (c.this.bD != null) {
                try {
                    c.this.bD.onVideoPlayEnd();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onVideoPlayError() {
            if (c.this.bD != null) {
                try {
                    c.this.bD.onVideoPlayError();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onVideoPlayPause() {
            if (c.this.bD != null) {
                try {
                    c.this.bD.onVideoPlayPause();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onVideoPlayResume() {
            if (c.this.bD != null) {
                try {
                    c.this.bD.onVideoPlayResume();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public final void onVideoPlayStart() {
            if (c.this.bD != null) {
                try {
                    c.this.bD.onVideoPlayStart();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }
    };

    public c(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        KSImageLoader.preloadImage(com.kwad.sdk.core.response.b.a.bi(com.kwad.sdk.core.response.b.d.ck(adTemplate)).getUrl(), this.mAdTemplate);
        com.kwad.components.ad.h.b.fc().a(this);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b bVar) {
        this.bP.a(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean ae() {
        return true;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b bVar) {
        this.bP.b(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.core.AbstractKsDrawAd
    public final View getDrawView2(Context context) {
        if (context == null || !KsAdSDKImpl.get().hasInitFinish()) {
            return null;
        }
        try {
            context = l.wrapContextIfNeed(context);
            com.kwad.sdk.i.a.ae(GMAdConstant.RIT_TYPE_DRAW, TTLogUtil.TAG_EVENT_SHOW);
            if (this.bO == null) {
                b bVar = new b(context);
                this.bO = bVar;
                bVar.setPageExitListener(this.bJ);
                this.bO.setAdInteractionListener(this.bD);
                this.bO.a(this.mAdTemplate);
            } else {
                com.kwad.sdk.core.e.c.i("KSDrawAdControl", "mDrawVideoView is not null");
            }
            com.kwad.sdk.i.a.af(GMAdConstant.RIT_TYPE_DRAW, TTLogUtil.TAG_EVENT_SHOW);
        } catch (Throwable th) {
            if (!KsAdSDKImpl.get().getIsExternal()) {
                throw th;
            }
            RuntimeException runtimeException = new RuntimeException("context:" + context.getClass().getName() + "--classloader:" + context.getClass().getClassLoader());
            if (Build.VERSION.SDK_INT >= 19) {
                runtimeException.addSuppressed(th);
            }
            com.kwad.components.core.d.a.b(runtimeException);
        }
        return this.bO;
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getECPM() {
        return com.kwad.sdk.core.response.b.a.aJ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aI(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.aW(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.zs()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setAdInteractionListener(KsDrawAd.AdInteractionListener adInteractionListener) {
        this.bD = adInteractionListener;
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setBidEcpm(int i) {
        setBidEcpm(i, -1L);
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setBidEcpm(long j, long j2) {
        this.mAdTemplate.mBidEcpm = j;
        com.kwad.sdk.core.report.a.j(this.mAdTemplate, j2);
    }
}
