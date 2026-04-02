package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.a;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.codec.binary.Hex;
/* compiled from: BaseApi.java */
/* loaded from: classes4.dex */
public abstract class i extends a1 implements a {
    static {
        new com.amazon.aps.iva.b30.j(i.class.getSimpleName());
    }

    public i(String str, long j) {
        put("__TYPE__", str);
        put("__TIMESTAMP__", String.valueOf(j));
    }

    public static i e(String str) throws IOException, NullPointerException {
        long j;
        if (str != null) {
            try {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = cVar.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, (String) cVar.get(next));
                }
                String str2 = (String) hashMap.get("__TYPE__");
                String str3 = (String) hashMap.get("__TIMESTAMP__");
                if (!f1.i(str3)) {
                    j = Long.parseLong(str3);
                } else {
                    j = -1;
                }
                if ("EVENT".equalsIgnoreCase(str2)) {
                    h hVar = new h(j);
                    hVar.putAll(hashMap);
                    return hVar;
                } else if ("SESSION_START".equalsIgnoreCase(str2)) {
                    g gVar = new g(j);
                    gVar.putAll(hashMap);
                    return gVar;
                } else if ("GDPR_CONSENT".equalsIgnoreCase(str2)) {
                    c cVar2 = new c(j);
                    cVar2.putAll(hashMap);
                    return cVar2;
                } else if ("GDPR_UNDER_13".equalsIgnoreCase(str2)) {
                    d dVar = new d(j);
                    dVar.putAll(hashMap);
                    return dVar;
                } else if ("CUSTOM_USER_ID".equalsIgnoreCase(str2)) {
                    b bVar = new b(j);
                    bVar.putAll(hashMap);
                    return bVar;
                } else {
                    throw new InvalidPropertiesFormatException(String.format("Unknown type = %s", str2));
                }
            } catch (com.amazon.aps.iva.if0.b e) {
                throw new IOException(e);
            }
        }
        throw new NullPointerException("api string cannot be null");
    }

    public final long g() {
        String str = get("__TIMESTAMP__");
        if (!f1.i(str)) {
            return Long.parseLong(str);
        }
        return -1L;
    }

    public final boolean h() {
        try {
            String str = get("e");
            if (str != null) {
                return new com.amazon.aps.iva.if0.c(str).getBoolean("is_admon_revenue");
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public final boolean i(u0 u0Var) throws IOException {
        String str;
        HttpURLConnection httpURLConnection;
        y yVar;
        HashMap hashMap = new HashMap(this);
        hashMap.remove("__TYPE__");
        hashMap.remove("__TIMESTAMP__");
        if (!((String) hashMap.get("k")).equalsIgnoreCase("sdid") && (yVar = u0Var.f) != null && (!f1.i(yVar.i.a))) {
            b1 b1Var = new b1();
            b1Var.g(u0Var.f);
            putAll(b1Var);
        }
        String str2 = "https://sdk-api-v1.singular.net/api/v1" + b();
        HashMap hashMap2 = new HashMap(this);
        hashMap2.remove("__TYPE__");
        hashMap2.remove("__TIMESTAMP__");
        long g = g();
        a.InterfaceC0561a c = c();
        int i = c1.a;
        int i2 = f1.b;
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = c1.a + 1;
        c1.a = i3;
        int i4 = c1.a;
        HashMap hashMap3 = new HashMap();
        String[] strArr = c1.b;
        for (int i5 = 0; i5 < 3; i5++) {
            String str3 = strArr[i5];
            if (hashMap2.containsKey(str3)) {
                hashMap3.put(str3, hashMap2.get(str3));
                hashMap2.remove(str3);
            }
        }
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(hashMap2);
        treeMap.put("rt", "json");
        treeMap.put("lag", String.valueOf(f1.k(g)));
        treeMap.put("c", f1.c(u0Var.a));
        if (!treeMap.containsKey("u") || f1.i((String) treeMap.get("u"))) {
            u0Var.f.getClass();
            if (!f1.i(null)) {
                u0Var.f.getClass();
                treeMap.put("u", null);
                treeMap.put("k", "OAID");
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), Hex.DEFAULT_CHARSET_NAME);
            String str4 = (String) entry.getValue();
            if (str4 != null) {
                str = URLEncoder.encode(str4, Hex.DEFAULT_CHARSET_NAME);
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        String str5 = u0Var.d.b;
        if (sb2 != null) {
            String l = f1.l(String.format("?%s", sb2), str5);
            if (!f1.i(l)) {
                sb2 = com.amazon.aps.iva.k.q.b(sb2, "&h=", l);
            }
            str = sb2;
        }
        URL url = new URL(com.amazon.aps.iva.k.q.b(str2, "?", str));
        if (url.getProtocol().equalsIgnoreCase("https")) {
            httpURLConnection = (HttpsURLConnection) url.openConnection();
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, x.b);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        String str6 = u0Var.d.b;
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            if (hashMap3.size() > 0) {
                String cVar2 = new com.amazon.aps.iva.if0.c((Map<?, ?>) hashMap3).toString();
                String l2 = f1.l(cVar2, str6);
                cVar.put("payload", cVar2);
                cVar.put("signature", l2);
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Hex.DEFAULT_CHARSET_NAME);
            outputStreamWriter.write(cVar.toString());
            outputStreamWriter.close();
        } catch (com.amazon.aps.iva.if0.b | IOException unused) {
        }
        httpURLConnection.getRequestMethod();
        try {
            try {
                return c1.a(u0Var, c, currentTimeMillis, i3, httpURLConnection);
            } catch (IOException e) {
                throw e;
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final String j() {
        return new com.amazon.aps.iva.if0.c((Map<?, ?>) this).toString();
    }
}
