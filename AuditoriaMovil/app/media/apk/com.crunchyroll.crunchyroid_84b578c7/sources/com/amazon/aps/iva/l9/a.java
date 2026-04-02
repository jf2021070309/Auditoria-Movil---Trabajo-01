package com.amazon.aps.iva.l9;

import android.os.Looper;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.util.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.apache.commons.codec.binary.Hex;
/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public final class a {
    public static a b;
    public Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    public static LinkedHashMap b(URL url) {
        String[] split;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : url.getQuery().split("&")) {
            int indexOf = str.indexOf("=");
            linkedHashMap.put(URLDecoder.decode(str.substring(0, indexOf), Hex.DEFAULT_CHARSET_NAME), URLDecoder.decode(str.substring(indexOf + 1), Hex.DEFAULT_CHARSET_NAME));
        }
        return linkedHashMap;
    }

    public static boolean c(String str) {
        try {
            URL url = new URL(str);
            if (!url.getHost().toLowerCase().endsWith(".advertising.amazon.dev")) {
                LogUtils.e("d", String.format("Invalid URL identified %s", url));
                return false;
            }
            return true;
        } catch (MalformedURLException e) {
            LogUtils.e("d", String.format("%s. Cannot load URL ", e));
            return false;
        }
    }

    public static a d() {
        if (b == null) {
            b = new a(1);
        }
        return b;
    }

    public static String e() {
        throw null;
    }

    public final com.amazon.aps.iva.ta.a a() {
        if (((com.amazon.aps.iva.ta.a) this.a) == null) {
            if (com.amazon.aps.iva.va.a.d == null) {
                com.amazon.aps.iva.va.a.d = new com.amazon.aps.iva.va.a();
            }
            com.amazon.aps.iva.va.a aVar = com.amazon.aps.iva.va.a.d;
            if (aVar.b == null) {
                try {
                    aVar.b = new com.amazon.aps.iva.wa.f(new a(new URL(aVar.a)), com.amazon.aps.iva.va.b.c().b());
                } catch (RuntimeException e) {
                    LogUtils.e("b", String.format("RuntimeException while fetching configuration: %s", e));
                } catch (MalformedURLException e2) {
                    LogUtils.e("b", String.format("Malformed url identified: %s", e2));
                }
            }
            this.a = new com.amazon.aps.iva.ta.a(aVar.b);
        }
        return (com.amazon.aps.iva.ta.a) this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(okhttp3.HttpUrl r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.host()
            java.lang.Object r0 = r6.a
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L19
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L19
            goto L58
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "*"
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r1, r3)
            r4 = 1
            if (r3 != 0) goto L54
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r7, r1)
            if (r3 != 0) goto L54
            java.lang.String r3 = "host"
            com.amazon.aps.iva.yb0.j.e(r7, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "."
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            boolean r1 = com.amazon.aps.iva.oe0.m.Y(r7, r1, r2)
            if (r1 == 0) goto L52
            goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L1d
            r2 = r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l9.a.f(okhttp3.HttpUrl):boolean");
    }

    public a(List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (String str : list2) {
            Locale locale = Locale.US;
            com.amazon.aps.iva.yb0.j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            arrayList.add(lowerCase);
        }
        this.a = arrayList;
    }

    public a(com.amazon.aps.iva.ar.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "rumMonitor");
        this.a = aVar;
    }

    public a(int i) {
        if (i != 1) {
            this.a = com.amazon.aps.iva.k3.i.a(Looper.getMainLooper());
        }
    }
}
