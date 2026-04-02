package bo.app;

import com.braze.models.outgoing.BrazeProperties;
/* loaded from: classes.dex */
public abstract class b6 extends z5 implements n2 {
    private BrazeProperties e;

    public b6(BrazeProperties brazeProperties, p1 p1Var) {
        super(p1Var);
        this.e = brazeProperties;
    }

    @Override // bo.app.n2
    public BrazeProperties c() {
        return this.e;
    }
}
