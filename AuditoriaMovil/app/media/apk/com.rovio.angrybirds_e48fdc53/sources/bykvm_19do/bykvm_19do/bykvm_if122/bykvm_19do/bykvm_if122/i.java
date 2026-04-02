package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.r;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.listener.ITTAdapterRewardedAdListener;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.TTVideoOptionUtil;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdLoadCallback;
import com.bytedance.msdk.api.v2.slot.GMAdSlotRewardVideo;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d implements ITTAdapterRewardedAdListener {
    private GMRewardedAdLoadCallback j0;
    private GMRewardedAdListener k0;
    private GMRewardedAdListener l0;
    private final bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a m0;
    private final bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a n0;
    private com.bytedance.msdk.core.admanager.reward.rewardagain.c o0;
    private boolean p0;
    GMRewardedAdListener q0;

    /* loaded from: classes.dex */
    class a implements GMRewardedAdListener {

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0042a implements a.i {

            /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0043a implements Runnable {
                final /* synthetic */ RewardItem a;

                RunnableC0043a(RewardItem rewardItem) {
                    this.a = rewardItem;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (i.this.l0 != null) {
                        i.this.l0.onRewardVerify(this.a);
                        i.this.a(this.a, 1);
                    }
                }
            }

            C0042a() {
            }

            @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.i
            public void onRewardVerify(RewardItem rewardItem) {
                ThreadHelper.runOnUiThread(new RunnableC0043a(rewardItem));
            }
        }

        a() {
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardClick() {
            String str;
            String str2;
            String str3 = null;
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.getAdNetWorkName())) {
                    if (!r.b(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 5, 1, 1, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    } else if (r.d()) {
                        str2 = u.a(Thread.currentThread().getStackTrace());
                        if (!i.this.h0() && i.this.l0 != null) {
                            i.this.l0.onRewardClick();
                        }
                        str = str2;
                    }
                }
                str2 = null;
                if (!i.this.h0()) {
                    i.this.l0.onRewardClick();
                }
                str = str2;
            } else {
                if (i.this.l0 != null) {
                    i.this.l0.onRewardClick();
                }
                str = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O)) {
                str3 = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 1, str3, j, str, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.isClickListenRepeatPlayAgainOnce());
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardVerify(RewardItem rewardItem) {
            GMRewardedAdListener gMRewardedAdListener;
            AdSlot adSlot;
            TTBaseAd tTBaseAd;
            if (!r.a()) {
                if (!i.this.n0.b()) {
                    if (i.this.l0 != null) {
                        gMRewardedAdListener = i.this.l0;
                        adSlot = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h;
                        tTBaseAd = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O;
                        gMRewardedAdListener.onRewardVerify(i.a(adSlot, rewardItem, tTBaseAd));
                        i.this.a((RewardItem) null, 1);
                        return;
                    }
                    return;
                }
                i.this.n0.d();
            }
            if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.getAdNetWorkName())) {
                if (!r.b(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 4, 1, 1, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 4, 0, 1, r.f() ? u.a(Thread.currentThread().getStackTrace()) : null);
            }
            if (i.this.h0()) {
                return;
            }
            if (!i.this.n0.b()) {
                if (i.this.l0 != null) {
                    gMRewardedAdListener = i.this.l0;
                    adSlot = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h;
                    tTBaseAd = ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O;
                    gMRewardedAdListener.onRewardVerify(i.a(adSlot, rewardItem, tTBaseAd));
                    i.this.a((RewardItem) null, 1);
                    return;
                }
                return;
            }
            i.this.n0.d();
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdClosed() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.getAdNetWorkName())) {
                    if (!r.b(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 2, 1, 1, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 2, 0, 1, (String) null);
                }
                if (i.this.h0() || i.this.l0 == null) {
                    return;
                }
            } else if (i.this.l0 == null) {
                return;
            }
            i.this.l0.onRewardedAdClosed();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onRewardedAdShow() {
            /*
                Method dump skipped, instructions count: 383
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i.a.onRewardedAdShow():void");
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onRewardedAdShowFail(AdError adError) {
            String str;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            } else {
                str = null;
                j = -1;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, adError, 1, 1, str, j);
            i.this.e(adError);
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onSkippedVideo() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.getAdNetWorkName())) {
                    if (!r.b(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 3, 1, 1, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 3, 0, 1, (String) null);
                }
                if (i.this.h0()) {
                    return;
                }
                if (i.this.n0.b()) {
                    i.this.n0.c();
                }
                if (i.this.l0 == null) {
                    return;
                }
            } else {
                if (i.this.n0.b()) {
                    i.this.n0.c();
                }
                if (i.this.l0 == null) {
                    return;
                }
            }
            i.this.l0.onSkippedVideo();
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoComplete() {
            if (r.a()) {
                if (((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O != null && "pangle".equals(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O.getAdNetWorkName())) {
                    if (!r.b(Thread.currentThread().getStackTrace())) {
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 1, 1, 1, u.a(Thread.currentThread().getStackTrace()));
                        return;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, 1, 0, 1, (String) null);
                }
                if (i.this.h0()) {
                    return;
                }
                if (i.this.n0.b()) {
                    i.this.n0.e();
                }
                if (i.this.l0 == null) {
                    return;
                }
            } else {
                if (i.this.n0.b()) {
                    i.this.n0.e();
                }
                if (i.this.l0 == null) {
                    return;
                }
            }
            i.this.l0.onVideoComplete();
        }

        @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
        public void onVideoError() {
            String str;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (u.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O)) {
                str = u.b(Thread.currentThread().getStackTrace());
                j = System.currentTimeMillis() - currentTimeMillis;
            } else {
                str = null;
                j = -1;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e) i.this).O, ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c) i.this).h, (AdError) null, 2, 1, str, j);
            if (i.this.l0 != null) {
                i.this.l0.onVideoError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d.c {
        b() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.c
        public void a() {
            i.this.d(new AdError(AdError.ERROR_CODE_SHOW_FAIL_NO_AD, AdError.getMessage(AdError.ERROR_CODE_SHOW_FAIL_NO_AD)));
        }
    }

    /* loaded from: classes.dex */
    class c implements a.i {

        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ RewardItem a;

            a(RewardItem rewardItem) {
                this.a = rewardItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.k0 != null) {
                    i.this.k0.onRewardVerify(this.a);
                    i.this.a(this.a, 0);
                }
            }
        }

        c() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.i
        public void onRewardVerify(RewardItem rewardItem) {
            ThreadHelper.runOnUiThread(new a(rewardItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        final /* synthetic */ AdError a;

        d(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.k0 != null) {
                i.this.k0.onRewardedAdShowFail(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        final /* synthetic */ AdError a;

        e(AdError adError) {
            this.a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.l0 != null) {
                i.this.l0.onRewardedAdShowFail(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f implements RewardItem {
        final /* synthetic */ RewardItem a;
        final /* synthetic */ AdSlot b;
        final /* synthetic */ TTBaseAd c;

        f(RewardItem rewardItem, AdSlot adSlot, TTBaseAd tTBaseAd) {
            this.a = rewardItem;
            this.b = adSlot;
            this.c = tTBaseAd;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public float getAmount() {
            return this.a.getAmount();
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public Map<String, Object> getCustomData() {
            Map<String, Object> customData = this.a.getCustomData();
            if (customData == null) {
                customData = new HashMap<>();
            }
            GMAdEcpmInfo a = p.a(this.b, this.c, true);
            customData.put("adnName", a != null ? a.getAdnName() : "");
            customData.put(RewardItem.KEY_ECPM, a != null ? a.getPreEcpm() : "");
            return customData;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public String getRewardName() {
            return this.a.getRewardName();
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public boolean rewardVerify() {
            return this.a.rewardVerify();
        }
    }

    public i(Context context, String str) {
        super(context, str);
        this.m0 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a(this.f);
        this.n0 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a(this.f);
        this.q0 = new a();
    }

    public static RewardItem a(AdSlot adSlot, RewardItem rewardItem, TTBaseAd tTBaseAd) {
        if (rewardItem == null) {
            return null;
        }
        return new f(rewardItem, adSlot, tTBaseAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RewardItem rewardItem, int i) {
        String str;
        long j;
        int i2;
        int i3;
        String str2;
        Map<String, Object> customData;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str = null;
            j = -1;
        }
        String str3 = str;
        long j2 = j;
        if (rewardItem == null || (customData = rewardItem.getCustomData()) == null) {
            i2 = 0;
            i3 = 0;
            str2 = "";
        } else {
            Integer num = (Integer) customData.get("reason");
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) customData.get("errorCode");
            i3 = num2 != null ? num2.intValue() : 0;
            str2 = (String) customData.get("errorMsg");
            i2 = intValue;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, i, str3, j2, i2, i3, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AdError adError) {
        ThreadHelper.runOnUiThread(new d(adError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(AdError adError) {
        ThreadHelper.runOnUiThread(new e(adError));
    }

    private boolean k0() {
        StringBuilder sb;
        String str;
        AdSlot adSlot = this.h;
        if (adSlot == null || adSlot.getIsRa() == 1) {
            sb = new StringBuilder();
            str = "--==--ra: 激励再得，一次链路只展示一次激励再得: ";
        } else {
            com.bytedance.msdk.core.admanager.reward.rewardagain.a b2 = com.bytedance.msdk.core.admanager.reward.rewardagain.c.b(this.f);
            if (b2 == null) {
                sb = new StringBuilder();
                str = "--==--ra: 激励再得开关未开启: ";
            } else if (!this.p0) {
                com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar = this.o0;
                if (cVar != null) {
                    int a2 = cVar.a(this.h, b2);
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
                    String G = cVar2 != null ? cVar2.G() : null;
                    int i = 2;
                    if (!(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.f, e()) == 2)) {
                        i = 1;
                    } else if (this.i0) {
                        i = 4;
                    }
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, G, a2, i);
                    if (a2 == 0) {
                        this.o0.a(b2, G);
                        return true;
                    }
                }
                return false;
            } else {
                sb = new StringBuilder();
                str = "--==--ra: 激励再得，adn已经触发了再看一个: ";
            }
        }
        sb.append(str);
        sb.append(this.f);
        Logger.d("TTMediationSDK", sb.toString());
        return false;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void D() {
        super.D();
        this.m0.a();
        this.n0.a();
        this.j0 = null;
        this.k0 = null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        GMRewardedAdLoadCallback gMRewardedAdLoadCallback = this.j0;
        if (gMRewardedAdLoadCallback != null) {
            gMRewardedAdLoadCallback.onRewardVideoAdLoad();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
        GMRewardedAdLoadCallback gMRewardedAdLoadCallback = this.j0;
        if (gMRewardedAdLoadCallback != null) {
            gMRewardedAdLoadCallback.onRewardVideoCached();
        }
    }

    public void a(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar = this.o0;
        if (cVar != null) {
            cVar.a(activity, map);
        }
        super.a(activity, map, new b());
        if (this.k0 == null) {
            Logger.d("TTMediationSDK", "注意：未设置GMRewardedAdListener，将收不到广告播放/点击/关闭等回调信息");
        }
    }

    public void a(AdSlot adSlot, GMAdSlotRewardVideo gMAdSlotRewardVideo, GMRewardedAdLoadCallback gMRewardedAdLoadCallback) {
        if (f0()) {
            this.j0 = gMRewardedAdLoadCallback;
            this.h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(adSlot);
            AdSlot adSlot2 = this.h;
            if (adSlot2 != null) {
                adSlot2.setAdType(7);
                this.h.setAdCount(1);
                TTVideoOptionUtil.setRewardTTVideoOptionIfNeed(this.h);
            }
            this.J = this;
            this.K = this.q0;
            this.w = gMAdSlotRewardVideo;
            if (this.h != null && com.bytedance.msdk.core.admanager.reward.rewardagain.c.b(this.f) != null) {
                this.o0 = new com.bytedance.msdk.core.admanager.reward.rewardagain.c(this.I, this.h, gMAdSlotRewardVideo, this.k0, this.l0);
            }
            U();
        }
    }

    public void a(GMRewardedAdListener gMRewardedAdListener) {
        this.k0 = gMRewardedAdListener;
        com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar = this.o0;
        if (cVar != null) {
            cVar.a(gMRewardedAdListener);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void b(AdError adError) {
        GMRewardedAdLoadCallback gMRewardedAdLoadCallback = this.j0;
        if (gMRewardedAdLoadCallback != null) {
            gMRewardedAdLoadCallback.onRewardVideoLoadFail(adError);
        }
    }

    public void b(GMRewardedAdListener gMRewardedAdListener) {
        this.l0 = gMRewardedAdListener;
        com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar = this.o0;
        if (cVar != null) {
            cVar.b(gMRewardedAdListener);
        }
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onRewardClick() {
        String str;
        String str2;
        GMRewardedAdListener gMRewardedAdListener;
        String str3 = null;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.b(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 5, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                } else if (r.d()) {
                    str2 = u.a(Thread.currentThread().getStackTrace());
                    if (!h0() && (gMRewardedAdListener = this.k0) != null) {
                        gMRewardedAdListener.onRewardClick();
                    }
                    str = str2;
                }
            }
            str2 = null;
            if (!h0()) {
                gMRewardedAdListener.onRewardClick();
            }
            str = str2;
        } else {
            GMRewardedAdListener gMRewardedAdListener2 = this.k0;
            if (gMRewardedAdListener2 != null) {
                gMRewardedAdListener2.onRewardClick();
            }
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (u.a(this.O)) {
            str3 = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        }
        TTBaseAd tTBaseAd2 = this.O;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd2, this.h, 0, str3, j, str, tTBaseAd2.isClickListenRepeatOnce());
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onRewardVerify(RewardItem rewardItem) {
        GMRewardedAdListener gMRewardedAdListener;
        if (!r.a()) {
            com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar = this.o0;
            if (cVar != null) {
                cVar.b();
            }
            if (!this.m0.b()) {
                gMRewardedAdListener = this.k0;
                if (gMRewardedAdListener == null) {
                    return;
                }
                gMRewardedAdListener.onRewardVerify(a(this.h, rewardItem, this.O));
                a((RewardItem) null, 0);
                return;
            }
            this.m0.d();
        }
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
            if (!r.b(Thread.currentThread().getStackTrace())) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 4, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                return;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 4, 0, 0, r.f() ? u.a(Thread.currentThread().getStackTrace()) : null);
        }
        if (h0()) {
            return;
        }
        com.bytedance.msdk.core.admanager.reward.rewardagain.c cVar2 = this.o0;
        if (cVar2 != null) {
            cVar2.b();
        }
        if (!this.m0.b()) {
            gMRewardedAdListener = this.k0;
            if (gMRewardedAdListener == null) {
                return;
            }
            gMRewardedAdListener.onRewardVerify(a(this.h, rewardItem, this.O));
            a((RewardItem) null, 0);
            return;
        }
        this.m0.d();
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onRewardedAdClosed() {
        GMRewardedAdListener gMRewardedAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.b(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 2, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 2, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            if (k0() || (gMRewardedAdListener = this.k0) == null) {
                return;
            }
        } else {
            j0();
            if (k0() || (gMRewardedAdListener = this.k0) == null) {
                return;
            }
        }
        gMRewardedAdListener.onRewardedAdClosed();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRewardedAdShow() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.i.onRewardedAdShow():void");
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onRewardedAdShowFail(AdError adError) {
        String str;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str = null;
            j = -1;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, adError, 1, 0, str, j);
        d(adError);
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onSkippedVideo() {
        GMRewardedAdListener gMRewardedAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.b(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 3, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 3, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            if (this.m0.b()) {
                this.m0.c();
            }
            gMRewardedAdListener = this.k0;
            if (gMRewardedAdListener == null) {
                return;
            }
        } else {
            j0();
            if (this.m0.b()) {
                this.m0.c();
            }
            gMRewardedAdListener = this.k0;
            if (gMRewardedAdListener == null) {
                return;
            }
        }
        gMRewardedAdListener.onSkippedVideo();
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onVideoComplete() {
        GMRewardedAdListener gMRewardedAdListener;
        if (r.a()) {
            TTBaseAd tTBaseAd = this.O;
            if (tTBaseAd != null && "pangle".equals(tTBaseAd.getAdNetWorkName())) {
                if (!r.b(Thread.currentThread().getStackTrace())) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 1, 1, 0, u.a(Thread.currentThread().getStackTrace()));
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, 1, 0, 0, (String) null);
            }
            if (h0()) {
                return;
            }
            j0();
            if (this.m0.b()) {
                this.m0.e();
            }
            gMRewardedAdListener = this.k0;
            if (gMRewardedAdListener == null) {
                return;
            }
        } else {
            j0();
            if (this.m0.b()) {
                this.m0.e();
            }
            gMRewardedAdListener = this.k0;
            if (gMRewardedAdListener == null) {
                return;
            }
        }
        gMRewardedAdListener.onVideoComplete();
    }

    @Override // com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener
    public void onVideoError() {
        String str;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        if (u.a(this.O)) {
            str = u.b(Thread.currentThread().getStackTrace());
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            str = null;
            j = -1;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.O, this.h, (AdError) null, 2, 0, str, j);
        GMRewardedAdListener gMRewardedAdListener = this.k0;
        if (gMRewardedAdListener != null) {
            gMRewardedAdListener.onVideoError();
        }
    }
}
