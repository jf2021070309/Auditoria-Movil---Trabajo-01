package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.config.IGMInitAdnResult;
import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.error.AdBreakError;
import com.bytedance.msdk.api.error.AdFreqError;
import com.bytedance.msdk.api.error.AdPacingError;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter;
import com.bytedance.msdk.api.v2.ad.custom.bean.GMCustomAdConfig;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class e extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c implements TTAbsAdLoaderAdapter.AdapterLoaderListener {
    protected long D;
    protected long E;
    protected long F;
    protected long G;
    protected bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c H;
    protected Context I;
    protected ITTAdatperCallback J;
    protected ITTAdatperCallback K;
    protected TTBaseAd O;
    protected GMNetworkRequestInfo T;
    private boolean X;
    protected int a0;
    protected TTBaseAd b0;
    protected b.f c0;
    protected volatile boolean L = false;
    protected volatile boolean M = false;
    protected volatile boolean N = false;
    private final Map<String, TTAbsAdLoaderAdapter> P = new HashMap();
    protected int Q = -1000;
    protected int R = -1000;
    protected final AtomicBoolean S = new AtomicBoolean(false);
    private ConcurrentHashMap<String, AdLoadInfo> U = new ConcurrentHashMap<>();
    protected long V = 0;
    private long W = 0;
    private final Map<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> Y = new HashMap();
    protected boolean Z = false;
    private final Comparator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> d0 = new h(this);
    private final Comparator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> e0 = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ AdError a;

        a(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ AdError a;

        c(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ AdError b;

        d(List list, AdError adError) {
            this.a = list;
            this.b = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.a(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0049e implements Runnable {
        RunnableC0049e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.R();
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!e.this.a.get() || e.this.c.get()) {
                return;
            }
            e.this.c.set(true);
            AdSlot adSlot = e.this.h;
            if ((adSlot != null && adSlot.getAdType() == 7) || e.this.h.getAdType() == 8) {
                Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "m-sdk----设置 cacheTimeout 已到时间【" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().c(e.this.h.getAdUnitId()) + "】，给外部invokeAdVideoCache ...");
            }
            if (e.this.u()) {
                return;
            }
            e.this.h0();
            ThreadHelper.runOnUiThread(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.R();
        }
    }

    /* loaded from: classes.dex */
    class h implements Comparator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> {
        h(e eVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar2) {
            int p;
            int p2;
            if (kVar.p() == kVar2.p()) {
                p = kVar.y();
                p2 = kVar2.y();
            } else {
                p = kVar.p();
                p2 = kVar2.p();
            }
            return p - p2;
        }
    }

    /* loaded from: classes.dex */
    class i implements Comparator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> {
        i(e eVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar2) {
            return (kVar.i() > kVar2.i() ? 1 : (kVar.i() == kVar2.i() ? 0 : -1)) >= 0 ? -1 : 1;
        }
    }

    /* loaded from: classes.dex */
    class j extends Handler {
        j(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.a(message);
        }
    }

    /* loaded from: classes.dex */
    class k extends Handler {
        k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.a(message);
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ StackTraceElement[] b;

        l(boolean z, StackTraceElement[] stackTraceElementArr) {
            this.a = z;
            this.b = stackTraceElementArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Integer> list;
            Map<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> map;
            String str;
            e eVar;
            AdBreakError adBreakError;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c cVar;
            e.this.V = SystemClock.elapsedRealtime();
            e.this.b0();
            if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.m()) {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "MSDK未进行初始化！！！");
                e.this.e(1);
                eVar = e.this;
                adBreakError = new AdBreakError(1, AdError.getMessage(1));
            } else if (e.this.N) {
                Logger.e("TTMediationSDK", "调用过销毁方法_destroy()！！！");
                e.this.e(AdError.ERROR_CODE_DESTROY);
                eVar = e.this;
                adBreakError = new AdBreakError(AdError.ERROR_CODE_DESTROY, AdError.getMessage(AdError.ERROR_CODE_DESTROY));
            } else {
                e eVar2 = e.this;
                if (eVar2.I == null) {
                    Logger.e("TTMediationSDK", "Context为null！！！");
                    e.this.e(AdError.ERROR_CODE_CONTEXT_ERROR);
                    eVar = e.this;
                    adBreakError = new AdBreakError(AdError.ERROR_CODE_CONTEXT_ERROR, AdError.getMessage(AdError.ERROR_CODE_CONTEXT_ERROR));
                } else if (eVar2.h == null) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "AdSlot can't be null！！");
                    e.this.e(AdError.ERROR_CODE_ADSLOT_CONFIG_ERROR);
                    eVar = e.this;
                    adBreakError = new AdBreakError(AdError.ERROR_CODE_ADSLOT_CONFIG_ERROR, AdError.getMessage(AdError.ERROR_CODE_ADSLOT_CONFIG_ERROR));
                } else if (eVar2.g == null) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "msdk threadHandler can't be null！！");
                    e.this.e(AdError.ERROR_CODE_MSDK_THREAD_HANDLER);
                    eVar = e.this;
                    adBreakError = new AdBreakError(AdError.ERROR_CODE_MSDK_THREAD_HANDLER, AdError.getMessage(AdError.ERROR_CODE_MSDK_THREAD_HANDLER));
                } else {
                    if (eVar2.d == null && (cVar = eVar2.H) != null) {
                        eVar2.d = cVar.b(eVar2.f, 100);
                        e.this.X();
                        e.this.b0();
                    }
                    e eVar3 = e.this;
                    eVar3.L = true;
                    eVar3.Z();
                    if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.a.c().a()) {
                        String a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_break12.a.a(e.this.h.getTestSlotId());
                        if (!TextUtils.isEmpty(a)) {
                            e.this.A();
                            e eVar4 = e.this;
                            eVar4.d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_break12.a.a(eVar4.d, a);
                            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = e.this.d;
                            int C = cVar2 != null ? cVar2.C() : 0;
                            e.this.X();
                            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "测试工具加载广告........totalWaterFallCount: " + C + "  ,rit_id:" + e.this.f + " ,slot_id:" + a);
                        }
                        e.this.a0();
                        if (e.this.h.getAdType() == 3 && TextUtils.equals(n0.a(), "com.header.app.untext") && e.this.h.isForceLoadBottom()) {
                            str = "强制开启开屏兜底...............";
                        } else {
                            e eVar5 = e.this;
                            if (eVar5.d != null) {
                                eVar5.t = eVar5.h.getAdCount();
                                e eVar6 = e.this;
                                eVar6.e = eVar6.d.E();
                                e eVar7 = e.this;
                                eVar7.n = new ArrayList(eVar7.d.m());
                                if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().g(e.this.f) || (list = e.this.n) == null || list.size() == 0 || (map = e.this.e) == null || map.size() == 0) {
                                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "settings config.......注意，AdUnitId = " + e.this.h.getAdUnitId() + "  没有对应的waterfall配置信息");
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(e.this.h, 3);
                                    e.this.e(AdError.ERROR_CODE_REQUEST_BUT_CONFIG_ERROR);
                                    e eVar8 = e.this;
                                    eVar8.a(eVar8.f, eVar8.S);
                                    return;
                                }
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b();
                                if (!b.b(e.this.f + "")) {
                                    Logger.d("TMe", "广告位 请求触发次数拦截............");
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b();
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.g h = b2.h(e.this.f + "");
                                    Pair<String, String> f = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b().f(e.this.f);
                                    if (h == null || f == null) {
                                        return;
                                    }
                                    AdFreqError adFreqError = new AdFreqError(AdError.ERROR_CODE_EXCEED_FREQCTL, AdError.getMessage(AdError.ERROR_CODE_EXCEED_FREQCTL), (String) f.second, (String) f.first);
                                    e.this.e(adFreqError.code);
                                    e.this.a(adFreqError, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                                    return;
                                }
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m b3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b();
                                if (!b3.c(e.this.f + "") && !e.this.u()) {
                                    Logger.d("TMe", "广告位 请求触发时间间隔拦截............");
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m b4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b();
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.i i = b4.i(e.this.f + "");
                                    if (i != null) {
                                        String message = AdError.getMessage(AdError.ERROR_CODE_EXCEED_PACING);
                                        AdPacingError adPacingError = new AdPacingError(AdError.ERROR_CODE_EXCEED_PACING, message, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m.b().g(e.this.f) + "", i.j());
                                        e.this.e(adPacingError.code);
                                        e.this.a(adPacingError, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                                        return;
                                    }
                                    return;
                                }
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.b.a(e.this.n);
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d();
                                e eVar9 = e.this;
                                if (d.a(eVar9.f, eVar9.e()) == 2) {
                                    boolean z = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().d(e.this.f) == null;
                                    if (!e.this.u() && !z && e.this.T()) {
                                        e eVar10 = e.this;
                                        eVar10.Z = true;
                                        eVar10.P();
                                        return;
                                    }
                                    if (!e.this.u() && !z) {
                                        e.this.h.setPrimeRitReqType(3);
                                    }
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b d2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d();
                                    e eVar11 = e.this;
                                    d2.b(eVar11.f, eVar11.h);
                                }
                                e.this.e(0);
                                e.this.a(this.a, this.b);
                                e eVar12 = e.this;
                                eVar12.s.a(eVar12.n);
                                e eVar13 = e.this;
                                eVar13.s.e(eVar13.d.C());
                                e eVar14 = e.this;
                                Handler handler = eVar14.g;
                                if (handler != null) {
                                    handler.sendEmptyMessageDelayed(2, eVar14.F);
                                }
                                if (e.this.d.M()) {
                                    e eVar15 = e.this;
                                    eVar15.l = 0;
                                    eVar15.s.b(true);
                                    e.this.k0();
                                } else {
                                    e.this.Y();
                                }
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).c(1);
                                return;
                            } else if (eVar5.h.getAdType() != 3 || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().B() || e.this.T == null) {
                                if (e.this.H == null || bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().e()) {
                                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "settings config.......没有settings config配置信息,AdUnitId = " + e.this.h.getAdUnitId());
                                    e.this.e(AdError.ERROR_CODE_REQUEST_BUT_CONFIG_ERROR);
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(e.this.h, 1);
                                } else {
                                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "settings config.......注意，AdUnitId = " + e.this.h.getAdUnitId() + " 的配置信息为 null ！！");
                                    e.this.e(AdError.ERROR_CODE_REQUEST_BUT_CONFIG_ERROR);
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(e.this.h, 2);
                                }
                                e eVar16 = e.this;
                                eVar16.a(eVar16.f, eVar16.S);
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.e();
                                return;
                            } else {
                                str = "执行开启开屏兜底...............";
                            }
                        }
                        Logger.e("TTMediationSDK", str);
                        e.this.V();
                        return;
                    }
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(e.this.f) + "请求过于频繁，触发了熔断机制");
                    e.this.e(AdError.ERROR_CODE_REQUEST_CIRCUIT_BREAKER);
                    eVar = e.this;
                    adBreakError = new AdBreakError(AdError.ERROR_CODE_REQUEST_CIRCUIT_BREAKER, AdError.getMessage(AdError.ERROR_CODE_REQUEST_CIRCUIT_BREAKER));
                }
            }
            eVar.a(adBreakError, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements Runnable {
        final /* synthetic */ GMCustomBaseAdapter a;
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ long e;
        final /* synthetic */ int f;

        m(GMCustomBaseAdapter gMCustomBaseAdapter, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i, int i2, long j, int i3) {
            this.a = gMCustomBaseAdapter;
            this.b = kVar;
            this.c = i;
            this.d = i2;
            this.e = j;
            this.f = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
                Context context = e.this.I;
                AdSlot adSlot = e.this.h;
                GMAdSlotBase gMAdSlotBase = e.this.w;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar = this.b;
                gMCustomBaseAdapter.loadInner(context, adSlot, gMAdSlotBase, kVar, e.this.a(this.c, this.d, kVar, this.e), e.this.v, this.f, e.this);
            } catch (Exception e) {
                e eVar = e.this;
                TTBaseAd tTBaseAd = eVar.O;
                AdSlot adSlot2 = eVar.h;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar2 = this.b;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a("", tTBaseAd, adSlot2, kVar2, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, "自定义Adapter 加载广告内部错误 " + e.getClass().getName()));
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        n(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.a(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o implements IGMInitAdnResult {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        o(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void fail(AdError adError) {
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void success() {
            e.this.a(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (e.this.g != null) {
                    e.this.g.removeCallbacksAndMessages(null);
                }
                if (e.this.q != null) {
                    e.this.q.clear();
                }
                if (e.this.o != null) {
                    e.this.o.clear();
                }
                if (e.this.p != null) {
                    e.this.p.clear();
                }
                if (e.this.O != null) {
                    e.this.O.onDestroy();
                }
                if (e.this.P != null) {
                    for (Map.Entry entry : e.this.P.entrySet()) {
                        if (entry != null) {
                            TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = (TTAbsAdLoaderAdapter) entry.getValue();
                            tTAbsAdLoaderAdapter.setAdapterListener(null);
                            tTAbsAdLoaderAdapter.destroy();
                        }
                    }
                    e.this.P.clear();
                }
                e.this.s.h();
            } catch (Throwable th) {
                if (Logger.isDebug()) {
                    th.printStackTrace();
                }
            }
            e eVar = e.this;
            eVar.J = null;
            eVar.K = null;
            eVar.H = null;
            eVar.e = null;
            eVar.I = null;
            eVar.T = null;
            eVar.N = true;
            if (eVar.L) {
                e.this.a(new AdBreakError(AdError.ERROR_CODE_DESTROY, AdError.getMessage(AdError.ERROR_CODE_DESTROY)), (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q implements Runnable {
        final /* synthetic */ boolean a;

        q(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            b.f fVar = eVar.c0;
            if (fVar != null) {
                fVar.a(eVar.f, this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(Context context, String str) {
        Map<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> E;
        this.I = context;
        this.f = str;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c f2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f();
        this.H = f2;
        if (f2 != null) {
            a(f2.n());
            d(this.H.s());
            this.d = this.H.b(this.f, 100);
            X();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar != null && (E = cVar.E()) != null) {
            for (Map.Entry<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> entry : E.entrySet()) {
                List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> value = entry.getValue();
                if (value != null && value.size() > 0 && value.get(0).f() == 100) {
                    this.Y.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Looper mSDKThreadLooper = ThreadHelper.getMSDKThreadLooper();
        if (mSDKThreadLooper != null) {
            this.g = new j(mSDKThreadLooper);
            return;
        }
        ThreadHelper.initMSDKThread();
        this.g = new k(ThreadHelper.getMSDKThreadLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(int i2, int i3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, long j2) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(kVar, this.h, this.r, this.T, i2, i3, !u(), j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Handler handler;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(str2, str, -4, -4);
        if (this.D != 0 && (handler = this.g) != null) {
            handler.removeMessages(3);
            this.g.sendEmptyMessageDelayed(3, this.D);
        }
        b(a2, -1);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).c(1);
    }

    private void a(boolean z) {
        ThreadHelper.runOnMSDKThread(new q(z));
    }

    private boolean a(int i2, int i3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i4, long j2) {
        TTAbsAdLoaderAdapter c2 = c(kVar);
        if (c2 == null) {
            a(kVar, i2, i3);
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + " 创建TTAbsAdLoaderAdapter失败");
        } else if (this.I != null) {
            c2.setAdapterListener(this);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j jVar = this.v;
            if (jVar != null) {
                kVar.h(jVar.a);
            }
            if (kVar.f() == 2 && kVar.x() != null) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, this.h, c2.getSdkVersion());
            }
            c2.loadAdInter(this.I, kVar, a(i2, i3, kVar, j2), this.h, this.v, i4, this.w);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(this.f, kVar.d(), kVar, i4);
            return true;
        } else {
            a(kVar, i2, i3);
        }
        return false;
    }

    private boolean a(Class<?> cls, Class<?> cls2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        String b2;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.b.a(cls, cls2)) {
            b2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.b.b(cls, cls2);
        } else {
            b2 = "自定义ADN初始化对象失败  ---------  初始化类 " + cls.getSimpleName() + " 需要继承自自定义ADN的广告对象基类 " + cls2.getSimpleName();
        }
        if (TextUtils.isEmpty(b2)) {
            return true;
        }
        Logger.e("TTMediationSDK_SDK_Init", b2);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a("", this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, b2));
        return false;
    }

    private boolean a(String str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(this.f, str, kVar, i2);
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(str, this.h);
        if (a2 == null || a2.size() <= 0) {
            return false;
        }
        TTBaseAd tTBaseAd = a2.get(0).a;
        AdSlot adSlot = this.h;
        int mediationRitReqType = tTBaseAd.getMediationRitReqType(adSlot != null ? adSlot.getLinkedId() : null);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, this.h, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(str), !u(), 1, i2, 3, mediationRitReqType, (AdError) null, -1L, this.X, false);
        ArrayList arrayList = new ArrayList();
        for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar : a2) {
            eVar.a.setMediationRitReqType(3);
            eVar.a.setMediationRitReqTypeSrc(mediationRitReqType);
            eVar.a.setTimeoutFill(this.X);
            eVar.a.setIsCallback(false);
            a(eVar.a, str);
            arrayList.add(eVar.a);
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(a2.get(0).a, 0, "adn cache命中", 0L, this.h, i2, arrayList.size(), 2, null, 0L, -1L);
        onAdLoaded(arrayList, a2.get(0).b);
        return true;
    }

    private TTBaseAd b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        TTBaseAd next;
        if (kVar == null) {
            return null;
        }
        String d2 = kVar.d();
        String c2 = kVar.x() != null ? kVar.x().c() : null;
        if (TextUtils.isEmpty(d2)) {
            return null;
        }
        Iterator<TTBaseAd> it = this.q.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next != null && d2.equals(next.getAdNetworkSlotId())) {
                    break;
                }
            } else {
                Iterator<TTBaseAd> it2 = this.o.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator<TTBaseAd> it3 = this.p.iterator();
                        while (it3.hasNext()) {
                            next = it3.next();
                            if (next != null) {
                                if (!next.isServerBiddingAd() || TextUtils.isEmpty(c2) || TextUtils.isEmpty(next.getAid())) {
                                    if (d2.equals(next.getAdNetworkSlotId())) {
                                    }
                                } else if (d2.equals(next.getAdNetworkSlotId()) && c2.equals(next.getAid())) {
                                }
                            }
                        }
                        return null;
                    }
                    next = it2.next();
                    if (next != null && d2.equals(next.getAdNetworkSlotId())) {
                        break;
                    }
                }
            }
        }
        return next;
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0105: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:34:0x0105 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0109: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:36:0x0109 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x010d: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:38:0x010d */
    private boolean b(int i2, int i3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i4, long j2) {
        String str;
        String str2;
        GMCustomAdConfig className;
        Object newInstance;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "";
        if (this.w == null) {
            Logger.e("TTMediationSDK_SDK_Init", "自定义Adapter 老API不支持自定义Adapter，请使用新的API");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a("", this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, "自定义Adapter 老API不支持自定义Adapter，请使用新的API"));
        } else {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(kVar.e());
            if (a2 == null) {
                a(kVar, i2, i3);
                str6 = "自定义Adapter 配置为空";
            } else {
                Logger.i("TTMediationSDK_SDK_Init", "自定义Adapter 获取配置wfcBean = " + kVar);
                try {
                    className = a2.c().getClassName(kVar.t(), kVar.z());
                } catch (ClassNotFoundException e) {
                    e = e;
                    str = "TTMediationSDK_SDK_Init";
                    str2 = "";
                }
                if (className == null) {
                    str6 = "自定义Adapter 配置的className为空，无法反射创建自定义广告Adapter对象 ";
                } else {
                    Class<?> cls = Class.forName(className.getClassName());
                    try {
                        if (a(cls, className.getClazz(), kVar)) {
                            try {
                                newInstance = cls.newInstance();
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                str = "TTMediationSDK_SDK_Init";
                                str2 = "";
                            } catch (InstantiationException e3) {
                                e = e3;
                                str = "TTMediationSDK_SDK_Init";
                                str2 = "";
                            }
                            try {
                                if (newInstance instanceof GMCustomBaseAdapter) {
                                    GMCustomBaseAdapter gMCustomBaseAdapter = (GMCustomBaseAdapter) newInstance;
                                    Logger.i("TTMediationSDK_SDK_Init", "自定义Adapter 反射创建初始化对象为 " + gMCustomBaseAdapter);
                                    if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(kVar.e()) != null) {
                                        ThreadHelper.runOnThreadPool(new m(gMCustomBaseAdapter, kVar, i2, i3, j2, i4));
                                        return true;
                                    }
                                    Logger.e("TTMediationSDK_SDK_Init", "自定义Adapter 创建广告对象失败  ---------  没有初始化，不能加载广告，请检查初始化配置");
                                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a("", this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, "自定义Adapter 创建广告对象失败  ---------  没有初始化，不能加载广告，请检查初始化配置"));
                                    str = "TTMediationSDK_SDK_Init";
                                    str2 = "";
                                } else {
                                    str = "TTMediationSDK_SDK_Init";
                                    String str8 = "自定义ADN 创建广告对象失败  ---------  对象类型错误  对象类型为 " + GMCustomBaseAdapter.class.getName();
                                    Logger.e(str, str8);
                                    str2 = "";
                                    try {
                                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str8));
                                    } catch (IllegalAccessException e4) {
                                        e = e4;
                                        e.printStackTrace();
                                        str7 = "自定义Adapter IllegalAccessException";
                                        Logger.e(str, str7);
                                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str7));
                                        a(kVar, i2, i3);
                                        return false;
                                    } catch (InstantiationException e5) {
                                        e = e5;
                                        e.printStackTrace();
                                        str7 = "自定义Adapter InstantiationException";
                                        Logger.e(str, str7);
                                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str7));
                                        a(kVar, i2, i3);
                                        return false;
                                    }
                                }
                                a(kVar, i2, i3);
                                return true;
                            } catch (ClassNotFoundException e6) {
                                e = e6;
                                str2 = str5;
                                e.printStackTrace();
                                str7 = "自定义Adapter ClassNotFoundException";
                                Logger.e(str, str7);
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str7));
                                a(kVar, i2, i3);
                                return false;
                            } catch (IllegalAccessException e7) {
                                e = e7;
                                str2 = str4;
                            } catch (InstantiationException e8) {
                                e = e8;
                                str2 = str3;
                            }
                        } else {
                            str = "TTMediationSDK_SDK_Init";
                            str2 = "";
                        }
                    } catch (ClassNotFoundException e9) {
                        e = e9;
                    }
                    Logger.e(str, str7);
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str7));
                    a(kVar, i2, i3);
                }
            }
            str = "TTMediationSDK_SDK_Init";
            str2 = "";
            str7 = str6;
            Logger.e(str, str7);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(str2, this.O, this.h, kVar, new AdError(AdError.ERROR_CODE_CUSTOM_LOAD, str7));
            a(kVar, i2, i3);
        }
        return false;
    }

    private TTAbsAdLoaderAdapter c(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        if (kVar != null) {
            return (TextUtils.equals("baidu", kVar.e()) && kVar.G()) ? a(this.h.getLinkedId(), this.f, kVar.d()) : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.w.getValueSet(), kVar);
        }
        Logger.i("TTMediationSDK", "wfcBean is null getTTAbsAdLoaderAdapter fail");
        return null;
    }

    private int c0() {
        Map<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> E;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> list;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        int i2 = 0;
        if (cVar != null && (E = cVar.E()) != null && E.size() != 0) {
            ArrayList<Integer> arrayList = new ArrayList();
            arrayList.addAll(E.keySet());
            for (Integer num : arrayList) {
                if (this.s.c(num.intValue()) && (list = E.get(num)) != null) {
                    i2 += list.size();
                }
            }
        }
        return i2;
    }

    private void d(AdError adError) {
        this.X = true;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j jVar = this.v;
        if (jVar != null) {
            jVar.e = true;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, adError, cVar != null ? cVar.G() : null, j());
    }

    private boolean d0() {
        List<TTBaseAd> list = this.q;
        if (list != null) {
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd.isCacheSuccess()) {
                    return true;
                }
            }
        }
        List<TTBaseAd> list2 = this.p;
        if (list2 != null) {
            for (TTBaseAd tTBaseAd2 : list2) {
                if (tTBaseAd2.isCacheSuccess()) {
                    return true;
                }
            }
        }
        List<TTBaseAd> list3 = this.o;
        if (list3 != null) {
            for (TTBaseAd tTBaseAd3 : list3) {
                if (tTBaseAd3.isCacheSuccess()) {
                    return true;
                }
            }
        }
        return false;
    }

    private TTBaseAd e(List<TTBaseAd> list) {
        TTBaseAd tTBaseAd = null;
        if (list != null && list.size() != 0) {
            for (TTBaseAd tTBaseAd2 : list) {
                if (tTBaseAd == null || tTBaseAd2.getFillTime() < tTBaseAd.getFillTime()) {
                    tTBaseAd = tTBaseAd2;
                }
            }
        }
        return tTBaseAd;
    }

    private boolean e0() {
        return !u();
    }

    private List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> f(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> it = list.iterator();
        while (it.hasNext()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k next = it.next();
            if (next.F()) {
                it.remove();
                arrayList2.add(next);
            } else if (next.G() || next.E() || next.B()) {
                it.remove();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k();
                kVar.a(next.d());
                kVar.c(next.f());
                kVar.b(next.e());
                kVar.a(next.c());
                kVar.g(next.q());
                kVar.g(next.p());
                kVar.j(next.y());
                kVar.i(next.t());
                kVar.e("" + next.i());
                kVar.f(next.j());
                kVar.i(next.A());
                kVar.h(next.u());
                kVar.a(next.x());
                TTBaseAd b2 = b(kVar);
                if (b2 != null) {
                    kVar.e("" + b2.getBiddingCpmWithOutExchangeRate());
                }
                arrayList.add(kVar);
            }
        }
        list.addAll(arrayList);
        Collections.sort(list, this.e0);
        Collections.sort(arrayList2, this.d0);
        list.addAll(0, arrayList2);
        return list;
    }

    private boolean f0() {
        return u() && h() == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105 A[LOOP:2: B:42:0x0102->B:43:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115 A[PHI: r0 r2 
      PHI: (r0v7 char) = (r0v3 char), (r0v6 char), (r0v10 char) binds: [B:55:0x0125, B:44:0x0108, B:46:0x0111] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v9 char) = (r2v4 char), (r2v8 char), (r2v10 char) binds: [B:55:0x0125, B:44:0x0108, B:46:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[LOOP:1: B:53:0x011f->B:54:0x0122, LOOP_START, PHI: r0 
      PHI: (r0v8 char) = (r0v7 char), (r0v9 char) binds: [B:48:0x0115, B:54:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[PHI: r0 
      PHI: (r0v3 char) = (r0v7 char), (r0v25 char) binds: [B:48:0x0115, B:28:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102 A[PHI: r0 r2 
      PHI: (r0v2 char) = (r0v4 char), (r0v10 char) binds: [B:41:0x00ff, B:46:0x0111] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v1 char) = (r2v5 char), (r2v10 char) binds: [B:41:0x00ff, B:46:0x0111] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ff -> B:42:0x0102). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010b -> B:46:0x0111). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0111 -> B:57:0x0129). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0119 -> B:44:0x0108). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0125 -> B:48:0x0115). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.g0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        AdSlot adSlot = this.h;
        if ((adSlot == null || adSlot.getAdType() != 7) && this.h.getAdType() != 8) {
            return;
        }
        AdSlot adSlot2 = this.h;
        TTBaseAd tTBaseAd = this.O;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.W;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(adSlot2, tTBaseAd, elapsedRealtime - j2, cVar != null ? cVar.G() : null);
    }

    private void i0() {
        if (this.g != null) {
            if (!d0()) {
                this.g.postDelayed(new f(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().c(this.h.getAdUnitId()));
            } else if (!this.a.get() || this.c.get()) {
            } else {
                this.c.set(true);
                AdSlot adSlot = this.h;
                if ((adSlot != null && adSlot.getAdType() == 7) || this.h.getAdType() == 8) {
                    Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "从onAdLoaded给外部invokeAdVideoCache ...");
                }
                if (u()) {
                    return;
                }
                h0();
                ThreadHelper.runOnUiThread(new RunnableC0049e());
            }
        }
    }

    private void j0() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        AdError adError;
        this.y = System.currentTimeMillis();
        Map<Integer, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> map = this.e;
        if (map == null) {
            adError = new AdError(AdError.ERROR_CODE_NO_CONFIG, AdError.getMessage(AdError.ERROR_CODE_NO_CONFIG));
        } else {
            List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> list = map.get(0);
            if (!i0.a(list)) {
                int primeRitReqType = this.h.getPrimeRitReqType();
                JSONObject jSONObject = new JSONObject();
                a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.c().a(this.B, this.I, this.h, list, this.d, primeRitReqType, !u(), jSONObject), jSONObject);
                return;
            }
            adError = new AdError(AdError.ERROR_CODE_NO_CONFIG, AdError.getMessage(AdError.ERROR_CODE_NO_CONFIG));
        }
        c(adError);
    }

    public void D() {
        ThreadHelper.runOnMSDKThread(new p());
    }

    public List<AdLoadInfo> E() {
        AdLoadInfo value;
        ArrayList arrayList = new ArrayList(this.U.size());
        for (Map.Entry<String, AdLoadInfo> entry : this.U.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !TextUtils.equals(AdLoadInfo.AD_LOADED, value.getErrMsg()) && !TextUtils.equals(AdLoadInfo.AD_LOADING, value.getErrMsg())) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public ConcurrentHashMap<String, AdLoadInfo> F() {
        return this.U;
    }

    public int G() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetworkPlatformId();
        }
        return -2;
    }

    public String H() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            return tTBaseAd.getAdNetworkSlotId();
        }
        return null;
    }

    public Map<String, Object> I() {
        TTBaseAd tTBaseAd = this.O;
        return tTBaseAd != null ? tTBaseAd.getMediaExtraInfo() : new HashMap();
    }

    public String J() {
        if (this.O == null) {
            return null;
        }
        return (o() || !(this.O.isServerBiddingAd() || this.O.isClientBiddingAd() || this.O.isMultiBiddingAd())) ? this.O.getNetWorkPlatFormCpm() : GMNetworkPlatformConst.AD_NETWORK_NO_PERMISSION;
    }

    public int K() {
        return this.a0;
    }

    public GMAdEcpmInfo L() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd == null) {
            return null;
        }
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p.a(this.h, tTBaseAd, true);
    }

    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> M() {
        boolean z;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> arrayList = new ArrayList<>();
        if (this.N) {
            return arrayList;
        }
        List<Integer> list = this.n;
        int i2 = 0;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            int i3 = 0;
            z = false;
            while (i2 < list.size()) {
                int intValue = list.get(i2).intValue();
                if (intValue == -100) {
                    i3 = 1;
                }
                if (intValue < -100) {
                    z = true;
                }
                if (this.e.get(Integer.valueOf(intValue)) != null) {
                    arrayList.addAll(this.e.get(Integer.valueOf(intValue)));
                }
                i2++;
            }
            i2 = i3;
        }
        if (i2 == 0 && n() && !i0.b(this.p)) {
            for (TTBaseAd tTBaseAd : this.p) {
                if (this.d != null && (tTBaseAd.isMultiBiddingAd() || tTBaseAd.isClientBiddingAd())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k a2 = this.d.a(tTBaseAd.getAdNetworkSlotId());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        if (!z) {
            List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> g2 = g();
            if (!i0.a(g2)) {
                arrayList.addAll(g2);
            }
        }
        Iterator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
        if (p() || n()) {
            return f(arrayList);
        }
        Collections.sort(arrayList, this.d0);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N() {
        Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "超过当前层最短加载时间.....");
        if (this.a.get() || r()) {
            return;
        }
        if (s()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "超过当前层最短加载时间....有P层广告回调成功出去....");
            q();
        }
        if (p() && !y()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "超过当前层最短加载时间.....  当前有serverBidding广告，serverBidding请求还未发起或者还没有返回.......");
        } else if (t() && m()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "超过当前层最短加载时间且满足client bidding限制条件....有广告回调成功出去....");
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O() {
        List<TTBaseAd> list;
        List<TTBaseAd> list2;
        this.s.a(true);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j jVar = this.v;
        if (jVar != null) {
            jVar.f = true;
        }
        if (this.a.get() || this.b.get()) {
            return;
        }
        List<TTBaseAd> list3 = this.q;
        if ((list3 != null && list3.size() > 0) || (((list = this.o) != null && list.size() > 0) || ((list2 = this.p) != null && list2.size() > 0))) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "总加载时间超时.......有广告回调成功");
            q();
            return;
        }
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_19do.a.a(this.d)) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "总加载时间超时.......isCallback:true");
            if (B()) {
                return;
            }
        }
        Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "总加载时间超时.......没有广告回调失败");
        this.C = true;
        a(new AdError(AdError.LOAD_AD_TIME_OUT_ERROR, AdError.getMessage(AdError.LOAD_AD_TIME_OUT_ERROR)), (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
    }

    protected void P() {
        AdSlot a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.f);
        if (a2 != null) {
            this.h.setLinkedId(a2.getLinkedId());
            this.h.setPrimeRitReqType(a2.getPrimeRitReqType());
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().b(this.f, this.h);
        e(0);
        b((List<TTBaseAd>) null, false);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c c2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().c(this.f);
        if (c2 != null) {
            this.v = c2.v;
            this.U = c2.F();
        }
        q();
    }

    protected abstract void Q();

    protected abstract void R();

    protected void S() {
        AdSlot adSlot = this.h;
        if ((adSlot != null && adSlot.getAdType() == 7) || this.h.getAdType() == 8) {
            Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告缓存成功！给外部回调：invokeAdVideoCacheOnMainUI........");
        }
        if (u()) {
            return;
        }
        h0();
        ThreadHelper.runOnUiThread(new g());
    }

    protected boolean T() {
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> e;
        Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "mLoadSortList: " + this.n);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.f, this.h, cVar != null ? cVar.G() : null) && (e = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().e(this.f)) != null && e.size() > 0) {
            for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar : e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eVar.a);
                c(arrayList);
            }
            if (this.q.size() > 0 || this.p.size() > 0 || this.o.size() > 0) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "--==-- hit cache!!! -----");
                return true;
            }
        }
        Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "--==-- not hit cache!!! -----");
        return false;
    }

    public void U() {
        boolean x = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().x();
        ThreadHelper.runOnMSDKThread(new l(x, x ? Thread.currentThread().getStackTrace() : null));
    }

    protected void V() {
        if (this.T != null) {
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "settings config.......AdUnitId = " + this.f + "  开屏广告走了开发者自定义兜底方案   adnName:" + com.bytedance.msdk.base.a.a(this.T.getAdNetworkFlatFromId()));
        }
        e(AdError.ERROR_CODE_CONFIG_ERROR);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, -4);
        g0();
    }

    public void W() {
        List<TTBaseAd> list;
        List<TTBaseAd> list2;
        if (this.s.b() != 0 || this.x.get()) {
            return;
        }
        this.g.removeMessages(5);
        if (p() && y()) {
            if (t()) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "SeverBidding广告成功返回...所有的ClientBidding都有返回结果且没有到达其层超时...当前广告池中广告数量满足要求...直接返回......");
                q();
            }
            if (this.s.g() || !this.s.f()) {
                return;
            }
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "所有广告都已经加载完成....... ");
            List<TTBaseAd> list3 = this.q;
            if ((list3 == null || list3.size() <= 0) && (((list = this.o) == null || list.size() <= 0) && ((list2 = this.p) == null || list2.size() <= 0))) {
                a(new AdError(AdError.ERROR_CODE_AD_LOAD_FAIL, AdError.getMessage(AdError.ERROR_CODE_AD_LOAD_FAIL)), (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                return;
            }
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "SeverBidding广告返回且到达ClientBidding的等待时间，所有广告都有返回结果...直接返回......");
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar != null) {
            this.D = cVar.n();
            this.E = this.d.l();
            this.F = this.d.B();
            this.G = this.d.p();
            this.j = this.d.J();
            this.i = this.d.K();
            this.k = this.d.o() == 0;
            this.d.q();
            this.a0 = this.d.s();
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "mRitConfig=" + this.d.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Y() {
        a(0, false);
    }

    protected void Z() {
        this.S.set(false);
        this.u.set(false);
        this.p.clear();
        this.o.clear();
        this.q.clear();
        this.a.set(false);
        this.b.set(false);
        this.c.set(false);
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.h hVar = this.s;
        if (hVar != null) {
            hVar.h();
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j jVar = this.v;
        if (jVar != null) {
            jVar.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.a(int, boolean):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb A[LOOP:0: B:39:0x00c8->B:40:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180 A[PHI: r3 
      PHI: (r3v5 char) = (r3v1 char), (r3v4 char), (r3v8 char), (r3v8 char) binds: [B:61:0x0153, B:63:0x0181, B:48:0x00de, B:42:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d0 -> B:44:0x00d4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0181 -> B:62:0x0180). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0189 -> B:63:0x0181). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(android.os.Message r6) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.a(android.os.Message):void");
    }

    public void a(ViewGroup viewGroup) {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.showSplashClickEyeView(viewGroup);
        }
    }

    public void a(ViewGroup viewGroup, Activity activity) {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null) {
            tTBaseAd.showSplashCardView(viewGroup, activity);
        }
    }

    protected void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        if (kVar == null) {
            return;
        }
        this.s.a(kVar.d());
        this.s.a(kVar.p());
        if (kVar.E() || kVar.B()) {
            this.s.a();
            W();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i2) {
        if (kVar == null) {
            return;
        }
        Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "----------总超时后尝试从复用池中查找广告：id:" + kVar.d() + "   loadSort:" + kVar.p() + "  showSort:" + kVar.y() + "   adnName:" + kVar.e());
        String d2 = kVar.d();
        if (kVar.a() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, d2, e()) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h, true) == 3) {
            Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "----------可复用：id:" + kVar.d() + "   loadSort:" + kVar.p() + "  showSort:" + kVar.y() + "   adnName:" + kVar.e());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(this.f, d2, kVar, i2);
            List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h);
            if (a2 == null || a2.size() <= 0) {
                return;
            }
            TTBaseAd tTBaseAd = a2.get(0).a;
            AdSlot adSlot = this.h;
            int mediationRitReqType = tTBaseAd.getMediationRitReqType(adSlot != null ? adSlot.getLinkedId() : null);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, this.h, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2), !u(), 4, i2, 3, mediationRitReqType, (AdError) null, -1L, this.X, true);
            ArrayList arrayList = new ArrayList();
            for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar : a2) {
                eVar.a.setMediationRitReqType(3);
                eVar.a.setMediationRitReqTypeSrc(mediationRitReqType);
                eVar.a.setTimeoutFill(this.X);
                eVar.a.setIsCallback(true);
                a(eVar.a, d2);
                arrayList.add(eVar.a);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(a2.get(0).a, 0, "adn cache命中", 0L, this.h, i2, arrayList.size(), 4, null, 0L, -1L);
            b((List<TTBaseAd>) arrayList, true);
            TTBaseAd tTBaseAd2 = arrayList.get(0);
            if (tTBaseAd2.isPAd()) {
                this.q.addAll(arrayList);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.q, (Comparator<TTBaseAd>) null);
                for (TTBaseAd tTBaseAd3 : arrayList) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "复用池回溯成功...........回溯到了P层广告_当前P层广告缓存池数量：" + this.q.size() + ",slotId：" + tTBaseAd3.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd3.getAdNetWorkName() + ",loadSort=" + tTBaseAd3.getLoadSort() + ",showSort=" + tTBaseAd3.getShowSort() + ",CPM=" + tTBaseAd3.getCpm());
                }
            } else if (tTBaseAd2.isNormalAd()) {
                this.o.addAll(arrayList);
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.o, (Comparator<TTBaseAd>) null);
                for (TTBaseAd tTBaseAd4 : arrayList) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "复用池回溯成功...........回溯到了普通层广告_当前普通广告缓存池数量：" + this.o.size() + ",slotId：" + tTBaseAd4.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd4.getAdNetWorkName() + ",loadSort=" + tTBaseAd4.getLoadSort() + ",showSort=" + tTBaseAd4.getShowSort() + ",CPM=" + tTBaseAd4.getCpm());
                }
            }
        }
    }

    protected void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i2, int i3) {
        if (kVar != null) {
            a(kVar);
            kVar.h(j());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, this.h, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void a(AdError adError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        if (adError == null) {
            adError = new AdError(AdError.ERROR_CODE_AD_LOAD_FAIL, AdError.getMessage(AdError.ERROR_CODE_AD_LOAD_FAIL));
        }
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_19do.a.b(this.d) || adError.code != 10003) {
            j0();
        }
        if (this.b.get() || this.a.get()) {
            return;
        }
        this.b.set(true);
        d(adError);
        if (u()) {
            a(false);
            return;
        }
        Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载失败！给外部回调：invokeAdLoadFailCallbackOnMainUI...... error Code = " + adError.code + " error Message = " + adError.message);
        ThreadHelper.runOnUiThread(new a(adError));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, String str2, String str3, String str4, int i2, String str5) {
        AdLoadInfo adLoadInfo = this.U.get(str);
        if (adLoadInfo == null) {
            adLoadInfo = new AdLoadInfo();
        }
        adLoadInfo.setMediationRit(str).setAdnName(str2).setCustomAdnName(str3).setErrCode(i2).setErrMsg(str5).setAdType(str4);
        this.U.put(str, adLoadInfo);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[LOOP:0: B:11:0x006b->B:16:0x006b, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0069 -> B:11:0x006b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(java.lang.String r3, java.util.concurrent.atomic.AtomicBoolean r4) {
        /*
            r2 = this;
            boolean r4 = r2.u()
            if (r4 == 0) goto L9
            r3 = 64
            goto L6b
        L9:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d r4 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d
            r4.<init>()
            r0 = -1
            r4.c(r0)
            r4.d(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            boolean r0 = r0.f(r3)
            if (r0 != 0) goto L2a
            com.bytedance.msdk.api.AdError r3 = new com.bytedance.msdk.api.AdError
            r0 = 44406(0xad76, float:6.2226E-41)
            java.lang.String r1 = "广告位ID不合法"
            r3.<init>(r0, r1)
            goto L5a
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f
            java.lang.String r1 = com.bytedance.msdk.adapter.util.TTLogUtil.getTagSecondLevel(r1)
            r0.append(r1)
            java.lang.String r1 = "settings config.......AdUnitId = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "  暂无config配置信息"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "TTMediationSDK"
            com.bytedance.msdk.adapter.util.Logger.e(r0, r3)
            com.bytedance.msdk.api.AdError r3 = new com.bytedance.msdk.api.AdError
            r0 = 40040(0x9c68, float:5.6108E-41)
            java.lang.String r1 = com.bytedance.msdk.api.AdError.getMessage(r0)
            r3.<init>(r0, r1)
        L5a:
            r2.a(r3, r4)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(r3)
            r4 = 1
            r3.c(r4)
        L69:
            r3 = 66
        L6b:
            switch(r3) {
                case 64: goto L6f;
                case 65: goto L69;
                case 66: goto L6f;
                default: goto L6e;
            }
        L6e:
            goto L6b
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.a(java.lang.String, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    protected final void a(String str, JSONObject jSONObject) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, this.d.G(), jSONObject);
        ThreadHelper.runOnUiThread(new b(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        if (list == null || list.size() <= 0) {
            return;
        }
        String adNetworkSlotId = list.get(0).getAdNetworkSlotId();
        if (list.get(0).canAdReuse() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, adNetworkSlotId, e())) {
            ArrayList arrayList = new ArrayList();
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null) {
                    arrayList.add(new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e(tTBaseAd, dVar, 0L, this.h));
                }
            }
            if (arrayList.size() > 0) {
                TTBaseAd tTBaseAd2 = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e) arrayList.get(0)).a;
                Logger.d("TTMediationSDK", "--==-- 广告复用:广告缓存成功 -------" + tTBaseAd2.getAdNetWorkName() + ", adType: " + com.bytedance.msdk.base.a.a(tTBaseAd2.getAdType(), tTBaseAd2.getSubAdType()) + ", adnSlotId: " + tTBaseAd2.getAdNetworkSlotId() + ", ad个数: " + arrayList.size());
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(adNetworkSlotId, arrayList);
            }
        }
    }

    public boolean a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        return dVar != null && (dVar.i() || dVar.j() || dVar.m());
    }

    protected void a0() {
        this.h.setIfTest(e());
        this.h.setTransparentParams(k());
        this.h.setAdUnitId(this.f);
        this.h.setAdloadSeq(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a());
        this.h.setLinkedId(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.d());
        if (this.h.getReuestParam() != null) {
            this.h.getReuestParam().getExtraObject().put("tt_request_ad_type", Integer.valueOf(this.h.getAdStyleType()));
        }
        this.h.setReqType(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.f, e()));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar != null) {
            this.h.setWaterfallId(cVar.I());
            this.h.setVersion(this.d.D());
            this.h.setSegmentId(this.d.x());
            this.h.setSegmentVersion(this.d.y());
            this.h.setmWaterfallExtra(this.d.H());
            this.h.setBidFloor(this.d.c());
            this.h.setParalleType(this.d.q());
            this.h.setReqParallelNum(this.d.s());
            this.h.setWaterfallABTest(this.d.G());
        }
    }

    protected int b(int i2) {
        List<Integer> list = this.n;
        if (list == null) {
            return -1;
        }
        return list.indexOf(Integer.valueOf(i2)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(AdError adError);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(List<TTBaseAd> list, AdError adError) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.M()) {
            return;
        }
        if (this.N) {
            list = null;
            adError = new AdError(AdError.ERROR_CODE_DESTROY, AdError.getMessage(AdError.ERROR_CODE_DESTROY));
        }
        if (u()) {
            return;
        }
        if (!i0.a(list)) {
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "单个广告加载完成！给外部回调：invokeSingleAdLoadCallbackUI......");
            for (TTBaseAd tTBaseAd : list) {
                Logger.i("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_FILL) + "AdNetWorkName[" + tTBaseAd.getAdNetWorkName() + "] AdUnitId[" + tTBaseAd.getAdNetworkSlotId() + "]  请求成功 (loadSort=" + tTBaseAd.getLoadSort() + ",showSort=" + tTBaseAd.getShowSort() + ")");
            }
        }
        if (adError != null) {
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "单个广告加载失败！给外部回调：invokeSingleAdLoadCallbackUI...... errorCode:" + adError.code + "  errorMsg:" + adError.message);
        }
        ThreadHelper.runOnUiThread(new d(list, adError));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(List<TTBaseAd> list, boolean z) {
        if (this.b0 == null) {
            this.b0 = e(list);
        }
        if (this.u.get()) {
            return;
        }
        this.W = SystemClock.elapsedRealtime();
        boolean u = u();
        TTBaseAd tTBaseAd = this.b0;
        AdSlot adSlot = this.h;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        long j2 = this.W;
        long j3 = this.V;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd, adSlot, cVar, j2 - j3, j(), !u, list != null ? list.size() : 0, this.X, z);
        this.u.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a0 A[PHI: r0 r10 
      PHI: (r0v14 ??) = (r0v6 boolean), (r0v15 ??) binds: [B:57:0x0294, B:59:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v2 boolean) = (r10v1 boolean), (r10v3 boolean) binds: [B:57:0x0294, B:59:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a6 A[PHI: r10 
      PHI: (r10v4 boolean) = (r10v3 boolean), (r10v5 boolean) binds: [B:59:0x02a2, B:14:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a8 A[PHI: r0 
      PHI: (r0v16 ??) = (r0v15 ??), (r0v0 int) binds: [B:59:0x02a2, B:35:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02aa  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x020e -> B:36:0x0211). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02a0 -> B:59:0x02a2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r23, int r24) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0() {
        AdSlot adSlot = this.h;
        if (adSlot == null || this.d == null) {
            return;
        }
        adSlot.setNetWorkNum("network_ad_num_" + this.d.b());
        GMAdSlotBase gMAdSlotBase = this.w;
        if (gMAdSlotBase != null) {
            gMAdSlotBase.setNetWorkNum("network_ad_num_" + this.d.b());
        }
    }

    protected final void c(AdError adError) {
        ThreadHelper.runOnUiThread(new c(adError));
    }

    public void c(TTBaseAd tTBaseAd) {
        AdSlot adSlot = this.h;
        int mediationRitReqType = tTBaseAd.getMediationRitReqType(adSlot != null ? adSlot.getLinkedId() : null);
        tTBaseAd.setMediationRitReqType(3);
        tTBaseAd.setMediationRitReqTypeSrc(mediationRitReqType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(List<TTBaseAd> list) {
        if (i0.b(list)) {
            return;
        }
        if (this.s.g()) {
            b((List<TTBaseAd>) null, new AdError(AdError.SINGLE_AD_REQUEST_TIMEOUT, AdError.AD_LOAD_AD_TIME_OUT_ERROR_MSG));
        } else {
            b(list, (AdError) null);
        }
        TTBaseAd tTBaseAd = list.get(0);
        if (tTBaseAd.isPAd()) {
            this.q.addAll(list);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.q, (Comparator<TTBaseAd>) null);
            if (Logger.isDebug()) {
                for (TTBaseAd tTBaseAd2 : list) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载成功...........返回了P层广告_当前P层广告缓存池数量：" + this.q.size() + ",slotId：" + tTBaseAd2.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd2.getAdNetWorkName() + ",loadSort=" + tTBaseAd2.getLoadSort() + ",showSort=" + tTBaseAd2.getShowSort() + ",CPM=" + tTBaseAd2.getCpm());
                }
            }
        } else if (tTBaseAd.isServerBiddingAd()) {
            this.p.addAll(list);
            for (TTBaseAd tTBaseAd3 : list) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载成功...........返回了ServerBidding层广告_当前ServerBidding层广告缓存池数量：" + this.p.size() + ",slotId：" + tTBaseAd3.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd3.getAdNetWorkName() + ",loadSort=" + tTBaseAd3.getLoadSort() + ",showSort=" + tTBaseAd3.getShowSort() + ",CPM=" + tTBaseAd3.getCpm());
            }
        } else if (tTBaseAd.isMultiBiddingAd() || tTBaseAd.isClientBiddingAd()) {
            this.p.addAll(list);
            String str = tTBaseAd.isMultiBiddingAd() ? "多阶底价" : "clientBidding";
            for (TTBaseAd tTBaseAd4 : list) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载成功...........返回了" + str + "层广告_当前" + str + "层广告缓存池数量：" + this.p.size() + ",slotId：" + tTBaseAd4.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd4.getAdNetWorkName() + ",loadSort=" + tTBaseAd4.getLoadSort() + ",showSort=" + tTBaseAd4.getShowSort() + ",CPM=" + tTBaseAd4.getCpm());
            }
            this.s.a();
            W();
        } else {
            this.o.addAll(list);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.o, (Comparator<TTBaseAd>) null);
            if (Logger.isDebug()) {
                for (TTBaseAd tTBaseAd5 : list) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载成功...........返回了普通层广告_当前普通广告缓存池数量：" + this.o.size() + ",slotId：" + tTBaseAd5.getAdNetworkSlotId() + ",广告类型：" + tTBaseAd5.getAdNetWorkName() + ",loadSort=" + tTBaseAd5.getLoadSort() + ",showSort=" + tTBaseAd5.getShowSort() + ",CPM=" + tTBaseAd5.getCpm());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(int i2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> list = this.e.get(Integer.valueOf(i2));
        if (list != null) {
            Iterator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> it = list.iterator();
            while (it.hasNext()) {
                kVar = it.next();
                if (kVar != null && kVar.G() && TextUtils.equals(kVar.e(), "pangle")) {
                    break;
                }
            }
        }
        kVar = null;
        return kVar != null && kVar.s() == 3;
    }

    public HashMap<String, TTBaseAd> d(List<TTBaseAd> list) {
        HashMap<String, TTBaseAd> hashMap = new HashMap<>();
        if (list != null && list.size() > 0) {
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null) {
                    hashMap.put(tTBaseAd.getAdNetworkSlotId(), tTBaseAd);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:77:0x013d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.d(int):boolean");
    }

    protected void e(int i2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, cVar != null ? cVar.G() : null, !u(), j(), i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
        if (android.text.TextUtils.isEmpty(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_break12.a.a(r1.getTestSlotId())) == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAdFailed(com.bytedance.msdk.api.AdError r9, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d r10) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e.onAdFailed(com.bytedance.msdk.api.AdError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d):void");
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdLoaded(TTBaseAd tTBaseAd, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(tTBaseAd);
        onAdLoaded(arrayList, dVar);
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdLoaded(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        StringBuilder sb;
        String str;
        String str2;
        if (this.g != null) {
            if (dVar == null) {
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(list, this.d);
            a(dVar.d(), dVar.c(), dVar.e(), com.bytedance.msdk.base.a.a(dVar.b(), dVar.h()), 0, AdLoadInfo.AD_LOADED);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g.a(this.f, dVar, !i0.b(list) ? list.get(0) : null);
            a(list, dVar);
            if (dVar.a() == 0 && !i0.b(list)) {
                String adNetworkSlotId = list.get(0).getAdNetworkSlotId();
                if (a(adNetworkSlotId)) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "返回的普通广告被server Bidding过滤了......slotId:" + adNetworkSlotId);
                    return;
                }
            }
            this.s.a(dVar.d());
            if (u()) {
                b(list, dVar);
            }
            c(list);
            b(list, false);
            if (this.a.get() || r()) {
                return;
            }
            if (!i0.b(list) && list.get(0).isPAd() && s()) {
                TTBaseAd tTBaseAd = list.get(0);
                str2 = TTLogUtil.getTagSecondLevel(this.f) + "P层广告已经成功返回loadSort:" + tTBaseAd.getLoadSort() + " ,showSort:" + tTBaseAd.getLoadSort() + "  mTTPAdPoolList.size:" + this.q.size();
            } else if (((p() || n()) && !(p() && y())) || i0.b(list) || !a(list.get(0)) || !t()) {
                if (dVar.m() && t()) {
                    if (this.q.size() >= i()) {
                        sb = new StringBuilder();
                        sb.append(TTLogUtil.getTagSecondLevel(this.f));
                        str = "SeverBidding广告有返回时P层池中有广告直接返回......";
                    } else {
                        for (TTBaseAd tTBaseAd2 : this.o) {
                            if (a(tTBaseAd2) && m()) {
                                sb = new StringBuilder();
                                sb.append(TTLogUtil.getTagSecondLevel(this.f));
                                str = "SeverBidding广告有返回且满足ClientBidding等待时间时普通池中有广告直接返回......";
                            }
                        }
                    }
                    sb.append(str);
                    Logger.d("TTMediationSDK", sb.toString());
                    q();
                }
                if (this.s.f() && m()) {
                    Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "所有层级和所有waterfall都已完成且满足ClientBidding等待时间直接回调...");
                    q();
                }
                return;
            } else {
                TTBaseAd tTBaseAd3 = list.get(0);
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "普通广告当前层优先级最高的广告已经成功返回loadSort:" + tTBaseAd3.getLoadSort() + " ,showSort:" + tTBaseAd3.getShowSort() + "  mTTCommonAdPoolList.size:" + this.o.size());
                if (m()) {
                    str2 = TTLogUtil.getTagSecondLevel(this.f) + "满足广告的返回条件...直接返回...";
                }
            }
            Logger.e("TTMediationSDK", str2);
            q();
        }
    }

    @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdVideoCache() {
        if (this.g == null || this.b.get() || this.c.get() || !this.a.get()) {
            return;
        }
        this.c.set(true);
        S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void q() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + " load done..........s:" + this.a.get() + "  f:" + this.b.get() + "     p.size" + this.q.size() + "   bidding.size:" + this.p.size() + "   normal.size:" + this.o.size());
        j0();
        this.C = false;
        if (this.a.get() || this.b.get()) {
            return;
        }
        Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "广告加载成功！给外部回调：invokeAdLoadCallbackOnMainUI........P.size:" + this.q.size() + "   bidding.size:" + this.p.size() + "   normal.size:" + this.o.size());
        this.a.set(true);
        z();
        if ((f0() || (e0() && !this.Z)) && (p() || n())) {
            List<TTBaseAd> v = v();
            TTBaseAd tTBaseAd = v.size() > 0 ? v.get(0) : null;
            int i2 = i();
            if (i2 > 1) {
                arrayList = new ArrayList();
                for (int i3 = 1; i3 < i2; i3++) {
                    if (i3 < v.size()) {
                        arrayList.add(v.get(i3));
                    }
                }
                if (v.size() > i2) {
                    arrayList2 = new ArrayList();
                    while (i2 < v.size()) {
                        TTBaseAd tTBaseAd2 = v.get(i2);
                        if (tTBaseAd2 != null && tTBaseAd2.isServerBiddingAd()) {
                            arrayList2.add(tTBaseAd2);
                        }
                        i2++;
                    }
                } else {
                    arrayList2 = null;
                }
            } else {
                arrayList = null;
                arrayList2 = null;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd, this.h, arrayList, arrayList2);
        }
        if (!this.Z) {
            List<TTBaseAd> v2 = v();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(!i0.b(v2) ? v2.get(0).getCpm() : PangleAdapterUtils.CPM_DEFLAUT_VALUE, this.f, this.h.getAdType());
        }
        if (u()) {
            a(true);
            return;
        }
        int i4 = (this.q.size() + this.o.size()) + this.p.size() >= i() ? i() : this.q.size() + this.o.size() + this.p.size();
        AdSlot adSlot = this.h;
        TTBaseAd tTBaseAd3 = this.O;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.V;
        int c0 = c0();
        int b2 = b(this.Q);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(adSlot, tTBaseAd3, elapsedRealtime - j2, c0, b2, 0, cVar != null ? cVar.G() : null, i4);
        ThreadHelper.runOnUiThread(new r());
        i0();
    }
}
