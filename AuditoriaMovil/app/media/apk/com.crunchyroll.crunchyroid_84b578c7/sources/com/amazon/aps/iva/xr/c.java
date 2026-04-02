package com.amazon.aps.iva.xr;

import com.amazon.aps.iva.xr.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
/* compiled from: DatadogHttpCodec.java */
/* loaded from: classes2.dex */
public final class c implements g.d {
    @Override // com.amazon.aps.iva.xr.g.d
    public final void a(com.amazon.aps.iva.ur.b bVar, com.amazon.aps.iva.kr.c cVar) {
        String str;
        cVar.a("x-datadog-trace-id", bVar.d.toString());
        cVar.a("x-datadog-parent-id", bVar.e.toString());
        com.amazon.aps.iva.ur.a f = bVar.b.f();
        if (f != null) {
            str = f.b.m;
        } else {
            str = bVar.m;
        }
        if (str != null) {
            cVar.a("x-datadog-origin", str);
        }
        for (Map.Entry entry : bVar.c.entrySet()) {
            String str2 = "ot-baggage-" + ((String) entry.getKey());
            String str3 = (String) entry.getValue();
            try {
                str3 = URLEncoder.encode(str3, Hex.DEFAULT_CHARSET_NAME);
            } catch (UnsupportedEncodingException unused) {
            }
            cVar.a(str2, str3);
        }
        cVar.a("x-datadog-sampling-priority", "1");
    }
}
