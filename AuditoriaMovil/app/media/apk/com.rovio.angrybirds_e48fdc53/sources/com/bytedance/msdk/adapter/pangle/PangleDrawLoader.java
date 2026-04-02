package com.bytedance.msdk.adapter.pangle;

import android.content.Context;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes.dex */
public class PangleDrawLoader extends MediationAdLoaderImpl {
    private Context a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
        continue;
     */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.bytedance.sdk.openadsdk.TTAdNative r7, com.bytedance.sdk.openadsdk.AdSlot.Builder r8) {
        /*
            r6 = this;
            com.bytedance.sdk.openadsdk.AdSlot r4 = r8.build()
            com.bytedance.msdk.adapter.pangle.PangleDrawAd r0 = new com.bytedance.msdk.adapter.pangle.PangleDrawAd
            r0.<init>()
            android.content.Context r1 = r6.a
            boolean r2 = r6.isClientBidding()
            r3 = r7
            r5 = r6
            r0.loadAd(r1, r2, r3, r4, r5)
        L14:
            r7 = 95
            r8 = r7
        L17:
            switch(r7) {
                case 94: goto L22;
                case 95: goto L1b;
                case 96: goto L1e;
                default: goto L1a;
            }
        L1a:
            goto L28
        L1b:
            switch(r8) {
                case 94: goto L14;
                case 95: goto L28;
                case 96: goto L14;
                default: goto L1e;
            }
        L1e:
            switch(r8) {
                case 55: goto L14;
                case 56: goto L28;
                case 57: goto L14;
                default: goto L21;
            }
        L21:
            goto L27
        L22:
            r7 = 39
            if (r8 != r7) goto L27
            goto L14
        L27:
            return
        L28:
            r7 = 94
            r8 = 125(0x7d, float:1.75E-43)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleDrawLoader.a(com.bytedance.sdk.openadsdk.TTAdNative, com.bytedance.sdk.openadsdk.AdSlot$Builder):void");
    }

    @JProtect
    private void a(TTAdNative tTAdNative, AdSlot.Builder builder, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (mediationAdSlotValueSet.getExpressHeight() > 0.0f) {
            builder.setExpressViewAcceptedSize(mediationAdSlotValueSet.getExpressWidth(), mediationAdSlotValueSet.getExpressHeight());
        } else {
            builder.setExpressViewAcceptedSize(mediationAdSlotValueSet.getExpressWidth(), 0.0f);
        }
        new PangleDrawExpressAd().loadAd(this.a, isClientBidding(), tTAdNative, builder.build(), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6 != ';') goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:17:0x004b). Please submit an issue!!! */
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void realLoader(android.content.Context r6, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r7) {
        /*
            r5 = this;
            r5.a = r6
            r0 = 80001(0x13881, float:1.12105E-40)
            if (r6 == 0) goto L54
            if (r7 == 0) goto L54
            com.bytedance.sdk.openadsdk.TTAdManager r6 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()
            android.content.Context r1 = r5.a
            com.bytedance.sdk.openadsdk.TTAdNative r6 = r6.createAdNative(r1)
            java.lang.String r1 = r5.getAdnId()
            java.lang.String r2 = r5.getAdm()
            r3 = 0
            com.bytedance.sdk.openadsdk.AdSlot$Builder r1 = com.bytedance.msdk.adapter.pangle.PangleAdapterUtils.buildPangleAdSlot(r7, r1, r2, r3)
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            if (r2 <= 0) goto L2f
            if (r3 <= 0) goto L2f
            r1.setImageAcceptedSize(r2, r3)
        L2f:
            int r2 = r7.getOriginType()
            r3 = 1
            r4 = 58
            if (r2 != r3) goto L3e
            r5.a(r6, r1, r7)
            r6 = 57
            goto L4b
        L3e:
            r7 = 2
            if (r2 != r7) goto L45
            r5.a(r6, r1)
            goto L4a
        L45:
            java.lang.String r6 = "渲染类型错误"
            r5.notifyAdFailed(r0, r6)
        L4a:
            r6 = r4
        L4b:
            if (r6 == r4) goto L59
            r7 = 59
            if (r6 == r7) goto L52
            goto L4a
        L52:
            goto L52
        L54:
            java.lang.String r6 = "context is null or adSlotValueSet is null"
            r5.notifyAdFailed(r0, r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleDrawLoader.realLoader(android.content.Context, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet):void");
    }
}
