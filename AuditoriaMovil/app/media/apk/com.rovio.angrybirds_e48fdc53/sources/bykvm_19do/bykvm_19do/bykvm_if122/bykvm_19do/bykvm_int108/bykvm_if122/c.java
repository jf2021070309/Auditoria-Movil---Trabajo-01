package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class c extends f {
    private long h0;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, String str) {
        super(context, str);
    }

    static /* synthetic */ void a(c cVar, AdError adError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        super.onAdFailed(adError, dVar);
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                default:
                                    c = '[';
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                            }
                        }
                        c2 = '^';
                        c = 'K';
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void Q() {
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                            case 21:
                                return;
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    return;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    protected void R() {
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                            case 21:
                                return;
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    return;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.bytedance.msdk.api.AdSlot r5, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.f r6) {
        /*
            r4 = this;
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            r4.h0 = r0
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d()
            java.lang.String r1 = r4.f
            long r2 = r4.h0
            r0.a(r1, r2)
            r4.h = r5
            com.bytedance.msdk.api.AdSlot r5 = r4.h
            com.bytedance.msdk.api.v2.slot.GMAdSlotBase r5 = com.bytedance.msdk.api.v2.ad.AdUtils.covertAdSlot2GMAdSlotBase(r5)
            r4.w = r5
            r5 = 0
            r4.J = r5
            r4.c0 = r6
            r4.U()
            r5 = 55
            r6 = 0
        L26:
            r0 = 72
        L28:
            switch(r0) {
                case 72: goto L40;
                case 73: goto L3b;
                case 74: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 52
            if (r6 == r0) goto L26
            r0 = 53
            if (r6 == r0) goto L35
            goto L40
        L35:
            switch(r5) {
                case 29: goto L3f;
                case 30: goto L26;
                case 31: goto L2c;
                default: goto L38;
            }
        L38:
            r5 = 30
            goto L35
        L3b:
            r0 = 57
            if (r6 > r0) goto L40
        L3f:
            return
        L40:
            r0 = 73
            r6 = 16
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.c.a(com.bytedance.msdk.api.AdSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b$f):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(AdError adError) {
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                            case 21:
                                return;
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    return;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void b(List<k> list) {
        boolean z;
        TTBaseAd tTBaseAd;
        super.b(list);
        Map<String, List<e>> b = b.d().b(this.f);
        if (b == null || b.keySet() == null) {
            return;
        }
        CopyOnWriteArrayList<TTBaseAd> copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(b.keySet());
        for (String str : arrayList) {
            List<e> list2 = b.get(str);
            if (list2 != null && list2.size() > 0) {
                for (e eVar : list2) {
                    if (eVar != null && (tTBaseAd = eVar.a) != null && tTBaseAd.isNormalAd()) {
                        copyOnWriteArrayList.add(eVar.a);
                    }
                }
            }
        }
        if (copyOnWriteArrayList.size() != 0) {
            if (i0.a(list)) {
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "处理预缓存逻辑......没有胜出的普通广告，普通广告被全部过滤掉了");
                return;
            }
            for (TTBaseAd tTBaseAd2 : copyOnWriteArrayList) {
                Iterator<k> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    k next = it.next();
                    if (tTBaseAd2 != null && next != null && tTBaseAd2.getAdNetworkSlotId().equals(next.d())) {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "处理预缓存逻辑......已经响应的广告: " + tTBaseAd2.getAdNetworkSlotId() + "  没有在severBidding的waterFall列表中，需要被移除掉");
                    copyOnWriteArrayList.remove(tTBaseAd2);
                }
            }
            for (TTBaseAd tTBaseAd3 : copyOnWriteArrayList) {
                if (tTBaseAd3 != null) {
                    b.remove(tTBaseAd3.getAdNetworkSlotId());
                }
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void b(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        if (list == null) {
            return;
        }
        for (TTBaseAd tTBaseAd : list) {
            if (tTBaseAd != null) {
                b.d().a(this.f, new e(tTBaseAd, dVar, this.h0, this.h));
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e, com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdFailed(AdError adError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        a(this, adError, dVar);
        b.d().a(this.f, dVar.d(), this.h0, adError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public boolean u() {
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 21:
                            return true;
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        return true;
                    default:
                        c2 = '[';
                }
            }
        }
    }
}
