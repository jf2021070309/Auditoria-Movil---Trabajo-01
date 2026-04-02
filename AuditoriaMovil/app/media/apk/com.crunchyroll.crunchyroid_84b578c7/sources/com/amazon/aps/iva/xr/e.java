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
/* compiled from: HaystackHttpCodec.java */
/* loaded from: classes2.dex */
public final class e implements g.c {
    public final HashMap a = new HashMap();

    public e(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
        }
    }

    @Override // com.amazon.aps.iva.xr.g.c
    public final com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar) {
        Map map;
        HashMap hashMap;
        com.amazon.aps.iva.ur.f fVar;
        com.amazon.aps.iva.ur.f fVar2;
        String str;
        try {
            Map emptyMap = Collections.emptyMap();
            Map emptyMap2 = Collections.emptyMap();
            BigInteger bigInteger = BigInteger.ZERO;
            Iterator<Map.Entry<String, String>> it = aVar.iterator();
            map = emptyMap;
            hashMap = emptyMap2;
            fVar = bigInteger;
            fVar2 = fVar;
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                Locale locale = Locale.US;
                String lowerCase = next.getKey().toLowerCase(locale);
                String value = next.getValue();
                if (value != null) {
                    if ("Trace-ID".equalsIgnoreCase(lowerCase)) {
                        fVar = g.a(10, value);
                    } else if ("Span-ID".equalsIgnoreCase(lowerCase)) {
                        fVar2 = g.a(10, value);
                    } else if (lowerCase.startsWith("Baggage-".toLowerCase(locale))) {
                        if (map.isEmpty()) {
                            map = new HashMap();
                        }
                        String replace = lowerCase.replace("Baggage-".toLowerCase(locale), "");
                        try {
                            str = URLDecoder.decode(value, Hex.DEFAULT_CHARSET_NAME);
                        } catch (UnsupportedEncodingException unused) {
                            str = value;
                        }
                        map.put(replace, str);
                    }
                    HashMap hashMap2 = this.a;
                    if (hashMap2.containsKey(lowerCase)) {
                        if (hashMap.isEmpty()) {
                            hashMap = new HashMap();
                        }
                        String str2 = (String) hashMap2.get(lowerCase);
                        try {
                            value = URLDecoder.decode(value, Hex.DEFAULT_CHARSET_NAME);
                        } catch (UnsupportedEncodingException unused2) {
                        }
                        hashMap.put(str2, value);
                    }
                }
            }
        } catch (RuntimeException unused3) {
        }
        if (!BigInteger.ZERO.equals(fVar)) {
            d dVar = new d(fVar, fVar2, 1, null, map, hashMap);
            dVar.g.set(true);
            return dVar;
        }
        if (!hashMap.isEmpty()) {
            return new h(null, hashMap);
        }
        return null;
    }
}
