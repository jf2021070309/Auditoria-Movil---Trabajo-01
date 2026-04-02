package com.amazon.aps.iva.l6;

import com.amazon.aps.iva.i7.g;
import com.amazon.aps.iva.q5.v;
/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes.dex */
public interface a {
    public static final C0470a a = new C0470a();

    /* compiled from: MetadataDecoderFactory.java */
    /* renamed from: com.amazon.aps.iva.l6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0470a implements a {
        @Override // com.amazon.aps.iva.l6.a
        public final com.amazon.aps.iva.ab.a a(v vVar) {
            String str = vVar.m;
            if (str != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new com.amazon.aps.iva.e7.b();
                    case 1:
                        return new com.amazon.aps.iva.h7.a();
                    case 2:
                        return new g(null);
                    case 3:
                        return new com.amazon.aps.iva.f7.b();
                    case 4:
                        return new com.amazon.aps.iva.k7.c();
                }
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // com.amazon.aps.iva.l6.a
        public final boolean c(v vVar) {
            String str = vVar.m;
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }
    }

    com.amazon.aps.iva.ab.a a(v vVar);

    boolean c(v vVar);
}
