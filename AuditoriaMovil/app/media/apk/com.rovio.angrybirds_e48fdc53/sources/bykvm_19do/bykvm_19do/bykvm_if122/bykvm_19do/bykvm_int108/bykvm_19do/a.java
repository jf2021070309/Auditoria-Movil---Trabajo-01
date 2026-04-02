package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.error.AdFreqError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class a extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.a {
    private static volatile a j;
    private final String[] c = {"unity", "ks"};
    private final Map<String, Integer> d = new HashMap();
    private final Map<String, Integer> e = new HashMap();
    private final Map<String, CopyOnWriteArrayList<e>> f = new ConcurrentHashMap();
    private final Map<String, k> g = new HashMap();
    private final Map<String, String> h = new HashMap();
    private final Map<String, Integer> i = new HashMap();

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0044a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ AdSlot b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Map d;
        final /* synthetic */ Context e;
        final /* synthetic */ GMNetworkRequestInfo f;
        final /* synthetic */ j g;
        final /* synthetic */ GMAdSlotBase h;

        RunnableC0044a(String str, AdSlot adSlot, boolean z, Map map, Context context, GMNetworkRequestInfo gMNetworkRequestInfo, j jVar, GMAdSlotBase gMAdSlotBase) {
            this.a = str;
            this.b = adSlot;
            this.c = z;
            this.d = map;
            this.e = context;
            this.f = gMNetworkRequestInfo;
            this.g = jVar;
            this.h = gMAdSlotBase;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            e eVar;
            List<e> list = (List) a.this.f.get(this.a);
            ArrayList arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (e eVar2 : list) {
                    if (eVar2 != null && eVar2.a.isHasShown()) {
                        list.remove(eVar2);
                        arrayList.add(eVar2);
                    }
                }
            }
            boolean z = false;
            if (Logger.isDebug()) {
                if (arrayList.size() <= 0 || (eVar = (e) arrayList.get(0)) == null) {
                    str = "";
                    str2 = str;
                } else {
                    str2 = com.bytedance.msdk.base.a.a(eVar.a.getAdType(), eVar.a.getSubAdType());
                    str = eVar.a.getAdNetWorkName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("--==-- 广告复用:show时缓存移除 -----：");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                sb.append(", ");
                sb.append(this.a);
                sb.append(arrayList.size() > 0 ? ", size: " + arrayList.size() : "移除广告数为0");
                Logger.d("TTMediationSDK", sb.toString());
            }
            AdSlot adSlot = this.b;
            String adUnitId = adSlot != null ? adSlot.getAdUnitId() : "";
            AdSlot adSlot2 = this.b;
            boolean z2 = adSlot2 == null || adSlot2.getAdType() == 1;
            if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(adUnitId, this.a) && this.c) {
                z = true;
            }
            if (z && !z2 && a.this.d(adUnitId, this.a)) {
                a.this.a(this.a, this.b, this.d, this.e, this.f, this.g, this.h);
                return;
            }
            Logger.d("TTMediationSDK", "--==-- 广告复用:show时预请求取消，因为：已发起waterfall预加载，或feed多广告，或未开启adn预加载，或是banner轮播 --: " + this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements TTAbsAdLoaderAdapter.AdapterLoaderListener {
        private AdSlot a;

        b(AdSlot adSlot) {
            this.a = adSlot;
        }

        @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
        public void onAdFailed(AdError adError, d dVar) {
            if (adError == null || dVar == null) {
                return;
            }
            Logger.d("TTMediationSDK", "--==-- 广告复用:show时预请求广告缓存失败 --- " + dVar.c() + ", " + dVar.d() + ", " + com.bytedance.msdk.base.a.a(dVar.b(), dVar.h()) + ", errCode: " + adError.thirdSdkErrorCode + ",msg=" + adError.thirdSdkErrorMessage);
        }

        @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
        public void onAdLoaded(TTBaseAd tTBaseAd, d dVar) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(tTBaseAd);
            onAdLoaded(arrayList, dVar);
        }

        @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
        public void onAdLoaded(List<TTBaseAd> list, d dVar) {
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null) {
                    tTBaseAd.setFillTime(SystemClock.elapsedRealtime());
                    arrayList.add(new e(tTBaseAd, dVar, 0L, this.a));
                }
            }
            if (arrayList.size() > 0) {
                TTBaseAd tTBaseAd2 = ((e) arrayList.get(0)).a;
                Logger.d("TTMediationSDK", "--==-- 广告复用:show时预请求广告缓存成功 --- " + tTBaseAd2.getAdNetWorkName() + ", adType: " + com.bytedance.msdk.base.a.a(tTBaseAd2.getAdType(), tTBaseAd2.getSubAdType()) + ", adnSlotId: " + tTBaseAd2.getAdNetworkSlotId() + ", ad个数: " + arrayList.size());
                a.this.a(tTBaseAd2.getAdNetworkSlotId(), arrayList);
            }
        }

        @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
        public void onAdVideoCache() {
        }
    }

    private a() {
    }

    public static a a() {
        if (j == null) {
            synchronized (a.class) {
                if (j == null) {
                    j = new a();
                }
            }
        }
        return j;
    }

    private String a(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a> list) {
        if (list.size() > 0) {
            StringBuilder sb = new StringBuilder("[");
            int i = 0;
            while (i < list.size()) {
                sb.append(list.get(i).a());
                sb.append(i == list.size() + (-1) ? "]" : ",");
                i++;
            }
            try {
                return new JSONArray(sb.toString()).toString();
            } catch (JSONException e) {
                Logger.d("TTMediationSDK", "--==-- 广告复用：adCannotUseInfo json err: " + e.getMessage());
            }
        }
        return list.size() > 0 ? "json error" : "[]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, AdSlot adSlot, Map<String, Object> map, Context context, GMNetworkRequestInfo gMNetworkRequestInfo, j jVar, GMAdSlotBase gMAdSlotBase) {
        StringBuilder sb;
        String str2;
        if (adSlot == null) {
            sb = new StringBuilder();
            str2 = "--==-- 广告复用:show时预请求取消，adSlot为空 -------: ";
        } else if (context == null) {
            sb = new StringBuilder();
            str2 = "--==-- 广告复用:show时预请求取消，context为null -------: ";
        } else {
            k c = c(adSlot.getAdUnitId(), str);
            String str3 = null;
            if (c != null) {
                try {
                    str3 = g.a(c.q(), g.b(c.e()), com.bytedance.msdk.base.a.a(c.t(), c.z()));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(str3) || !g.a(str3) || c == null) {
                sb = new StringBuilder();
                sb.append("--==-- 广告复用:show时预请求取消，className或wfcBean为空, className: ");
                sb.append(str3);
                sb.append(", wfcBean: ");
                sb.append(c);
                str2 = ", adnSlotId: ";
            } else {
                String[] strArr = this.c;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str4 = strArr[i];
                        if (TextUtils.equals(str4, c.e())) {
                            sb = new StringBuilder();
                            sb.append("--==-- 广告复用:show时预请求取消，");
                            sb.append(str4);
                            str2 = "为单例模式 -------: ";
                            break;
                        }
                        i++;
                    } else {
                        int intValue = this.i.get(str) != null ? this.i.get(str).intValue() : -1;
                        Logger.d("TTMediationSDK", "--==-- 广告复用:show时预请求开始 -------: " + str);
                        TTAbsAdLoaderAdapter a = g.a(gMAdSlotBase.getValueSet(), c);
                        if (a == null) {
                            h.a(c, adSlot, 4, 1);
                            return;
                        } else if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().b(adSlot.getAdUnitId(), c.d())) {
                            Logger.d("TMe", "adn 代码位预请求触发次数拦截............");
                            Pair<String, String> d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.k.b().d(adSlot.getAdUnitId(), c.d());
                            if (d != null) {
                                AdFreqError adFreqError = new AdFreqError(AdError.ERROR_CODE_ADN_EXCEED_FREQCTL, AdError.getMessage(AdError.ERROR_CODE_ADN_EXCEED_FREQCTL), (String) d.second, (String) d.first);
                                h.a(c, adSlot, a().a(c.d()), true, 2, intValue, 4, 1, (AdError) adFreqError, -1L, false, false);
                                h.a(adFreqError, adSlot, c, intValue, 4, 1, a().a(c.d()), 0L, (String) null, (String) null, (String) null, 0L);
                                return;
                            }
                            return;
                        } else {
                            a.setAdapterListener(new b(adSlot));
                            a.loadAdInter(context, c, g.a(c, adSlot, map, gMNetworkRequestInfo, 4, 1, true, -1L), adSlot, jVar, intValue, gMAdSlotBase);
                            sb = new StringBuilder();
                            str2 = "--==-- 广告复用:show时预请求已发完 -------: ";
                        }
                    }
                }
            }
        }
        sb.append(str2);
        sb.append(str);
        Logger.d("TTMediationSDK", sb.toString());
    }

    private boolean a(List<e> list, e eVar) {
        for (e eVar2 : list) {
            if (eVar2 != null && eVar != null && eVar2.a == eVar.a) {
                return true;
            }
        }
        return false;
    }

    private int b(String str, AdSlot adSlot, boolean z) {
        int i;
        String str2;
        CopyOnWriteArrayList<e> copyOnWriteArrayList = this.f.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            Logger.d("TTMediationSDK", "--==-- 广告复用:当前没有广告缓存 -------adnSlotId: " + str);
            return 1;
        }
        String adUnitId = adSlot != null ? adSlot.getAdUnitId() : "";
        ArrayList arrayList = new ArrayList();
        e eVar = null;
        boolean z2 = false;
        for (e eVar2 : copyOnWriteArrayList) {
            GMAdConstant.AdIsReadyStatus isReadyStatus = eVar2.a.isReadyStatus();
            if (isReadyStatus == GMAdConstant.AdIsReadyStatus.AD_IS_NOT_READY ? a(adUnitId, eVar2.a) : isReadyStatus != GMAdConstant.AdIsReadyStatus.AD_IS_READY) {
                copyOnWriteArrayList.remove(eVar2);
                i = 5;
                str2 = "--==-- 广告复用:广告过期了 -------: " + eVar2.a.getAdNetWorkName() + ", adSlotId: " + str;
            } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.a.a(eVar2.a(), adSlot, eVar2.a)) {
                Logger.d("TTMediationSDK", "--==-- 广告复用:复用成功：--------" + eVar2.a.getAdNetWorkName() + ", adSlotId: " + str);
                z2 = true;
            } else {
                i = 6;
                str2 = "--==-- 广告复用:AdSlot不符合 -------: " + eVar2.a.getAdNetWorkName() + ", adSlotId: " + str;
            }
            Logger.d("TTMediationSDK", str2);
            if (eVar == null) {
                eVar = eVar2;
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a aVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a();
            aVar.c(eVar2.a.getLoadSort());
            aVar.e(eVar2.a.getShowSort());
            aVar.b(eVar2.a.getAdNetworkSlotId());
            aVar.d(i);
            aVar.b(eVar2.a.isHasShown() ? 1 : 0);
            arrayList.add(aVar);
        }
        if (z2) {
            return 3;
        }
        if (z && eVar != null) {
            h.a(adSlot, eVar.a, a(arrayList));
        }
        return 2;
    }

    public int a(String str, AdSlot adSlot, boolean z) {
        int i;
        synchronized (this) {
            i = 1;
            if (b(adSlot != null ? adSlot.getAdUnitId() : "", str) == 0) {
                i = b(str, adSlot, z);
            } else {
                CopyOnWriteArrayList<e> copyOnWriteArrayList = this.f.get(str);
                if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                    Logger.d("TTMediationSDK", "--==-- 广告复用:当前没有广告缓存 -------adnSlotId: " + str);
                } else {
                    e eVar = null;
                    ArrayList arrayList = z ? new ArrayList() : null;
                    boolean z2 = false;
                    for (e eVar2 : copyOnWriteArrayList) {
                        int a = a(eVar2, eVar2.a(), adSlot, "广告复用");
                        if (a == -1) {
                            z2 = true;
                        } else {
                            if (a != 6) {
                                copyOnWriteArrayList.remove(eVar2);
                            }
                            if (z) {
                                if (eVar == null) {
                                    eVar = eVar2;
                                }
                                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a aVar = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.a();
                                aVar.c(eVar2.a.getLoadSort());
                                aVar.e(eVar2.a.getShowSort());
                                aVar.b(eVar2.a.getAdNetworkSlotId());
                                aVar.d(a);
                                aVar.b(eVar2.a.isHasShown() ? 1 : 0);
                                arrayList.add(aVar);
                            }
                        }
                    }
                    if (z2) {
                        i = 3;
                    } else {
                        if (z && eVar != null) {
                            h.a(adSlot, eVar.a, a(arrayList));
                        }
                        i = 2;
                    }
                }
            }
        }
        return i;
    }

    public String a(String str) {
        return this.h.get(str);
    }

    public List<e> a(String str, AdSlot adSlot) {
        ArrayList arrayList;
        synchronized (this) {
            CopyOnWriteArrayList<e> copyOnWriteArrayList = this.f.get(str);
            if (copyOnWriteArrayList == null) {
                arrayList = null;
            } else {
                int adCount = adSlot != null ? adSlot.getAdCount() : 1;
                ArrayList<e> arrayList2 = new ArrayList();
                for (int i = 0; arrayList2.size() < adCount && i < copyOnWriteArrayList.size(); i++) {
                    if (!copyOnWriteArrayList.get(i).c() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.a.a(copyOnWriteArrayList.get(i).a(), adSlot, copyOnWriteArrayList.get(i).a)) {
                        arrayList2.add(copyOnWriteArrayList.get(i));
                    }
                }
                for (int i2 = 0; arrayList2.size() < adCount && i2 < copyOnWriteArrayList.size(); i2++) {
                    if (copyOnWriteArrayList.get(i2).c() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.a.a(copyOnWriteArrayList.get(i2).a(), adSlot, copyOnWriteArrayList.get(i2).a)) {
                        arrayList2.add(copyOnWriteArrayList.get(i2));
                    }
                }
                for (e eVar : arrayList2) {
                    eVar.a(true);
                }
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    public void a(String str, AdSlot adSlot, Map<String, Object> map, boolean z, GMNetworkRequestInfo gMNetworkRequestInfo, j jVar, Context context, GMAdSlotBase gMAdSlotBase) {
        ThreadHelper.runOnMSDKThread(new RunnableC0044a(str, adSlot, z, map, context, gMNetworkRequestInfo, jVar, gMAdSlotBase));
    }

    public void a(String str, String str2, k kVar, int i) {
        if (kVar != null) {
            Map<String, k> map = this.g;
            map.put(str + "_" + str2, kVar);
        }
        this.i.put(str2, Integer.valueOf(i));
    }

    public void a(String str, List<e> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList = this.f.get(str);
        if (copyOnWriteArrayList == null) {
            this.f.put(str, new CopyOnWriteArrayList<>(list));
            return;
        }
        for (e eVar : list) {
            if (!a(copyOnWriteArrayList, eVar)) {
                copyOnWriteArrayList.add(eVar);
            }
        }
    }

    public k c(String str, String str2) {
        Map<String, k> map = this.g;
        return map.get(str + "_" + str2);
    }

    public boolean c(String str, String str2, int i) {
        if (i == 2) {
            return false;
        }
        Map<String, Integer> map = this.d;
        Integer num = map.get(str + "_" + str2);
        return num != null && num.intValue() == 1;
    }

    public void d(String str, String str2, int i) {
        Map<String, Integer> map = this.e;
        map.put(str + "_" + str2, Integer.valueOf(i));
    }

    public boolean d(String str, String str2) {
        Map<String, Integer> map = this.e;
        Integer num = map.get(str + "_" + str2);
        return num != null && num.intValue() == 1;
    }

    public void e(String str, String str2) {
        this.h.put(str, str2);
    }

    public void e(String str, String str2, int i) {
        Map<String, Integer> map = this.d;
        map.put(str + "_" + str2, Integer.valueOf(i));
    }
}
