package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L implements com.ironsource.mediationsdk.sdk.g {
    com.ironsource.mediationsdk.sdk.k a;
    com.ironsource.mediationsdk.sdk.g b;
    private com.ironsource.mediationsdk.utils.k g;
    private NetworkSettings h;
    private String i;
    private final String c = getClass().getName();
    private AtomicBoolean e = new AtomicBoolean(true);
    private AtomicBoolean f = new AtomicBoolean(false);
    private IronSourceLoggerManager d = IronSourceLoggerManager.getLogger();

    private synchronized void a(IronSourceError ironSourceError) {
        if (this.f != null) {
            this.f.set(false);
        }
        if (this.e != null) {
            this.e.set(true);
        }
        if (this.b != null) {
            this.b.a(false, ironSourceError);
        }
    }

    private AbstractAdapter b(String str) {
        try {
            E a = E.a();
            AbstractAdapter b = a.b(str);
            if (b == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
                if (b == null) {
                    return null;
                }
            }
            a.a(b);
            return b;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.logException(ironSourceTag2, this.c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    public final void a(String str) {
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.i = str;
            com.ironsource.mediationsdk.model.k a = this.g.c.c.a(str);
            if (a == null) {
                this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.g.c.c.a();
                if (a == null) {
                    this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            if (this.f == null || !this.f.get() || this.a == null) {
                return;
            }
            this.a.showOfferwall(String.valueOf(a.a), this.h.getRewardedVideoSettings());
        } catch (Exception e) {
            this.d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x0040, B:12:0x004b, B:14:0x0056, B:16:0x005a, B:19:0x0067, B:21:0x0073, B:24:0x0080, B:26:0x0086, B:29:0x0093, B:31:0x009b, B:32:0x009e, B:34:0x00a6, B:38:0x00e3, B:37:0x00c9), top: B:46:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x0040, B:12:0x004b, B:14:0x0056, B:16:0x005a, B:19:0x0067, B:21:0x0073, B:24:0x0080, B:26:0x0086, B:29:0x0093, B:31:0x009b, B:32:0x009e, B:34:0x00a6, B:38:0x00e3, B:37:0x00c9), top: B:46:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.L.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public final void a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (!z) {
            a(ironSourceError);
            return;
        }
        this.f.set(true);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            gVar.onOfferwallAvailable(true);
        }
    }

    public final synchronized boolean a() {
        return this.f != null ? this.f.get() : false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            gVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            return gVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = com.ironsource.mediationsdk.utils.n.a().b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.i)) {
                mediationAdditionalData.put("placement", this.i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        com.ironsource.mediationsdk.utils.n.a().a(0);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.b;
        if (gVar != null) {
            gVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
