package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.p;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class c {
    protected bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c d;
    protected Map<Integer, List<k>> e;
    protected String f;
    protected Handler g;
    protected AdSlot h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected List<Integer> n;
    protected int t;
    protected GMAdSlotBase w;
    protected long y;
    protected final AtomicBoolean a = new AtomicBoolean(false);
    protected final AtomicBoolean b = new AtomicBoolean(false);
    protected final AtomicBoolean c = new AtomicBoolean(false);
    protected int l = -1;
    protected final List<k> m = new CopyOnWriteArrayList();
    protected List<TTBaseAd> o = new CopyOnWriteArrayList();
    protected List<TTBaseAd> p = new CopyOnWriteArrayList();
    protected List<TTBaseAd> q = new CopyOnWriteArrayList();
    protected Map<String, Object> r = new HashMap();
    protected h s = new h();
    protected AtomicBoolean u = new AtomicBoolean(false);
    protected j v = new j();
    protected final AtomicBoolean x = new AtomicBoolean(false);
    protected boolean z = false;
    protected int A = 0;
    protected Map<String, TTAbsAdLoaderAdapter> B = new ConcurrentHashMap();
    protected boolean C = false;

    /* loaded from: classes.dex */
    class a implements d.a {
        final /* synthetic */ AdSlot a;
        final /* synthetic */ List b;

        a(AdSlot adSlot, List list) {
            this.a = adSlot;
            this.b = list;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d.a
        public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar) {
            c.this.a(this.a, this.b, aVar);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        final /* synthetic */ String a;

        /* loaded from: classes.dex */
        class a implements d.a {
            a() {
            }

            @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d.a
            public void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar) {
                Map<Integer, List<k>> map = c.this.e;
                List<k> list = map != null ? map.get(0) : null;
                c cVar = c.this;
                cVar.a(cVar.h, list, aVar);
            }
        }

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.f fVar = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.f) bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.e.a();
            String str = this.a;
            c cVar = c.this;
            fVar.a(str, cVar.y, cVar.h, cVar.d, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdSlot adSlot, List<k> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar) {
        List<TTBaseAd> list2;
        List<TTBaseAd> list3;
        AdError adError;
        StringBuilder sb;
        String str;
        List<TTBaseAd> list4;
        List<TTBaseAd> list5;
        if (this.v != null && aVar != null && !TextUtils.isEmpty(aVar.d)) {
            this.v.a = aVar.d;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        String G = cVar != null ? cVar.G() : null;
        if (aVar != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(adSlot, aVar, G, this.s.g() ? 1 : 0);
        }
        if (aVar == null || i0.a(aVar.b)) {
            this.l = 2;
            if (this.a.get() || this.b.get()) {
                return;
            }
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "serverBidding响应失败了.......... ");
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.s.a((String) null);
                }
            }
            this.s.a(0, true);
            if (this.s.g() || !this.s.f()) {
                C();
            } else {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "所有广告都已经加载完成....... ");
                List<TTBaseAd> list6 = this.q;
                if ((list6 == null || list6.size() <= 0) && (((list2 = this.o) == null || list2.size() <= 0) && ((list3 = this.p) == null || list3.size() <= 0))) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar2 = this.d;
                    if (cVar2 == null || !cVar2.M()) {
                        adError = new AdError(AdError.ERROR_CODE_AD_LOAD_FAIL, AdError.getMessage(AdError.ERROR_CODE_AD_LOAD_FAIL));
                        a(adError, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                    } else {
                        a(new AdError(AdError.ERROR_COED_ADM_ERROR, AdError.getMessage(AdError.ERROR_COED_ADM_ERROR)), (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append(TTLogUtil.getTagSecondLevel(this.f));
                    str = "exchange响应失败且所有的广告都已经加载完成，则给出成功回调.....";
                    sb.append(str);
                    Logger.e("TTMediationSDK", sb.toString());
                    q();
                }
            }
        } else {
            this.l = 1;
            if (this.a.get() || this.b.get()) {
                return;
            }
            Handler handler = this.g;
            if (handler != null) {
                handler.removeMessages(4);
                this.g.removeMessages(1);
                this.g.removeMessages(3);
            }
            this.m.clear();
            List<k> list7 = aVar.b;
            if (list7 != null) {
                this.m.addAll(list7);
            }
            a(this.m, this.d.N());
            if (i0.a(this.m)) {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "serverBidding响应回来..........没有P层，且普通广告全都没有胜出.....直接返回");
                List<TTBaseAd> list8 = this.q;
                if ((list8 == null || list8.size() <= 0) && (((list4 = this.o) == null || list4.size() <= 0) && ((list5 = this.p) == null || list5.size() <= 0))) {
                    adError = new AdError(AdError.ERROR_CODE_AD_LOAD_FAIL, AdError.getMessage(AdError.ERROR_CODE_AD_LOAD_FAIL));
                    a(adError, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                } else {
                    if (!this.j) {
                        sb = new StringBuilder();
                        sb.append(TTLogUtil.getTagSecondLevel(this.f));
                        str = "没有client bidding....直接给出成功回调.....";
                    } else if (m()) {
                        sb = new StringBuilder();
                        sb.append(TTLogUtil.getTagSecondLevel(this.f));
                        str = "存在client bidding且满足触发成功回调的条件，则给出成功回调.....";
                    }
                    sb.append(str);
                    Logger.e("TTMediationSDK", sb.toString());
                    q();
                }
            } else {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "serverBidding响应回来..........开始从头开始请求waterFallConfig ");
                a();
            }
        }
        if (aVar == null || !aVar.c) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).a().c(1);
    }

    private void c(TTBaseAd tTBaseAd) {
        AdSlot adSlot;
        if (tTBaseAd == null || (adSlot = this.h) == null || !adSlot.isBidNotify()) {
            return;
        }
        if (tTBaseAd.isMultiBiddingAd() || tTBaseAd.isClientBiddingAd() || tTBaseAd.isServerBiddingAd()) {
            tTBaseAd.bidWinNotify(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A() {
        j jVar = this.v;
        if (jVar != null) {
            jVar.b = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
        r0.append(r2);
        com.bytedance.msdk.adapter.util.Logger.d("TTMediationSDK", r0.toString());
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c.B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        StringBuilder sb;
        String str;
        if (t()) {
            if (this.q.size() < i()) {
                for (TTBaseAd tTBaseAd : this.o) {
                    if (a(tTBaseAd) && m()) {
                        sb = new StringBuilder();
                        sb.append(TTLogUtil.getTagSecondLevel(this.f));
                        str = "抛出成功回调_普通层池中广告满足数量，且满足client bidding的返回条件，给出成功回调，直接返回......";
                    }
                }
                return;
            }
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagSecondLevel(this.f));
            str = "抛出成功回调_P层池中广告满足数量，直接返回......";
            sb.append(str);
            Logger.d("TTMediationSDK", sb.toString());
            q();
        }
    }

    public TTAbsAdLoaderAdapter a(String str, String str2, String str3) {
        return this.B.get(String.format("%1$s_%2$s_%3$s", str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        a(0, false);
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        j jVar = this.v;
        if (jVar != null) {
            jVar.b = i;
        }
    }

    abstract void a(int i, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context, AdSlot adSlot, List<k> list, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.e.a();
        if (a2 != null) {
            this.l = 0;
            j jVar = this.v;
            if (jVar != null) {
                jVar.d = true;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b bVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b();
            bVar.a = adSlot;
            bVar.b = list;
            bVar.d = this.d;
            bVar.f = z;
            bVar.e = adSlot != null ? adSlot.getPrimeRitReqType() : 1;
            a2.a(this.B, context, bVar, new a(adSlot, list));
        }
    }

    abstract void a(k kVar, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AdError adError) {
    }

    abstract void a(AdError adError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar);

    protected void a(TTBaseAd tTBaseAd, GMAdConstant.BiddingLossReason biddingLossReason) {
        AdSlot adSlot;
        if (tTBaseAd == null || (adSlot = this.h) == null || biddingLossReason == null || !adSlot.isBidNotify()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MediationConstant.BIDDING_LOSE_REASON, biddingLossReason);
        tTBaseAd.bidLoseNotify(hashMap);
    }

    public void a(TTBaseAd tTBaseAd, String str) {
        k c = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(this.f, str);
        if (tTBaseAd == null || c == null) {
            return;
        }
        tTBaseAd.setLoadSort(c.p());
        tTBaseAd.setShowSort(c.y());
        tTBaseAd.setExchangeRate(c.j());
        tTBaseAd.setAdNetworkSlotType(c.f());
        tTBaseAd.setCpm(c.i());
    }

    public void a(List<TTBaseAd> list) {
        boolean z;
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList<TTBaseAd> arrayList = new ArrayList();
        arrayList.addAll(list);
        for (TTBaseAd tTBaseAd : arrayList) {
            c(tTBaseAd);
        }
        if (this.p.size() != 0) {
            ArrayList<TTBaseAd> arrayList2 = new ArrayList();
            arrayList2.addAll(this.p);
            for (TTBaseAd tTBaseAd2 : arrayList2) {
                Iterator<TTBaseAd> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    TTBaseAd next = it.next();
                    if (next != null && tTBaseAd2 != null && next == tTBaseAd2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    a(tTBaseAd2, GMAdConstant.BiddingLossReason.LOW_PRICE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(List<TTBaseAd> list, AdError adError) {
    }

    protected void a(List<k> list, boolean z) {
        if (list == null) {
            list = new ArrayList<>();
        }
        Map<Integer, List<k>> a2 = z ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.c.a(list) : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.c.b(list);
        if (a2 == null) {
            a2 = new HashMap<>();
        }
        this.e = a2;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        arrayList.addAll(this.e.keySet());
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.b.a(this.n);
        this.s.b(this.n);
        this.s.a(list, g(), d());
        b(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, StackTraceElement[] stackTraceElementArr) {
        if (z) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a((TTBaseAd) null, this.h, u.a(stackTraceElementArr), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(TTBaseAd tTBaseAd) {
        Map<Integer, List<k>> map;
        if (tTBaseAd == null || TextUtils.isEmpty(tTBaseAd.getAdNetworkSlotId()) || !tTBaseAd.isNormalAd() || (map = this.e) == null) {
            return false;
        }
        List<k> list = map.get(Integer.valueOf(tTBaseAd.getLoadSort()));
        if (i0.a(list)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.sort(arrayList);
        return !i0.b(arrayList) && tTBaseAd.getAdNetworkSlotId().equals(((k) arrayList.get(0)).d());
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str) && p() && x()) {
            for (k kVar : this.m) {
                if (str.equals(kVar.d())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public GMAdEcpmInfo b() {
        List<TTBaseAd> v;
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().t() || (v = v()) == null || v.size() == 0) {
            return null;
        }
        return p.a(this.h, v.get(0), false);
    }

    public void b(TTBaseAd tTBaseAd) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().x()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(tTBaseAd, this.h, u.a(Thread.currentThread().getStackTrace()), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(List<k> list) {
        StringBuilder sb;
        String str;
        boolean z;
        if (list == null || list.size() == 0) {
            this.o.clear();
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagSecondLevel(this.f));
            str = "没有胜出的普通广告，普通广告被全部过滤掉了 :";
        } else {
            for (TTBaseAd tTBaseAd : this.o) {
                Iterator<k> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    k next = it.next();
                    if (tTBaseAd != null && next != null && tTBaseAd.getAdNetworkSlotId().equals(next.d())) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "已经响应的广告: " + tTBaseAd.getAdNetworkSlotId() + "  没有在severBidding的waterFall列表中，需要被移除掉");
                    this.o.remove(tTBaseAd);
                }
            }
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagSecondLevel(this.f));
            str = "已经响应的广告被serverBidding过滤完还剩: ";
        }
        sb.append(str);
        sb.append(this.o.size());
        Logger.e("TTMediationSDK", sb.toString());
    }

    public List<GMAdEcpmInfo> c() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().t()) {
            ArrayList arrayList = new ArrayList();
            for (TTBaseAd tTBaseAd : v()) {
                if (tTBaseAd != null) {
                    arrayList.add(p.a(this.h, tTBaseAd, false));
                }
            }
            return arrayList;
        }
        return null;
    }

    public void c(String str) {
        ThreadHelper.runOnMSDKThread(new b(str));
    }

    protected List<k> d() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || cVar.F() == null || this.d.F().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.d.F()) {
            if (kVar != null && (kVar.f() == 1 || kVar.f() == 3)) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        j jVar = this.v;
        if (jVar != null) {
            jVar.c = str;
        }
    }

    public int e() {
        j jVar = this.v;
        if (jVar != null) {
            return jVar.b;
        }
        return 0;
    }

    public List<GMAdEcpmInfo> f() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().t()) {
            ArrayList arrayList = new ArrayList();
            for (TTBaseAd tTBaseAd : this.p) {
                if (tTBaseAd != null) {
                    arrayList.add(p.a(this.h, tTBaseAd, false));
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<k> g() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || cVar.F() == null || this.d.F().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.d.F()) {
            if (kVar != null && kVar.f() == 100) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public int h() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i() {
        AdSlot adSlot = this.h;
        if (adSlot == null) {
            return 1;
        }
        return adSlot.getAdCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j() {
        j jVar = this.v;
        if (jVar == null) {
            return null;
        }
        return jVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String k() {
        j jVar = this.v;
        if (jVar != null) {
            return jVar.c;
        }
        return null;
    }

    public String l() {
        return this.f;
    }

    public boolean m() {
        return !n() || this.x.get() || this.s.b() == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean n() {
        return this.j;
    }

    public boolean o() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        return this.i;
    }

    abstract void q();

    public boolean r() {
        return this.b.get() && !(this.C && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_19do.a.b(this.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s() {
        return this.q.size() >= i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return this.q.size() + this.o.size() >= i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        return false;
    }

    public List<TTBaseAd> v() {
        ArrayList arrayList = new ArrayList();
        if (!i0.a(this.o)) {
            arrayList.addAll(this.o);
        }
        if (!i0.a(this.p)) {
            arrayList.addAll(this.p);
        }
        g.a(arrayList, g.c());
        if (!i0.a(this.q)) {
            arrayList.addAll(0, this.q);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w() {
        return this.k;
    }

    protected boolean x() {
        return this.l == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y() {
        return this.l > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        j jVar;
        if (!p() || (jVar = this.v) == null || TextUtils.isEmpty(jVar.a)) {
            return;
        }
        for (TTBaseAd tTBaseAd : this.q) {
            tTBaseAd.putEventParam("server_bidding_extra", this.v.a);
        }
        for (TTBaseAd tTBaseAd2 : this.p) {
            tTBaseAd2.putEventParam("server_bidding_extra", this.v.a);
        }
        for (TTBaseAd tTBaseAd3 : this.o) {
            tTBaseAd3.putEventParam("server_bidding_extra", this.v.a);
        }
    }
}
