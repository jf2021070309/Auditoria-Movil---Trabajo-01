package bo.app;

import java.util.List;
/* loaded from: classes.dex */
public final class c extends b3 {
    public c(List list) {
        super(list);
    }

    @Override // bo.app.u1
    public boolean a(l2 l2Var) {
        boolean z = false;
        for (u1 u1Var : this.b) {
            if (!u1Var.a(l2Var)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
