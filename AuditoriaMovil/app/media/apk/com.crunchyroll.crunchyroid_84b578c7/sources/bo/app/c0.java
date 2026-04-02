package bo.app;

import com.braze.models.outgoing.BrazeProperties;
/* loaded from: classes.dex */
public class c0 extends b6 {
    private final String f;

    public c0(String str, BrazeProperties brazeProperties, p1 p1Var) {
        super(brazeProperties, p1Var);
        this.f = str;
    }

    @Override // bo.app.l2
    public String d() {
        return "custom_event";
    }

    public String f() {
        return this.f;
    }
}
