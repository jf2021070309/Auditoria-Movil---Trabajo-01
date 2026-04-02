package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19;

import android.app.Activity;
import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.z;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomTTBaseAd;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_if122.d {
    protected boolean h0;
    protected boolean i0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ TTBaseAd a;

        a(TTBaseAd tTBaseAd) {
            this.a = tTBaseAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            TTBaseAd tTBaseAd = this.a;
            if (tTBaseAd == null || !tTBaseAd.adnHasAdVideoCachedApi() || !this.a.isCacheSuccess() || (d.this.O instanceof GMCustomTTBaseAd)) {
                return;
            }
            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(d.this.f, this.a.getAdNetworkSlotId()) + "在show时触发了预加载【" + this.a.getAdNetWorkName() + "】, loadSort: " + this.a.getLoadSort() + ", showSort: " + this.a.getShowSort());
            d.this.i0 = true;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d();
            d dVar = d.this;
            d.b(dVar.I, dVar.f, dVar.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ TTBaseAd a;
        final /* synthetic */ Activity b;
        final /* synthetic */ Map c;

        b(TTBaseAd tTBaseAd, Activity activity, Map map) {
            this.a = tTBaseAd;
            this.b = activity;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            TTBaseAd tTBaseAd = this.a;
            if (tTBaseAd != null) {
                d dVar = d.this;
                dVar.O = tTBaseAd;
                dVar.O.setHasShown(true);
                d dVar2 = d.this;
                dVar2.O.setTTAdatperCallback(dVar2.J);
                d dVar3 = d.this;
                dVar3.O.setTTAdatperRewardPlayAgainCallback(dVar3.K);
                if (d.this.O.canAdReuse()) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a();
                    d dVar4 = d.this;
                    if (a.c(dVar4.f, dVar4.O.getAdNetworkSlotId(), d.this.e())) {
                        d dVar5 = d.this;
                        TTBaseAd tTBaseAd2 = dVar5.O;
                        dVar5.a(tTBaseAd2, tTBaseAd2.getAdNetworkSlotId());
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(TTLogUtil.getTagThirdLevelByEvent(d.this.f, TTLogUtil.TAG_EVENT_SHOW));
                sb.append("展示的广告类型：");
                sb.append(com.bytedance.msdk.base.a.a(d.this.O.getAdNetworkPlatformId()));
                sb.append(",slotId：");
                sb.append(d.this.O.getAdNetworkSlotId());
                sb.append(",slotType:");
                sb.append(d.this.O.getAdNetworkSlotType());
                sb.append(",isReady()：");
                d dVar6 = d.this;
                sb.append(dVar6.O.isReady(dVar6.f));
                sb.append("，是否为缓存广告:");
                sb.append(d.this.O.isCacheSuccess());
                Logger.d("TTMediationSDK", sb.toString());
                d.this.O.showAd(this.b, this.c);
                m b = m.b();
                b.j(d.this.f + "");
                l b2 = l.b();
                d dVar7 = d.this;
                b2.e(dVar7.f, dVar7.O.getAdNetworkSlotId());
                d dVar8 = d.this;
                dVar8.M = true;
                if (dVar8.O != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(d.this.O);
                    d.this.a(arrayList);
                }
                d dVar9 = d.this;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(dVar9.O, dVar9.h, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, String str) {
        super(context, str);
        this.h0 = false;
        this.i0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
        c(r5);
        a(r5, r20, r21);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r17, java.util.List<com.bytedance.msdk.base.TTBaseAd> r18, boolean r19, android.app.Activity r20, java.util.Map<com.bytedance.msdk.api.TTAdConstant.GroMoreExtraKey, java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.a(java.util.List, java.util.List, boolean, android.app.Activity, java.util.Map):boolean");
    }

    private boolean k0() {
        boolean e = z.e(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
        boolean f = z.f(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
        Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "setting 下发是否为弱网执行：" + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().N() + "，当前网络环境：2G-type=" + e + ",3G-type=" + f);
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().N() && (e || f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Activity activity, c cVar) {
        List<k> list;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> a2;
        TTBaseAd tTBaseAd;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, cVar2 != null ? cVar2.G() : null);
        if (this.M) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((List<TTBaseAd>) null, this.h);
            if (cVar == null) {
                return;
            }
        } else {
            List<TTBaseAd> v = v();
            try {
                list = M();
            } catch (Throwable th) {
                th.printStackTrace();
                list = null;
            }
            if (list != null && list.size() > 0) {
                HashMap<String, TTBaseAd> d = d(v);
                for (k kVar : list) {
                    if (kVar != null) {
                        String d2 = kVar.d();
                        TTBaseAd tTBaseAd2 = d.get(d2);
                        if (tTBaseAd2 != null && tTBaseAd2.isReady(this.f) && !tTBaseAd2.isHasShown()) {
                            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "adSlotId：" + tTBaseAd2.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd2.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd2.isReady(this.f));
                            a(tTBaseAd2, activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
                            return;
                        } else if (kVar.a() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, d2, e()) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h, false) == 3 && (a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d2, this.h)) != null && a2.size() > 0 && (tTBaseAd = a2.get(0).a) != null && tTBaseAd.isReady(this.f) && !tTBaseAd.isHasShown()) {
                            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "adSlotId：" + tTBaseAd.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd.isReady(this.f));
                            c(tTBaseAd);
                            a(tTBaseAd, activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
                            return;
                        }
                    }
                }
            }
            if (v != null && v.size() > 0) {
                for (TTBaseAd tTBaseAd3 : v) {
                    if (tTBaseAd3 != null && tTBaseAd3.isReady(this.f) && !tTBaseAd3.isHasShown()) {
                        Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelByEvent(this.f, TTLogUtil.TAG_EVENT_SHOW) + "adSlotId：" + tTBaseAd3.getAdNetworkSlotId() + "，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd3.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd3.isReady(this.f));
                        a(tTBaseAd3, activity, (Map<TTAdConstant.GroMoreExtraKey, Object>) null);
                        return;
                    }
                }
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(v, this.h);
            if (cVar == null) {
                return;
            }
        }
        cVar.a();
    }

    public void a(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map, c cVar) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
        List<k> list = null;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(this.h, cVar2 != null ? cVar2.G() : null);
        if (this.M) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((List<TTBaseAd>) null, this.h);
            if (cVar == null) {
                return;
            }
        } else {
            boolean k0 = k0();
            List<TTBaseAd> v = v();
            try {
                list = M();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            List<k> list2 = list;
            if (list2 != null && list2.size() > 0 && a(list2, v, k0, activity, map)) {
                return;
            }
            if (v != null && v.size() > 0) {
                for (TTBaseAd tTBaseAd : v) {
                    if (tTBaseAd != null) {
                        if (k0) {
                            if (tTBaseAd.isCacheSuccess()) {
                                Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(this.f, tTBaseAd.getAdNetworkSlotId()) + "弱网情况下已缓存好的广告，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd.isReady(this.f));
                            } else {
                                continue;
                            }
                        }
                        if (tTBaseAd.isReady(this.f) && !tTBaseAd.isHasShown()) {
                            a(tTBaseAd, activity, map);
                            return;
                        }
                    }
                }
                if (k0 && this.O == null) {
                    for (TTBaseAd tTBaseAd2 : v) {
                        if (tTBaseAd2 != null && tTBaseAd2.isReady(this.f) && !tTBaseAd2.isHasShown()) {
                            Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(this.f, tTBaseAd2.getAdNetworkSlotId()) + "弱网情况下没有缓存好的广告,那么直接根据优先级展示，广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd2.getAdNetworkPlatformId()) + ",isReady()：" + tTBaseAd2.isReady(this.f));
                            a(tTBaseAd2, activity, map);
                            return;
                        }
                    }
                }
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(v, this.h);
            if (cVar == null) {
                return;
            }
        }
        cVar.a();
    }

    public void a(TTBaseAd tTBaseAd, Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        ThreadHelper.runOnUiThread(new b(tTBaseAd, activity, map));
    }

    public void a(boolean z) {
        this.h0 = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map, c cVar) {
        a(activity, map, cVar);
    }

    public void d(TTBaseAd tTBaseAd) {
        ThreadHelper.runOnUiThread(new a(tTBaseAd));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r11.O.getAdNetworkPlatformId() == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0() {
        /*
            r11 = this;
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            int r0 = r0.getAdType()
            r1 = 0
            r2 = 1
            r3 = 10
            if (r0 == r3) goto L1f
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            int r0 = r0.getAdType()
            r3 = 8
            if (r0 == r3) goto L1f
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            int r0 = r0.getAdType()
            r3 = 7
            if (r0 != r3) goto L4a
        L1f:
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            boolean r0 = r0.adnHasAdVideoCachedApi()
            if (r0 == 0) goto L40
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            boolean r0 = r0.isCacheSuccess()
            if (r0 == 0) goto L40
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d()
            java.lang.String r3 = r11.f
            int r4 = r11.e()
            int r0 = r0.a(r3, r4)
            if (r0 == 0) goto L40
            r2 = r1
        L40:
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            int r0 = r0.getAdNetworkPlatformId()
            r3 = 4
            if (r0 != r3) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            r6 = r1
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            boolean r0 = r0.canAdReuse()
            if (r0 == 0) goto L83
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a()
            java.lang.String r1 = r11.f
            com.bytedance.msdk.base.TTBaseAd r2 = r11.O
            java.lang.String r2 = r2.getAdNetworkSlotId()
            int r3 = r11.e()
            boolean r0 = r0.c(r1, r2, r3)
            if (r0 == 0) goto L83
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a()
            com.bytedance.msdk.base.TTBaseAd r0 = r11.O
            java.lang.String r3 = r0.getAdNetworkSlotId()
            com.bytedance.msdk.api.AdSlot r4 = r11.h
            java.util.Map<java.lang.String, java.lang.Object> r5 = r11.r
            com.bytedance.msdk.api.v2.GMNetworkRequestInfo r7 = r11.T
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j r8 = r11.v
            android.content.Context r9 = r11.I
            com.bytedance.msdk.api.v2.slot.GMAdSlotBase r10 = r11.w
            r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.d.g0():void");
    }

    public boolean h0() {
        return this.h0;
    }

    public boolean i0() {
        List<k> list;
        try {
            list = M();
        } catch (Throwable th) {
            th.printStackTrace();
            list = null;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        return p.a(this.q, this.p, this.o, this.h, this.M, this.b, this.f, e(), list, cVar != null ? cVar.G() : null);
    }

    public void j0() {
        TTBaseAd tTBaseAd = this.O;
        if (tTBaseAd == null || tTBaseAd.getAdNetworkPlatformId() == 4) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(this.I, this.f, e());
    }
}
