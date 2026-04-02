package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;
/* loaded from: classes.dex */
public class ActionUtil {

    /* loaded from: classes.dex */
    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    public static void setProperties(InterpretationContext interpretationContext, Properties properties, Scope scope) {
        int ordinal = scope.ordinal();
        if (ordinal == 0) {
            interpretationContext.addSubstitutionProperties(properties);
        } else if (ordinal == 1) {
            new ContextUtil(interpretationContext.getContext()).addProperties(properties);
        } else if (ordinal != 2) {
        } else {
            OptionHelper.setSystemProperties(interpretationContext, properties);
        }
    }

    public static void setProperty(InterpretationContext interpretationContext, String str, String str2, Scope scope) {
        int ordinal = scope.ordinal();
        if (ordinal == 0) {
            interpretationContext.addSubstitutionProperty(str, str2);
        } else if (ordinal == 1) {
            interpretationContext.getContext().putProperty(str, str2);
        } else if (ordinal != 2) {
        } else {
            OptionHelper.setSystemProperty(interpretationContext, str, str2);
        }
    }

    public static Scope stringToScope(String str) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(str)) {
            return scope;
        }
        Scope scope2 = Scope.CONTEXT;
        return scope2.toString().equalsIgnoreCase(str) ? scope2 : Scope.LOCAL;
    }
}
