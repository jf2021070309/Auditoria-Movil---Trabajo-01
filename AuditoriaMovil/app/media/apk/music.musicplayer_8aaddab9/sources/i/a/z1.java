package i.a;

import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class z1 extends CancellationException {
    public final g1 a;

    public z1(String str) {
        super(str);
        this.a = null;
    }

    public z1(String str, g1 g1Var) {
        super(str);
        this.a = g1Var;
    }
}
