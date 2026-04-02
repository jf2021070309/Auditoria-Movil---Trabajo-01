package com.moat.analytics.mobile.vng;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class MoatAdEvent {
    Integer b;
    Double c;
    MoatAdEventType d;
    private final Long f;
    static final Integer a = Integer.MIN_VALUE;
    private static final Double e = Double.valueOf(Double.NaN);
    public static final Double VOLUME_MUTED = Double.valueOf((double) PangleAdapterUtils.CPM_DEFLAUT_VALUE);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, a, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d) {
        this.f = Long.valueOf(System.currentTimeMillis());
        this.d = moatAdEventType;
        this.c = d;
        this.b = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("adVolume", this.c);
        hashMap.put("playhead", this.b);
        hashMap.put("aTimeStamp", this.f);
        hashMap.put("type", this.d.toString());
        return hashMap;
    }
}
