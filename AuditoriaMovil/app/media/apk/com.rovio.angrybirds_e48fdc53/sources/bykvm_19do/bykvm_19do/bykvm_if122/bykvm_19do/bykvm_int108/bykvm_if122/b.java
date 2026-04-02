package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.GMPreloadRequestInfo;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class b extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.a {
    private static volatile b o;
    private final Map<String, Integer> c = new HashMap();
    private final Map<String, Long> d = new HashMap();
    private final Map<String, AdSlot> e = new HashMap();
    private final Map<String, Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>>> f = new HashMap();
    private final Map<String, Map<String, AdError>> g = new HashMap();
    private final Map<String, Boolean> h = new HashMap();
    private final Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c> i = new HashMap();
    private boolean j = false;
    private int k = 20;
    private List<String> l;
    private int m;
    private int n;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        a(Context context, String str, int i) {
            this.a = context;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.a, this.b, 2, this.c, (f) null);
        }
    }

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0045b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        RunnableC0045b(Context context, String str, int i) {
            this.a = context;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.a, this.b, 4, this.c, (f) null);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        final /* synthetic */ Activity a;
        final /* synthetic */ List b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* loaded from: classes.dex */
        class a implements e {
            a() {
            }

            @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.e
            public void a(boolean z) {
                if (z) {
                    return;
                }
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e().a(b.this.f);
            }
        }

        c(Activity activity, List list, int i, int i2) {
            this.a = activity;
            this.b = list;
            this.c = i;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (b.this.j) {
                str = "注意：预加载preload只能调用一次";
            } else if (this.a == null) {
                str = "预加载preload传入的activity不能是null";
            } else {
                List list = this.b;
                if (list != null && list.size() > 0) {
                    b.this.j = true;
                    b.this.m = this.c;
                    b.this.n = this.d;
                    b.this.l = new ArrayList();
                    for (GMPreloadRequestInfo gMPreloadRequestInfo : this.b) {
                        if (gMPreloadRequestInfo != null && gMPreloadRequestInfo.getPrimeRitList() != null) {
                            b.this.l.addAll(gMPreloadRequestInfo.getPrimeRitList());
                        }
                    }
                    int i = this.c;
                    int i2 = (i < 1 || i > 20) ? 2 : i;
                    int i3 = this.d;
                    int i4 = (i3 < 1 || i3 > 10) ? 2 : i3;
                    List a2 = b.this.a(this.b);
                    if (a2.size() > 0) {
                        new d(this.a, a2, i2, i4, new a()).a();
                        return;
                    }
                    return;
                }
                str = "预加载preload传入的requestInfos不能是null或者size为0";
            }
            Logger.d("TTMediationSDK", str);
        }
    }

    /* loaded from: classes.dex */
    private class d {
        private final Activity a;
        private final int b;
        private final int c;
        private final List<GMPreloadRequestInfo> d;
        private final e e;
        private int f;
        private int g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements f {
            a() {
            }

            @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.f
            public void a(String str, boolean z) {
                d.d(d.this);
                if (!z) {
                    d.f(d.this);
                }
                Logger.d("TTMediationSDK", "--==-- pendingLoadNum: " + d.this.f);
                if (d.this.f > 0 || d.this.e == null) {
                    return;
                }
                d.this.e.a(d.this.g <= 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0046b implements Runnable {
            RunnableC0046b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
            }
        }

        d(Activity activity, List<GMPreloadRequestInfo> list, int i, int i2, e eVar) {
            this.a = activity;
            this.d = list;
            this.b = i;
            this.c = i2;
            this.e = eVar;
            this.f = list.size();
            this.g = list.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            GMPreloadRequestInfo remove;
            StringBuilder sb;
            String str;
            for (int i = 0; i < this.b; i++) {
                if (this.d.size() > 0 && (remove = this.d.remove(0)) != null) {
                    AdSlot convertGMAdSlotBase2AdSlot = AdUtils.convertGMAdSlotBase2AdSlot(remove.getGmAdSlot());
                    String str2 = remove.getPrimeRitList().get(0);
                    if (convertGMAdSlotBase2AdSlot == null) {
                        sb = new StringBuilder();
                        str = "预加载preload传入的GMAdSlotBase为空，广告位：";
                    } else if (convertGMAdSlotBase2AdSlot.getAdType() == 1) {
                        sb = new StringBuilder();
                        str = "预加载preload传入的GMAdSlotBase为banner类型，不支持该类型预加载，广告位: ";
                    } else if (convertGMAdSlotBase2AdSlot.getAdType() == 2) {
                        sb = new StringBuilder();
                        str = "预加载preload传入的GMAdSlotBase为插屏类型，不支持该类型预加载，广告位: ";
                    } else if (convertGMAdSlotBase2AdSlot.getAdType() == 9) {
                        sb = new StringBuilder();
                        str = "预加载preload传入的GMAdSlotBase为Draw类型，不支持该类型预加载，广告位: ";
                    } else {
                        b.this.b(str2, convertGMAdSlotBase2AdSlot);
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(str2, 101);
                        b.this.a(this.a, str2, 5, 0, new a());
                    }
                    sb.append(str);
                    sb.append(str2);
                    Logger.d("TTMediationSDK", sb.toString());
                }
            }
            if (this.d.size() > 0) {
                ThreadHelper.postDelayOnMSDKThread(new RunnableC0046b(), this.c * 1000);
            }
        }

        static /* synthetic */ int d(d dVar) {
            int i = dVar.f;
            dVar.f = i - 1;
            return i;
        }

        static /* synthetic */ int f(d dVar) {
            int i = dVar.g;
            dVar.g = i - 1;
            return i;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, boolean z);
    }

    private b() {
    }

    private String a(List<k> list, String str, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c cVar) {
        String str2;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list2;
        if (list.size() <= 0) {
            return null;
        }
        Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map = this.f.get(str);
        int i = 0;
        if (map != null && (list2 = map.get(list.get(0).d())) != null && list2.size() > 0 && list2.get(0) != null) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar = list2.get(0);
            if (a(eVar, eVar.a(), adSlot, "聚合预请求") == -1) {
                str2 = TTLogUtil.getTagSecondLevel(str) + "--==-- 命中最优广告： " + eVar.a.getAdNetWorkName() + ", loadSort: " + eVar.a.getLoadSort() + ", showSort: " + eVar.a.getShowSort();
                Logger.d("TTMediationSDK", str2);
                return null;
            }
        }
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a> a2 = a(list, str, map, adSlot, cVar);
        if (a2.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        while (i < a2.size()) {
            sb.append(a2.get(i).a());
            sb.append(i == a2.size() + (-1) ? "]" : ",");
            i++;
        }
        try {
            String jSONArray = new JSONArray(sb.toString()).toString();
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "adCannotUseInfo: " + jSONArray);
            return jSONArray;
        } catch (JSONException e2) {
            str2 = TTLogUtil.getTagSecondLevel(str) + "adCannotUseInfo json err: " + e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<GMPreloadRequestInfo> a(List<GMPreloadRequestInfo> list) {
        ArrayList arrayList = new ArrayList();
        int i = this.k;
        HashSet hashSet = new HashSet();
        for (GMPreloadRequestInfo gMPreloadRequestInfo : list) {
            if (arrayList.size() >= i) {
                break;
            } else if (gMPreloadRequestInfo != null && gMPreloadRequestInfo.getPrimeRitList() != null) {
                for (String str : gMPreloadRequestInfo.getPrimeRitList()) {
                    if (arrayList.size() < i) {
                        if (!TextUtils.isEmpty(str) && !hashSet.contains(str)) {
                            hashSet.add(str);
                            ArrayList arrayList2 = new ArrayList(1);
                            arrayList2.add(str);
                            arrayList.add(new GMPreloadRequestInfo(gMPreloadRequestInfo.getGmAdSlot(), arrayList2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a> a(List<k> list, String str, Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c cVar) {
        int i;
        int i2;
        TTBaseAd tTBaseAd;
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list2;
        ArrayList arrayList = new ArrayList();
        int f0 = (cVar.h() == 2 && (cVar instanceof bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.d)) ? ((bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.d) cVar).f0() : 0;
        for (i = 0; i < list.size() && i < f0; i = i + 1) {
            String d2 = list.get(i).d();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a aVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a();
            aVar.b(d2);
            aVar.e(list.get(i).y());
            aVar.c(list.get(i).p());
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar = (map == null || (list2 = map.get(d2)) == null || list2.size() <= 0) ? null : list2.get(0);
            if (eVar == null || (tTBaseAd = eVar.a) == null) {
                Map<String, AdError> map2 = this.g.get(str);
                AdError adError = map2 != null ? map2.get(d2) : null;
                if (adError != null) {
                    aVar.d(3);
                    aVar.a(adError.thirdSdkErrorCode);
                    aVar.a(adError.thirdSdkErrorMessage);
                    arrayList.add(aVar);
                } else {
                    i2 = 4;
                }
            } else {
                aVar.b(tTBaseAd.isHasShown() ? 1 : 0);
                i2 = a(eVar, this.e.get(str), adSlot, "预缓存");
                i = i2 == -1 ? i + 1 : 0;
            }
            aVar.d(i2);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, int i, int i2, f fVar) {
        int a2 = a(str, i2);
        if (a2 != 2) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "--==-- 配置未开启预加载缓存，req_type: " + a2);
            if (fVar != null) {
                fVar.a(str, false);
            }
        } else if (this.h.get(str) != null && this.h.get(str).booleanValue()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "--==-- 已发起过预缓存，还未使用掉，此次不发起");
            if (fVar != null) {
                fVar.a(str, true);
            }
        } else {
            AdSlot shallowCopy = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.b.getShallowCopy(this.e.get(str));
            if (shallowCopy == null) {
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "--==-- 预缓存取消，adslot为null，rit：" + str);
                return;
            }
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "--==-- 预缓存开始请求, req_type: " + a2);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.d dVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.d(context, str);
            this.i.put(str, dVar);
            this.h.put(str, true);
            shallowCopy.setPrimeRitReqType(i);
            dVar.a(shallowCopy, fVar);
        }
    }

    private void c(String str, AdSlot adSlot) {
        Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map = this.f.get(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list = map.get(str2);
                if (list != null && list.size() > 0 && list.get(0) != null) {
                    bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar = list.get(0);
                    if (a(eVar, eVar.a(), adSlot, "聚合预缓存") != -1) {
                        map.put(str2, null);
                    }
                }
            }
        }
    }

    public static b d() {
        if (o == null) {
            synchronized (b.class) {
                if (o == null) {
                    o = new b();
                }
            }
        }
        return o;
    }

    public int a() {
        return this.m;
    }

    public int a(String str, int i) {
        Integer num;
        if (i == 2 || (num = this.c.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public int a(String str, AdSlot adSlot) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c cVar = this.i.get(str);
        boolean z = false;
        if (cVar != null) {
            List<k> M = cVar.M();
            if (Logger.isDebug()) {
                for (k kVar : M) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(str) + "waterfall: " + kVar.e() + ", loadSort: " + kVar.p() + ", showSort: " + kVar.y() + ", eCpm: " + kVar.i());
                }
            }
            Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map = this.f.get(str);
            if (map != null && cVar.h() == 2) {
                boolean z2 = false;
                for (int i = 0; i < M.size(); i++) {
                    List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list = map.get(M.get(i).d());
                    if (list != null && list.size() > 0) {
                        for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar : list) {
                            if (eVar != null && a(eVar, eVar.a(), adSlot, "聚合预缓存-ra") == -1) {
                                if (eVar.a.getCpm() >= com.bytedance.msdk.core.admanager.reward.rewardagain.c.c(str)) {
                                    Logger.d("TTMediationSDK", "--==--ra: 激励再得有缓存，ecpm符合");
                                    return 0;
                                }
                                z2 = true;
                            }
                        }
                        continue;
                    }
                }
                z = z2;
            }
        }
        if (z) {
            Logger.d("TTMediationSDK", "--==--ra: 激励再得有缓存，但是ecpm不符合");
            return 8;
        }
        Logger.d("TTMediationSDK", "--==--ra: 激励再得无缓存可用");
        return 7;
    }

    public AdSlot a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(Activity activity, List<GMPreloadRequestInfo> list, int i, int i2) {
        ThreadHelper.runOnMSDKThread(new c(activity, list, i, i2));
    }

    public void a(Context context, String str, int i) {
        ThreadHelper.runOnMSDKThread(new a(context, str, i));
    }

    public void a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, Long.valueOf(j));
    }

    public void a(String str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar) {
        if (d(str) == null || d(str).longValue() == eVar.b()) {
            Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map = this.f.get(str);
            String adNetworkSlotId = eVar.a.getAdNetworkSlotId();
            if (map == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(eVar);
                HashMap hashMap = new HashMap();
                hashMap.put(adNetworkSlotId, copyOnWriteArrayList);
                this.f.put(str, hashMap);
                return;
            }
            List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list = map.get(adNetworkSlotId);
            if (list != null) {
                list.add(eVar);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            copyOnWriteArrayList2.add(eVar);
            map.put(adNetworkSlotId, copyOnWriteArrayList2);
        }
    }

    public void a(String str, String str2, long j, AdError adError) {
        if (d(str) == null || d(str).longValue() == j) {
            Map<String, AdError> map = this.g.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.g.put(str, map);
            }
            map.put(str2, adError);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[PHI: r9 
      PHI: (r9v3 char) = (r9v1 char), (r9v4 char), (r9v4 char) binds: [B:27:0x00c9, B:31:0x00d1, B:33:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[FALL_THROUGH, PHI: r9 
      PHI: (r9v2 char) = (r9v3 char), (r9v4 char), (r9v4 char) binds: [B:28:0x00cb, B:31:0x00d1, B:33:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c9 -> B:28:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cb -> B:35:0x00d9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cf -> B:31:0x00d1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d5 -> B:35:0x00d9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r9, com.bytedance.msdk.api.AdSlot r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r8.h
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.put(r9, r2)
            java.util.Map<java.lang.String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c> r0 = r8.i
            java.lang.Object r0 = r0.get(r9)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c r0 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c) r0
            if (r0 == 0) goto Lde
            java.util.List r2 = r0.M()
            boolean r3 = com.bytedance.msdk.adapter.util.Logger.isDebug()
            if (r3 == 0) goto L74
            java.util.Iterator r3 = r2.iterator()
        L22:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r4 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.bytedance.msdk.adapter.util.TTLogUtil.getTagSecondLevel(r9)
            r5.append(r6)
            java.lang.String r6 = "waterfall: "
            r5.append(r6)
            java.lang.String r6 = r4.e()
            r5.append(r6)
            java.lang.String r6 = ", loadSort: "
            r5.append(r6)
            int r6 = r4.p()
            r5.append(r6)
            java.lang.String r6 = ", showSort: "
            r5.append(r6)
            int r6 = r4.y()
            r5.append(r6)
            java.lang.String r6 = ", eCpm: "
            r5.append(r6)
            double r6 = r4.i()
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "TTMediationSDK"
            com.bytedance.msdk.adapter.util.Logger.d(r5, r4)
            goto L22
        L74:
            java.lang.String r3 = r8.a(r2, r9, r10, r0)
            r8.c(r9, r10)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>>> r4 = r8.f
            java.lang.Object r4 = r4.get(r9)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto Lb1
            int r0 = r0.h()
            r5 = 2
            if (r0 != r5) goto Lb1
            r0 = r1
        L8d:
            int r5 = r2.size()
            if (r0 >= r5) goto Lb1
            java.lang.Object r5 = r2.get(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r5 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r5
            java.lang.String r5 = r5.d()
            java.lang.Object r5 = r4.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Lae
            int r5 = r5.size()
            if (r5 <= 0) goto Lae
            r0 = 1
            r1 = r0
            goto Lb1
        Lae:
            int r0 = r0 + 1
            goto L8d
        Lb1:
            if (r3 == 0) goto Lc9
            if (r1 == 0) goto Lc1
            java.util.Map<java.lang.String, com.bytedance.msdk.api.AdSlot> r10 = r8.e
            java.lang.Object r9 = r10.get(r9)
            com.bytedance.msdk.api.AdSlot r9 = (com.bytedance.msdk.api.AdSlot) r9
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(r9, r3, r11)
            goto Ld9
        Lc1:
            r9 = 3
            r10.setPrimeRitReqType(r9)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(r10, r3, r11)
            goto Lde
        Lc9:
            r9 = 86
        Lcb:
            switch(r9) {
                case 85: goto Lcf;
                case 86: goto Lde;
                case 87: goto Ld9;
                default: goto Lce;
            }
        Lce:
            goto Lc9
        Lcf:
            r10 = 70
        Ld1:
            switch(r10) {
                case 70: goto Lde;
                case 71: goto Ld5;
                case 72: goto Lcb;
                default: goto Ld4;
            }
        Ld4:
            goto Lcf
        Ld5:
            switch(r9) {
                case 32: goto Lde;
                case 33: goto Lcf;
                case 34: goto Ld9;
                default: goto Ld8;
            }
        Ld8:
            goto Lcb
        Ld9:
            r9 = 85
            r10 = 72
            goto Ld1
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.a(java.lang.String, com.bytedance.msdk.api.AdSlot, java.lang.String):boolean");
    }

    public List<String> b() {
        return this.l;
    }

    public Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> b(String str) {
        return this.f.get(str);
    }

    public void b(Context context, String str, int i) {
        ThreadHelper.runOnMSDKThread(new RunnableC0045b(context, str, i));
    }

    public void b(String str, int i) {
        this.c.put(str, Integer.valueOf(i));
    }

    public void b(String str, AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, adSlot);
    }

    public int c() {
        return this.n;
    }

    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c c(String str) {
        return this.i.get(str);
    }

    public Long d(String str) {
        return this.d.get(str);
    }

    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> e(String str) {
        ArrayList arrayList = new ArrayList();
        Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> map = this.f.get(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> list = map.get(str2);
                if (list != null && list.size() > 0) {
                    arrayList.addAll(list);
                }
            }
        }
        if (map != null) {
            map.clear();
        }
        Map<String, AdError> map2 = this.g.get(str);
        if (map2 != null) {
            map2.clear();
        }
        return arrayList;
    }
}
