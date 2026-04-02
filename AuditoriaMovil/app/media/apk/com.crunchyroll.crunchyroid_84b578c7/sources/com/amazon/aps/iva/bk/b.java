package com.amazon.aps.iva.bk;

import android.net.Uri;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.l;
import com.amazon.aps.iva.qj.j;
import com.google.common.collect.ImmutableMap;
import com.google.common.net.HttpHeaders;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: MediaItemFactory.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.rj.b b;

    public b(com.amazon.aps.iva.rj.b bVar) {
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    @Override // com.amazon.aps.iva.bk.a
    public final b0 a(String str, String str2, j jVar, d0 d0Var, String str3, String str4, long j, String str5, String str6, boolean z) {
        Uri parse;
        boolean z2;
        String str7;
        ?? r5;
        String str8;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(jVar, "streamProtocol");
        com.amazon.aps.iva.yb0.j.f(str3, "adsSessionId");
        com.amazon.aps.iva.yb0.j.f(str4, "videoId");
        b0.b bVar = new b0.b();
        bVar.a = str4;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        bVar.b = parse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str6 != null && str6.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            linkedHashMap.put(HttpHeaders.ACCEPT, "application/octet-stream");
            linkedHashMap.put(HttpHeaders.CONTENT_TYPE, "application/octet-stream");
            linkedHashMap.put("x-cr-content-id", str4);
            linkedHashMap.put("x-cr-video-token", str6);
        }
        if (str2 != null) {
            b0.e.a aVar = new b0.e.a(l.d);
            aVar.b = Uri.parse(str2);
            aVar.d = false;
            if (!linkedHashMap.isEmpty()) {
                aVar.c = ImmutableMap.copyOf((Map) linkedHashMap);
            }
            bVar.e = new b0.e.a(new b0.e(aVar));
        }
        int i = com.amazon.aps.iva.pk.a.a[jVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                str7 = "application/x-mpegURL";
            } else {
                throw new h();
            }
        } else {
            str7 = "application/dash+xml";
        }
        bVar.c = str7;
        bVar.k = d0Var;
        if (z) {
            com.amazon.aps.iva.rj.b bVar2 = this.b;
            bVar2.getClass();
            com.amazon.aps.iva.kk.a aVar2 = bVar2.b;
            Boolean bool = aVar2.e;
            if (bool != null) {
                r5 = bool.booleanValue();
            } else {
                r5 = 0;
            }
            String str9 = "";
            if (!aVar2.f) {
                str8 = "";
            } else {
                str8 = "&cust_params=".concat(str5);
            }
            ?? sb = new StringBuilder();
            sb.append(aVar2.m);
            sb.append("env=");
            sb.append(aVar2.n);
            sb.append("&unviewed_position_start=");
            sb.append(aVar2.o);
            sb.append("&impl=");
            sb.append(aVar2.p);
            sb.append("&vad_type=");
            sb.append(aVar2.q);
            sb.append("&gdfp_req=");
            sb.append(aVar2.r);
            sb.append("&output=");
            sb.append(aVar2.s);
            sb.append("&ad_rule=");
            sb.append(aVar2.t);
            sb.append("&iu=/21925627211/");
            sb.append(aVar2.h);
            sb.append("&tfcd=");
            sb.append(aVar2.u);
            sb.append("&sz=");
            sb.append(aVar2.v);
            sb.append("&cmsid=");
            com.amazon.aps.iva.m80.a.c(sb, aVar2.w, "&vid=", str4, "&url=");
            String str10 = aVar2.j;
            com.amazon.aps.iva.m80.a.c(sb, str10, "&msid=", str10, "&an=");
            sb.append(aVar2.x);
            sb.append("&rdid=");
            sb.append(aVar2.d);
            sb.append("&is_lat=");
            sb.append(r5);
            sb.append("&description_url=");
            sb.append(aVar2.y);
            sb.append("&idtype=");
            sb.append(aVar2.g);
            sb.append("&ppid=");
            String str11 = aVar2.i;
            if (str11.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = str11.getBytes(com.amazon.aps.iva.oe0.a.b);
                com.amazon.aps.iva.yb0.j.e(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] digest = messageDigest.digest(bytes);
                com.amazon.aps.iva.yb0.j.e(digest, "getInstance(\"SHA-256\")\n …igest(this.toByteArray())");
                for (byte b : digest) {
                    StringBuilder b2 = defpackage.c.b(str9);
                    String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
                    b2.append(format);
                    str9 = b2.toString();
                }
            }
            sb.append(str9);
            sb.append("&vpmute=");
            sb.append(aVar2.z);
            sb.append("&vpi=");
            sb.append(aVar2.A);
            sb.append("&vid_d=");
            sb.append(TimeUnit.MILLISECONDS.toSeconds(j));
            sb.append(str8);
            Uri parse2 = Uri.parse(sb.toString());
            com.amazon.aps.iva.yb0.j.e(parse2, "parse(adUrl)");
            com.amazon.aps.iva.mf0.a.a.a("AdUrl: " + parse2, new Object[0]);
            b0.a.C0635a c0635a = new b0.a.C0635a(parse2);
            c0635a.b = str3;
            bVar.i = new b0.a(c0635a);
        }
        return bVar.a();
    }
}
