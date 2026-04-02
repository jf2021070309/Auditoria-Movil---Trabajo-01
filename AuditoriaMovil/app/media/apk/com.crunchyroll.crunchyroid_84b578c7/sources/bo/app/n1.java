package bo.app;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 a = new n1();
    private static final int b = (int) TimeUnit.SECONDS.toMillis(5);
    private static a2 c;

    private n1() {
    }

    public static final a2 a() {
        a2 a2Var = c;
        if (a2Var == null) {
            return new a3(new m1(b));
        }
        return a2Var;
    }
}
