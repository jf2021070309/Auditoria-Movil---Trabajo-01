package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
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
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f3782b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3783c = new AtomicBoolean();

    public EventServiceImpl(m mVar) {
        this.a = mVar;
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.bk)).booleanValue()) {
            this.f3782b = JsonUtils.toStringObjectMap((String) mVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.t, (com.applovin.impl.sdk.c.d<String>) "{}"), new HashMap());
            return;
        }
        this.f3782b = new HashMap();
        mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.t, (com.applovin.impl.sdk.c.d<String>) "{}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return e.a.d.a.a.r(new StringBuilder(), (String) this.a.a(com.applovin.impl.sdk.c.b.bb), "4.0/pix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(q qVar, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        boolean contains = this.a.b(com.applovin.impl.sdk.c.b.bi).contains(qVar.a());
        hashMap.put("AppLovin-Event", contains ? qVar.a() : "postinstall");
        if (!contains) {
            hashMap.put("AppLovin-Sub-Event", qVar.a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(q qVar, boolean z) {
        boolean contains = this.a.b(com.applovin.impl.sdk.c.b.bi).contains(qVar.a());
        Map<String, Object> a = this.a.V().a(null, z, false);
        a.put("event", contains ? qVar.a() : "postinstall");
        a.put("event_id", qVar.d());
        a.put("ts", Long.toString(qVar.c()));
        if (!contains) {
            a.put("sub_event", qVar.a());
        }
        return Utils.stringifyObjectMap(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return e.a.d.a.a.r(new StringBuilder(), (String) this.a.a(com.applovin.impl.sdk.c.b.bc), "4.0/pix");
    }

    private void c() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bk)).booleanValue()) {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.t, (com.applovin.impl.sdk.c.d<String>) CollectionUtils.toJsonString(this.f3782b, "{}"));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return new HashMap(this.f3782b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f3783c.compareAndSet(false, true)) {
            this.a.w().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.f3782b.remove(str);
            c();
        } else {
            List<String> b2 = this.a.b(com.applovin.impl.sdk.c.b.bj);
            if (Utils.objectIsOfType(obj, b2, this.a)) {
                this.f3782b.put(str, Utils.sanitizeSuperProperty(obj, this.a));
                c();
                return;
            }
            v.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b2);
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap(1);
        hashMap.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
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
        v B = this.a.B();
        B.b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        final q qVar = new q(str, map, this.f3782b);
        try {
            this.a.S().a(new com.applovin.impl.sdk.e.z(this.a, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    EventServiceImpl.this.a.U().a(com.applovin.impl.sdk.network.g.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(EventServiceImpl.this.a(qVar, false)).b(EventServiceImpl.this.a(qVar, map2)).c(qVar.b()).b(((Boolean) EventServiceImpl.this.a.a(com.applovin.impl.sdk.c.b.eC)).booleanValue()).a(((Boolean) EventServiceImpl.this.a.a(com.applovin.impl.sdk.c.b.et)).booleanValue()).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            v B2 = this.a.B();
            B2.b("AppLovinEventService", "Unable to track event: " + qVar, th);
        }
    }

    public void trackEventSynchronously(String str) {
        v B = this.a.B();
        B.b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        q qVar = new q(str, new HashMap(), this.f3782b);
        this.a.U().a(com.applovin.impl.sdk.network.g.o().c(a()).d(b()).a(a(qVar, true)).b(a(qVar, (Map<String, String>) null)).c(qVar.b()).b(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eC)).booleanValue()).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.et)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            v.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, hashMap);
    }
}
