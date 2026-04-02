package com.fyber.inneractive.sdk.j;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class e {
    public Exception B;
    public String C;
    public long b;
    public long c;
    public long d;
    public String e;
    String f;
    public int g;
    public int h;
    public int i;
    public String j;
    String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    String q;
    public UnitDisplayType r;
    public String t;
    public Map<String, String> u;
    public ImpressionData v;
    protected com.fyber.inneractive.sdk.dv.g w;
    public String z;
    private final long a = 20;
    boolean s = false;
    public int x = 0;
    public float y = -1.0f;
    public int A = -1;

    public abstract InneractiveErrorCode a();

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar);

    public final Long b() {
        ImpressionData impressionData = this.v;
        if (impressionData != null) {
            return impressionData.getDemandId();
        }
        return null;
    }

    public final String c() {
        ImpressionData impressionData = this.v;
        if (impressionData != null) {
            return impressionData.getAdvertiserDomain();
        }
        return null;
    }

    public final void a(com.fyber.inneractive.sdk.dv.g gVar) {
        this.w = gVar;
    }

    public final com.fyber.inneractive.sdk.dv.g e() {
        return this.w;
    }

    public final boolean d() {
        return this.b < System.currentTimeMillis();
    }
}
