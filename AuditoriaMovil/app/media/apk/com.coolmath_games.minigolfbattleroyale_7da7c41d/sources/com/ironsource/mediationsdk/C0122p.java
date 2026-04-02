package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0122p implements com.ironsource.mediationsdk.sdk.b {
    C0123q a;
    IronSourceBannerLayout b;
    ConcurrentHashMap<String, C0123q> c = new ConcurrentHashMap<>();
    private C0123q d;

    public C0122p(List<NetworkSettings> list, com.ironsource.mediationsdk.model.f fVar, String str, String str2) {
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C0110d.a().a(networkSettings, networkSettings.getBannerSettings(), true, false);
                if (a != null) {
                    this.c.put(networkSettings.getSubProviderId(), new C0123q(str, str2, networkSettings, this, (int) fVar.b, a));
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, C0123q c0123q, Object[][] objArr) {
        Map<String, Object> c = c0123q.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(c)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(hashMap)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, C0123q c0123q) {
        a(i, c0123q, (Object[][]) null);
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose("demand only banner manager : destroyBanner");
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("destroyBanner banner cannot be null");
        } else if (ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API");
        } else {
            ironSourceBannerLayout.b();
            this.b = null;
            if (this.d != null) {
                IronLog.INTERNAL.verbose("demand only banner manager : destroyBanner | mActiveSmash != null ");
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.d, (Object[][]) null);
                this.d.a();
                this.d = null;
                return;
            }
            if (this.a != null) {
                IronLog.INTERNAL.verbose("demand only banner manager : destroyBanner | mLoadingSmash != null ");
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.a, (Object[][]) null);
                this.a.a();
                this.a = null;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void a(IronSourceError ironSourceError, C0123q c0123q, boolean z, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + c0123q.b());
        if (z) {
            a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c0123q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c0123q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        this.b.a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void a(C0123q c0123q) {
        IronLog.INTERNAL.verbose(c0123q.b());
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, c0123q, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.c();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void a(C0123q c0123q, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + c0123q.b());
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c0123q);
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = this.b;
        if (ironSourceBannerLayout2 != null) {
            ironSourceBannerLayout2.a(view, layoutParams);
        }
        this.d = c0123q;
        int b = com.ironsource.mediationsdk.utils.n.a().b(3);
        a(3005, c0123q, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, c0123q, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        com.ironsource.mediationsdk.utils.n.a().a(3);
        if (c0123q.i()) {
            for (String str : c0123q.g) {
                C0112f.a();
                String a = C0112f.a(str, c0123q.d(), c0123q.e(), c0123q.h, "", "", "", "");
                C0112f.a();
                C0112f.a("onBannerAdLoaded", c0123q.d(), a);
            }
        }
        IronSourceBannerLayout ironSourceBannerLayout3 = this.b;
        if (ironSourceBannerLayout3 != null) {
            ironSourceBannerLayout3.a(String.format("%s %s", c0123q.b(), Integer.valueOf(c0123q.hashCode())));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void b(C0123q c0123q) {
        IronLog.INTERNAL.verbose(c0123q.b());
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c0123q, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.e();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void c(C0123q c0123q) {
        IronLog.INTERNAL.verbose(c0123q.b());
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c0123q, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.d();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void d(C0123q c0123q) {
        IronLog.INTERNAL.verbose(c0123q.b());
        a((int) IronSourceConstants.BN_INSTANCE_LEFT_APPLICATION, c0123q, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.f();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.b
    public final void e(C0123q c0123q) {
        IronLog.INTERNAL.verbose(c0123q.b());
        a((int) IronSourceConstants.BN_INSTANCE_SHOW, c0123q, (Object[][]) null);
        a((int) IronSourceConstants.BN_CALLBACK_SHOW, "");
    }
}
