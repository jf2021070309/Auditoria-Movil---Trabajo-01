package com.braze.support;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class g {
    private static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");
    private static final SimpleDateFormat b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not parse http-date value: " + this.b;
        }
    }

    public static final Long a(String str) {
        Long valueOf;
        if (str == null) {
            return null;
        }
        try {
            Double V = com.amazon.aps.iva.oe0.l.V(str);
            if (V != null) {
                valueOf = Long.valueOf((long) (V.doubleValue() * 1000));
            } else {
                Date parse = b.parse(str);
                if (parse == null) {
                    return null;
                }
                valueOf = Long.valueOf(parse.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return valueOf;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, (Throwable) e, (com.amazon.aps.iva.xb0.a<String>) new a(str));
            return null;
        }
    }

    public static final String a(Object... objArr) {
        j.f(objArr, "requestArgs");
        long j = 1;
        for (Object obj : objArr) {
            j *= obj.hashCode();
        }
        String hexString = Long.toHexString(j);
        j.e(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }

    public static final Map a(Map map) {
        j.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k.w(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            j.c(key);
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = ((String) key).toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(k.w(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), x.B0((Iterable) entry3.getValue(), null, null, null, null, 63));
        }
        return linkedHashMap3;
    }
}
