package com.applovin.impl.a;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
/* loaded from: classes.dex */
public class i {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f3107b;

    private i() {
    }

    public static i a(q qVar, i iVar, com.applovin.impl.sdk.m mVar) {
        if (qVar != null) {
            if (mVar != null) {
                if (iVar == null) {
                    try {
                        iVar = new i();
                    } catch (Throwable th) {
                        mVar.B().b("VastSystemInfo", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (!StringUtils.isValidString(iVar.a)) {
                    String c2 = qVar.c();
                    if (StringUtils.isValidString(c2)) {
                        iVar.a = c2;
                    }
                }
                if (!StringUtils.isValidString(iVar.f3107b)) {
                    String str = qVar.b().get("version");
                    if (StringUtils.isValidString(str)) {
                        iVar.f3107b = str;
                    }
                }
                return iVar;
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
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = this.a;
            if (str == null ? iVar.a == null : str.equals(iVar.a)) {
                String str2 = this.f3107b;
                String str3 = iVar.f3107b;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3107b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastSystemInfo{name='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", version='");
        y.append(this.f3107b);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
