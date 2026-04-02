package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import e.a.d.a.a;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class DefinePropertyAction extends Action {
    public PropertyDefiner definer;
    public boolean inError;
    public String propertyName;
    public ActionUtil.Scope scope;
    public String scopeStr;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        StringBuilder sb;
        String str2;
        this.scopeStr = null;
        this.scope = null;
        this.propertyName = null;
        this.definer = null;
        this.inError = false;
        this.propertyName = attributes.getValue("name");
        String value = attributes.getValue(Action.SCOPE_ATTRIBUTE);
        this.scopeStr = value;
        this.scope = ActionUtil.stringToScope(value);
        if (OptionHelper.isEmpty(this.propertyName)) {
            sb = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Action.CLASS_ATTRIBUTE);
            if (!OptionHelper.isEmpty(value2)) {
                try {
                    addInfo("About to instantiate property definer of type [" + value2 + "]");
                    PropertyDefiner propertyDefiner = (PropertyDefiner) OptionHelper.instantiateByClassName(value2, PropertyDefiner.class, this.context);
                    this.definer = propertyDefiner;
                    propertyDefiner.setContext(this.context);
                    PropertyDefiner propertyDefiner2 = this.definer;
                    if (propertyDefiner2 instanceof LifeCycle) {
                        ((LifeCycle) propertyDefiner2).start();
                    }
                    interpretationContext.pushObject(this.definer);
                    return;
                } catch (Exception e2) {
                    this.inError = true;
                    addError("Could not create an PropertyDefiner of type [" + value2 + "].", e2);
                    throw new ActionException(e2);
                }
            }
            sb = new StringBuilder();
            str2 = "Missing class name for property definer. Near [";
        }
        a.L(sb, str2, str, "] line ");
        sb.append(getLineNumber(interpretationContext));
        addError(sb.toString());
        this.inError = true;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        if (interpretationContext.peekObject() != this.definer) {
            StringBuilder y = a.y("The object at the of the stack is not the property definer for property named [");
            y.append(this.propertyName);
            y.append("] pushed earlier.");
            addWarn(y.toString());
            return;
        }
        StringBuilder y2 = a.y("Popping property definer for property named [");
        y2.append(this.propertyName);
        y2.append("] from the object stack");
        addInfo(y2.toString());
        interpretationContext.popObject();
        String propertyValue = this.definer.getPropertyValue();
        if (propertyValue != null) {
            ActionUtil.setProperty(interpretationContext, this.propertyName, propertyValue, this.scope);
        }
    }
}
