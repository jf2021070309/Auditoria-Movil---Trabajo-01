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
public final class G extends V implements RewardedVideoSmashListener {
    a a;
    String b;
    private H j;
    private Timer k;
    private int l;
    private String m;
    private String n;
    private Placement o;
    private long p;
    private JSONObject q;
    private int r;
    private String s;
    private final Object t;
    private final Object u;
    private long v;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public G(G g, H h, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2) {
        this(g.m, g.n, g.d.a, h, g.l, abstractAdapter, i);
        this.b = str;
        this.q = jSONObject;
        this.r = i2;
        this.s = str2;
    }

    public G(String str, String str2, NetworkSettings networkSettings, H h, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.t = new Object();
        this.u = new Object();
        this.m = str;
        this.n = str2;
        this.j = h;
        this.k = null;
        this.l = i;
        this.c.updateRewardedVideoListener(this);
        this.h = i2;
        this.a = a.NO_INIT;
        this.v = 0L;
        if (this.d.c) {
            c("initForBidding()");
            a(a.INIT_IN_PROGRESS);
            g();
            try {
                this.c.initRewardedVideoForBidding(this.m, this.n, this.f, this);
            } catch (Throwable th) {
                d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    private void a(int i) {
        a(i, null, false);
    }

    private void a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = n();
        if (!TextUtils.isEmpty(this.b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.b);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.q);
        }
        if (z && (placement = this.o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.o.getPlacementName());
        }
        if (b(i)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(n, this.r, this.s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(n)));
        if (i == 1203) {
            com.ironsource.mediationsdk.utils.n.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        c("current state=" + this.a + ", new state=" + aVar);
        synchronized (this.t) {
            this.a = aVar;
        }
    }

    private static boolean b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + "  : " + str, 0);
    }

    private void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + " : " + str, 3);
    }

    private boolean f() {
        return this.c.isRewardedVideoAvailable(this.f);
    }

    private void g() {
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
            c("setCustomParams() " + e.getMessage());
        }
    }

    private void q() {
        synchronized (this.u) {
            if (this.k != null) {
                this.k.cancel();
                this.k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return new Date().getTime() - this.p;
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.c.getRewardedVideoBiddingData(this.f);
            }
            return null;
        } catch (Throwable th) {
            d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i, Object[][] objArr) {
        a(i, objArr, true);
    }

    public final void a(Placement placement) {
        q();
        c("showVideo()");
        this.o = placement;
        a(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.c.showRewardedVideo(this.f, this);
        } catch (Throwable th) {
            d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str) {
        a aVar;
        c("loadVideo() auctionId: " + this.b + " state: " + this.a);
        this.i = null;
        this.e = false;
        synchronized (this.t) {
            aVar = this.a;
            if (this.a != a.LOAD_IN_PROGRESS && this.a != a.SHOW_IN_PROGRESS) {
                a(a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == a.LOAD_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.u) {
                Timer timer = new Timer();
                this.k = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.G.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        int i;
                        boolean z;
                        String str2 = "Rewarded Video - load instance time out";
                        if (G.this.a == a.LOAD_IN_PROGRESS || G.this.a == a.INIT_IN_PROGRESS) {
                            if (G.this.a == a.LOAD_IN_PROGRESS) {
                                i = 1025;
                            } else {
                                i = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str2 = "Rewarded Video - init instance time out";
                            }
                            G.this.a(a.NOT_LOADED);
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        G.this.c(str2);
                        if (!z) {
                            G.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(G.this.r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, G.this.a.name()}});
                            return;
                        }
                        G.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(G.this.r())}});
                        G.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(G.this.r())}});
                        G.this.j.b(G.this);
                    }
                }, this.l * 1000);
            }
            this.p = new Date().getTime();
            a(1001);
            try {
                if (h()) {
                    this.c.loadRewardedVideoForBidding(this.f, this, str);
                    return;
                }
                g();
                this.c.initRewardedVideo(this.m, this.n, this.f, this);
            } catch (Throwable th) {
                d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    public final boolean b() {
        try {
            return h() ? this.a == a.LOADED && f() : f();
        } catch (Throwable th) {
            d("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    public final void b_() {
        this.c.setMediationState(AbstractC0108b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        a(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    public final LoadWhileShowSupportState c() {
        return this.c.getLoadWhileShowSupportState(this.f);
    }

    @Override // com.ironsource.mediationsdk.V
    public final int e() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.j.b(this, this.o);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        c("onRewardedVideoAdClosed");
        synchronized (this.t) {
            if (this.a == a.SHOW_IN_PROGRESS) {
                a(a.ENDED);
                this.v = new Date().getTime();
                this.j.d(this);
                return;
            }
            a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        c("onRewardedVideoAdEnded");
        this.j.f(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.j.c(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.j.a(this, this.o);
        Map<String, Object> n = n();
        Placement placement = this.o;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.o.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(E.a().m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, E.a().m);
        }
        if (E.a().n != null) {
            for (String str : E.a().n.keySet()) {
                n.put("custom_" + str, E.a().n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.b);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.q);
        }
        if (b(1010)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(n, this.r, this.s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        com.ironsource.mediationsdk.adunit.a.a aVar = new com.ironsource.mediationsdk.adunit.a.a(1010, new JSONObject(n));
        aVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(aVar.b(), k()));
        long j = this.v;
        if (j != 0) {
            long j2 = time - j;
            c("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            aVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        com.ironsource.mediationsdk.a.h.e().b(aVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.t) {
            if (this.a == a.SHOW_IN_PROGRESS) {
                a(a.ENDED);
                this.j.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        c("onRewardedVideoAdStarted");
        this.j.e(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        c("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.a.name());
        synchronized (this.t) {
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
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.a.name()}});
                return;
            }
        }
        q();
        b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}});
        if (z) {
            this.j.a(this);
        } else {
            this.j.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        q();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}});
        synchronized (this.t) {
            if (this.a == a.INIT_IN_PROGRESS) {
                a(a.NO_INIT);
                this.j.b(this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        c("onRewardedVideoInitSuccess");
        synchronized (this.t) {
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
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.i = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
