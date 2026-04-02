package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
/* loaded from: classes.dex */
public final class u2 {
    private final l2 a;
    private final q2 b;
    private final IInAppMessage c;
    private final String d;

    public u2(l2 l2Var, q2 q2Var, IInAppMessage iInAppMessage, String str) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        com.amazon.aps.iva.yb0.j.f(q2Var, "triggeredAction");
        com.amazon.aps.iva.yb0.j.f(iInAppMessage, "inAppMessage");
        this.a = l2Var;
        this.b = q2Var;
        this.c = iInAppMessage;
        this.d = str;
    }

    public final l2 a() {
        return this.a;
    }

    public final q2 b() {
        return this.b;
    }

    public final IInAppMessage c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, u2Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, u2Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, u2Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, u2Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public String toString() {
        return com.amazon.aps.iva.oe0.i.T("\n             " + JsonUtils.getPrettyPrintedString(this.c.forJsonPut()) + "\n             Triggered Action Id: " + this.b.getId() + "\n             Trigger Event: " + this.a + "\n             User Id: " + this.d + "\n        ");
    }
}
