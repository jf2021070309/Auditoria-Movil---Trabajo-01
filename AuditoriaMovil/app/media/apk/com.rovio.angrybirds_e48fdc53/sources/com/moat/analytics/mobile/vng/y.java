package com.moat.analytics.mobile.vng;

import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class y extends c<Object> implements ReactiveVideoTracker {
    private Integer l;

    public y(String str) {
        super(str);
        p.a("[SUCCESS] ", a() + " created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.moat.analytics.mobile.vng.b
    public String a() {
        return "ReactiveVideoTracker";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moat.analytics.mobile.vng.c
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.b.equals(MoatAdEvent.a) && !a(moatAdEvent.b, this.l)) {
            moatAdEvent.d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    @Override // com.moat.analytics.mobile.vng.c
    protected Map<String, Object> g() {
        Integer num;
        Integer num2;
        HashMap hashMap = new HashMap();
        View view = this.k.get();
        if (view != null) {
            num2 = Integer.valueOf(view.getWidth());
            num = Integer.valueOf(view.getHeight());
        } else {
            num = 0;
            num2 = 0;
        }
        hashMap.put("duration", this.l);
        hashMap.put("width", num2);
        hashMap.put("height", num);
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        if (this.e) {
            p.a(3, "ReactiveVideoTracker", this, "trackVideoAd already called");
            p.a("[ERROR] ", a() + " trackVideoAd can't be called twice");
            return false;
        } else if (num.intValue() < 1000) {
            p.a(3, "ReactiveVideoTracker", this, String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", num));
            return false;
        } else {
            this.l = num;
            return super.a(map, new Object(), view);
        }
    }
}
