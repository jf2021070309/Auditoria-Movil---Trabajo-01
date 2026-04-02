package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class U extends V implements RewardedVideoSmashListener {
    private String A;
    private String B;
    private final Object C;
    private final Object D;
    a a;
    boolean b;
    private T j;
    private Timer k;
    private int l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private boolean q;
    private Placement r;
    private long s;
    private String t;
    private JSONObject u;
    private String v;
    private int w;
    private String x;
    private int y;
    private int z;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public U(String str, String str2, NetworkSettings networkSettings, T t, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.C = new Object();
        this.D = new Object();
        this.a = a.NO_INIT;
        this.m = str;
        this.n = str2;
        this.j = t;
        this.k = null;
        this.l = i;
        this.c.addRewardedVideoListener(this);
        this.p = false;
        this.q = false;
        this.b = false;
        this.r = null;
        this.t = "";
        this.u = null;
        this.h = 1;
        g();
    }

    private void a(int i) {
        a(i, null, false);
    }

    private void a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = n();
        if (!TextUtils.isEmpty(this.t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.t);
        }
        JSONObject jSONObject = this.u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.u);
        }
        if (z && (placement = this.r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.r.getPlacementName());
        }
        if (b(i)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(n, this.w, this.x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(n)));
        if (i == 1203) {
            com.ironsource.mediationsdk.utils.n.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        a("current state=" + this.a + ", new state=" + aVar);
        synchronized (this.D) {
            this.a = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 0);
    }

    private void a(String str, String str2, int i, String str3, int i2, String str4) {
        this.v = str2;
        this.o = str;
        this.y = i;
        this.B = str3;
        this.z = i2;
        this.A = str4;
    }

    private static boolean b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 3);
    }

    private void g() {
        this.v = "";
        this.y = -1;
        this.B = "";
        this.o = "";
        this.z = this.h;
        this.A = "";
    }

    private boolean q() {
        return this.c.isRewardedVideoAvailable(this.f);
    }

    private void r() {
        try {
            String str = E.a().l;
            if (!TextUtils.isEmpty(str)) {
                this.c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            a("setCustomParams() " + e.getMessage());
        }
    }

    private void s() {
        synchronized (this.C) {
            if (this.k != null) {
                this.k.cancel();
                this.k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long t() {
        return new Date().getTime() - this.s;
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.c.getRewardedVideoBiddingData(this.f);
            }
            return null;
        } catch (Throwable th) {
            c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i, Object[][] objArr) {
        a(i, objArr, true);
    }

    public final void a(Placement placement, int i) {
        s();
        a("showVideo()");
        this.r = placement;
        this.h = i;
        a(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.c.showRewardedVideo(this.f, this);
        } catch (Throwable th) {
            c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        a aVar;
        a("loadVideo() auctionId: " + str2 + " state: " + this.a);
        this.i = null;
        this.e = false;
        this.b = true;
        synchronized (this.D) {
            aVar = this.a;
            if (this.a != a.LOAD_IN_PROGRESS && this.a != a.SHOW_IN_PROGRESS) {
                a(a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == a.LOAD_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.q = true;
            a(str, str2, i, str3, i2, str4);
            this.j.b(this, str2);
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.p = true;
            a(str, str2, i, str3, i2, str4);
        } else {
            this.g = str4;
            this.t = str2;
            this.u = jSONObject;
            this.w = i;
            this.x = str3;
            this.h = i2;
            synchronized (this.C) {
                s();
                Timer timer = new Timer();
                this.k = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.U.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        String str5;
                        int i3;
                        boolean z;
                        synchronized (U.this.D) {
                            str5 = "Rewarded Video - load instance time out";
                            if (U.this.a != a.LOAD_IN_PROGRESS && U.this.a != a.INIT_IN_PROGRESS) {
                                i3 = 0;
                                z = false;
                            }
                            if (U.this.a == a.LOAD_IN_PROGRESS) {
                                i3 = 1025;
                            } else {
                                i3 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str5 = "Rewarded Video - init instance time out";
                            }
                            U.this.a(a.NOT_LOADED);
                            z = true;
                        }
                        U.this.a(str5);
                        if (!z) {
                            U.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(U.this.t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, U.this.a.name()}});
                            return;
                        }
                        U.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(U.this.t())}});
                        U.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i3)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str5}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(U.this.t())}});
                        T t = U.this.j;
                        U u = U.this;
                        t.b(u, u.t);
                    }
                }, this.l * 1000);
            }
            this.s = new Date().getTime();
            a(1001);
            try {
                if (h()) {
                    this.c.loadRewardedVideoForBidding(this.f, this, str);
                } else if (aVar != a.NO_INIT) {
                    this.c.fetchRewardedVideoForAutomaticLoad(this.f, this);
                } else {
                    r();
                    this.c.initRewardedVideo(this.m, this.n, this.f, this);
                }
            } catch (Throwable th) {
                c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z, int i) {
        this.h = i;
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b() {
        a("initForBidding()");
        a(a.INIT_IN_PROGRESS);
        r();
        try {
            this.c.initRewardedVideoForBidding(this.m, this.n, this.f, this);
        } catch (Throwable th) {
            c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void b(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    public final boolean c() {
        try {
            return h() ? this.b && this.a == a.LOADED && q() : q();
        } catch (Throwable th) {
            c("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    public final void f() {
        this.c.setMediationState(AbstractC0108b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        a(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.j.b(this, this.r);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.D) {
            if (this.a != a.SHOW_IN_PROGRESS) {
                a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.a}});
                return;
            }
            a(a.NOT_LOADED);
            this.j.b(this);
            if (this.p) {
                a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
                this.p = false;
                a(this.o, this.v, this.u, this.y, this.B, this.z, this.A);
                g();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.j.d(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.j.a(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        this.j.a(this, this.r);
        Map<String, Object> n = n();
        Placement placement = this.r;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(E.a().m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, E.a().m);
        }
        if (E.a().n != null) {
            for (String str : E.a().n.keySet()) {
                n.put("custom_" + str, E.a().n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.t);
        }
        JSONObject jSONObject = this.u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.u);
        }
        if (b(1010)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(n, this.w, this.x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        com.ironsource.mediationsdk.adunit.a.a aVar = new com.ironsource.mediationsdk.adunit.a.a(1010, new JSONObject(n));
        aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), k()));
        com.ironsource.mediationsdk.a.h.e().b(aVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.D) {
            if (this.a == a.SHOW_IN_PROGRESS) {
                a(a.NOT_LOADED);
                this.j.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.j.c(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.a.name());
        synchronized (this.D) {
            if (this.a == a.LOAD_IN_PROGRESS) {
                a(z ? a.LOADED : a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.a.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.a.name()}});
                return;
            }
        }
        s();
        b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}});
        if (!this.q) {
            if (z) {
                this.j.a(this, this.t);
                return;
            } else {
                this.j.b(this, this.t);
                return;
            }
        }
        this.q = false;
        a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
        a(this.o, this.v, this.u, this.y, this.B, this.z, this.A);
        g();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        s();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}});
        synchronized (this.D) {
            if (this.a == a.INIT_IN_PROGRESS) {
                a(a.NO_INIT);
                this.j.b(this, this.t);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.D) {
            if (this.a == a.INIT_IN_PROGRESS) {
                a(a.NOT_LOADED);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.i = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(t())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
