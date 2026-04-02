package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y extends AbstractC0107a implements com.ironsource.environment.k, InterfaceC0109c, com.ironsource.mediationsdk.sdk.m, com.ironsource.mediationsdk.utils.d {
    com.ironsource.mediationsdk.sdk.j m;
    int o;
    C0129w p;
    private NetworkStateReceiver s;
    private Placement t;
    private final String q = getClass().getSimpleName();
    private Timer u = null;
    private boolean r = false;
    boolean n = false;
    private boolean y = false;
    private boolean w = false;
    private long x = new Date().getTime();
    private List<AbstractC0108b.a> v = Arrays.asList(AbstractC0108b.a.INIT_FAILED, AbstractC0108b.a.CAPPED_PER_SESSION, AbstractC0108b.a.EXHAUSTED, AbstractC0108b.a.CAPPED_PER_DAY);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y() {
        this.a = new com.ironsource.mediationsdk.utils.e("rewarded_video", this);
    }

    private void a(int i) {
        a(i, (Object[][]) null);
    }

    private void a(int i, AbstractC0108b abstractC0108b, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC0108b);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, providerAdditionalData));
    }

    private void a(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, mediationAdditionalData));
    }

    private synchronized void a(AbstractC0108b abstractC0108b, int i) {
        com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.t);
        if (com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getCurrentActiveActivity(), p())) {
            a(IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", p()}});
        }
        this.a.a(abstractC0108b);
        if (this.t != null) {
            if (this.n) {
                a(((Z) abstractC0108b).v, true, this.t.getPlacementId());
                int placementId = this.t.getPlacementId();
                for (int i2 = 0; i2 < i && i2 < this.c.size(); i2++) {
                    if (!this.v.contains(this.c.get(i2).a)) {
                        a(((Z) this.c.get(i2)).v, false, placementId);
                    }
                }
            }
            String p = p();
            a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC0108b, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "true"}});
            for (int i3 = 0; i3 < this.c.size() && i3 < i; i3++) {
                AbstractC0108b abstractC0108b2 = this.c.get(i3);
                if (abstractC0108b2.a == AbstractC0108b.a.NOT_AVAILABLE || abstractC0108b2.a == AbstractC0108b.a.NEEDS_RELOAD) {
                    a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC0108b2, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "false"}});
                }
            }
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        a(IronSourceConstants.RV_INSTANCE_SHOW, abstractC0108b, this.t != null ? new Object[][]{new Object[]{"placement", p()}} : null);
        this.y = true;
        this.p.a();
        ((Z) abstractC0108b).w = com.ironsource.mediationsdk.utils.n.a().b(1);
        Z z = (Z) abstractC0108b;
        if (z.b != null) {
            z.q.log(IronSourceLogger.IronSourceTag.INTERNAL, z.d + ":showRewardedVideo()", 1);
            z.d();
            z.b.showRewardedVideo(z.r, z);
        }
    }

    private synchronized void a(String str, final boolean z, final int i) {
        final String str2;
        try {
            str2 = ("" + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable() { // from class: com.ironsource.mediationsdk.server.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str3 = str2;
                    boolean z2 = z;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str3, z2, i)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str3 + ", hit:" + z2 + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str3 == null) {
                            sb.append("null");
                        } else {
                            sb.append(str3);
                        }
                        sb.append(", hit:");
                        sb.append(z2);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
            thread.start();
        } catch (Throwable th) {
            this.h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    private synchronized void a(Map<String, Object> map) {
        if (this.d != null && !this.k) {
            this.k = true;
            if (h((Z) this.d) == null) {
                this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
            }
            return;
        }
        if (!k()) {
            this.m.a(this.j.booleanValue(), map);
        } else if (a(true, false)) {
            this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
        }
    }

    private synchronized boolean a(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        if (this.j == null) {
            d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!k() && h()) {
                bool = Boolean.FALSE;
            }
            this.j = bool;
            z3 = true;
        } else {
            if (z && !this.j.booleanValue()) {
                bool = Boolean.TRUE;
            } else if (!z && this.j.booleanValue() && ((!j() || z2) && !k())) {
                bool = Boolean.FALSE;
            }
            this.j = bool;
            z3 = true;
        }
        return z3;
    }

    private void b(boolean z) {
        if (!z && c()) {
            a(1000, (Object[][]) null);
            a(1003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            this.w = false;
        } else if (i()) {
            a(1000, (Object[][]) null);
            this.w = true;
            this.x = new Date().getTime();
        }
    }

    private AbstractAdapter f() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.c.size() && abstractAdapter == null; i2++) {
            if (this.c.get(i2).a == AbstractC0108b.a.AVAILABLE || this.c.get(i2).a == AbstractC0108b.a.INITIATED) {
                i++;
                if (i >= this.b) {
                    break;
                }
            } else if (this.c.get(i2).a == AbstractC0108b.a.NOT_INITIATED && (abstractAdapter = h((Z) this.c.get(i2))) == null) {
                this.c.get(i2).a(AbstractC0108b.a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    private synchronized AbstractAdapter h(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.q + ":startAdapter(" + z.d + ")", 1);
        AbstractAdapter a = C0110d.a().a(z.c, z.c.getRewardedVideoSettings(), false, false);
        if (a == null) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.log(ironSourceTag2, z.d + " is configured in IronSource's platform, but the adapter is not integrated", 2);
            return null;
        }
        z.b = a;
        z.a(AbstractC0108b.a.INITIATED);
        b((AbstractC0108b) z);
        a(1001, z, (Object[][]) null);
        String str = this.g;
        String str2 = this.f;
        z.h();
        if (z.b != null) {
            z.t.set(true);
            z.u = new Date().getTime();
            z.b.addRewardedVideoListener(z);
            IronSourceLoggerManager ironSourceLoggerManager3 = z.q;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager3.log(ironSourceTag3, z.d + ":initRewardedVideo()", 1);
            z.b.initRewardedVideo(str, str2, z.r, z);
        }
        return a;
    }

    private synchronized boolean h() {
        int i;
        Iterator<AbstractC0108b> it = this.c.iterator();
        i = 0;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.INIT_FAILED || next.a == AbstractC0108b.a.CAPPED_PER_DAY || next.a == AbstractC0108b.a.CAPPED_PER_SESSION || next.a == AbstractC0108b.a.NOT_AVAILABLE || next.a == AbstractC0108b.a.NEEDS_RELOAD || next.a == AbstractC0108b.a.EXHAUSTED) {
                i++;
            }
        }
        return this.c.size() == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[Catch: all -> 0x003c, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0007, B:6:0x000d, B:8:0x0019, B:10:0x001f, B:12:0x0025, B:14:0x002b, B:16:0x0031), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r4.c     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC0108b) r1     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.NOT_AVAILABLE     // Catch: java.lang.Throwable -> L3c
            if (r2 == r3) goto L37
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.NEEDS_RELOAD     // Catch: java.lang.Throwable -> L3c
            if (r2 == r3) goto L37
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.AVAILABLE     // Catch: java.lang.Throwable -> L3c
            if (r2 == r3) goto L37
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.INITIATED     // Catch: java.lang.Throwable -> L3c
            if (r2 == r3) goto L37
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.INIT_PENDING     // Catch: java.lang.Throwable -> L3c
            if (r2 == r3) goto L37
            com.ironsource.mediationsdk.b$a r1 = r1.a     // Catch: java.lang.Throwable -> L3c
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC0108b.a.LOAD_PENDING     // Catch: java.lang.Throwable -> L3c
            if (r1 != r2) goto L7
        L37:
            r0 = 1
        L38:
            monitor-exit(r4)
            return r0
        L3a:
            r0 = 0
            goto L38
        L3c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Y.i():boolean");
    }

    private synchronized boolean j() {
        boolean z;
        z = false;
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().a == AbstractC0108b.a.AVAILABLE) {
                z = true;
                break;
            }
        }
        return z;
    }

    private synchronized boolean k() {
        if (this.d != null) {
            return ((Z) this.d).o();
        }
        return false;
    }

    private synchronized void l() {
        if (f() != null) {
            return;
        }
        AbstractC0108b.a[] aVarArr = {AbstractC0108b.a.NOT_AVAILABLE, AbstractC0108b.a.NEEDS_RELOAD, AbstractC0108b.a.CAPPED_PER_SESSION, AbstractC0108b.a.CAPPED_PER_DAY};
        Iterator<AbstractC0108b> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            for (int i2 = 0; i2 < 4; i2++) {
                if (next.a == aVarArr[i2]) {
                    i++;
                }
            }
        }
        if (i < this.c.size()) {
            m();
            return;
        }
        if (a(false, false)) {
            a((Map<String, Object>) null);
        }
    }

    private synchronized void m() {
        if (n()) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator<AbstractC0108b> it = this.c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC0108b next = it.next();
                if (next.a == AbstractC0108b.a.EXHAUSTED) {
                    next.g();
                }
                if (next.a == AbstractC0108b.a.AVAILABLE) {
                    z = true;
                }
            }
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (a(z, false)) {
                this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0007, B:6:0x000d, B:8:0x0019, B:10:0x001f), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r4.c     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC0108b) r1     // Catch: java.lang.Throwable -> L2a
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L2a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.NOT_INITIATED     // Catch: java.lang.Throwable -> L2a
            if (r2 == r3) goto L25
            com.ironsource.mediationsdk.b$a r2 = r1.a     // Catch: java.lang.Throwable -> L2a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.INITIATED     // Catch: java.lang.Throwable -> L2a
            if (r2 == r3) goto L25
            com.ironsource.mediationsdk.b$a r1 = r1.a     // Catch: java.lang.Throwable -> L2a
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC0108b.a.AVAILABLE     // Catch: java.lang.Throwable -> L2a
            if (r1 != r2) goto L7
        L25:
            r0 = 0
        L26:
            monitor-exit(r4)
            return r0
        L28:
            r0 = 1
            goto L26
        L2a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Y.n():boolean");
    }

    private void o() {
        for (int i = 0; i < this.c.size(); i++) {
            String providerTypeForReflection = this.c.get(i).c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C0110d.a().a(this.c.get(i).c, this.c.get(i).c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    private String p() {
        Placement placement = this.t;
        return placement == null ? "" : placement.getPlacementName();
    }

    private void q() {
        Iterator<AbstractC0108b> it = this.c.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.AVAILABLE && next.l() != null && next.l().longValue() < j) {
                j = next.l().longValue();
            }
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            this.p.a(System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0107a
    public final void a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.q + " Should Track Network State: " + z, 0);
        try {
            this.i = z;
            if (this.i) {
                if (this.s == null) {
                    this.s = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.s != null) {
                context.getApplicationContext().unregisterReceiver(this.s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void a(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdOpened()", 1);
        a(1005, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        this.m.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void a(IronSourceError ironSourceError, Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.y = false;
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        b(false);
        this.m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Placement placement) {
        this.t = placement;
        this.m.f = placement.getPlacementName();
    }

    public final synchronized void a(String str) {
        this.h.log(IronSourceLogger.IronSourceTag.API, this.q + ":showRewardedVideo(placementName: " + str + ")", 1);
        this.m.f = str;
        a(IronSourceConstants.RV_API_SHOW_CALLED, new Object[][]{new Object[]{"placement", str}});
        if (this.y) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo error: can't show ad while an ad is already showing", 3);
            this.m.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"));
        } else if (this.i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo error: can't show ad when there's no internet connection", 3);
            this.m.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < this.c.size(); i++) {
                AbstractC0108b abstractC0108b = this.c.get(i);
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo, iterating on: " + abstractC0108b.d + ", Status: " + abstractC0108b.a, 0);
                if (abstractC0108b.a == AbstractC0108b.a.AVAILABLE) {
                    if (((Z) abstractC0108b).o()) {
                        a(abstractC0108b, i);
                        if (this.l && !abstractC0108b.equals(this.e)) {
                            b();
                        }
                        if (abstractC0108b.b()) {
                            abstractC0108b.a(AbstractC0108b.a.CAPPED_PER_SESSION);
                            a(IronSourceConstants.RV_CAP_SESSION, abstractC0108b, (Object[][]) null);
                            l();
                            return;
                        } else if (this.a.c(abstractC0108b)) {
                            abstractC0108b.a(AbstractC0108b.a.CAPPED_PER_DAY);
                            a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, abstractC0108b, new Object[][]{new Object[]{"status", "true"}});
                            l();
                            return;
                        } else {
                            if (abstractC0108b.a()) {
                                f();
                                m();
                            }
                            return;
                        }
                    }
                    if (abstractC0108b.m() != null) {
                        stringBuffer.append(abstractC0108b.d + CertificateUtil.DELIMITER + abstractC0108b.m() + ",");
                    }
                    a(false, (Z) abstractC0108b);
                    Exception exc = new Exception("FailedToShowVideoException");
                    this.h.logException(IronSourceLogger.IronSourceTag.INTERNAL, abstractC0108b.d + " Failed to show video", exc);
                }
            }
            if (k()) {
                a(this.d, this.c.size());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            this.m.a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), hashMap);
        }
    }

    public final synchronized void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.q + ":initRewardedVideo(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        this.g = str;
        this.f = str2;
        Iterator<AbstractC0108b> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (this.a.b(next)) {
                a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.a.c(next)) {
                next.a(AbstractC0108b.a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.c.size()) {
            this.m.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        a(1000);
        this.m.f = null;
        this.w = true;
        this.x = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
        o();
        for (int i2 = 0; i2 < this.b && i2 < this.c.size() && f() != null; i2++) {
        }
    }

    @Override // com.ironsource.environment.k
    public final void a(boolean z) {
        Boolean bool;
        if (this.i) {
            boolean z2 = false;
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (this.j != null) {
                if (z && !this.j.booleanValue() && j()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.j = bool;
                z2 = true;
            }
            if (z2) {
                this.r = !z;
                this.m.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final synchronized void a(boolean z, Z z2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z2.d + ": onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        if (this.r) {
            return;
        }
        if (z && this.w) {
            this.w = false;
            a(1003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.x)}});
            q();
        }
        if (z2.equals(this.d)) {
            if (a(z, false)) {
                this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
            }
            return;
        }
        if (z2.equals(this.e)) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, z2.d + " is a premium adapter, canShowPremium: " + a(), 1);
            if (!a()) {
                z2.a(AbstractC0108b.a.CAPPED_PER_SESSION);
                if (a(false, false)) {
                    this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
                }
                return;
            }
        }
        if (!this.a.c(z2)) {
            if (!z || !z2.c()) {
                if (a(false, false)) {
                    a((Map<String, Object>) null);
                }
                f();
                m();
            } else if (a(true, false)) {
                this.m.onRewardedVideoAvailabilityChanged(this.j.booleanValue());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC0107a
    protected final synchronized void b() {
        super.b();
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.equals(this.e)) {
                next.a(AbstractC0108b.a.CAPPED_PER_SESSION);
                f();
                return;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void b(Z z) {
        String str;
        AbstractC0108b next;
        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, z.d + ":onRewardedVideoAdClosed()", 1);
        this.y = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<AbstractC0108b> it = this.c.iterator();
            while (it.hasNext()) {
                if (((Z) it.next()).o()) {
                    sb.append(next.d + ";");
                }
            }
        } catch (Throwable unused) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "placement";
        objArr2[1] = p();
        objArr[0] = objArr2;
        Object[] objArr3 = new Object[2];
        objArr3[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + ((Object) sb);
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr3[1] = sb2.toString();
        objArr[1] = objArr3;
        Object[] objArr4 = new Object[2];
        objArr4[0] = IronSourceConstants.KEY_SESSION_DEPTH;
        objArr4[1] = Integer.valueOf(z.w);
        objArr[2] = objArr4;
        a(IronSourceConstants.RV_INSTANCE_CLOSED, z, objArr);
        com.ironsource.mediationsdk.utils.n.a().a(1);
        if (!z.b() && !this.a.c(z)) {
            a(1001, z, (Object[][]) null);
        }
        b(false);
        this.m.onRewardedVideoAdClosed();
        q();
        Iterator<AbstractC0108b> it2 = this.c.iterator();
        while (it2.hasNext()) {
            AbstractC0108b next2 = it2.next();
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch on ad closed, iterating on: " + next2.d + ", Status: " + next2.a, 0);
            if (next2.a == AbstractC0108b.a.NOT_AVAILABLE || next2.a == AbstractC0108b.a.NEEDS_RELOAD) {
                try {
                    if (!next2.d.equals(z.d)) {
                        this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, next2.d + ":reload smash", 1);
                        ((Z) next2).n();
                        a(1001, next2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.h.log(IronSourceLogger.IronSourceTag.NATIVE, next2.d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void c(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdStarted()", 1);
        a(IronSourceConstants.RV_INSTANCE_STARTED, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        this.m.onRewardedVideoAdStarted();
    }

    public final synchronized boolean c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.q + ":isRewardedVideoAvailable()", 1);
        if (!this.i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            Iterator<AbstractC0108b> it = this.c.iterator();
            while (it.hasNext()) {
                AbstractC0108b next = it.next();
                if (next.c() && ((Z) next).o()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0109c
    public final void c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            a(IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (a(false, true)) {
            a(a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        b(true);
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.AVAILABLE || next.a == AbstractC0108b.a.NOT_AVAILABLE) {
                next.a(AbstractC0108b.a.NEEDS_RELOAD);
            }
        }
        Iterator<AbstractC0108b> it2 = this.c.iterator();
        while (it2.hasNext()) {
            AbstractC0108b next2 = it2.next();
            if (next2.a == AbstractC0108b.a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(next2.d + ":reload smash");
                    a(1001, next2, (Object[][]) null);
                    ((Z) next2).n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(next2.d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    void d() {
        if (this.o <= 0) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.u;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.u = timer2;
        timer2.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.Y.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                cancel();
                Y.this.e();
                Y.this.d();
            }
        }, this.o * 1000);
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void d(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdEnded()", 1);
        a(IronSourceConstants.RV_INSTANCE_ENDED, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        this.m.onRewardedVideoAdEnded();
    }

    synchronized void e() {
        if (IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity()) && this.j != null) {
            if (!this.j.booleanValue()) {
                a(102, (Object[][]) null);
                a(1000, (Object[][]) null);
                this.w = true;
                Iterator<AbstractC0108b> it = this.c.iterator();
                while (it.hasNext()) {
                    AbstractC0108b next = it.next();
                    if (next.a == AbstractC0108b.a.NOT_AVAILABLE) {
                        IronSourceLoggerManager ironSourceLoggerManager = this.h;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                        ironSourceLoggerManager.log(ironSourceTag, "Fetch from timer: " + next.d + ":reload smash", 1);
                        a(1001, next, (Object[][]) null);
                        ((Z) next).n();
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void e(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdRewarded()", 1);
        if (this.t == null) {
            this.t = E.a().i.c.a.a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(z);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, z.w);
            if (this.t != null) {
                providerAdditionalData.put("placement", p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.t.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.t.getRewardAmount());
            } else {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.adunit.a.a aVar = new com.ironsource.mediationsdk.adunit.a.a(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.g)) {
            aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), z.j()));
            if (!TextUtils.isEmpty(E.a().m)) {
                aVar.a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, E.a().m);
            }
            Map<String, String> map = E.a().n;
            if (map != null) {
                for (String str : map.keySet()) {
                    aVar.a("custom_" + str, map.get(str));
                }
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(aVar);
        Placement placement = this.t;
        if (placement != null) {
            this.m.onRewardedVideoAdRewarded(placement);
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void f(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdClicked()", 1);
        if (this.t == null) {
            this.t = E.a().i.c.a.a();
        }
        if (this.t == null) {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            return;
        }
        a(1006, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        this.m.onRewardedVideoAdClicked(this.t);
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        Iterator<AbstractC0108b> it = this.c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.CAPPED_PER_DAY) {
                a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
                next.a(AbstractC0108b.a.NOT_AVAILABLE);
                if (((Z) next).o() && next.c()) {
                    next.a(AbstractC0108b.a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && a(true, false)) {
            this.m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void g(Z z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, z.d + ":onRewardedVideoAdVisible()", 1);
        if (this.t != null) {
            a(IronSourceConstants.RV_INSTANCE_VISIBLE, z, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(z.w)}});
        } else {
            this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }
}
