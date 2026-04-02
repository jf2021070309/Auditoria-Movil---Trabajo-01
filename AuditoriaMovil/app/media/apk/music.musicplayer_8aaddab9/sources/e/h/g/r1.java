package e.h.g;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes.dex */
public class r1 {
    public static final /* synthetic */ int a = 0;

    static {
        Character.toString((char) 1984);
        Character.toString(CoreConstants.DOUBLE_QUOTE_CHAR);
        Character.toString((char) 1985);
        Character.toString('*');
        Character.toString((char) 1986);
        Character.toString(CoreConstants.COLON_CHAR);
        Character.toString((char) 1987);
        Character.toString('<');
        Character.toString((char) 1988);
        Character.toString('>');
        Character.toString((char) 1989);
        Character.toString('?');
        Character.toString((char) 1990);
        Character.toString('|');
        Character.toString((char) 1991);
        Character.toString(CoreConstants.ESCAPE_CHAR);
        Character.toString((char) 1992);
        Character.toString('/');
    }

    public static String a(Throwable th) {
        if (th != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                return stringWriter.toString();
            } catch (Throwable th2) {
                StringBuilder y = e.a.d.a.a.y("bad stack2String = ");
                y.append(th2.toString());
                return y.toString();
            }
        }
        return "missing exception to analyze";
    }
}
