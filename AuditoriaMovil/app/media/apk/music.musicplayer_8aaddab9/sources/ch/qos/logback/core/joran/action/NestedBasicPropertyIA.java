package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
import d.a.a.b.a.a.a;
import java.util.Stack;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class NestedBasicPropertyIA extends ImplicitAction {
    public Stack<a> actionDataStack = new Stack<>();

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void body(InterpretationContext interpretationContext, String str) {
        String subst = interpretationContext.subst(str);
        a peek = this.actionDataStack.peek();
        int ordinal = peek.f4946b.ordinal();
        if (ordinal == 1) {
            peek.a.setProperty(peek.f4947c, subst);
        } else if (ordinal == 3) {
            peek.a.addBasicProperty(peek.f4947c, subst);
        } else {
            StringBuilder y = e.a.d.a.a.y("Unexpected aggregationType ");
            y.append(peek.f4946b);
            addError(y.toString());
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        this.actionDataStack.pop();
    }

    @Override // ch.qos.logback.core.joran.action.ImplicitAction
    public boolean isApplicable(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        String peekLast = elementPath.peekLast();
        if (interpretationContext.isEmpty()) {
            return false;
        }
        PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
        propertySetter.setContext(this.context);
        AggregationType computeAggregationType = propertySetter.computeAggregationType(peekLast);
        int ordinal = computeAggregationType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            addError("PropertySetter.canContainComponent returned " + computeAggregationType);
                            return false;
                        }
                    }
                }
            }
            this.actionDataStack.push(new a(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        return false;
    }
}
