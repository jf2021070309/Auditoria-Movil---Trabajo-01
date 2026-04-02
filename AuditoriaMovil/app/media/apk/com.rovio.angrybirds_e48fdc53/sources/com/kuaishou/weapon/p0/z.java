package com.kuaishou.weapon.p0;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class z {
    private Set<String> e = new HashSet();
    private Set<String> f = new HashSet();
    private Set<String> g = new HashSet();
    private Set<String> h = new HashSet();
    private String a = i.a("f118f1f9431de3a626df48d7302911", "0820");
    private String b = i.a("f118f1ef4616f3fc27d1", "0820");
    private String c = i.a("f118f1e84f0bf5ba3bd1579c6d35", "0820");
    private String d = i.a("fc03e7a44510", "0820");

    public int a() {
        try {
            Set<String> set = this.f;
            if (set == null || set.size() <= 0) {
                return 0;
            }
            return this.f.size();
        } catch (Exception e) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f3, code lost:
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124 A[Catch: all -> 0x01e3, Exception -> 0x01e6, TryCatch #8 {Exception -> 0x01e6, all -> 0x01e3, blocks: (B:4:0x000d, B:10:0x004a, B:11:0x005e, B:13:0x0064, B:15:0x006d, B:17:0x0075, B:19:0x007d, B:21:0x0085, B:27:0x0093, B:29:0x009b, B:31:0x00a3, B:33:0x00ab, B:35:0x00b3, B:37:0x00bf, B:39:0x00c7, B:42:0x00d1, B:44:0x00d9, B:46:0x00e1, B:48:0x00e9, B:49:0x00ee, B:51:0x00f6, B:53:0x00fe, B:55:0x0106, B:57:0x010c, B:59:0x0114, B:61:0x011c, B:63:0x0124, B:65:0x012a, B:67:0x0132, B:69:0x013a, B:71:0x0142, B:73:0x014a, B:75:0x0152, B:77:0x015a, B:79:0x0162, B:82:0x016b, B:84:0x0173, B:86:0x017b, B:88:0x0183, B:91:0x018c, B:93:0x0194, B:95:0x019a, B:97:0x01a5, B:99:0x01ad, B:101:0x01b5, B:104:0x01bf, B:105:0x01c1, B:106:0x01c6, B:107:0x01c9, B:108:0x01cc, B:110:0x01d2), top: B:142:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONArray a(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.z.a(android.content.Context):org.json.JSONArray");
    }

    public Set<String> b() {
        try {
            Set<String> set = this.g;
            if (set == null || set.size() <= 0) {
                return null;
            }
            return this.g;
        } catch (Exception e) {
            return null;
        }
    }

    public Set<String> c() {
        try {
            Set<String> set = this.h;
            if (set == null || set.size() <= 0) {
                return null;
            }
            return this.h;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject d() {
        String str;
        try {
            Set<String> set = this.e;
            if (set == null || set.size() <= 0) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            for (String str2 : this.e) {
                if (str2.contains(this.a)) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                } else if (str2.contains(this.b)) {
                    str = "1";
                } else if (str2.contains(this.c)) {
                    str = "2";
                }
                jSONObject.put(str, 1);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public Set e() {
        try {
            HashSet hashSet = new HashSet();
            Set<String> set = this.e;
            if (set == null || set.size() <= 0) {
                return null;
            }
            for (String str : this.e) {
                if (str.endsWith("dex")) {
                    hashSet.add(str);
                }
                if (hashSet.size() > 5) {
                    break;
                }
            }
            if (hashSet.size() > 0) {
                return hashSet;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
