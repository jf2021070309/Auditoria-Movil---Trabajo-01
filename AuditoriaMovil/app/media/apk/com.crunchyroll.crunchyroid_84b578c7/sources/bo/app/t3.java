package bo.app;

import com.braze.models.outgoing.BrazeProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public class t3 extends b6 {
    private final String f;

    public t3(String str, BrazeProperties brazeProperties, p1 p1Var) {
        super(brazeProperties, p1Var);
        this.f = str;
    }

    @Override // bo.app.l2
    public String d() {
        return FirebaseAnalytics.Event.PURCHASE;
    }

    public String f() {
        return this.f;
    }
}
