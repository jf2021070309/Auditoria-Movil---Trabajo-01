package com.amazon.aps.iva.ma0;

import com.amazon.aps.iva.h6.j;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.yb0.l;
/* compiled from: HlsUtils.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final m a = f.b(a.h);

    /* compiled from: HlsUtils.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            try {
                String canonicalName = j.class.getCanonicalName();
                com.amazon.aps.iva.yb0.j.c(canonicalName);
                Class.forName(canonicalName);
                z = true;
            } catch (Exception unused) {
                com.amazon.aps.iva.ia0.b.b("isHlsExtensionAvailable", "HLS extension not found. Some features may not work");
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final long a(r0.d dVar, String str) {
        String str2;
        boolean z;
        try {
            if (((Boolean) a.getValue()).booleanValue() && dVar.e != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Object obj = dVar.e;
                    if (obj instanceof j) {
                        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.media3.exoplayer.hls.HlsManifest");
                        for (String str3 : ((j) obj).b.b) {
                            com.amazon.aps.iva.yb0.j.e(str3, "tag");
                            if (q.i0(str3, str, false)) {
                                str2 = ((String[]) q.E0(str3, new String[]{str}).toArray(new String[0]))[1];
                                if (q.i0(str2, ",", false)) {
                                    str2 = ((String[]) q.E0(str2, new String[]{","}).toArray(new String[0]))[0];
                                }
                                if (com.amazon.aps.iva.oe0.m.h0(str2, "=", false) || com.amazon.aps.iva.oe0.m.h0(str2, ":", false)) {
                                    str2 = str2.substring(1, str2.length());
                                    com.amazon.aps.iva.yb0.j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                return Long.parseLong(com.amazon.aps.iva.oe0.m.f0(str2, ".", ""));
                            }
                        }
                    }
                }
            }
            return Long.parseLong(com.amazon.aps.iva.oe0.m.f0(str2, ".", ""));
        } catch (NumberFormatException unused) {
            Boolean bool = com.amazon.aps.iva.ia0.b.a;
            return -1L;
        }
        str2 = "-1";
    }
}
