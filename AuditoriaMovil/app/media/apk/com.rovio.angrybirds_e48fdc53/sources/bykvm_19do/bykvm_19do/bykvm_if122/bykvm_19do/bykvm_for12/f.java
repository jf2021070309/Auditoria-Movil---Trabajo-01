package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.i;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f implements d {

    /* loaded from: classes.dex */
    class a implements a.d {
        final /* synthetic */ long a;
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b b;
        final /* synthetic */ int[] c;
        final /* synthetic */ d.a d;

        a(long j, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b bVar, int[] iArr, d.a aVar) {
            this.a = j;
            this.b = bVar;
            this.c = iArr;
            this.d = aVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.d
        public void a(h hVar) {
            f fVar = f.this;
            long j = this.a;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b bVar = this.b;
            fVar.a(j, bVar.a, bVar.d, this.c[0], hVar, this.d);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.d
        public void a(AdError adError) {
            f.this.a(this.a, this.c[0], adError, this.b.a, this.d);
        }
    }

    /* loaded from: classes.dex */
    class b implements a.d {
        final /* synthetic */ long a;
        final /* synthetic */ AdSlot b;
        final /* synthetic */ bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c c;
        final /* synthetic */ d.a d;

        b(long j, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, d.a aVar) {
            this.a = j;
            this.b = adSlot;
            this.c = cVar;
            this.d = aVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.d
        public void a(h hVar) {
            f.this.a(this.a, this.b, this.c, 4, hVar, this.d);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.d
        public void a(AdError adError) {
            f.this.a(this.a, 4, adError, this.b, this.d);
        }
    }

    private List<k> a(List<k> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar) {
        if (list == null || list.size() == 0 || cVar == null || cVar.F() == null || cVar.F().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar : cVar.F()) {
            Iterator<k> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    k next = it.next();
                    if (kVar != null && next != null && kVar.f() == 0 && !TextUtils.isEmpty(kVar.d()) && kVar.d().equals(next.d())) {
                        arrayList.add(kVar);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, int i, AdError adError, AdSlot adSlot, d.a aVar) {
        int i2 = (adError == null || adError.code != -1) ? 5 : 4;
        Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应失败......onFail  result:" + i2);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
        aVar2.f = i2;
        aVar2.g = System.currentTimeMillis() - j;
        aVar2.h = adError;
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, int i, h hVar, d.a aVar) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar2;
        int i2;
        k a2;
        Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响返回.............");
        long currentTimeMillis = System.currentTimeMillis();
        if (cVar == null || hVar == null || i0.a(hVar.e())) {
            if (hVar == null || i0.a(hVar.d())) {
                r6 = i;
            }
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应失败......没有返回serverBiddingModel相关数据");
            aVar2 = null;
        } else {
            List<i> e = hVar.e();
            aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
            aVar2.k = hVar.a();
            aVar2.i = e.size();
            aVar2.a = hVar.d();
            aVar2.j = cVar.i();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("winners : {");
            for (i iVar : e) {
                if (iVar != null && (a2 = cVar.a(iVar.i())) != null) {
                    k b2 = a2.b();
                    sb.append(" [ AdnName:" + b2.e() + ",slotId:" + b2.d() + ",loadSort:" + b2.p() + ",showSort:" + b2.y() + "] ");
                    b2.a(iVar);
                    arrayList.add(b2);
                }
            }
            sb.append("}");
            if (i0.a(arrayList)) {
                r6 = i0.a(hVar.d()) ? i : 2;
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应失败......：数据有返回，但没有返回winner数据......");
            } else {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应成功......：" + sb.toString());
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.addAll(arrayList);
                List<k> a3 = a(hVar.d(), cVar);
                if (a3 == null || a3.size() <= 0) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应成功......server bidding物料......");
                    i2 = 3;
                } else {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding网络请求响应成功......waterfall+server bidding物料......");
                    copyOnWriteArrayList.addAll(a3);
                    i2 = 1;
                }
                aVar2.b = copyOnWriteArrayList;
                r6 = i2;
            }
        }
        if (hVar != null) {
            String c = hVar.c();
            if (!TextUtils.isEmpty(c)) {
                if (aVar2 == null) {
                    aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
                }
                aVar2.d = c;
            }
            if (hVar.f()) {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(adSlot.getAdUnitId()) + "server bidding发现config过期了，需要重新拉取配置......：");
                if (aVar2 == null) {
                    aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
                }
                aVar2.c = true;
            }
            if (!i0.a(hVar.b())) {
                if (aVar2 == null) {
                    aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
                }
                aVar2.e = hVar.b();
            }
        }
        if (aVar2 == null) {
            aVar2 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a();
        }
        aVar2.f = r6;
        aVar2.g = currentTimeMillis - j;
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    public void a(String str, long j, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, d.a aVar) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.c().a(str, new b(j, adSlot, cVar, aVar));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.d
    public void a(Map<String, TTAbsAdLoaderAdapter> map, Context context, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.b bVar, d.a aVar) {
        if (bVar != null && bVar.a != null && bVar.d != null && !i0.a(bVar.b)) {
            String G = bVar.d.G();
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(bVar.a.getAdUnitId()) + "开启server bidding网络请求......：");
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(bVar.a, G, (JSONObject) null);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.c().a(map, context, bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, new a(System.currentTimeMillis(), bVar, new int[]{4}, aVar));
            return;
        }
        aVar.a(null);
        char c = 29;
        char c2 = '=';
        while (true) {
            char c3 = 'T';
            while (true) {
                switch (c3) {
                    case 'T':
                        c3 = 'U';
                        c = ']';
                    case 'U':
                        if (c >= 27) {
                            return;
                        }
                        break;
                }
                while (true) {
                    switch (c) {
                        case '%':
                            while (true) {
                                switch (c2) {
                                    case 25:
                                    case 27:
                                        break;
                                    case 26:
                                        break;
                                    default:
                                        c2 = 27;
                                }
                            }
                            break;
                        case '&':
                            break;
                        case '\'':
                            break;
                        default:
                            c = '\'';
                    }
                }
            }
        }
        if (c2 <= '=') {
        }
        while (true) {
        }
    }
}
