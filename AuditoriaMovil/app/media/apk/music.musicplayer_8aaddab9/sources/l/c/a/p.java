package l.c.a;

import e.j.d.w;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public abstract class p implements Serializable {
    public static final Map<String, String> a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        a = Collections.unmodifiableMap(hashMap);
    }

    public p() {
        if (getClass() != q.class && getClass() != r.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static p t(l.c.a.w.e eVar) {
        p pVar = (p) eVar.query(l.c.a.w.j.f9811d);
        if (pVar != null) {
            return pVar;
        }
        throw new a("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static p y(String str, Map<String, String> map) {
        r rVar;
        r rVar2;
        w.k0(str, "zoneId");
        w.k0(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        w.k0(str, "zoneId");
        if (str.equals("Z")) {
            return q.f9705d;
        }
        if (str.length() != 1) {
            if (str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
                return q.G(str);
            }
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new r(str, q.f9705d.v());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                q G = q.G(str.substring(3));
                if (G.f9708g == 0) {
                    rVar = new r(str.substring(0, 3), G.v());
                } else {
                    rVar = new r(str.substring(0, 3) + G.f9709h, G.v());
                }
                return rVar;
            } else if (str.startsWith("UT+") || str.startsWith("UT-")) {
                q G2 = q.G(str.substring(2));
                if (G2.f9708g == 0) {
                    rVar2 = new r("UT", G2.v());
                } else {
                    StringBuilder y = e.a.d.a.a.y("UT");
                    y.append(G2.f9709h);
                    rVar2 = new r(y.toString(), G2.v());
                }
                return rVar2;
            } else {
                return r.B(str, true);
            }
        }
        throw new a(e.a.d.a.a.k("Invalid zone: ", str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return u().equals(((p) obj).u());
        }
        return false;
    }

    public int hashCode() {
        return u().hashCode();
    }

    public String toString() {
        return u();
    }

    public abstract String u();

    public abstract l.c.a.x.f v();

    public abstract void z(DataOutput dataOutput) throws IOException;
}
