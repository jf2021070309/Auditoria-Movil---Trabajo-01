package com.facebook.ads.internal.o;

import android.content.Context;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.q.a.k;
import com.facebook.ads.internal.q.a.r;
import com.facebook.ads.internal.q.a.x;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes2.dex */
public class b {
    protected String a;
    public Context b;
    public com.facebook.ads.internal.protocol.f c;
    private com.facebook.ads.internal.protocol.c d;
    private final AdPlacementType e;
    private final String f;
    private final String g;
    private com.facebook.ads.internal.protocol.d h;
    private boolean i;
    private boolean j;
    private int k;
    private k l;
    private final Map<String, String> m;
    private final com.facebook.ads.internal.protocol.h n;
    private String o;

    public b(Context context, com.facebook.ads.internal.i.c cVar, String str, k kVar, com.facebook.ads.internal.protocol.f fVar, com.facebook.ads.internal.protocol.d dVar, String str2, String str3, int i, boolean z, boolean z2, com.facebook.ads.internal.protocol.h hVar, String str4) {
        this.a = str;
        this.l = kVar;
        this.c = fVar;
        this.d = com.facebook.ads.internal.protocol.c.a(fVar);
        this.h = dVar;
        this.f = str2;
        this.g = str3;
        this.k = i;
        this.i = z;
        this.j = z2;
        this.m = cVar.b();
        this.n = hVar;
        this.b = context;
        this.o = str4;
        this.e = this.d.a();
    }

    private void a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    public String a() {
        return this.a;
    }

    public com.facebook.ads.internal.protocol.c b() {
        return this.d;
    }

    public k c() {
        return this.l;
    }

    public int d() {
        return this.k;
    }

    public com.facebook.ads.internal.protocol.h e() {
        return this.n;
    }

    public Map<String, String> f() {
        HashMap hashMap = new HashMap(this.m);
        a(hashMap, "IDFA", com.facebook.ads.internal.c.b.b);
        a(hashMap, "IDFA_FLAG", com.facebook.ads.internal.c.b.c ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        a(hashMap, "COPPA", String.valueOf(this.j));
        a(hashMap, "PLACEMENT_ID", this.a);
        if (this.e != AdPlacementType.UNKNOWN) {
            a(hashMap, "PLACEMENT_TYPE", this.e.toString().toLowerCase());
        }
        if (this.l != null) {
            a(hashMap, "WIDTH", String.valueOf(this.l.b()));
            a(hashMap, "HEIGHT", String.valueOf(this.l.a()));
        }
        a(hashMap, "ADAPTERS", this.g);
        if (this.c != null) {
            a(hashMap, "TEMPLATE_ID", String.valueOf(this.c.a()));
        }
        if (this.h != null) {
            a(hashMap, "REQUEST_TYPE", String.valueOf(this.h.a()));
        }
        if (this.i) {
            a(hashMap, "TEST_MODE", "1");
        }
        if (this.f != null) {
            a(hashMap, "DEMO_AD_ID", this.f);
        }
        if (this.k != 0) {
            a(hashMap, "NUM_ADS_REQUESTED", String.valueOf(this.k));
        }
        a(hashMap, "CLIENT_EVENTS", com.facebook.ads.internal.j.b.a());
        a(hashMap, "KG_RESTRICTED", String.valueOf(x.a(this.b)));
        a(hashMap, "REQUEST_TIME", r.a(System.currentTimeMillis()));
        if (this.n.c()) {
            a(hashMap, "BID_ID", this.n.d());
        }
        if (this.o != null) {
            a(hashMap, "STACK_TRACE", this.o);
        }
        a(hashMap, "CLIENT_REQUEST_ID", UUID.randomUUID().toString());
        return hashMap;
    }
}
