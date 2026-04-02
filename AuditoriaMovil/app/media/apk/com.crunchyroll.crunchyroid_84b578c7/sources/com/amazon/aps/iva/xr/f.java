package com.amazon.aps.iva.xr;

import com.amazon.aps.iva.xr.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
/* compiled from: HaystackHttpCodec.java */
/* loaded from: classes2.dex */
public final class f implements g.d {
    @Override // com.amazon.aps.iva.xr.g.d
    public final void a(com.amazon.aps.iva.ur.b bVar, com.amazon.aps.iva.kr.c cVar) {
        cVar.a("Trace-ID", bVar.d.toString());
        cVar.a("Span-ID", bVar.e.toString());
        cVar.a("Parent_ID", bVar.f.toString());
        for (Map.Entry entry : bVar.c.entrySet()) {
            String str = "Baggage-" + ((String) entry.getKey());
            String str2 = (String) entry.getValue();
            try {
                str2 = URLEncoder.encode(str2, Hex.DEFAULT_CHARSET_NAME);
            } catch (UnsupportedEncodingException unused) {
            }
            cVar.a(str, str2);
        }
    }
}
