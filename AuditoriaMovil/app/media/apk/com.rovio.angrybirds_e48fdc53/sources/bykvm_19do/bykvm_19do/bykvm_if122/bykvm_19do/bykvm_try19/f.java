package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19;

import android.content.Context;
import android.os.Message;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdLoadInfo;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class f extends e {
    protected Map<Integer, Integer> f0;
    protected boolean g0;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Context context, String str) {
        super(context, str);
        this.f0 = new HashMap();
        this.g0 = false;
    }

    private void f0() {
        if (t()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "抛出成功回调_广告池中广告满足数量直接返回......");
            if (m()) {
                Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "当前广告池中有广告且满足client bididing的返回条件...给出成功回调...");
                q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void C() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.C();
        } else {
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void Y() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.Y();
            return;
        }
        c0();
        e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public void a() {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.a();
            return;
        }
        this.g0 = false;
        e0();
        C();
    }

    protected void a(int i, int i2, boolean z) {
        int i3;
        if (i2 < -100) {
            b(i, z);
            return;
        }
        if (i2 == -100) {
            i3 = i + 1;
        } else if (i2 == 0) {
            for (int i4 = 0; i4 < K(); i4++) {
                int i5 = i + i4 + 1;
                if (i5 < this.n.size()) {
                    a(i5, z);
                }
            }
            return;
        } else {
            i3 = i(i);
            if (i3 <= -1) {
                return;
            }
        }
        a(i3, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void a(int i, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.a(i, z);
        } else {
            c(i, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x000d, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(android.os.Message r2) {
        /*
            r1 = this;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c r0 = r1.d
            if (r0 == 0) goto L23
            boolean r0 = r0.N()
            if (r0 == 0) goto L23
            r1.b(r2)
        Ld:
            r2 = 73
            r0 = 96
        L11:
            switch(r2) {
                case 72: goto L1e;
                case 73: goto L17;
                case 74: goto L1a;
                default: goto L14;
            }
        L14:
            r2 = 72
            goto L11
        L17:
            switch(r0) {
                case 94: goto Ld;
                case 95: goto L1e;
                case 96: goto L1e;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 55: goto L26;
                case 56: goto L26;
                case 57: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto Ld
        L1e:
            r2 = 74
            r0 = 55
            goto L11
        L23:
            super.a(r2)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f.a(android.os.Message):void");
    }

    protected void b(int i, boolean z) {
        int j = j(i);
        if (j > -1) {
            a(j, z);
        } else if (d0() && !this.g0) {
            this.g0 = true;
            int h = h(i);
            if (h > 0) {
                if (this.n.get(h).intValue() <= 0) {
                    if (this.n.get(h).intValue() != 0 && w()) {
                        return;
                    }
                    a(h, z);
                    return;
                }
                for (int i2 = 0; i2 < K(); i2++) {
                    int i3 = h + i2;
                    if (i3 < this.n.size()) {
                        a(i3, z);
                    }
                }
            }
        }
    }

    protected void b(Message message) {
        StringBuilder sb;
        List<TTBaseAd> list;
        int i;
        List<TTBaseAd> list2;
        List<TTBaseAd> list3;
        int i2 = message.what;
        if (i2 == 1) {
            if (message.arg1 == 10003) {
                int intValue = ((Integer) message.obj).intValue();
                this.f0.put(Integer.valueOf(intValue), 4);
                if (p() && !y()) {
                    Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "当前层超时....server Bidding 的请求还没有返回，继续执行下一层普通层(不一定执行)....mTTCommonAdPoolList.size()=" + this.o.size());
                    int f = f(intValue);
                    if (f <= -1 || (i = i(f)) <= -1) {
                        return;
                    }
                } else if (t()) {
                    Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "当前层超时....广告池已有广告不执行下层....mTTCommonAdPoolList.size()=" + this.o.size());
                    if (!m()) {
                        return;
                    }
                    sb = new StringBuilder();
                    sb.append(TTLogUtil.getTagSecondLevel(this.f));
                    sb.append("当前层超时....广告池已有广告不执行下层且满足client bidding的返回条件....mTTCommonAdPoolList.size()=");
                    list = this.o;
                } else {
                    Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "当前层超时....普通广告池没广告尝试执行下层(不一定执行)....mTTCommonAdPoolList.size()=" + this.o.size());
                    int f2 = f(intValue);
                    if (f2 <= -1 || (i = i(f2)) <= -1) {
                        return;
                    }
                }
                a(i, false);
                return;
            }
            return;
        } else if (i2 == 2) {
            O();
            return;
        } else if (i2 == 3) {
            N();
            return;
        } else if (i2 != 4) {
            if (i2 != 5) {
                return;
            }
            this.x.set(true);
            if (p() && y()) {
                if (t()) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "SeverBidding广告成功返回且到达ClientBidding的等待时间，广告池中的广告数量满足...直接返回......");
                    q();
                }
                if (this.s.g() || !this.s.f()) {
                    return;
                }
                Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "所有广告都已经加载完成....... ");
                List<TTBaseAd> list4 = this.q;
                if ((list4 == null || list4.size() <= 0) && (((list2 = this.o) == null || list2.size() <= 0) && ((list3 = this.p) == null || list3.size() <= 0))) {
                    a(new AdError(AdError.ERROR_CODE_AD_LOAD_FAIL, AdError.getMessage(AdError.ERROR_CODE_AD_LOAD_FAIL)), (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d) null);
                    return;
                }
                Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "SeverBidding广告返回且到达ClientBidding的等待时间，所有广告都有返回结果...直接返回......");
                q();
            }
            return;
        } else {
            int intValue2 = ((Integer) message.obj).intValue();
            if (this.f0.get(Integer.valueOf(intValue2)) != null && this.f0.get(Integer.valueOf(intValue2)).intValue() == 1) {
                this.f0.put(Integer.valueOf(intValue2), 4);
            }
            if (!s()) {
                Logger.w("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "当前层超时....P层广告池没广告或者数量不达标,尝试执行下层(不一定执行)....mTTPAdPoolList.size()=" + this.q.size());
                int f3 = f(intValue2);
                if (f3 > -1) {
                    b(f3, false);
                    return;
                }
                return;
            }
            sb = new StringBuilder();
            sb.append(TTLogUtil.getTagSecondLevel(this.f));
            sb.append("当前层超时....广告池已有P层类型广告不执行下层....mTTPAdPoolList.size()=");
            list = this.q;
        }
        sb.append(list.size());
        Logger.w("TTMediationSDK", sb.toString());
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x018f, code lost:
        if (android.text.TextUtils.isEmpty(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_break12.a.a(r1.getTestSlotId())) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.bytedance.msdk.api.AdError r9, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d r10) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f.b(com.bytedance.msdk.api.AdError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f.c(int, boolean):void");
    }

    public void c(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        if (this.g == null || dVar == null) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(list, this.d);
        if (dVar != null) {
            a(dVar.d(), dVar.c(), dVar.e(), com.bytedance.msdk.base.a.a(dVar.b(), dVar.h()), 0, AdLoadInfo.AD_LOADED);
        }
        a(list, dVar);
        if (dVar.a() == 0 && !i0.b(list)) {
            String adNetworkSlotId = list.get(0).getAdNetworkSlotId();
            if (a(adNetworkSlotId)) {
                this.f0.put(Integer.valueOf(list.get(0).getShowSort()), 3);
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
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "P层广告已经成功返回loadSort:" + list.get(0).getLoadSort() + " ,showSort:" + list.get(0).getShowSort());
            this.f0.put(Integer.valueOf(list.get(0).getShowSort()), 2);
        } else if (((!p() && !n()) || (p() && y())) && !i0.b(list) && list.get(0).isNormalAd() && t()) {
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "普通层广告已经成功返回loadSort:" + list.get(0).getLoadSort() + " ,showSort:" + list.get(0).getShowSort());
            if (!m()) {
                return;
            }
            Logger.e("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "满足广告的返回条件...直接返回...");
        } else if (dVar.m() && t() && m()) {
            Logger.d("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "SeverBidding广告返回结果且满足ClientBidding等待时间时广告池中有广告直接返回......");
        } else if (!this.s.f() || !m()) {
            return;
        } else {
            Logger.i("TTMediationSDK", TTLogUtil.getTagSecondLevel(this.f) + "所有层级和所有waterfall都已完成直接回调...");
        }
        q();
    }

    protected void c0() {
        for (int i = 0; i < this.n.size(); i++) {
            this.f0.put(this.n.get(i), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public boolean d(int i) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        return (cVar == null || !cVar.N()) ? super.d(i) : g(i);
    }

    protected boolean d0() {
        for (int i = 0; i < this.n.size(); i++) {
            if (this.n.get(i).intValue() < -100 && (this.f0.get(this.n.get(i)).intValue() == 0 || this.f0.get(this.n.get(i)).intValue() == 1)) {
                return false;
            }
        }
        return true;
    }

    protected void e0() {
        if (i0.b(this.n)) {
            return;
        }
        int intValue = this.n.get(0).intValue();
        if (intValue < -100) {
            for (int i = 0; i < K(); i++) {
                if (i < this.n.size() && this.n.get(i).intValue() < -100) {
                    a(i, false);
                }
            }
        } else if (intValue == -100 || intValue == 0) {
            a(0, false);
        } else {
            for (int i2 = 0; i2 < K(); i2++) {
                if (i2 < this.n.size()) {
                    a(i2, false);
                }
            }
        }
    }

    protected int f(int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            if (this.n.get(i3).intValue() == i) {
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean g(int r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f.g(int):boolean");
    }

    protected int h(int i) {
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            int i3 = i + i2 + 1;
            if (i3 < this.n.size()) {
                int intValue = this.n.get(i3).intValue();
                if (this.f0.get(Integer.valueOf(intValue)) != null && this.f0.get(Integer.valueOf(intValue)).intValue() == 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    protected int i(int i) {
        int intValue;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            int i3 = i + i2 + 1;
            if (i3 < this.n.size() && (intValue = this.n.get(i3).intValue()) > 0 && this.f0.get(Integer.valueOf(intValue)).intValue() == 0) {
                return i3;
            }
        }
        return -1;
    }

    protected int j(int i) {
        int intValue;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            int i3 = i + i2 + 1;
            if (i3 < this.n.size() && (intValue = this.n.get(i3).intValue()) < -100 && this.f0.get(Integer.valueOf(intValue)).intValue() == 0) {
                return i3;
            }
        }
        return -1;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e, com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdFailed(AdError adError, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.onAdFailed(adError, dVar);
        } else {
            b(adError, dVar);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e, com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter.AdapterLoaderListener
    public void onAdLoaded(List<TTBaseAd> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.d dVar) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar = this.d;
        if (cVar == null || !cVar.N()) {
            super.onAdLoaded(list, dVar);
        } else {
            c(list, dVar);
        }
    }
}
