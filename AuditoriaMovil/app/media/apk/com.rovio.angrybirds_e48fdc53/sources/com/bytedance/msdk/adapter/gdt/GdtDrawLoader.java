package com.bytedance.msdk.adapter.gdt;

import android.content.Context;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes.dex */
public class GdtDrawLoader extends MediationAdLoaderImpl {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(final android.content.Context r4, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r5) {
        /*
            r3 = this;
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = new com.qq.e.ads.nativ.NativeUnifiedAD
            java.lang.String r1 = r5.getADNId()
            com.bytedance.msdk.adapter.gdt.GdtDrawLoader$1 r2 = new com.bytedance.msdk.adapter.gdt.GdtDrawLoader$1
            r2.<init>()
            r0.<init>(r4, r1, r2)
            java.lang.Object r4 = r5.getGdtDownAPPConfirmPolicy()
            boolean r4 = r4 instanceof com.qq.e.ads.cfg.DownAPPConfirmPolicy
            if (r4 == 0) goto L20
            java.lang.Object r4 = r5.getGdtDownAPPConfirmPolicy()
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r4 = (com.qq.e.ads.cfg.DownAPPConfirmPolicy) r4
        L1c:
            r0.setDownAPPConfirmPolicy(r4)
            goto L3e
        L20:
            java.lang.Object r4 = r5.getGdtDownAPPConfirmPolicy()
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r5.getGdtDownAPPConfirmPolicy()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L35
            goto L3b
        L35:
            r1 = 1
            if (r4 != r1) goto L3e
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r4 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.NOConfirm
            goto L1c
        L3b:
            com.qq.e.ads.cfg.DownAPPConfirmPolicy r4 = com.qq.e.ads.cfg.DownAPPConfirmPolicy.Default
            goto L1c
        L3e:
            int r4 = r5.getGdtMaxVideoDuration()
            int r1 = r5.getGdtMinVideoDuration()
            if (r1 <= 0) goto L4b
            r0.setMinVideoDuration(r1)
        L4b:
            if (r4 <= 0) goto L50
            r0.setMaxVideoDuration(r4)
        L50:
            int r4 = r5.getAdCount()
            r0.loadData(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.gdt.GdtDrawLoader.a(android.content.Context, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet):void");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        a(context, mediationAdSlotValueSet);
    }
}
