package com.applovin.impl.a;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    private final List<b> a;

    private c(List<b> list) {
        this.a = list;
    }

    public static c a(q qVar, c cVar, e eVar, com.applovin.impl.sdk.m mVar) {
        try {
            List<b> a = cVar != null ? cVar.a() : new ArrayList<>();
            for (q qVar2 : qVar.a("Verification")) {
                b a2 = b.a(qVar2, eVar, mVar);
                if (a2 != null) {
                    a.add(a2);
                }
            }
            return new c(a);
        } catch (Throwable th) {
            mVar.B().b("VastAdVerifications", "Error occurred while initializing", th);
            return null;
        }
    }

    public List<b> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastAdVerification{verifications='");
        y.append(this.a);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
