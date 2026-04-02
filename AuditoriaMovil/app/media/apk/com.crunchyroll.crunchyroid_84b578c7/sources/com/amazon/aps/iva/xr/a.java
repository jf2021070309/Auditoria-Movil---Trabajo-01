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
/* compiled from: B3HttpCodec.java */
/* loaded from: classes2.dex */
public final class a {
    public static final String a = String.valueOf(1);
    public static final String b = String.valueOf(0);

    /* compiled from: B3HttpCodec.java */
    /* renamed from: com.amazon.aps.iva.xr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0867a implements g.c {
        public final HashMap a = new HashMap();

        public C0867a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.a.put(entry.getKey().trim().toLowerCase(Locale.US), entry.getValue());
            }
        }

        @Override // com.amazon.aps.iva.xr.g.c
        public final com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar) {
            HashMap hashMap;
            BigInteger bigInteger;
            com.amazon.aps.iva.ur.f fVar;
            int i;
            String str;
            try {
                Map emptyMap = Collections.emptyMap();
                BigInteger bigInteger2 = BigInteger.ZERO;
                Iterator<Map.Entry<String, String>> it = aVar.iterator();
                hashMap = emptyMap;
                bigInteger = bigInteger2;
                fVar = bigInteger;
                i = Integer.MIN_VALUE;
                while (true) {
                    int i2 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    String lowerCase = next.getKey().toLowerCase(Locale.US);
                    String value = next.getValue();
                    if (value != null) {
                        if ("X-B3-TraceId".equalsIgnoreCase(lowerCase)) {
                            int length = value.length();
                            if (length > 32) {
                                bigInteger = BigInteger.ZERO;
                            } else {
                                if (length > 16) {
                                    str = value.substring(length - 16);
                                } else {
                                    str = value;
                                }
                                bigInteger = g.a(16, str);
                            }
                        } else if ("X-B3-SpanId".equalsIgnoreCase(lowerCase)) {
                            fVar = g.a(16, value);
                        } else if ("X-B3-Sampled".equalsIgnoreCase(lowerCase)) {
                            if (Integer.parseInt(value) != 1) {
                                i2 = 0;
                            }
                            i = i2;
                        }
                        HashMap hashMap2 = this.a;
                        if (hashMap2.containsKey(lowerCase)) {
                            if (hashMap.isEmpty()) {
                                hashMap = new HashMap();
                            }
                            String str2 = (String) hashMap2.get(lowerCase);
                            try {
                                value = URLDecoder.decode(value, Hex.DEFAULT_CHARSET_NAME);
                            } catch (UnsupportedEncodingException unused) {
                            }
                            hashMap.put(str2, value);
                        }
                    }
                }
            } catch (RuntimeException unused2) {
            }
            if (!BigInteger.ZERO.equals(bigInteger)) {
                d dVar = new d(bigInteger, fVar, i, null, Collections.emptyMap(), hashMap);
                dVar.g.set(true);
                return dVar;
            }
            if (!hashMap.isEmpty()) {
                return new h(null, hashMap);
            }
            return null;
        }
    }

    /* compiled from: B3HttpCodec.java */
    /* loaded from: classes2.dex */
    public static class b implements g.d {
        @Override // com.amazon.aps.iva.xr.g.d
        public final void a(com.amazon.aps.iva.ur.b bVar, com.amazon.aps.iva.kr.c cVar) {
            String str;
            try {
                String bigInteger = bVar.d.toString(16);
                Locale locale = Locale.US;
                cVar.a("X-B3-TraceId", bigInteger.toLowerCase(locale));
                cVar.a("X-B3-SpanId", bVar.e.toString(16).toLowerCase(locale));
                if (bVar.e()) {
                    if (bVar.d() > 0) {
                        str = a.a;
                    } else {
                        str = a.b;
                    }
                    cVar.a("X-B3-Sampled", str);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
