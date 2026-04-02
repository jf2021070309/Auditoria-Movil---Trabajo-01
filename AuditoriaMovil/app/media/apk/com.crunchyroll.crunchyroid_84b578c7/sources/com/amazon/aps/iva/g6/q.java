package com.amazon.aps.iva.g6;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.google.common.collect.ImmutableMap;
import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes.dex */
public final class q implements t {
    public final f.a a;
    public final String b;
    public final boolean c;
    public final HashMap d;

    public q(String str, boolean z, f.a aVar) {
        boolean z2;
        if (z && TextUtils.isEmpty(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #3 {Exception -> 0x00bd, blocks: (B:3:0x0030, B:5:0x0039, B:29:0x00aa, B:4:0x0035, B:9:0x003f, B:28:0x0070, B:33:0x00b8, B:19:0x0052, B:21:0x0056, B:23:0x0060, B:25:0x0066), top: B:41:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(com.amazon.aps.iva.w5.f.a r38, java.lang.String r39, byte[] r40, java.util.Map<java.lang.String, java.lang.String> r41) throws com.amazon.aps.iva.g6.u {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g6.q.c(com.amazon.aps.iva.w5.f$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // com.amazon.aps.iva.g6.t
    public final byte[] a(UUID uuid, m.a aVar) throws u {
        String str;
        String str2 = aVar.b;
        if (this.c || TextUtils.isEmpty(str2)) {
            str2 = this.b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = com.amazon.aps.iva.q5.l.e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (com.amazon.aps.iva.q5.l.c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put(HttpHeaders.CONTENT_TYPE, str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                hashMap.putAll(this.d);
            }
            return c(this.a, str2, aVar.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        com.amazon.aps.iva.cq.b.E(uri, "The uri must be set.");
        throw new u(new com.amazon.aps.iva.w5.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // com.amazon.aps.iva.g6.t
    public final byte[] b(m.d dVar) throws u {
        return c(this.a, dVar.b + "&signedRequest=" + g0.p(dVar.a), null, Collections.emptyMap());
    }
}
