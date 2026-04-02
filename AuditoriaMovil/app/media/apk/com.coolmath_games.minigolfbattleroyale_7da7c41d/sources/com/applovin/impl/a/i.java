package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
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
public class i {
    private static DateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static Random b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j, Uri uri, d dVar, com.applovin.impl.sdk.k kVar) {
        if (!URLUtil.isValidUrl(str)) {
            kVar.z().e("VastUtils", "Unable to replace macros in invalid URL string.");
            return null;
        }
        try {
            String replace = str.replace("[ERRORCODE]", Integer.toString(dVar.a()));
            if (j >= 0) {
                replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
            }
            if (uri != null) {
                replace = replace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
        } catch (Throwable th) {
            r z = kVar.z();
            z.b("VastUtils", "Unable to replace macros in URL string " + str, th);
            return null;
        }
    }

    public static d a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return d.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }

    private static String a(long j) {
        if (j > 0) {
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(TimeUnit.SECONDS.toHours(j)), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % TimeUnit.MINUTES.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    public static String a(c cVar) {
        p c;
        if (cVar != null) {
            List<p> b2 = cVar.b();
            int size = cVar.b().size();
            if (size <= 0 || (c = b2.get(size - 1).c("VASTAdTagURI")) == null) {
                return null;
            }
            return c.c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(p pVar, String str, String str2) {
        p b2 = pVar.b(str);
        if (b2 != null) {
            String c = b2.c();
            if (StringUtils.isValidString(c)) {
                return c;
            }
        }
        return str2;
    }

    private static Set<g> a(c cVar, com.applovin.impl.sdk.k kVar) {
        if (cVar != null) {
            List<p> b2 = cVar.b();
            Set<g> hashSet = new HashSet<>(b2.size());
            for (p pVar : b2) {
                p c = pVar.c("Wrapper");
                if (c == null) {
                    c = pVar.c("InLine");
                }
                hashSet = a(hashSet, c != null ? c.a("Error") : pVar.a("Error"), cVar, kVar);
            }
            r z = kVar.z();
            z.b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
            return hashSet;
        }
        return null;
    }

    private static Set<g> a(Set<g> set, List<p> list, c cVar, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            for (p pVar : list) {
                g a2 = g.a(pVar, cVar, kVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    public static void a(c cVar, AppLovinAdLoadListener appLovinAdLoadListener, d dVar, int i, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        a(a(cVar, kVar), dVar, kVar);
    }

    public static void a(p pVar, Map<String, Set<g>> map, c cVar, com.applovin.impl.sdk.k kVar) {
        List<p> a2;
        r z;
        String str;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (pVar == null) {
            z = kVar.z();
            str = "Unable to render event trackers; null node provided";
        } else if (map != null) {
            p b2 = pVar.b("TrackingEvents");
            if (b2 == null || (a2 = b2.a("Tracking")) == null) {
                return;
            }
            for (p pVar2 : a2) {
                String str2 = pVar2.b().get(NotificationCompat.CATEGORY_EVENT);
                if (StringUtils.isValidString(str2)) {
                    g a3 = g.a(pVar2, cVar, kVar);
                    if (a3 != null) {
                        Set<g> set = map.get(str2);
                        if (set != null) {
                            set.add(a3);
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(a3);
                            map.put(str2, hashSet);
                        }
                    }
                } else {
                    r z2 = kVar.z();
                    z2.e("VastUtils", "Could not find event for tracking node = " + pVar2);
                }
            }
            return;
        } else {
            z = kVar.z();
            str = "Unable to render event trackers; null event trackers provided";
        }
        z.e("VastUtils", str);
    }

    public static void a(List<p> list, Set<g> set, c cVar, com.applovin.impl.sdk.k kVar) {
        r z;
        String str;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            z = kVar.z();
            str = "Unable to render trackers; null nodes provided";
        } else if (set != null) {
            for (p pVar : list) {
                g a2 = g.a(pVar, cVar, kVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
            return;
        } else {
            z = kVar.z();
            str = "Unable to render trackers; null trackers provided";
        }
        z.e("VastUtils", str);
    }

    public static void a(Set<g> set, long j, Uri uri, d dVar, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        for (g gVar : set) {
            Uri a2 = a(gVar.b(), j, uri, dVar, kVar);
            if (a2 != null) {
                kVar.S().a(com.applovin.impl.sdk.network.g.o().c(a2.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(Set<g> set, d dVar, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, dVar, kVar);
    }

    public static void a(Set<g> set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, d.UNSPECIFIED, kVar);
    }

    public static boolean a(p pVar) {
        if (pVar != null) {
            return pVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        a.setTimeZone(TimeZone.getDefault());
        return a.format(new Date());
    }

    public static boolean b(a aVar) {
        j l;
        List<k> a2;
        return (aVar == null || (l = aVar.l()) == null || (a2 = l.a()) == null || a2.isEmpty()) ? false : true;
    }

    public static boolean b(p pVar) {
        if (pVar != null) {
            return pVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        b n;
        e b2;
        if (aVar == null || (n = aVar.n()) == null || (b2 = n.b()) == null) {
            return false;
        }
        return b2.b() != null || StringUtils.isValidString(b2.c());
    }
}
