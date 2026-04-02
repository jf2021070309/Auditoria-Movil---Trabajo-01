package bo.app;

import java.util.List;
/* loaded from: classes.dex */
public final class m3 extends b3 {
    public m3(List list) {
        super(list);
    }

    @Override // bo.app.u1
    public boolean a(l2 l2Var) {
        for (u1 u1Var : this.b) {
            if (u1Var.a(l2Var)) {
                return true;
            }
        }
        return false;
    }
}
