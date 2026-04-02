package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.i;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.g;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.o;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.ad.AdUtils;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import com.qq.e.comm.pi.ACTD;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.bg;
import com.unity3d.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private static volatile a a;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0048a extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ d b;

        C0048a(JSONObject jSONObject, d dVar) {
            this.a = jSONObject;
            this.b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0312 A[Catch: all -> 0x034b, TryCatch #13 {all -> 0x034b, blocks: (B:106:0x02e7, B:111:0x02fa, B:112:0x030d, B:113:0x0312, B:114:0x0326), top: B:145:0x0026 }] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x036f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x034d, TryCatch #12 {all -> 0x034d, blocks: (B:6:0x0011, B:8:0x0028, B:12:0x0032, B:29:0x0084, B:31:0x008e, B:19:0x005e, B:26:0x007b, B:14:0x003c, B:21:0x006c), top: B:146:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0206 A[Catch: all -> 0x02f0, TryCatch #6 {all -> 0x02f0, blocks: (B:72:0x01df, B:71:0x01dc, B:73:0x01eb, B:77:0x01fc, B:79:0x0206, B:81:0x0221, B:84:0x0228, B:90:0x0266, B:91:0x0269, B:92:0x026f, B:94:0x027c, B:97:0x0283, B:103:0x02df, B:104:0x02e2, B:99:0x0289, B:86:0x022e), top: B:127:0x01dc }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0289 A[Catch: all -> 0x02c6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x02f0, blocks: (B:72:0x01df, B:71:0x01dc, B:73:0x01eb, B:77:0x01fc, B:79:0x0206, B:81:0x0221, B:84:0x0228, B:90:0x0266, B:91:0x0269, B:92:0x026f, B:94:0x027c, B:97:0x0283, B:103:0x02df, B:104:0x02e2, B:99:0x0289, B:86:0x022e), top: B:127:0x01dc }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a$a] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r1v38 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v40 */
        /* JADX WARN: Type inference failed for: r1v41 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a$a] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b r22, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b r23) {
            /*
                Method dump skipped, instructions count: 922
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.C0048a.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b r4, java.io.IOException r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof java.net.SocketTimeoutException
                if (r4 == 0) goto Lc
                r4 = 44405(0xad75, float:6.2225E-41)
            L7:
                java.lang.String r5 = r5.toString()
                goto L14
            Lc:
                r4 = 44404(0xad74, float:6.2223E-41)
                if (r5 == 0) goto L12
                goto L7
            L12:
                java.lang.String r5 = "没有网络"
            L14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Server Bidding Request onError...errorCode="
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ServerBiddingHelper"
                com.bytedance.msdk.adapter.util.Logger.e(r1, r0)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a$d r0 = r3.b
                if (r0 == 0) goto L38
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.this
                com.bytedance.msdk.api.AdError r2 = new com.bytedance.msdk.api.AdError
                r2.<init>(r4, r5)
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(r1, r0, r2)
            L38:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.C0048a.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.b, java.io.IOException):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ AdError b;

        b(a aVar, d dVar, AdError adError) {
            this.a = dVar;
            this.b = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = this.a;
            if (dVar != null) {
                dVar.a(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ h b;

        c(a aVar, d dVar, h hVar) {
            this.a = dVar;
            this.b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = this.a;
            if (dVar != null) {
                dVar.a(this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(h hVar);

        void a(AdError adError);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        return 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r4) {
        /*
        L0:
            r0 = 93
            r1 = r0
        L3:
            r2 = 3
            r3 = 4
            switch(r1) {
                case 92: goto Lc;
                case 93: goto Lf;
                case 94: goto L9;
                default: goto L8;
            }
        L8:
            goto L0
        L9:
            if (r0 <= r3) goto L0
            goto L1d
        Lc:
            switch(r0) {
                case 21: goto L1d;
                case 22: goto L1b;
                case 23: goto L19;
                default: goto Lf;
            }
        Lf:
            switch(r0) {
                case 91: goto L1f;
                case 92: goto L1d;
                case 93: goto L15;
                default: goto L12;
            }
        L12:
            r0 = 91
            goto Lf
        L15:
            switch(r4) {
                case 1: goto L1b;
                case 2: goto L1f;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L1e;
                case 6: goto L18;
                case 7: goto L19;
                case 8: goto L19;
                case 9: goto L1e;
                default: goto L18;
            }
        L18:
            goto L1e
        L19:
            r2 = 5
            goto L1e
        L1b:
            r2 = 2
            goto L1e
        L1d:
            r2 = r3
        L1e:
            return r2
        L1f:
            r1 = 94
            r0 = 75
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x0118, TryCatch #2 {all -> 0x0118, blocks: (B:8:0x001b, B:10:0x002f, B:14:0x0039, B:31:0x008c, B:33:0x0096, B:35:0x010e, B:21:0x0065, B:28:0x0082, B:23:0x0073, B:16:0x0043), top: B:42:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.i a(org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(org.json.JSONObject):bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.i");
    }

    private String a(AdSlot adSlot, k kVar) {
        String linkedId = adSlot != null ? adSlot.getLinkedId() : null;
        if (kVar != null) {
            return (linkedId + "_") + kVar.d();
        }
        return linkedId;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0022 -> B:14:0x003f). Please submit an issue!!! */
    private String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                GMCustomAdapterConfiguration a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(str);
                if (a2 != null) {
                    return a2.getNetworkSdkVersion();
                }
                ITTAdapterConfiguration a3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a(str);
                if (a3 != null) {
                    return a3.getNetworkSdkVersion();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                Logger.e("TTMediationSDK_SDK_Init", "GDT SDK 初始化失败。。 e=" + th.toString());
            }
        }
        return null;
    }

    private String a(Map<String, TTAbsAdLoaderAdapter> map, Context context, AdSlot adSlot, k kVar, Map<String, Object> map2) {
        String d2;
        GMAdSlotBase covertAdSlot2GMAdSlotBase;
        if (adSlot == null || kVar == null) {
            Logger.i("serverBiddingRequest", "adSlot is null or waterFallConfig is null can not get server bidding token");
            return "";
        } else if (TextUtils.equals("baidu", kVar.e())) {
            TTAbsAdLoaderAdapter d3 = g.d(kVar);
            if (d3 == null) {
                return "";
            }
            map.put(String.format("%1$s_%2$s_%3$s", adSlot.getLinkedId(), adSlot.getAdUnitId(), kVar.d()), d3);
            if (adSlot.getAdType() == 5) {
                d2 = kVar.d();
                covertAdSlot2GMAdSlotBase = AdUtils.getAdSlotNative(adSlot, kVar);
            } else {
                d2 = kVar.d();
                covertAdSlot2GMAdSlotBase = AdUtils.covertAdSlot2GMAdSlotBase(adSlot);
            }
            return d3.getBiddingToken(context, d2, covertAdSlot2GMAdSlotBase);
        } else {
            return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(map2, kVar.e());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:181:0x05a9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private java.lang.String a(java.util.Map<java.lang.String, com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter> r38, android.content.Context r39, com.bytedance.msdk.api.AdSlot r40, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r41, java.util.List<com.bytedance.msdk.base.TTBaseAd> r42, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c r43, int r44, boolean r45, org.json.JSONObject r46) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(java.util.Map, android.content.Context, com.bytedance.msdk.api.AdSlot, java.util.List, java.util.List, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c, int, boolean, org.json.JSONObject):java.lang.String");
    }

    private String a(JSONObject jSONObject, boolean z) {
        JSONObject a2 = n0.a(jSONObject);
        if (a2 != null) {
            try {
                a2.putOpt("token_type", Integer.valueOf(z ? 1 : 0));
            } catch (Exception e) {
            }
            return a2.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0001, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject a() {
        /*
            r3 = this;
            r0 = 0
        L1:
            r1 = 73
            r2 = 96
        L5:
            switch(r1) {
                case 72: goto L37;
                case 73: goto Lb;
                case 74: goto Le;
                default: goto L8;
            }
        L8:
            r1 = 72
            goto L5
        Lb:
            switch(r2) {
                case 94: goto L1;
                case 95: goto L12;
                case 96: goto L12;
                default: goto Le;
            }
        Le:
            switch(r2) {
                case 55: goto L1f;
                case 56: goto L1f;
                case 57: goto L12;
                default: goto L11;
            }
        L11:
            goto L1
        L12:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L37
        L1f:
            r1 = 0
            if (r0 == 0) goto L23
            goto L36
        L23:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> L32
            r0.<init>(r2)     // Catch: java.lang.Exception -> L32
            r1 = r0
            goto L36
        L32:
            r0 = move-exception
            r0.printStackTrace()
        L36:
            return r1
        L37:
            r1 = 74
            r2 = 55
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a():org.json.JSONObject");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private org.json.JSONObject a(com.bytedance.msdk.api.AdSlot r6) {
        /*
            r5 = this;
            r0 = 92
        L2:
            r1 = 14
        L4:
            switch(r1) {
                case 13: goto L5f;
                case 14: goto L61;
                case 15: goto L8;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            switch(r0) {
                case 94: goto L61;
                case 95: goto Lc;
                case 96: goto L61;
                default: goto Lb;
            }
        Lb:
            goto L61
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r6.getAdType()     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "id"
            java.lang.String r3 = r6.getAdUnitId()     // Catch: java.lang.Exception -> L5d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "adtype"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "pos"
            int r3 = a(r1)     // Catch: java.lang.Exception -> L5d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "accepted_size"
            int r3 = r6.getImgAcceptedWidth()     // Catch: java.lang.Exception -> L5d
            int r4 = r6.getImgAcceptedHeight()     // Catch: java.lang.Exception -> L5d
            r5.a(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "is_support_dpl"
            boolean r3 = r6.isSupportDeepLink()     // Catch: java.lang.Exception -> L5d
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L5d
            int r6 = r6.getAdCount()     // Catch: java.lang.Exception -> L5d
            r2 = 1
            if (r6 >= r2) goto L4a
            r6 = r2
        L4a:
            r3 = 3
            if (r6 <= r3) goto L4e
            r6 = r3
        L4e:
            r3 = 7
            if (r1 == r3) goto L57
            r3 = 8
            if (r1 != r3) goto L56
            goto L57
        L56:
            r2 = r6
        L57:
            java.lang.String r6 = "ad_count"
            r0.put(r6, r2)     // Catch: java.lang.Exception -> L5d
            goto L5e
        L5d:
            r6 = move-exception
        L5e:
            return r0
        L5f:
            r1 = 72
        L61:
            r0 = 95
            r1 = 15
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(com.bytedance.msdk.api.AdSlot):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:15:0x0023, B:17:0x0037, B:21:0x0040, B:39:0x0094, B:41:0x009e, B:43:0x00bc, B:29:0x006d, B:36:0x008a, B:23:0x004a, B:31:0x007b), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0012 -> B:14:0x0020). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "ServerBiddingHelper"
            r1 = 14
            if (r5 != 0) goto L8
            r6 = r1
            goto L20
        L8:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L23
            r5 = 12
            r6 = 128(0x80, float:1.794E-43)
        L12:
            switch(r5) {
                case 12: goto Ldf;
                case 13: goto Ldf;
                case 14: goto L16;
                default: goto L15;
            }
        L15:
            goto L20
        L16:
            r5 = 27
            if (r6 >= r5) goto L1c
            goto Ldf
        L1c:
            r6 = 26
            r5 = r1
            goto L12
        L20:
            r5 = 13
            goto L12
        L23:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "cypher"
            r2 = -1
            int r6 = r1.optInt(r6, r2)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = "message"
            java.lang.String r1 = r1.optString(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r6 <= r2) goto Lc3
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto Lc3
            r2 = 2
            if (r6 != r2) goto L6a
            java.lang.String r6 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n0.a(r1)     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L91
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L50
            goto L92
        L50:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r1.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = ">>>>> m_meta data error: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc6
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Lc6
            com.bytedance.msdk.adapter.util.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> Lc6
            goto L91
        L6a:
            r2 = 1
            if (r6 != r2) goto L88
            java.lang.String r6 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L91
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L81
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L81
            goto L92
        L81:
            r6 = move-exception
            java.lang.String r1 = "m_meta data error: "
            com.bytedance.msdk.adapter.util.Logger.d(r0, r1, r6)     // Catch: java.lang.Throwable -> Lc6
            goto L91
        L88:
            if (r6 != 0) goto L91
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Lc6
            r1 = r6
            goto L92
        L91:
            r1 = 0
        L92:
            if (r1 == 0) goto Lc0
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Lc6
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc6
            if (r6 != 0) goto Lba
            java.lang.String r6 = "request_id"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> Lc6
            r5.a(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "server_bidding_extra"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> Lc6
            r5.b(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "server_request_id"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> Lc6
            r5.c(r6)     // Catch: java.lang.Throwable -> Lc6
            goto Ldf
        Lba:
            java.lang.String r5 = "m_meta..data.string is null "
        Lbc:
            com.bytedance.msdk.adapter.util.Logger.e(r0, r5)     // Catch: java.lang.Throwable -> Lc6
            goto Ldf
        Lc0:
            java.lang.String r5 = "m_meta...data is null"
            goto Lbc
        Lc3:
            java.lang.String r5 = "m_meta onResponse error "
            goto Lbc
        Lc6:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "m_meta onResponse throwable ："
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.bytedance.msdk.adapter.util.Logger.e(r0, r5)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h, java.lang.String):void");
    }

    private void a(d dVar, h hVar) {
        ThreadHelper.runOnMSDKThread(new c(this, dVar, hVar));
    }

    private void a(d dVar, AdError adError) {
        ThreadHelper.runOnMSDKThread(new b(this, dVar, adError));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r1, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.d r2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h r3) {
        /*
            r1.a(r2, r3)
        L3:
            r1 = 94
            r2 = 75
            r3 = 93
        L9:
            r0 = 92
            if (r1 == r0) goto L10
            if (r1 == r3) goto L13
            goto L1a
        L10:
            switch(r2) {
                case 21: goto L1a;
                case 22: goto L1a;
                case 23: goto L1a;
                default: goto L13;
            }
        L13:
            switch(r2) {
                case 91: goto L3;
                case 92: goto L1a;
                case 93: goto L19;
                default: goto L16;
            }
        L16:
            r2 = 91
            goto L13
        L19:
            return
        L1a:
            r1 = r3
            r2 = r1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a$d, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.h):void");
    }

    static /* synthetic */ void a(a aVar, d dVar, AdError adError) {
        aVar.a(dVar, adError);
        while (true) {
            char c2 = ']';
            char c3 = ']';
            while (true) {
                switch (c3) {
                    case '\\':
                        switch (c2) {
                        }
                        c3 = '^';
                        c2 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c2) {
                                default:
                                    c2 = '[';
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                            }
                        }
                        c3 = '^';
                        c2 = 'K';
                    case '^':
                        if (c2 <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    private void a(JSONObject jSONObject, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception e) {
        }
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ACTD.APPID_KEY, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b());
            jSONObject.put("name", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().i());
            c(jSONObject);
            b(jSONObject);
        } catch (Exception e) {
        }
        return jSONObject;
    }

    private JSONObject b(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", adSlot.getLinkedId());
            jSONObject.put("ad_sdk_version", "4.2.0.2");
            jSONObject.put("source_type", "app");
            jSONObject.put("app", b());
            JSONObject a2 = n.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
            if (a2 != null && adSlot.getOrientation() > 0) {
                a2.put(AdUnitActivity.EXTRA_ORIENTATION, adSlot.getOrientation());
            }
            jSONObject.put("device", a2);
            jSONObject.put(as.d, com.bytedance.msdk.base.b.b);
            jSONObject.put("ip", n.a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a(adSlot));
            jSONObject.put("adslots", jSONArray);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            jSONObject.put("req_sign", o.a((adSlot.getAdUnitId() == null || adSlot.getLinkedId() == null) ? "" : String.valueOf(currentTimeMillis).concat(adSlot.getAdUnitId()).concat(adSlot.getLinkedId())));
        } catch (Exception e) {
        }
        return jSONObject;
    }

    private JSONObject b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private void b(org.json.JSONObject r6) {
        /*
            r5 = this;
            r0 = 92
        L2:
            r1 = 14
        L4:
            switch(r1) {
                case 13: goto L33;
                case 14: goto L35;
                case 15: goto L8;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            switch(r0) {
                case 94: goto L35;
                case 95: goto Lc;
                case 96: goto L35;
                default: goto Lb;
            }
        Lb:
            goto L35
        Lc:
            android.content.Context r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.e r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f.b(r0)
            if (r0 == 0) goto L32
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L31
            r1.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "latitude"
            float r3 = r0.a     // Catch: java.lang.Exception -> L31
            double r3 = (double) r3     // Catch: java.lang.Exception -> L31
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "longitude"
            float r0 = r0.b     // Catch: java.lang.Exception -> L31
            double r3 = (double) r0     // Catch: java.lang.Exception -> L31
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "geo"
            r6.put(r0, r1)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r6 = move-exception
        L32:
            return
        L33:
            r1 = 72
        L35:
            r0 = 95
            r1 = 15
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.b(org.json.JSONObject):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0002, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a c() {
        /*
            java.lang.Class<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a> r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.class
        L2:
            r1 = 73
            r2 = 96
            r3 = 55
        L8:
            switch(r1) {
                case 72: goto L30;
                case 73: goto Le;
                case 74: goto L11;
                default: goto Lb;
            }
        Lb:
            r1 = 72
            goto L8
        Le:
            switch(r2) {
                case 94: goto L2;
                case 95: goto L30;
                case 96: goto L30;
                default: goto L11;
            }
        L11:
            if (r2 == r3) goto L18
            r1 = 57
            if (r2 == r1) goto L30
            goto L2
        L18:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a
            if (r1 != 0) goto L2d
            monitor-enter(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L28
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r1 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a = r1     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
        L2d:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.a
            return r0
        L30:
            r1 = 74
            r2 = r3
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a.c():bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_this102.a");
    }

    private void c(JSONObject jSONObject) {
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                if (c2 == '\\') {
                    switch (c3) {
                    }
                } else if (c2 != ']') {
                    c2 = ']';
                    c3 = ']';
                }
            }
            while (true) {
                switch (c3) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        try {
                            jSONObject.put(bg.o, n0.a());
                            jSONObject.put("version_code", n0.d());
                            jSONObject.put("version", n0.e());
                            return;
                        } catch (Exception e) {
                            return;
                        }
                    default:
                        c3 = '[';
                }
            }
        }
    }

    public String a(Map<String, TTAbsAdLoaderAdapter> map, Context context, AdSlot adSlot, List<k> list, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, int i, boolean z, JSONObject jSONObject) {
        return a(map, context, adSlot, list, (List<TTBaseAd>) null, cVar, i, z, jSONObject);
    }

    public void a(String str, d dVar) {
        boolean z = true;
        while (true) {
            if (!z && z) {
                break;
            }
            z = true;
        }
        if (TextUtils.isEmpty(str)) {
            Logger.e("ServerBiddingHelper", "Server Bidding Request onResponse...response is invalid");
            a(dVar, new AdError(-1, "response is invalid"));
            return;
        }
        try {
            h hVar = new h();
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            String optString = jSONObject.optString("m_meta");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    i a2 = a(optJSONArray.optJSONObject(i));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                hVar.b(arrayList);
            }
            a(hVar, optString);
            a(dVar, hVar);
        } catch (Throwable th) {
            String th2 = th.toString();
            Logger.e("ServerBiddingHelper", "Server Bidding onResponse throwable ：" + th2);
            if (TextUtils.isEmpty(th2)) {
                th2 = AdError.getMessage(-1);
            }
            a(dVar, new AdError(-1, th2));
        }
    }

    public void a(Map<String, TTAbsAdLoaderAdapter> map, Context context, AdSlot adSlot, List<k> list, List<TTBaseAd> list2, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, int i, boolean z, d dVar) {
        JSONObject jSONObject = new JSONObject();
        String a2 = a(map, context, adSlot, list, list2, cVar, i, z, jSONObject);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c c2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b().a().c();
        c2.b(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c.b());
        String q = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().q();
        if (!TextUtils.isEmpty(q)) {
            c2.a("X-Tt-Env", q);
            c2.a("x-use-ppe", "1");
        }
        c2.a("User-Agent", com.bytedance.msdk.base.b.b);
        c2.c(a2);
        c2.a(new C0048a(jSONObject, dVar));
    }
}
