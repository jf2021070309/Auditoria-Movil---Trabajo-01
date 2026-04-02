package e.d.b.e.a.c;

import java.io.PrintStream;
/* loaded from: classes2.dex */
public final class a0 {
    public static final u a;

    static {
        u yVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e2) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e2.printStackTrace(System.err);
            }
            yVar = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new x() : new y() : new z();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = y.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            yVar = new y();
        }
        a = yVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
