package com.amazon.aps.iva.eg;

import com.amazon.aps.iva.cg.a0;
import com.amazon.aps.iva.cg.b0;
import com.amazon.aps.iva.cg.e0;
import com.amazon.aps.iva.cg.u;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.xw.y;
import com.amazon.aps.iva.yb0.j;
import java.util.Iterator;
import java.util.List;
/* compiled from: WebLinkParser.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final List<String> a = f1.K("watch", "series", "artist", "concert", "musicvideo");

    @Override // com.amazon.aps.iva.cg.w
    public final e0 a(com.amazon.aps.iva.dg.a aVar) {
        Object obj;
        List<String> list = aVar.d;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (this.a.contains((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1409097913) {
                if (hashCode != -905838985) {
                    if (hashCode == 112903375 && str.equals("watch")) {
                        String str2 = (String) x.v0(y.a("watch", list));
                        if (j.a(str2, "concert")) {
                            String str3 = (String) x.t0(y.a("concert", list));
                            if (!m.b0(str3)) {
                                return new b0.a(aVar, str3);
                            }
                            throw new IllegalArgumentException(("Invalid asset ID '" + str3 + "' in deep link: '" + aVar + "'").toString());
                        } else if (j.a(str2, "musicvideo")) {
                            String str4 = (String) x.t0(y.a("musicvideo", list));
                            if (!m.b0(str4)) {
                                return new b0.b(aVar, str4);
                            }
                            throw new IllegalArgumentException(("Invalid asset ID '" + str4 + "' in deep link: '" + aVar + "'").toString());
                        } else {
                            String str5 = (String) x.t0(y.a("watch", list));
                            if (!m.b0(str5)) {
                                return new a0(u.a.WATCH_SCREEN, aVar, str5);
                            }
                            throw new IllegalArgumentException(("Invalid asset ID '" + str5 + "' in deep link: '" + aVar + "'").toString());
                        }
                    }
                } else if (str.equals("series")) {
                    String str6 = (String) x.t0(y.a("series", list));
                    if (!m.b0(str6)) {
                        return new a0(u.a.SHOW_PAGE, aVar, str6);
                    }
                    throw new IllegalArgumentException(("Invalid asset ID '" + str6 + "' in deep link: '" + aVar + "'").toString());
                }
            } else if (str.equals("artist")) {
                String str7 = (String) x.t0(y.a("artist", list));
                if (!m.b0(str7)) {
                    return new com.amazon.aps.iva.cg.a(aVar, str7);
                }
                throw new IllegalArgumentException(("Invalid artist ID '" + str7 + "' in deep link: '" + aVar + "'").toString());
            }
        }
        throw new IllegalArgumentException("Invalid deep link: '" + aVar + "'");
    }
}
