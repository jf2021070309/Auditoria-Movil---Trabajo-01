package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import e.a.d.a.a;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class ContextNameAction extends Action {
    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void body(InterpretationContext interpretationContext, String str) {
        String subst = interpretationContext.subst(str);
        addInfo("Setting logger context name as [" + subst + "]");
        try {
            this.context.setName(subst);
        } catch (IllegalStateException e2) {
            StringBuilder y = a.y("Failed to rename context [");
            y.append(this.context.getName());
            y.append("] as [");
            y.append(subst);
            y.append("]");
            addError(y.toString(), e2);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }
}
