package com.applovin.impl.a;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
import com.facebook.internal.security.CertificateUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class g {
    private String a;
    private String b;
    private String c;
    private long d = -1;
    private int e = -1;

    private g() {
    }

    private static int a(String str, c cVar) {
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
            if (cVar != null) {
                return cVar.h();
            }
            return 95;
        }
        return -1;
    }

    public static g a(p pVar, c cVar, com.applovin.impl.sdk.k kVar) {
        TimeUnit timeUnit;
        long seconds;
        if (pVar != null) {
            if (kVar != null) {
                try {
                    String c = pVar.c();
                    if (!StringUtils.isValidString(c)) {
                        kVar.z().e("VastTracker", "Unable to create tracker. Could not find URL.");
                        return null;
                    }
                    g gVar = new g();
                    gVar.c = c;
                    gVar.a = pVar.b().get("id");
                    gVar.b = pVar.b().get(NotificationCompat.CATEGORY_EVENT);
                    gVar.e = a(gVar.a(), cVar);
                    String str = pVar.b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            gVar.e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(CertificateUtil.DELIMITER)) {
                            List<String> explode = CollectionUtils.explode(trim, CertificateUtil.DELIMITER);
                            int size = explode.size();
                            if (size > 0) {
                                long j = 0;
                                int i = size - 1;
                                for (int i2 = i; i2 >= 0; i2--) {
                                    String str2 = explode.get(i2);
                                    if (StringUtils.isNumeric(str2)) {
                                        int parseInt = Integer.parseInt(str2);
                                        if (i2 == i) {
                                            seconds = parseInt;
                                        } else {
                                            if (i2 == size - 2) {
                                                timeUnit = TimeUnit.MINUTES;
                                            } else if (i2 == size - 3) {
                                                timeUnit = TimeUnit.HOURS;
                                            }
                                            seconds = timeUnit.toSeconds(parseInt);
                                        }
                                        j += seconds;
                                    }
                                }
                                gVar.d = j;
                                gVar.e = -1;
                            }
                        } else {
                            kVar.z().e("VastTracker", "Unable to parse time offset from rawOffsetString = " + trim);
                        }
                    }
                    return gVar;
                } catch (Throwable th) {
                    kVar.z().b("VastTracker", "Error occurred while initializing", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.b;
    }

    public boolean a(long j, int i) {
        boolean z = this.d >= 0;
        boolean z2 = j >= this.d;
        boolean z3 = this.e >= 0;
        boolean z4 = i >= this.e;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.d == gVar.d && this.e == gVar.e) {
                String str = this.a;
                if (str == null ? gVar.a == null : str.equals(gVar.a)) {
                    String str2 = this.b;
                    if (str2 == null ? gVar.b == null : str2.equals(gVar.b)) {
                        return this.c.equals(gVar.c);
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
        String str2 = this.b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.d;
        return ((((((hashCode + hashCode2) * 31) + this.c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.d + ", offsetPercent=" + this.e + '}';
    }
}
