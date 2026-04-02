package com.applovin.impl.a;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f3108b;

    /* renamed from: c  reason: collision with root package name */
    private String f3109c;

    /* renamed from: d  reason: collision with root package name */
    private long f3110d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f3111e = -1;

    private j() {
    }

    private static int a(String str, e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if ("complete".equalsIgnoreCase(str)) {
            if (eVar != null) {
                return eVar.h();
            }
            return 95;
        }
        return -1;
    }

    public static j a(q qVar, e eVar, com.applovin.impl.sdk.m mVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (qVar != null) {
            if (mVar != null) {
                try {
                    String c2 = qVar.c();
                    if (!StringUtils.isValidString(c2)) {
                        mVar.B().e("VastTracker", "Unable to create tracker. Could not find URL.");
                        return null;
                    }
                    j jVar = new j();
                    jVar.f3109c = c2;
                    jVar.a = qVar.b().get(FacebookAdapter.KEY_ID);
                    jVar.f3108b = qVar.b().get("event");
                    jVar.f3111e = a(jVar.a(), eVar);
                    String str = qVar.b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            jVar.f3111e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            long j2 = 0;
                            int i2 = size - 1;
                            for (int i3 = i2; i3 >= 0; i3--) {
                                String str2 = explode.get(i3);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i3 == i2) {
                                        seconds = parseInt;
                                    } else {
                                        if (i3 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i3 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds(parseInt);
                                    }
                                    j2 += seconds;
                                }
                            }
                            jVar.f3110d = j2;
                            jVar.f3111e = -1;
                        }
                    }
                    return jVar;
                } catch (Throwable th) {
                    mVar.B().b("VastTracker", "Error occurred while initializing", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.f3108b;
    }

    public boolean a(long j2, int i2) {
        long j3 = this.f3110d;
        boolean z = j3 >= 0;
        boolean z2 = j2 >= j3;
        int i3 = this.f3111e;
        boolean z3 = i3 >= 0;
        boolean z4 = i2 >= i3;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    public String b() {
        return this.f3109c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3110d == jVar.f3110d && this.f3111e == jVar.f3111e) {
                String str = this.a;
                if (str == null ? jVar.a == null : str.equals(jVar.a)) {
                    String str2 = this.f3108b;
                    if (str2 == null ? jVar.f3108b == null : str2.equals(jVar.f3108b)) {
                        return this.f3109c.equals(jVar.f3109c);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3108b;
        int x = e.a.d.a.a.x(this.f3109c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        long j2 = this.f3110d;
        return ((x + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f3111e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastTracker{identifier='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", event='");
        e.a.d.a.a.J(y, this.f3108b, CoreConstants.SINGLE_QUOTE_CHAR, ", uriString='");
        e.a.d.a.a.J(y, this.f3109c, CoreConstants.SINGLE_QUOTE_CHAR, ", offsetSeconds=");
        y.append(this.f3110d);
        y.append(", offsetPercent=");
        y.append(this.f3111e);
        y.append('}');
        return y.toString();
    }
}
