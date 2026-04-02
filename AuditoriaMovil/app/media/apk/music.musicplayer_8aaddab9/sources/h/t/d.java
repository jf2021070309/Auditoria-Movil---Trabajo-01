package h.t;

import ch.qos.logback.core.CoreConstants;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class d {
    public static final c a;

    static {
        String i2 = j.i("[eE][+-]?", "(\\p{Digit}+)");
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        e.a.d.a.a.M(sb, i2, ")?)|(\\.(", "(\\p{Digit}+)", ")(");
        e.a.d.a.a.M(sb, i2, ")?)|((", "(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))", ")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        a = new c(e.a.d.a.a.l("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", sb.toString(), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
