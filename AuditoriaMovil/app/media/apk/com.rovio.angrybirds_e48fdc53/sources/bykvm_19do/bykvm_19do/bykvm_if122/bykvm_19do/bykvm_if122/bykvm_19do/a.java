package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.facebook.AccessToken;
import com.facebook.login.widget.ToolTipPopup;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private int a;
    private int b;
    private RewardItem f;
    private AdSlot l;
    private TTBaseAd m;
    private long n;
    private String o;
    private i p;
    private boolean c = false;
    private boolean d = false;
    private long e = -1;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private int j = -1;
    private String k = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0036a implements Runnable {
        RunnableC0036a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0037a implements Runnable {

            /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0038a implements RewardItem {
                C0038a() {
                }

                @Override // com.bytedance.msdk.api.reward.RewardItem
                public float getAmount() {
                    if (a.this.l != null) {
                        return a.this.l.getRewardAmount();
                    }
                    return 0.0f;
                }

                @Override // com.bytedance.msdk.api.reward.RewardItem
                public Map<String, Object> getCustomData() {
                    HashMap hashMap = new HashMap();
                    hashMap.put("isGroMoreServerSideVerify", true);
                    hashMap.put("transId", a.this.o);
                    hashMap.put("reason", 0);
                    hashMap.put("gromoreExtra", (a.this.l == null || a.this.l.getCustomData() == null) ? "" : a.this.l.getCustomData().get("gromoreExtra"));
                    hashMap.put("errorCode", Integer.valueOf(a.this.j));
                    hashMap.put("errorMsg", a.this.k);
                    GMAdEcpmInfo a = p.a(a.this.l, a.this.m, true);
                    hashMap.put("adnName", a != null ? a.getAdnName() : "");
                    hashMap.put(RewardItem.KEY_ECPM, a != null ? a.getPreEcpm() : "");
                    return hashMap;
                }

                @Override // com.bytedance.msdk.api.reward.RewardItem
                public String getRewardName() {
                    return a.this.l != null ? a.this.l.getRewardName() : "";
                }

                @Override // com.bytedance.msdk.api.reward.RewardItem
                public boolean rewardVerify() {
                    return false;
                }
            }

            RunnableC0037a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.c) {
                    Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- verify回调兜底进来，已经destroy了, 直接return");
                } else if (a.this.p == null || a.this.h) {
                } else {
                    Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- verify回调兜底进来，给开发者verify回调");
                    a.this.h = true;
                    RewardItem c0038a = new C0038a();
                    i iVar = a.this.p;
                    if (a.this.f != null) {
                        c0038a = a.this.f;
                    }
                    iVar.onRewardVerify(c0038a);
                }
            }
        }

        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
            if (r7.a.i != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            r7.a.h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
            com.bytedance.msdk.adapter.util.Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- verify回调进来准备请求，但是不能重试");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
            if (r7.a.i != false) goto L20;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.b(r0)
                java.lang.String r1 = "GROMORE_SS_REWARD_VERIFY"
                if (r0 == 0) goto L11
                java.lang.String r0 = "--==-- verify回调进来，已经destroy, 直接return"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                goto La0
            L11:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                r2 = 1
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.c(r0, r2)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                com.bytedance.msdk.api.reward.RewardItem r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.g(r0)
                if (r0 == 0) goto L49
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$i r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.h(r0)
                if (r0 == 0) goto La0
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.i(r0)
                if (r0 != 0) goto La0
                java.lang.String r0 = "--==-- verify回调进来，已经有结果，直接给开发者回调"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.d(r0, r2)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$i r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.h(r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                com.bytedance.msdk.api.reward.RewardItem r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.g(r1)
                r0.onRewardVerify(r1)
                goto La0
            L49:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.j(r0)
                r4 = -1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                java.lang.String r2 = "--==-- verify回调进来准备请求，但是不能重试"
                if (r0 != 0) goto L77
                java.lang.String r0 = "--==-- verify回调进来，先进来发起请求"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r3 = android.os.SystemClock.elapsedRealtime()
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.a(r0, r3)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.k(r0)
                if (r0 == 0) goto L73
            L6d:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.l(r0)
                goto L96
            L73:
                com.bytedance.msdk.adapter.util.Logger.d(r1, r2)
                goto L96
            L77:
                long r3 = android.os.SystemClock.elapsedRealtime()
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.j(r0)
                long r3 = r3 - r5
                r5 = 2000(0x7d0, double:9.88E-321)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L96
                java.lang.String r0 = "--==-- verify回调进来，后进来但大于2s，发起请求"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.k(r0)
                if (r0 == 0) goto L73
                goto L6d
            L96:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$c$a r0 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$c$a
                r0.<init>()
                r1 = 3000(0xbb8, double:1.482E-320)
                com.bytedance.msdk.adapter.util.ThreadHelper.postDelayOnMSDKThread(r0, r1)
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            if (r7.a.i != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
            r7.a.h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            com.bytedance.msdk.adapter.util.Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- complete回调进来准备请求，但是不能重试");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
            if (r7.a.i != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.b(r0)
                java.lang.String r1 = "GROMORE_SS_REWARD_VERIFY"
                if (r0 == 0) goto L11
                java.lang.String r0 = "--==-- complete回调进来，已经destroy, 直接return"
            Lc:
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                goto La0
            L11:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                com.bytedance.msdk.api.reward.RewardItem r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.g(r0)
                if (r0 != 0) goto L6f
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.i(r0)
                if (r0 == 0) goto L22
                goto L6f
            L22:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.j(r0)
                r4 = -1
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                java.lang.String r2 = "--==-- complete回调进来准备请求，但是不能重试"
                if (r0 != 0) goto L50
                java.lang.String r0 = "--==-- complete回调进来，先进来发起请求"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r3 = android.os.SystemClock.elapsedRealtime()
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.a(r0, r3)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.k(r0)
                if (r0 == 0) goto L4c
            L46:
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.l(r0)
                goto La0
            L4c:
                com.bytedance.msdk.adapter.util.Logger.d(r1, r2)
                goto La0
            L50:
                long r3 = android.os.SystemClock.elapsedRealtime()
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                long r5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.j(r0)
                long r3 = r3 - r5
                r5 = 2000(0x7d0, double:9.88E-321)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto La0
                java.lang.String r0 = "--==-- complete回调进来，后进来但大于2s，发起请求"
                com.bytedance.msdk.adapter.util.Logger.d(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.k(r0)
                if (r0 == 0) goto L4c
                goto L46
            L6f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "--==-- complete回调进来，已经有响应("
                r0.append(r2)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                com.bytedance.msdk.api.reward.RewardItem r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.g(r2)
                if (r2 == 0) goto L83
                r2 = 1
                goto L84
            L83:
                r2 = 0
            L84:
                r0.append(r2)
                java.lang.String r2 = ")或已经给出开发者回调("
                r0.append(r2)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.this
                boolean r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.i(r2)
                r0.append(r2)
                java.lang.String r2 = "), 直接return"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                goto Lc
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements RewardItem {
        final /* synthetic */ boolean a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        e(boolean z, int i, String str, int i2) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public float getAmount() {
            return this.b;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public Map<String, Object> getCustomData() {
            HashMap hashMap = new HashMap();
            hashMap.put("isGroMoreServerSideVerify", true);
            hashMap.put("transId", a.this.o);
            hashMap.put("reason", Integer.valueOf(this.d));
            hashMap.put("gromoreExtra", (a.this.l == null || a.this.l.getCustomData() == null) ? "" : a.this.l.getCustomData().get("gromoreExtra"));
            hashMap.put("errorCode", Integer.valueOf(a.this.j));
            hashMap.put("errorMsg", a.this.k);
            GMAdEcpmInfo a = p.a(a.this.l, a.this.m, true);
            hashMap.put("adnName", a != null ? a.getAdnName() : "");
            hashMap.put(RewardItem.KEY_ECPM, a != null ? a.getPreEcpm() : "");
            return hashMap;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public String getRewardName() {
            return this.c;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public boolean rewardVerify() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.e != -1 || a.this.c || a.this.d) {
                Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- showListen计时到时间，已经destroy，或者skip，或者比complete/verify回调还晚，直接return");
                return;
            }
            Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- showListen计时到时间，发起请求");
            a.this.h();
            ThreadHelper.postDelayOnMSDKThread(new h(1), 3000L);
            ThreadHelper.postDelayOnMSDKThread(new h(2), ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
            ThreadHelper.postDelayOnMSDKThread(new h(3), 9000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a {

        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0039a implements Runnable {
            final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b a;

            RunnableC0039a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.a);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            final /* synthetic */ IOException a;

            b(g gVar, IOException iOException) {
                this.a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- ServerSide verify http error: " + this.a.toString());
            }
        }

        g() {
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b bVar2) {
            ThreadHelper.runOnMSDKThread(new RunnableC0039a(bVar2));
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b bVar, IOException iOException) {
            ThreadHelper.runOnMSDKThread(new b(this, iOException));
        }
    }

    /* loaded from: classes.dex */
    private class h implements Runnable {
        private final int a;

        h(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f != null || a.this.h || !a.this.i || a.this.c || a.this.d) {
                return;
            }
            Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- ServerSide reward verify 进行第" + this.a + "次重试请求");
            a.this.h();
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void onRewardVerify(RewardItem rewardItem);
    }

    public a(String str) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b2;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c f2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f();
        if (f2 != null && (b2 = f2.b(str, 101)) != null) {
            this.a = b2.A();
            this.b = b2.z();
        }
        if (this.a < 0) {
            this.a = 15000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[Catch: JSONException -> 0x0133, TryCatch #3 {JSONException -> 0x0133, blocks: (B:8:0x0011, B:10:0x003f, B:11:0x0043, B:15:0x004e, B:17:0x0076, B:21:0x0080, B:42:0x00d7, B:44:0x0114, B:46:0x0118, B:48:0x011c, B:28:0x00ad, B:34:0x00c4, B:23:0x008a), top: B:59:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do.a.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b):void");
    }

    private String f() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", "4.2.0.2");
            jSONObject.put("user_agent", com.bytedance.msdk.base.b.b);
            jSONObject.put("network", z.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()));
            jSONObject.put("play_start_ts", this.n);
            jSONObject.put("play_end_ts", System.currentTimeMillis());
            AdSlot adSlot = this.l;
            jSONObject.put(AccessToken.USER_ID_KEY, adSlot != null ? adSlot.getUserID() : "");
            if (TextUtils.isEmpty(this.o)) {
                str = UUID.randomUUID().toString();
                this.o = str;
            } else {
                str = this.o;
            }
            jSONObject.put("trans_id", str);
            AdSlot adSlot2 = this.l;
            jSONObject.put("link_id", adSlot2 != null ? adSlot2.getLinkedId() : "");
            AdSlot adSlot3 = this.l;
            jSONObject.put("prime_rit", adSlot3 != null ? adSlot3.getAdUnitId() : "");
            TTBaseAd tTBaseAd = this.m;
            jSONObject.put("adn_rit", tTBaseAd != null ? tTBaseAd.getAdNetworkSlotId() : "");
            AdSlot adSlot4 = this.l;
            jSONObject.put(MediationConstant.REWARD_NAME, adSlot4 != null ? adSlot4.getRewardName() : "");
            AdSlot adSlot5 = this.l;
            jSONObject.put(MediationConstant.REWARD_AMOUNT, adSlot5 != null ? adSlot5.getRewardAmount() : 0);
            AdSlot adSlot6 = this.l;
            jSONObject.put("media_extra", (adSlot6 == null || adSlot6.getCustomData() == null) ? "" : this.l.getCustomData().get("gromoreExtra"));
            AdSlot adSlot7 = this.l;
            if (adSlot7 != null && adSlot7.getScenarioId() != null) {
                jSONObject.put("scenario_id", this.l.getScenarioId());
            }
            GMAdEcpmInfo a = p.a(this.l, this.m, true);
            jSONObject.put(GMAdConstant.EXTRA_ADNNAME, a != null ? a.getAdnName() : "");
            jSONObject.put(RewardItem.KEY_ECPM, a != null ? a.getPreEcpm() : "");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return n0.a(jSONObject).toString();
    }

    private void g() {
        Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- showListen回调进来，开始计时");
        ThreadHelper.postDelayOnMSDKThread(new f(), this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c c2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b().a().c();
        c2.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c.f());
        String q = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().q();
        if (!TextUtils.isEmpty(q)) {
            c2.a("X-Tt-Env", q);
            c2.a("x-use-ppe", "1");
        }
        c2.a("User-Agent", com.bytedance.msdk.base.b.b);
        c2.c(f());
        c2.a(new g());
    }

    public void a() {
        ThreadHelper.runOnMSDKThread(new b());
    }

    public void a(i iVar) {
        this.p = iVar;
    }

    public void a(AdSlot adSlot, TTBaseAd tTBaseAd) {
        this.n = System.currentTimeMillis();
        this.l = adSlot;
        this.m = tTBaseAd;
        g();
    }

    public boolean b() {
        boolean z = this.b == 1;
        Logger.d("GROMORE_SS_REWARD_VERIFY", "--==-- 判断是否开启了M服务端激励验证： " + z);
        return z;
    }

    public void c() {
        ThreadHelper.runOnMSDKThread(new RunnableC0036a());
    }

    public void d() {
        ThreadHelper.runOnMSDKThread(new c());
    }

    public void e() {
        ThreadHelper.runOnMSDKThread(new d());
    }
}
