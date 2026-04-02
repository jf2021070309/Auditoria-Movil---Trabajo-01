package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B extends AbstractC0107a implements com.ironsource.mediationsdk.sdk.i, com.ironsource.mediationsdk.utils.d, com.ironsource.mediationsdk.utils.i {
    com.ironsource.mediationsdk.sdk.j m;
    private boolean r;
    private InterstitialPlacement s;
    private long w;
    private boolean x;
    private final String o = getClass().getName();
    private CopyOnWriteArraySet<String> v = new CopyOnWriteArraySet<>();
    private Map<String, C> u = new ConcurrentHashMap();
    C0121o n = C0121o.a();
    private boolean t = false;
    private boolean q = false;
    private boolean p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B() {
        this.a = new com.ironsource.mediationsdk.utils.e(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, this);
        this.x = false;
    }

    private int a(AbstractC0108b.a... aVarArr) {
        Iterator<AbstractC0108b> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            for (AbstractC0108b.a aVar : aVarArr) {
                if (next.a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    private void a(int i, AbstractC0108b abstractC0108b, Object[][] objArr) {
        a(i, abstractC0108b, objArr, false);
    }

    private void a(int i, AbstractC0108b abstractC0108b, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC0108b);
        if (z) {
            try {
                if (this.s != null && !TextUtils.isEmpty(this.s.getPlacementName())) {
                    providerAdditionalData.put("placement", this.s.getPlacementName());
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, providerAdditionalData));
    }

    private void a(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    private void a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                if (this.s != null && !TextUtils.isEmpty(this.s.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.s.getPlacementName());
                }
            } catch (Exception e) {
                this.h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, mediationAdditionalData));
    }

    private void b(int i, AbstractC0108b abstractC0108b, Object[][] objArr) {
        a(i, abstractC0108b, objArr, true);
    }

    private void c(AbstractC0108b abstractC0108b) {
        if (abstractC0108b.c()) {
            abstractC0108b.a(AbstractC0108b.a.INITIATED);
            return;
        }
        i();
        h();
    }

    private synchronized AbstractAdapter g(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.o + ":startAdapter(" + c.j() + ")", 1);
        AbstractAdapter a = C0110d.a().a(c.c, c.c.getInterstitialSettings(), false, false);
        if (a == null) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.log(ironSourceTag2, c.d + " is configured in IronSource's platform, but the adapter is not integrated", 2);
            return null;
        }
        c.b = a;
        c.a(AbstractC0108b.a.INIT_PENDING);
        b((AbstractC0108b) c);
        String str = this.g;
        String str2 = this.f;
        c.h();
        if (c.b != null) {
            c.b.addInterstitialListener(c);
            IronSourceLoggerManager ironSourceLoggerManager3 = c.q;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager3.log(ironSourceTag3, c.d + ":initInterstitial()", 1);
            c.b.initInterstitial(str, str2, c.r, c);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC0108b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC0108b.a.NOT_INITIATED
            if (r3 == r4) goto L31
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC0108b.a.INIT_PENDING
            if (r3 == r4) goto L31
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC0108b.a.INITIATED
            if (r3 == r4) goto L31
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC0108b.a.LOAD_PENDING
            if (r3 == r4) goto L31
            com.ironsource.mediationsdk.b$a r1 = r1.a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC0108b.a.AVAILABLE
            if (r1 != r3) goto L6
        L31:
            r0 = r2
            goto L34
        L33:
            r0 = 1
        L34:
            if (r0 == 0) goto L64
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC0108b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC0108b.a.EXHAUSTED
            if (r3 != r4) goto L45
            r1.g()
            goto L45
        L5b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.B.h():void");
    }

    private synchronized void h(C c) {
        a(2002, c, (Object[][]) null);
        c.i();
        if (c.b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = c.q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, c.d + ":loadInterstitial()", 1);
            c.t = new Date().getTime();
            c.b.loadInterstitial(c.r, c);
        }
    }

    private AbstractAdapter i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.c.size() && abstractAdapter == null; i2++) {
            if (this.c.get(i2).a == AbstractC0108b.a.AVAILABLE || this.c.get(i2).a == AbstractC0108b.a.INITIATED || this.c.get(i2).a == AbstractC0108b.a.INIT_PENDING || this.c.get(i2).a == AbstractC0108b.a.LOAD_PENDING) {
                i++;
                if (i >= this.b) {
                    break;
                }
            } else if (this.c.get(i2).a == AbstractC0108b.a.NOT_INITIATED && (abstractAdapter = g((C) this.c.get(i2))) == null) {
                this.c.get(i2).a(AbstractC0108b.a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    private synchronized void j() {
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.AVAILABLE || next.a == AbstractC0108b.a.LOAD_PENDING || next.a == AbstractC0108b.a.NOT_AVAILABLE) {
                next.a(AbstractC0108b.a.INITIATED);
            }
        }
    }

    private void k() {
        for (int i = 0; i < this.c.size(); i++) {
            String providerTypeForReflection = this.c.get(i).c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C0110d.a().a(this.c.get(i).c, this.c.get(i).c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0107a
    public final void a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.o + " Should Track Network State: " + z, 0);
        this.i = z;
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + " :onInterstitialInitSuccess()", 1);
        a(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, c, (Object[][]) null);
        this.r = true;
        if (this.p && a(AbstractC0108b.a.AVAILABLE, AbstractC0108b.a.LOAD_PENDING) < this.b) {
            c.a(AbstractC0108b.a.LOAD_PENDING);
            h(c);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(C c, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdReady()", 1);
        a(IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        long time = new Date().getTime() - this.w;
        c.a(AbstractC0108b.a.AVAILABLE);
        this.q = false;
        if (this.t) {
            this.t = false;
            this.m.onInterstitialAdReady();
            a(IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(IronSourceError ironSourceError, C c) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            a(IronSourceConstants.IS_INSTANCE_INIT_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager2.logException(ironSourceTag2, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + c.j() + ")", e);
        }
        if (a(AbstractC0108b.a.INIT_FAILED) < this.c.size()) {
            if (i() == null && this.p && a(AbstractC0108b.a.INIT_FAILED, AbstractC0108b.a.NOT_AVAILABLE, AbstractC0108b.a.CAPPED_PER_SESSION, AbstractC0108b.a.CAPPED_PER_DAY, AbstractC0108b.a.EXHAUSTED) >= this.c.size()) {
                this.n.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                this.t = false;
            }
            h();
            return;
        }
        IronSourceLoggerManager ironSourceLoggerManager3 = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager3.log(ironSourceTag3, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
        if (this.p) {
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_GENERIC)}});
            this.t = false;
        }
        this.r = true;
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(IronSourceError ironSourceError, C c, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        IronSourceUtils.sendAutomationLog(c.d + ":onInterstitialAdLoadFailed(" + ironSourceError + ")");
        if (ironSourceError.getErrorCode() == 1158) {
            a(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        c.a(AbstractC0108b.a.NOT_AVAILABLE);
        int a = a(AbstractC0108b.a.AVAILABLE, AbstractC0108b.a.LOAD_PENDING);
        if (a >= this.b) {
            return;
        }
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.INITIATED) {
                next.a(AbstractC0108b.a.LOAD_PENDING);
                h((C) next);
                return;
            }
        }
        if (i() != null) {
            return;
        }
        if (this.p && a + a(AbstractC0108b.a.INIT_PENDING) == 0) {
            h();
            this.q = false;
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(InterstitialPlacement interstitialPlacement) {
        this.s = interstitialPlacement;
        this.m.e = interstitialPlacement;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        if (this.p) {
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.p = false;
            this.q = false;
        }
    }

    public final synchronized void a(String str, String str2) {
        this.h.log(IronSourceLogger.IronSourceTag.NATIVE, this.o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        a(IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.g = str;
        this.f = str2;
        Iterator<AbstractC0108b> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (this.a.b(next)) {
                a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.a.c(next)) {
                next.a(AbstractC0108b.a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.c.size()) {
            this.r = true;
        }
        k();
        for (int i2 = 0; i2 < this.b && i() != null; i2++) {
        }
        a(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z, com.ironsource.mediationsdk.model.h hVar) {
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void b(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdOpened()", 1);
        b(IronSourceConstants.IS_INSTANCE_OPENED, c, null);
        this.m.onInterstitialAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void b(IronSourceError ironSourceError, C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.x = false;
        c((AbstractC0108b) c);
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next().a == AbstractC0108b.a.AVAILABLE) {
                this.p = true;
                InterstitialPlacement interstitialPlacement = this.s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                d();
                return;
            }
        }
        this.m.onInterstitialAdShowFailed(ironSourceError);
    }

    public final synchronized void c() {
        try {
            if (this.x) {
                this.h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                A.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.s = null;
            this.m.e = null;
            if (!this.q && !this.n.a(IronSource.AD_UNIT.INTERSTITIAL)) {
                J.a b = J.a().b();
                if (b == J.a.NOT_INIT) {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                    return;
                } else if (b == J.a.INIT_IN_PROGRESS) {
                    if (J.a().c()) {
                        this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    this.w = new Date().getTime();
                    a(2001, (Object[][]) null);
                    this.p = true;
                    this.t = true;
                    return;
                } else if (b == J.a.INIT_FAILED) {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                } else if (this.c.size() == 0) {
                    this.h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                    this.n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                } else {
                    this.w = new Date().getTime();
                    a(2001, (Object[][]) null);
                    this.t = true;
                    j();
                    if (a(AbstractC0108b.a.INITIATED) == 0) {
                        if (!this.r) {
                            this.p = true;
                            return;
                        }
                        IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                        this.h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                        this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildGenericError);
                        a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                        this.t = false;
                        return;
                    }
                    this.p = true;
                    this.q = true;
                    Iterator<AbstractC0108b> it = this.c.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        AbstractC0108b next = it.next();
                        if (next.a == AbstractC0108b.a.INITIATED) {
                            next.a(AbstractC0108b.a.LOAD_PENDING);
                            h((C) next);
                            i++;
                            if (i >= this.b) {
                                return;
                            }
                        }
                    }
                    return;
                }
            }
            this.h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.t) {
                this.t = false;
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void c(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdClosed()", 1);
        this.x = false;
        b(IronSourceConstants.IS_INSTANCE_CLOSED, c, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.n.a().b(2))}});
        com.ironsource.mediationsdk.utils.n.a().a(2);
        this.m.onInterstitialAdClosed();
    }

    public final void d() {
        if (this.x) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.m.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.p) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (this.i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            this.h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else {
            for (int i = 0; i < this.c.size(); i++) {
                AbstractC0108b abstractC0108b = this.c.get(i);
                if (abstractC0108b.a == AbstractC0108b.a.AVAILABLE) {
                    com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.s);
                    if (com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), this.s) != c.a.d) {
                        a(IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    b(IronSourceConstants.IS_INSTANCE_SHOW, abstractC0108b, null);
                    this.x = true;
                    C c = (C) abstractC0108b;
                    if (c.b != null) {
                        c.q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, c.d + ":showInterstitial()", 1);
                        c.d();
                        c.b.showInterstitial(c.r, c);
                    }
                    if (abstractC0108b.b()) {
                        a(IronSourceConstants.IS_CAP_SESSION, abstractC0108b, (Object[][]) null);
                    }
                    this.a.a(abstractC0108b);
                    if (this.a.c(abstractC0108b)) {
                        abstractC0108b.a(AbstractC0108b.a.CAPPED_PER_DAY);
                        a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, abstractC0108b, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.p = false;
                    if (abstractC0108b.c()) {
                        return;
                    }
                    i();
                    return;
                }
            }
            this.m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void d(C c) {
        this.h.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, c.d + ":onInterstitialAdShowSucceeded()", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, c, null);
        Iterator<AbstractC0108b> it = this.c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.AVAILABLE) {
                c(next);
                z = true;
            }
        }
        if (!z && (c.a == AbstractC0108b.a.CAPPED_PER_SESSION || c.a == AbstractC0108b.a.EXHAUSTED || c.a == AbstractC0108b.a.CAPPED_PER_DAY)) {
            h();
        }
        j();
        this.m.onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void e(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdClicked()", 1);
        b(IronSourceConstants.IS_INSTANCE_CLICKED, c, null);
        this.m.onInterstitialAdClicked();
    }

    public final synchronized boolean e() {
        boolean z;
        if (!this.i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            Iterator<AbstractC0108b> it = this.c.iterator();
            while (it.hasNext()) {
                AbstractC0108b next = it.next();
                if (next.a == AbstractC0108b.a.AVAILABLE) {
                    C c = (C) next;
                    if (c.b != null) {
                        c.q.log(IronSourceLogger.IronSourceTag.ADAPTER_API, c.d + ":isInterstitialReady()", 1);
                        z = c.b.isInterstitialReady(c.r);
                    } else {
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        if (this.p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.n.a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.p = false;
            this.q = false;
            if (this.t) {
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.t = false;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void f(C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.d + ":onInterstitialAdVisible()", 1);
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        Iterator<AbstractC0108b> it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0108b next = it.next();
            if (next.a == AbstractC0108b.a.CAPPED_PER_DAY) {
                a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
                next.a(next.b() ? AbstractC0108b.a.CAPPED_PER_SESSION : next.a() ? AbstractC0108b.a.EXHAUSTED : AbstractC0108b.a.INITIATED);
            }
        }
    }
}
