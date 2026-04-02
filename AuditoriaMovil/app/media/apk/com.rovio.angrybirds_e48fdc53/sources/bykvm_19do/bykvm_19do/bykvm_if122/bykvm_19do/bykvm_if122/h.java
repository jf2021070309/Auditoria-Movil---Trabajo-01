package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdLoadCallback;
import com.bytedance.msdk.api.v2.ad.banner.GMNativeToBannerListener;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.msdk.core.views.RefreshableBannerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class h {
    private int a = 0;
    private final Activity b;
    private final String c;
    private AdSlot d;
    private GMAdSlotBase e;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c f;
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c g;
    private RefreshableBannerView h;
    private final Handler i;
    private final Handler j;
    private GMBannerAdListener k;
    private GMNativeToBannerListener l;
    private final View.OnAttachStateChangeListener m;
    private final GMBannerAdListener n;
    private final Runnable o;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (h.this.a == 0) {
                return;
            }
            h.this.s();
            h.this.t();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            h.this.r();
        }
    }

    /* loaded from: classes.dex */
    class b implements GMBannerAdListener {
        b() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdClicked() {
            if (h.this.k != null) {
                h.this.k.onAdClicked();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdClosed() {
            h.this.r();
            if (h.this.k != null) {
                h.this.k.onAdClosed();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdLeftApplication() {
            if (h.this.k != null) {
                h.this.k.onAdLeftApplication();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdOpened() {
            if (h.this.k != null) {
                h.this.k.onAdOpened();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdShow() {
            if (h.this.k != null) {
                h.this.k.onAdShow();
            }
        }

        @Override // com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener
        public void onAdShowFail(AdError adError) {
            if (h.this.k != null) {
                h.this.k.onAdShowFail(adError);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.h$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0041a implements Runnable {
                RunnableC0041a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (h.this.f != null) {
                        h.this.f.D();
                    }
                    h hVar = h.this;
                    hVar.f = hVar.g;
                    h.this.s();
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (h.this.a == 0 || h.this.g == null) {
                    return;
                }
                View g0 = h.this.g.g0();
                if (g0 != null) {
                    if (h.this.h != null) {
                        h.this.h.a(g0);
                    }
                    h.this.j.postDelayed(new RunnableC0041a(), 250L);
                } else {
                    if (h.this.g != null) {
                        h.this.g.D();
                    }
                    h.this.s();
                }
                h.this.t();
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.j.post(new a());
        }
    }

    /* loaded from: classes.dex */
    class d implements RefreshableBannerView.c {
        d() {
        }

        @Override // com.bytedance.msdk.core.views.RefreshableBannerView.c
        public void a(boolean z) {
            if (!z) {
                h.this.r();
            } else if (h.this.a == 0) {
            } else {
                h.this.t();
            }
        }
    }

    public h(Activity activity, String str) {
        a aVar = new a();
        this.m = aVar;
        this.n = new b();
        this.o = new c();
        this.b = activity;
        this.c = str;
        this.f = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c(activity, str);
        if (activity != null) {
            RefreshableBannerView refreshableBannerView = new RefreshableBannerView(activity);
            this.h = refreshableBannerView;
            refreshableBannerView.addOnAttachStateChangeListener(aVar);
            this.h.setVisibilityChangeListener(new d());
        }
        this.i = new Handler(ThreadHelper.getMSDKThreadLooper());
        this.j = new Handler(Looper.getMainLooper());
        a(this.f);
    }

    private void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar) {
        String str;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c h0 = cVar.h0();
        if (h0 != null) {
            int r = h0.r();
            if (r < 10000 || r > 180000) {
                str = "---==-----banner轮播时间下发不在10*1000～180*1000范围内：" + r + "，禁止banner轮播";
            } else {
                this.a = r;
                str = "---==-----banner轮播时间：" + this.a;
            }
            Logger.d("TMe", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.i.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c(this.b, this.c);
        this.g = cVar;
        cVar.a(this.n);
        this.g.a(this.l);
        a(this.g);
        this.g.a(this.d, this.e, (GMBannerAdLoadCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.i.removeCallbacksAndMessages(null);
        this.i.postDelayed(this.o, this.a);
    }

    public void a() {
        this.j.removeCallbacksAndMessages(null);
        r();
        RefreshableBannerView refreshableBannerView = this.h;
        if (refreshableBannerView != null) {
            refreshableBannerView.removeOnAttachStateChangeListener(this.m);
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.D();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.D();
        }
    }

    public void a(AdSlot adSlot, GMAdSlotBase gMAdSlotBase, GMBannerAdLoadCallback gMBannerAdLoadCallback) {
        this.d = adSlot;
        this.e = gMAdSlotBase;
        this.f.a(adSlot, gMAdSlotBase, gMBannerAdLoadCallback);
    }

    public void a(GMBannerAdListener gMBannerAdListener) {
        this.k = gMBannerAdListener;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.a(this.n);
        }
    }

    public void a(GMNativeToBannerListener gMNativeToBannerListener) {
        this.l = gMNativeToBannerListener;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.a(gMNativeToBannerListener);
        }
    }

    public void a(boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public List<AdLoadInfo> b() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        return cVar != null ? cVar.E() : new ArrayList();
    }

    public int c() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.G();
        }
        return -2;
    }

    public String d() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.H();
        }
        return null;
    }

    public View e() {
        RefreshableBannerView refreshableBannerView;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.b((TTBaseAd) null);
            View g0 = this.f.g0();
            if (g0 == null || (refreshableBannerView = this.h) == null) {
                return null;
            }
            refreshableBannerView.removeAllViews();
            ViewParent parent = g0.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(g0);
            }
            this.h.addView(g0);
            return this.h;
        }
        return null;
    }

    public GMAdEcpmInfo f() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public List<GMAdEcpmInfo> g() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public Map<String, Object> h() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        return cVar != null ? cVar.I() : new HashMap();
    }

    public List<GMAdEcpmInfo> i() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.f();
        }
        return null;
    }

    public String j() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.J();
        }
        return null;
    }

    public int k() {
        return this.a;
    }

    public GMAdEcpmInfo l() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.L();
        }
        return null;
    }

    public String m() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.l();
        }
        return null;
    }

    public boolean n() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.i0();
            return false;
        }
        return false;
    }

    public boolean o() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            return cVar.j0();
        }
        return false;
    }

    public void p() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.k0();
        }
    }

    public void q() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = this.f;
        if (cVar != null) {
            cVar.l0();
        }
    }
}
