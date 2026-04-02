package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    private final k a;
    private final Map<String, Object> b;
    private final AtomicBoolean c = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.a = kVar;
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.ba)).booleanValue()) {
            this.b = JsonUtils.toStringObjectMap((String) this.a.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.r, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON), new HashMap());
            return;
        }
        this.b = new HashMap();
        kVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.r, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return ((String) this.a.a(com.applovin.impl.sdk.c.b.aS)) + "4.0/pix";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(o oVar, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.a.b(com.applovin.impl.sdk.c.b.aY).contains(oVar.a());
        hashMap.put("AppLovin-Event", contains ? oVar.a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", oVar.a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(o oVar, boolean z) {
        boolean contains = this.a.b(com.applovin.impl.sdk.c.b.aY).contains(oVar.a());
        Map<String, Object> a = this.a.T().a(null, z, false);
        a.put(NotificationCompat.CATEGORY_EVENT, contains ? oVar.a() : "postinstall");
        a.put("event_id", oVar.d());
        a.put("ts", Long.toString(oVar.c()));
        if (!contains) {
            a.put("sub_event", oVar.a());
        }
        return Utils.stringifyObjectMap(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return ((String) this.a.a(com.applovin.impl.sdk.c.b.aT)) + "4.0/pix";
    }

    private void c() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ba)).booleanValue()) {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.r, (com.applovin.impl.sdk.c.d<String>) CollectionUtils.toJsonString(this.b, JsonUtils.EMPTY_JSON));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.c.compareAndSet(false, true)) {
            this.a.u().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            r.i("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.b.remove(str);
            c();
        } else {
            List<String> b = this.a.b(com.applovin.impl.sdk.c.b.aZ);
            if (Utils.objectIsOfType(obj, b, this.a)) {
                this.b.put(str, Utils.sanitizeSuperProperty(obj, this.a));
                c();
                return;
            }
            r.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b);
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap(1);
        hashMap.put("transaction_id", str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, hashMap);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        r z = this.a.z();
        z.b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        final o oVar = new o(str, map, this.b);
        try {
            this.a.Q().a(new com.applovin.impl.sdk.e.y(this.a, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.a.S().a(com.applovin.impl.sdk.network.g.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(EventServiceImpl.this.a(oVar, false)).b(EventServiceImpl.this.a(oVar, map2)).c(oVar.b()).b(((Boolean) EventServiceImpl.this.a.a(com.applovin.impl.sdk.c.b.ew)).booleanValue()).a(((Boolean) EventServiceImpl.this.a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            r z2 = this.a.z();
            z2.b("AppLovinEventService", "Unable to track event: " + oVar, th);
        }
    }

    public void trackEventSynchronously(String str) {
        r z = this.a.z();
        z.b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        o oVar = new o(str, new HashMap(), this.b);
        this.a.S().a(com.applovin.impl.sdk.network.g.o().c(a()).d(b()).a(a(oVar, true)).b(a(oVar, (Map<String, String>) null)).c(oVar.b()).b(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ew)).booleanValue()).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            r.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent("iap", hashMap);
    }
}
