package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class l {
    private static final DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b  reason: collision with root package name */
    private static final Random f3112b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j2, Uri uri, f fVar, com.applovin.impl.sdk.m mVar) {
        if (!URLUtil.isValidUrl(str)) {
            mVar.B().e("VastUtils", "Unable to replace macros in invalid URL string.");
            return null;
        }
        try {
            String num = Integer.toString(fVar.a());
            String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
            if (j2 >= 0) {
                replace = replace.replace("[CONTENTPLAYHEAD]", a(j2));
            }
            if (uri != null) {
                replace = replace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
        } catch (Throwable th) {
            v B = mVar.B();
            B.b("VastUtils", "Unable to replace macros in URL string " + str, th);
            return null;
        }
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(f3112b.nextInt(89999999) + 10000000);
    }

    private static String a(long j2) {
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j2);
            long minutes = timeUnit.toMinutes(j2);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j2 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    public static String a(e eVar) {
        q c2;
        if (eVar != null) {
            List<q> b2 = eVar.b();
            int size = eVar.b().size();
            if (size <= 0 || (c2 = b2.get(size - 1).c("VASTAdTagURI")) == null) {
                return null;
            }
            return c2.c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(q qVar, String str, String str2) {
        q b2 = qVar.b(str);
        if (b2 != null) {
            String c2 = b2.c();
            if (StringUtils.isValidString(c2)) {
                return c2;
            }
        }
        return str2;
    }

    private static Set<j> a(e eVar, com.applovin.impl.sdk.m mVar) {
        if (eVar != null) {
            List<q> b2 = eVar.b();
            Set<j> hashSet = new HashSet<>(b2.size());
            for (q qVar : b2) {
                q c2 = qVar.c("Wrapper");
                if (c2 == null) {
                    c2 = qVar.c("InLine");
                }
                hashSet = a(hashSet, c2 != null ? c2.a("Error") : qVar.a("Error"), eVar, mVar);
            }
            v B = mVar.B();
            StringBuilder y = e.a.d.a.a.y("Retrieved ");
            y.append(hashSet.size());
            y.append(" top level error trackers: ");
            y.append(hashSet);
            B.b("VastUtils", y.toString());
            return hashSet;
        }
        return null;
    }

    private static Set<j> a(Set<j> set, List<q> list, e eVar, com.applovin.impl.sdk.m mVar) {
        if (list != null) {
            for (q qVar : list) {
                j a2 = j.a(qVar, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i2, com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
        a(a(eVar, mVar), fVar, mVar);
    }

    public static void a(q qVar, Map<String, Set<j>> map, e eVar, com.applovin.impl.sdk.m mVar) {
        List<q> a2;
        v B;
        String str;
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (qVar == null) {
            B = mVar.B();
            str = "Unable to render event trackers; null node provided";
        } else if (map != null) {
            q b2 = qVar.b("TrackingEvents");
            if (b2 == null || (a2 = b2.a("Tracking")) == null) {
                return;
            }
            for (q qVar2 : a2) {
                String str2 = qVar2.b().get("event");
                if (StringUtils.isValidString(str2)) {
                    j a3 = j.a(qVar2, eVar, mVar);
                    if (a3 != null) {
                        Set<j> set = map.get(str2);
                        if (set != null) {
                            set.add(a3);
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(a3);
                            map.put(str2, hashSet);
                        }
                    }
                } else {
                    v B2 = mVar.B();
                    B2.e("VastUtils", "Could not find event for tracking node = " + qVar2);
                }
            }
            return;
        } else {
            B = mVar.B();
            str = "Unable to render event trackers; null event trackers provided";
        }
        B.e("VastUtils", str);
    }

    public static void a(List<q> list, Set<j> set, e eVar, com.applovin.impl.sdk.m mVar) {
        v B;
        String str;
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            B = mVar.B();
            str = "Unable to render trackers; null nodes provided";
        } else if (set != null) {
            for (q qVar : list) {
                j a2 = j.a(qVar, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
            return;
        } else {
            B = mVar.B();
            str = "Unable to render trackers; null trackers provided";
        }
        B.e("VastUtils", str);
    }

    public static void a(Set<j> set, long j2, Uri uri, f fVar, com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        for (j jVar : set) {
            Uri a2 = a(jVar.b(), j2, uri, fVar, mVar);
            if (a2 != null) {
                mVar.U().a(com.applovin.impl.sdk.network.g.o().c(a2.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(Set<j> set, f fVar, com.applovin.impl.sdk.m mVar) {
        a(set, -1L, (Uri) null, fVar, mVar);
    }

    public static void a(Set<j> set, com.applovin.impl.sdk.m mVar) {
        a(set, -1L, (Uri) null, f.UNSPECIFIED, mVar);
    }

    public static boolean a(q qVar) {
        if (qVar != null) {
            return qVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean b(a aVar) {
        m m2;
        List<n> a2;
        return (aVar == null || (m2 = aVar.m()) == null || (a2 = m2.a()) == null || a2.isEmpty()) ? false : true;
    }

    public static boolean b(q qVar) {
        if (qVar != null) {
            return qVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        d aK;
        h b2;
        if (aVar == null || (aK = aVar.aK()) == null || (b2 = aK.b()) == null) {
            return false;
        }
        return b2.b() != null || StringUtils.isValidString(b2.c());
    }
}
