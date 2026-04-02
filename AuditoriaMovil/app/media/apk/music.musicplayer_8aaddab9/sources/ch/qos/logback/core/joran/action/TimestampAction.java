package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;
import e.a.d.a.a;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class TimestampAction extends Action {
    public static String CONTEXT_BIRTH = "contextBirth";
    public static String DATE_PATTERN_ATTRIBUTE = "datePattern";
    public static String TIME_REFERENCE_ATTRIBUTE = "timeReference";
    public boolean inError = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        long currentTimeMillis;
        String value = attributes.getValue(Action.KEY_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Attribute named [key] cannot be empty");
            this.inError = true;
        }
        String value2 = attributes.getValue(DATE_PATTERN_ATTRIBUTE);
        if (OptionHelper.isEmpty(value2)) {
            StringBuilder y = a.y("Attribute named [");
            y.append(DATE_PATTERN_ATTRIBUTE);
            y.append("] cannot be empty");
            addError(y.toString());
            this.inError = true;
        }
        if (CONTEXT_BIRTH.equalsIgnoreCase(attributes.getValue(TIME_REFERENCE_ATTRIBUTE))) {
            addInfo("Using context birth as time reference.");
            currentTimeMillis = this.context.getBirthTime();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.inError) {
            return;
        }
        ActionUtil.Scope stringToScope = ActionUtil.stringToScope(attributes.getValue(Action.SCOPE_ATTRIBUTE));
        String format = new CachingDateFormatter(value2).format(currentTimeMillis);
        addInfo("Adding property to the context with key=\"" + value + "\" and value=\"" + format + "\" to the " + stringToScope + " scope");
        ActionUtil.setProperty(interpretationContext, value, format, stringToScope);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }
}
