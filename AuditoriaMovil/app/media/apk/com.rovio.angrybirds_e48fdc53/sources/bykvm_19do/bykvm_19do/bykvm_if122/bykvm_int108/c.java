package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.n;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.d0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.h0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.q;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.s;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.w;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.TTAdConfig;
import com.bytedance.msdk.api.v2.GMAdConfig;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMPrivacyConfig;
import com.bytedance.msdk.api.v2.IGMLiveTokenInjectionAuth;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static long a;
    private static boolean b;
    private static long e;
    private static k f;
    private static AtomicBoolean c = new AtomicBoolean(false);
    static Runnable d = new RunnableC0056c();
    private static long g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean unused = c.b = true;
            long unused2 = c.a = SystemClock.elapsedRealtime();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a(this.a.getApplicationContext());
            h0.a(this.a);
            k0.c();
            q.a(this.a);
            s.a(this.a);
            w.m(this.a);
            h.c().b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bg_ts", c.g);
                Logger.d("TTMediationSDK", "--==-- init bg_ts: " + c.g);
                jSONObject.put("pre_time", elapsedRealtime - c.a);
            } catch (Throwable th) {
            }
            c.k();
            try {
                jSONObject.put("cfg_time", SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (Throwable th2) {
            }
            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a()) {
                c.e(this.a);
            } else {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a().b();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.c().b();
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(true, jSONObject);
            c.h();
            c.g(this.a);
            c.p();
            if (Logger.isDebug()) {
                ThreadHelper.runOnMSDKThread(c.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        final /* synthetic */ Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.a(this.a);
            s.a(this.a);
        }
    }

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class RunnableC0056c implements Runnable {
        RunnableC0056c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d("TMe", "--==-- queueSize: " + ((ThreadPoolExecutor) ThreadHelper.getMSDKExecutor()).getQueue().size());
            ThreadHelper.postDelayOnMSDKThread(c.d, PushUIConfig.dismissTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements k.b {
        d() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k.b
        public void a() {
            Logger.d("TTMediationSDK", "--==-- AppStateListener on foreground");
            long unused = c.e = SystemClock.elapsedRealtime();
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k.b
        public void b() {
            Logger.d("TTMediationSDK", "--==-- AppStateListener on background");
            if (c.g == -1) {
                long unused = c.g = System.currentTimeMillis();
                Logger.d("TTMediationSDK", "--==-- AppStateListener on background bgTime: " + c.g);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(SystemClock.elapsedRealtime() - c.e);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.e = true;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.f = true;
            if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a()) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a().a();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.c().a();
            } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.b()) {
                if (d0.c(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d())) {
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a();
                } else {
                    c.n();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements Runnable {
        final /* synthetic */ StackTraceElement[] a;

        e(StackTraceElement[] stackTraceElementArr) {
            this.a = stackTraceElementArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends BroadcastReceiver {
        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            Logger.d("TTMediationSDK", "--==-- event multi receiver");
            if (intent.getIntExtra("b_msg_id", -1) == 1) {
                try {
                    if (d0.c(context)) {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a();
                    } else {
                        Logger.d("TTMediationSDK", "--==-- event multi receiver not in main proc");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        public static final String a = n0.a() + ".openadsdk.permission.TT_PANGOLIN";
    }

    @Deprecated
    private static void a(TTAdConfig tTAdConfig) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(System.currentTimeMillis());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getAppId());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(tTAdConfig.getAppName());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().d(tTAdConfig.isPangleAllowShowNotify());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().e(tTAdConfig.isPangleAllowShowPageWhenScreenLock());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(tTAdConfig.getPangleTitleBarTheme());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getPangleDirectDownloadNetworkType());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getPangleNeedClearTaskReset());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().g(tTAdConfig.isPangleUseTextureView());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f(tTAdConfig.isPanglePaid());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f(tTAdConfig.getPublisherDid());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().c(tTAdConfig.isOpenAdnTest());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().d(tTAdConfig.getPangleData());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getExtraData());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getPrivacyConfig());
        r();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getAdapterConfigurationClasses());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().c(tTAdConfig.getMediatedNetworkConfigurations());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().d(tTAdConfig.getRequestOptions());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getUserInfoForSegment(), true);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(tTAdConfig.getPanglePluginUpdateConfig());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().e(tTAdConfig.getPangleKeywords());
    }

    @Deprecated
    public static void a(TTAdConfig tTAdConfig, Context context) {
        a(null, tTAdConfig, context);
    }

    private static void a(GMAdConfig gMAdConfig) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(System.currentTimeMillis());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getAppId());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(gMAdConfig.getAppName());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().i(gMAdConfig.getSupportMultiProcess());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().d(gMAdConfig.getGMPangleOption().isAllowShowNotify());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().e(gMAdConfig.getGMPangleOption().isAllowShowPageWhenScreenLock());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(gMAdConfig.getGMPangleOption().getTitleBarTheme());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getGMPangleOption().getDirectDownloadNetworkType());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getGMPangleOption().getNeedClearTaskReset());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().g(gMAdConfig.getGMPangleOption().isIsUseTextureView());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f(gMAdConfig.getGMPangleOption().isPaid());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f(gMAdConfig.getPublisherDid());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().c(gMAdConfig.isOpenAdnTest());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().d(gMAdConfig.getGMPangleOption().getData());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getGMPangleOption().getExtraData());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getPrivacyConfig());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getGMConfigUserInfoForSegment(), true);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getGMPangleOption().getPluginUpdateConfig());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().e(gMAdConfig.getGMPangleOption().getKeywords());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(gMAdConfig.getLocalExtra());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.isHttps());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b(gMAdConfig.isOpenPangleCustom());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.getCutstomLocalConfig());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().k(gMAdConfig.getGMGdtOption().isWxInstalled());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().c(gMAdConfig.getGMGdtOption().getOpensdkVer());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().h(gMAdConfig.getGMGdtOption().isSupportH265());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().j(gMAdConfig.getGMGdtOption().isSupportSplashZoomout());
        if (gMAdConfig.getGromoreExtra() != null) {
            try {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a((List) gMAdConfig.getGromoreExtra().get(GMAdConstant.GM_EXTRA_KEY_PRIME_RIT_LIST));
            } catch (Throwable th) {
            }
        }
        if (gMAdConfig.getGMBaiduOption() != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().g(gMAdConfig.getGMBaiduOption().getWxAppId());
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMAdConfig.geValueSet());
        a(gMAdConfig.getGmLiveTokenInjectionAuth());
        r();
    }

    public static void a(GMAdConfig gMAdConfig, Context context) {
        a(gMAdConfig, null, context);
    }

    private static void a(GMAdConfig gMAdConfig, TTAdConfig tTAdConfig, Context context) {
        d(context);
        if (gMAdConfig != null) {
            a(gMAdConfig);
        } else if (tTAdConfig != null) {
            a(tTAdConfig);
        }
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().r()) {
            f(context);
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().q();
        c(context);
    }

    public static void a(GMPrivacyConfig gMPrivacyConfig) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().a(gMPrivacyConfig);
        r();
    }

    private static void a(IGMLiveTokenInjectionAuth iGMLiveTokenInjectionAuth) {
        try {
            ITTAdapterConfiguration a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a("pangle");
            if (a2 != null) {
                a2.setInjectionAuth(iGMLiveTokenInjectionAuth);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StackTraceElement[] stackTraceElementArr) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().x()) {
            Map<String, String> e2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().e();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((TTBaseAd) null, (AdSlot) null, u.a(stackTraceElementArr), 1);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(u.a(e2));
        }
    }

    private static void c(Context context) {
        Logger.e("TTMediationSDK_SDK_Init", "msdk_init v2.............");
        o();
        ThreadHelper.runOnThreadPool(new a(context));
    }

    public static void d(Context context) {
        if (context != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context) {
        int k = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().k();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.a(new a.b().a(new l()).a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122.a.a(k, k, 172800000L)).a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u()).a(new m()).a(n.b).a(), context);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.b.c();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.c();
    }

    private static void f(Context context) {
        Logger.e("TTMediationSDK_SDK_Init", "msdk_init v1.............");
        b = true;
        a = SystemClock.elapsedRealtime();
        o();
        h0.a(context);
        k0.c();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.a(context.getApplicationContext());
        ThreadHelper.runOnThreadPool(new b(context));
        w.m(context);
        h.c().b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bg_ts", g);
            Logger.d("TTMediationSDK", "--==-- init bg_ts: " + g);
            jSONObject.put("pre_time", elapsedRealtime - a);
        } catch (Throwable th) {
        }
        k();
        try {
            jSONObject.put("cfg_time", SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (Throwable th2) {
        }
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a()) {
            e(context);
        } else {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.a().b();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.c().b();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(true, jSONObject);
        h();
        g(context);
        p();
        if (Logger.isDebug()) {
            ThreadHelper.runOnMSDKThread(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.d()) {
            Logger.d("TMe", "-----==---- 正常上报sdk_init");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(-1L);
            return;
        }
        Logger.d("TMe", "-----==---- 延时上报sdk_init");
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).a(0);
    }

    public static String i() {
        try {
            ITTAdapterConfiguration a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a("pangle");
            if (a2 != null) {
                return a2.getNetworkSdkPluginVersion();
            }
        } catch (Throwable th) {
        }
        return "";
    }

    public static long j() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        try {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(true);
        } catch (Throwable th) {
            Logger.e("TTMediationSDK", "InitHelper-->initSetting->loadData Exception=" + th.toString());
        }
    }

    public static void l() {
        Context d2;
        if (c.get()) {
            return;
        }
        Logger.i("TNCManager_GroMore", "初始化TNC initTTAdNetTNC：supportTNC：" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().L());
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().L() || (d2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()) == null) {
            return;
        }
        try {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b().a().a(d2, true, new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a(d2));
        } catch (Exception e2) {
        }
        c.set(true);
    }

    public static boolean m() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(n0.a());
                intent.setAction("com.bytedance.msdk.sdkinit.EventMultiFlushReceiver");
                intent.putExtra("b_msg_id", 1);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().sendBroadcast(intent, g.a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void o() {
        Application a2 = a.b.a();
        if (a2 == null) {
            Logger.d("TTMediationSDK", "AppStateListener注册失败, app = null");
            return;
        }
        Logger.d("TTMediationSDK", "AppStateListener注册成功");
        k kVar = f;
        if (kVar != null) {
            kVar.a(a2);
        }
        k kVar2 = new k();
        f = kVar2;
        kVar2.a(a2, new d());
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u()) {
            try {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().registerReceiver(new f(null), new IntentFilter("com.bytedance.msdk.sdkinit.EventMultiFlushReceiver"), g.a, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().B()) {
            b(stackTrace);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new e(stackTrace), 2000L);
        }
    }

    public static void q() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b(1);
        if (!c.get()) {
            l();
        }
        Context d2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
        if (d2 == null) {
            return;
        }
        try {
            Logger.i("TNCManager_GroMore", "尝试刷新TNC tryRefreshTNCConfig");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b().a().a(d2, false);
        } catch (Exception e2) {
        }
    }

    private static void r() {
        ITTAdapterConfiguration value;
        try {
            Map<String, ITTAdapterConfiguration> a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a();
            if (a2 == null || a2.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ITTAdapterConfiguration> entry : a2.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    value.setPrivacyConfig(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s());
                }
            }
        } catch (Throwable th) {
        }
    }
}
