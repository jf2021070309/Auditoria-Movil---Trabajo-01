package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
/* loaded from: classes.dex */
public class f {
    private String a;
    private String b;

    private f() {
    }

    public static f a(p pVar, f fVar, com.applovin.impl.sdk.k kVar) {
        if (pVar != null) {
            if (kVar != null) {
                if (fVar == null) {
                    try {
                        fVar = new f();
                    } catch (Throwable th) {
                        kVar.z().b("VastSystemInfo", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (!StringUtils.isValidString(fVar.a)) {
                    String c = pVar.c();
                    if (StringUtils.isValidString(c)) {
                        fVar.a = c;
                    }
                }
                if (!StringUtils.isValidString(fVar.b)) {
                    String str = pVar.b().get("version");
                    if (StringUtils.isValidString(str)) {
                        fVar.b = str;
                    }
                }
                return fVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.a;
            if (str == null ? fVar.a == null : str.equals(fVar.a)) {
                String str2 = this.b;
                String str3 = fVar.b;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.a + "', version='" + this.b + "'}";
    }
}
