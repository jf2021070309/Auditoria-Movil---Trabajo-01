package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0118l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0117k implements com.ironsource.mediationsdk.sdk.a {
    private C0118l a;
    private IronSourceBannerLayout b;
    private com.ironsource.mediationsdk.model.g c;
    private String f;
    private String g;
    private long i;
    private Timer j;
    private com.ironsource.mediationsdk.utils.f m;
    private com.ironsource.mediationsdk.utils.f n;
    private int o;
    private int p;
    private final CopyOnWriteArrayList<C0118l> h = new CopyOnWriteArrayList<>();
    private IronSourceLoggerManager e = IronSourceLoggerManager.getLogger();
    private a d = a.NOT_INITIATED;
    private AtomicBoolean l = new AtomicBoolean();
    private AtomicBoolean k = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.k$a */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C0117k(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.i = i;
        C0116j.a().a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a2 = C0110d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a2 == null || !C0111e.a().a(a2)) {
                a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.h.add(new C0118l(this, networkSettings, a2, j, i3 + 1));
            }
        }
        this.c = null;
        a(a.READY_TO_LOAD);
    }

    private void a(int i) {
        a(i, (Object[][]) null);
    }

    private void a(int i, C0118l c0118l) {
        a(i, c0118l, (Object[][]) null);
    }

    private void a(int i, C0118l c0118l, Object[][] objArr) {
        a(i, c0118l, objArr, this.p);
    }

    private void a(int i, C0118l c0118l, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(c0118l);
        try {
            if (this.b != null) {
                a(providerAdditionalData, this.b.getSize());
            }
            if (this.c != null) {
                providerAdditionalData.put("placement", this.c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, providerAdditionalData));
    }

    private void a(int i, Object[][] objArr) {
        a(i, objArr, this.p);
    }

    private void a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.b != null) {
                a(mediationAdditionalData, this.b.getSize());
            }
            if (this.c != null) {
                mediationAdditionalData.put("placement", this.c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, mediationAdditionalData));
    }

    private void a(a aVar) {
        this.d = aVar;
        a("state=" + aVar.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.ironsource.mediationsdk.C0117k r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0117k.a(com.ironsource.mediationsdk.k):void");
    }

    private void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    private void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c != 4) {
            } else {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    private boolean a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private void b() {
        Iterator<C0118l> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().d = true;
        }
    }

    private void b(C0118l c0118l, View view, FrameLayout.LayoutParams layoutParams) {
        this.a = c0118l;
        this.b.a(view, layoutParams);
    }

    private void b(C0118l c0118l, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + c0118l.a());
        a(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        this.o = com.ironsource.mediationsdk.utils.n.a().b(3);
        com.ironsource.mediationsdk.utils.n.a().a(3);
        if (z) {
            b(c0118l, view, layoutParams);
        }
        d();
    }

    private boolean c() {
        Iterator<C0118l> it = this.h.iterator();
        while (it.hasNext()) {
            C0118l next = it.next();
            if (next.d && this.a != next) {
                a(this.d == a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.n = new com.ironsource.mediationsdk.utils.f();
                next.a(this.b.a(), this.f, this.g);
                return true;
            }
        }
        return false;
    }

    private void d() {
        try {
            e();
            if (this.i > 0) {
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.k.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C0117k.a(C0117k.this);
                    }
                }, this.i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e() {
        Timer timer = this.j;
        if (timer != null) {
            timer.cancel();
            this.j = null;
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            a(IronSourceConstants.BN_DESTROY, (Object[][]) null, this.o);
            e();
            if (this.a != null) {
                a(IronSourceConstants.BN_INSTANCE_DESTROY, this.a, (Object[][]) null);
                C0118l c0118l = this.a;
                c0118l.a("destroyBanner()");
                if (c0118l.a == null) {
                    c0118l.a("destroyBanner() mAdapter == null");
                } else {
                    c0118l.a.destroyBanner(c0118l.b.getBannerSettings());
                    c0118l.a(C0118l.a.DESTROYED);
                }
                this.a = null;
            }
            ironSourceBannerLayout.b();
            this.b = null;
            this.c = null;
            a(a.READY_TO_LOAD);
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.g gVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (gVar != null && !TextUtils.isEmpty(gVar.getPlacementName())) {
                        if (this.d == a.READY_TO_LOAD && !C0116j.a().b()) {
                            this.p = com.ironsource.mediationsdk.utils.n.a().b(3);
                            a(a.FIRST_LOAD_IN_PROGRESS);
                            this.b = ironSourceBannerLayout;
                            this.c = gVar;
                            a(3001, (Object[][]) null);
                            if (com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                                C0116j a2 = C0116j.a();
                                a2.a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + gVar.getPlacementName() + " is capped"));
                                a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                                a(a.READY_TO_LOAD);
                                return;
                            }
                            this.m = new com.ironsource.mediationsdk.utils.f();
                            Iterator<C0118l> it = this.h.iterator();
                            while (it.hasNext()) {
                                it.next().d = true;
                            }
                            this.n = new com.ironsource.mediationsdk.utils.f();
                            C0118l c0118l = this.h.get(0);
                            a(3002, c0118l, (Object[][]) null);
                            c0118l.a(ironSourceBannerLayout.a(), this.f, this.g);
                            return;
                        }
                        this.e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                        return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = gVar == null ? "placement is null" : "placement name is empty";
                    this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C0116j a3 = C0116j.a();
                a3.a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e.getMessage()));
                a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                a(a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C0118l c0118l) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (a()) {
            this.b.c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.o);
        a(IronSourceConstants.BN_INSTANCE_CLICK, c0118l, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C0118l c0118l, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (this.d != a.FIRST_LOAD_IN_PROGRESS) {
            if (this.d != a.LOAD_IN_PROGRESS) {
                a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, c0118l, (Object[][]) null);
                return;
            }
            a(a.RELOAD_IN_PROGRESS);
            b(c0118l, view, layoutParams, true);
            return;
        }
        a(3005, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        b(c0118l, view, layoutParams);
        com.ironsource.mediationsdk.model.g gVar = this.c;
        String placementName = gVar != null ? gVar.getPlacementName() : "";
        com.ironsource.mediationsdk.utils.c.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
        if (com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
            a(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
        }
        a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        this.b.a(c0118l.a());
        this.o = com.ironsource.mediationsdk.utils.n.a().b(3);
        com.ironsource.mediationsdk.utils.n.a().a(3);
        a(a.RELOAD_IN_PROGRESS);
        d();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C0118l c0118l, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (this.d == a.RELOAD_IN_PROGRESS) {
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            b(c0118l, view, layoutParams, z);
            return;
        }
        a("onBannerAdReloaded " + c0118l.a() + " wrong state=" + this.d.name());
        a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, c0118l, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(IronSourceError ironSourceError, C0118l c0118l, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c0118l.a());
        if (this.d != a.FIRST_LOAD_IN_PROGRESS && this.d != a.LOAD_IN_PROGRESS) {
            a("onBannerAdLoadFailed " + c0118l.a() + " wrong state=" + this.d.name());
            return;
        }
        if (z) {
            a(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        }
        if (c()) {
            return;
        }
        if (this.d == a.FIRST_LOAD_IN_PROGRESS) {
            C0116j.a().a(this.b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"));
            a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            a(a.READY_TO_LOAD);
            return;
        }
        a(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        a(a.RELOAD_IN_PROGRESS);
        d();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(C0118l c0118l) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (a()) {
            this.b.e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.o);
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c0118l, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(IronSourceError ironSourceError, C0118l c0118l, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c0118l.a());
        if (this.d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloadFailed " + c0118l.a() + " wrong state=" + this.d.name());
            return;
        }
        if (z) {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, c0118l, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        }
        if (this.h.size() == 1) {
            a(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            d();
            return;
        }
        a(a.LOAD_IN_PROGRESS);
        b();
        c();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void c(C0118l c0118l) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (a()) {
            this.b.d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.o);
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c0118l, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void d(C0118l c0118l) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        if (a()) {
            this.b.f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.o);
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, c0118l, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void e(C0118l c0118l) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c0118l.a());
        a(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        a(IronSourceConstants.BN_INSTANCE_SHOW, c0118l, (Object[][]) null);
    }
}
