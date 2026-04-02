package com.bytedance.msdk.api.v2.slot;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.t;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.api.TTRequestExtraParams;
import com.bytedance.msdk.api.TTVideoOption;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GMAdSlotBase {
    public static final String KEY_TEST_TOOL_SLOT_ID = "testToolSlotId";
    private boolean a;
    private float b;
    private boolean c;
    protected GMAdSlotGDTOption d;
    protected GMAdSlotBaiduOption e;
    protected Map<String, Object> f;
    private String g;
    private int h;
    private boolean i;
    private String j;
    private int k;
    protected ValueSet l;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        protected boolean a;
        protected float b;
        protected boolean c;
        protected GMAdSlotGDTOption d;
        protected GMAdSlotBaiduOption e;
        protected String g;
        protected boolean i;
        protected String j;
        protected Map<String, Object> f = new HashMap();
        protected int h = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 < 0.0f) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GMAdSlotBase(com.bytedance.msdk.api.v2.slot.GMAdSlotBase.Builder r4) {
        /*
            r3 = this;
            r3.<init>()
            boolean r0 = r4.a
            r3.a = r0
            float r0 = r4.b
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L12
        Lf:
            r4.b = r1
            goto L18
        L12:
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L18
            goto Lf
        L18:
            float r0 = r4.b
            r3.b = r0
            boolean r0 = r4.c
            r3.c = r0
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption r0 = r4.d
            if (r0 == 0) goto L25
            goto L2e
        L25:
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption$Builder r0 = new com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption$Builder
            r0.<init>()
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption r0 = r0.build()
        L2e:
            r3.d = r0
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption r0 = r4.e
            if (r0 == 0) goto L35
            goto L3e
        L35:
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption$Builder r0 = new com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption$Builder
            r0.<init>()
            com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotBaiduOption r0 = r0.build()
        L3e:
            r3.e = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f
            r3.f = r0
            java.lang.String r0 = r4.g
            r3.g = r0
            int r0 = r4.h
            r3.h = r0
            boolean r0 = r4.i
            r3.i = r0
            java.lang.String r4 = r4.j
            r3.j = r4
            com.bykv.vk.openvk.api.proto.ValueSet r4 = r3.l
            if (r4 == 0) goto L94
            com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r4 = com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet.create(r4)
            boolean r0 = r4.isMuted()
            r3.a = r0
            float r0 = r4.getVolume()
            r3.b = r0
            boolean r0 = r4.isUseSurfaceView()
            r3.c = r0
            java.lang.String r0 = r4.getScenarioId()
            r3.j = r0
            java.util.Map r0 = r4.getExtraObject()
            r3.f = r0
            boolean r0 = r4.isBidNotify()
            r3.i = r0
            java.util.Map r4 = r4.getExtraObject()
            if (r4 == 0) goto L94
            java.lang.String r0 = "testToolSlotId"
            java.lang.Object r4 = r4.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L94
            java.lang.String r4 = (java.lang.String) r4
            r3.g = r4
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.api.v2.slot.GMAdSlotBase.<init>(com.bytedance.msdk.api.v2.slot.GMAdSlotBase$Builder):void");
    }

    public TTVideoOption createTTVideoOption(boolean z) {
        TTVideoOption.Builder builder = new TTVideoOption.Builder();
        builder.setMuted(isMuted());
        builder.setAdmobAppVolume(getVolume());
        builder.useSurfaceView(isUseSurfaceView());
        GMAdSlotGDTOption gMAdSlotGDTOption = getGMAdSlotGDTOption();
        if (gMAdSlotGDTOption != null) {
            builder.setGDTExtraOption(gMAdSlotGDTOption.getGDTExtraOption(z));
        }
        GMAdSlotBaiduOption gMAdSlotBaiduOption = getGMAdSlotBaiduOption();
        if (gMAdSlotGDTOption != null) {
            builder.setBaiduExtraOption(gMAdSlotBaiduOption.getBaiduExtra());
        }
        return builder.build();
    }

    public abstract ValueSet getAdValueSet();

    @Deprecated
    public int getDownloadType() {
        return this.h;
    }

    public GMAdSlotBaiduOption getGMAdSlotBaiduOption() {
        return this.e;
    }

    public GMAdSlotGDTOption getGMAdSlotGDTOption() {
        return this.d;
    }

    @Deprecated
    public int getNetWorkNum() {
        return this.k;
    }

    public Map<String, Object> getParams() {
        return this.f;
    }

    public String getScenarioId() {
        return this.j;
    }

    public TTRequestExtraParams getTTRequestExtraParams() {
        TTRequestExtraParams tTRequestExtraParams = new TTRequestExtraParams();
        if (getParams() != null && getParams().size() > 0) {
            tTRequestExtraParams.getExtraObject().putAll(getParams());
        }
        return tTRequestExtraParams;
    }

    public String getTestSlotId() {
        return this.g;
    }

    public ValueSet getValueSet() {
        return this.l;
    }

    public float getVolume() {
        return this.b;
    }

    public boolean isBidNotify() {
        return this.i;
    }

    public boolean isMuted() {
        return this.a;
    }

    public boolean isUseSurfaceView() {
        return this.c;
    }

    @Deprecated
    public void setNetWorkNum(String str) {
        this.k = t.a(str);
    }
}
