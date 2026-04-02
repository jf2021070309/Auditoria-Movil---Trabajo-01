package com.amazon.aps.iva.xr;

import com.amazon.aps.iva.xr.g;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
/* compiled from: DatadogHttpCodec.java */
/* loaded from: classes2.dex */
public final class b implements g.c {
    public final HashMap a = new HashMap();

    public b(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
        }
    }

    @Override // com.amazon.aps.iva.xr.g.c
    public final com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar) {
        String str;
        Map map;
        HashMap hashMap;
        com.amazon.aps.iva.ur.f fVar;
        com.amazon.aps.iva.ur.f fVar2;
        int i;
        String str2;
        try {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            BigInteger bigInteger = BigInteger.ZERO;
            Iterator<Map.Entry<String, String>> it = aVar.iterator();
            str = null;
            map = emptyMap;
            hashMap = emptyMap2;
            fVar = bigInteger;
            fVar2 = fVar;
            i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String lowerCase = next.getKey().toLowerCase(Locale.US);
                String value = next.getValue();
                if (value != null) {
                    if ("x-datadog-trace-id".equalsIgnoreCase(lowerCase)) {
                        fVar = g.a(10, value);
                    } else if ("x-datadog-parent-id".equalsIgnoreCase(lowerCase)) {
                        fVar2 = g.a(10, value);
                    } else if ("x-datadog-sampling-priority".equalsIgnoreCase(lowerCase)) {
                        i = Integer.parseInt(value);
                    } else if ("x-datadog-origin".equalsIgnoreCase(lowerCase)) {
                        str = value;
                    } else if (lowerCase.startsWith("ot-baggage-")) {
                        if (map.isEmpty()) {
                            map = new HashMap();
                        }
                        String replace = lowerCase.replace("ot-baggage-", "");
                        try {
                            str2 = URLDecoder.decode(value, Hex.DEFAULT_CHARSET_NAME);
                        } catch (UnsupportedEncodingException unused) {
                            str2 = value;
                        }
                        map.put(replace, str2);
                    }
                    HashMap hashMap2 = this.a;
                    if (hashMap2.containsKey(lowerCase)) {
                        if (hashMap.isEmpty()) {
                            hashMap = new HashMap();
                        }
                        String str3 = (String) hashMap2.get(lowerCase);
                        try {
                            value = URLDecoder.decode(value, Hex.DEFAULT_CHARSET_NAME);
                        } catch (UnsupportedEncodingException unused2) {
                        }
                        hashMap.put(str3, value);
                    }
                }
            }
        } catch (RuntimeException unused3) {
        }
        if (!BigInteger.ZERO.equals(fVar)) {
            d dVar = new d(fVar, fVar2, i, str, map, hashMap);
            dVar.g.set(true);
            return dVar;
        }
        if (str != null || !hashMap.isEmpty()) {
            return new h(str, hashMap);
        }
        return null;
    }
}
