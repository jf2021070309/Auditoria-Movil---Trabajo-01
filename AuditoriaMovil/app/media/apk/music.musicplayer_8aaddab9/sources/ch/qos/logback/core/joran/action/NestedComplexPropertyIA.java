package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import e.a.d.a.a;
import java.util.Stack;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class NestedComplexPropertyIA extends ImplicitAction {
    public Stack<IADataForComplexProperty> actionDataStack = new Stack<>();

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        IADataForComplexProperty peek = this.actionDataStack.peek();
        String subst = interpretationContext.subst(attributes.getValue(Action.CLASS_ATTRIBUTE));
        try {
            Class<?> loadClass = !OptionHelper.isEmpty(subst) ? Loader.loadClass(subst, this.context) : peek.parentBean.getClassNameViaImplicitRules(peek.getComplexPropertyName(), peek.getAggregationType(), interpretationContext.getDefaultNestedComponentRegistry());
            if (loadClass == null) {
                peek.inError = true;
                addError("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (OptionHelper.isEmpty(subst)) {
                addInfo("Assuming default type [" + loadClass.getName() + "] for [" + str + "] property");
            }
            peek.setNestedComplexProperty(loadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            if (peek.getNestedComplexProperty() instanceof ContextAware) {
                ((ContextAware) peek.getNestedComplexProperty()).setContext(this.context);
            }
            interpretationContext.pushObject(peek.getNestedComplexProperty());
        } catch (Exception e2) {
            peek.inError = true;
            addError("Could not create component [" + str + "] of type [" + subst + "]", e2);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        String sb;
        IADataForComplexProperty pop = this.actionDataStack.pop();
        if (pop.inError) {
            return;
        }
        PropertySetter propertySetter = new PropertySetter(pop.getNestedComplexProperty());
        propertySetter.setContext(this.context);
        if (propertySetter.computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY) {
            propertySetter.setComplexProperty("parent", pop.parentBean.getObj());
        }
        Object nestedComplexProperty = pop.getNestedComplexProperty();
        if ((nestedComplexProperty instanceof LifeCycle) && NoAutoStartUtil.notMarkedWithNoAutoStart(nestedComplexProperty)) {
            ((LifeCycle) nestedComplexProperty).start();
        }
        if (interpretationContext.peekObject() != pop.getNestedComplexProperty()) {
            sb = "The object on the top the of the stack is not the component pushed earlier.";
        } else {
            interpretationContext.popObject();
            int ordinal = pop.aggregationType.ordinal();
            if (ordinal == 2) {
                pop.parentBean.setComplexProperty(str, pop.getNestedComplexProperty());
                return;
            } else if (ordinal == 4) {
                pop.parentBean.addComplexProperty(str, pop.getNestedComplexProperty());
                return;
            } else {
                StringBuilder y = a.y("Unexpected aggregationType ");
                y.append(pop.aggregationType);
                sb = y.toString();
            }
        }
        addError(sb);
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
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        addError("PropertySetter.computeAggregationType returned " + computeAggregationType);
                        return false;
                    }
                }
            }
            this.actionDataStack.push(new IADataForComplexProperty(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        return false;
    }
}
