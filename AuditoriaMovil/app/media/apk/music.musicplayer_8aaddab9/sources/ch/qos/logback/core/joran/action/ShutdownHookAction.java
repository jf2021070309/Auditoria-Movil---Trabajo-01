package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.hook.DefaultShutdownHook;
import ch.qos.logback.core.hook.ShutdownHookBase;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import e.a.d.a.a;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class ShutdownHookAction extends Action {
    public ShutdownHookBase hook;
    private boolean inError;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.hook = null;
        this.inError = false;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            value = DefaultShutdownHook.class.getName();
            addInfo("Assuming className [" + value + "]");
        }
        try {
            addInfo("About to instantiate shutdown hook of type [" + value + "]");
            ShutdownHookBase shutdownHookBase = (ShutdownHookBase) OptionHelper.instantiateByClassName(value, ShutdownHookBase.class, this.context);
            this.hook = shutdownHookBase;
            shutdownHookBase.setContext(this.context);
            interpretationContext.pushObject(this.hook);
        } catch (Exception e2) {
            this.inError = true;
            addError("Could not create a shutdown hook of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (this.inError) {
            return;
        }
        if (interpretationContext.peekObject() != this.hook) {
            addWarn("The object at the of the stack is not the hook pushed earlier.");
            return;
        }
        interpretationContext.popObject();
        ShutdownHookBase shutdownHookBase = this.hook;
        StringBuilder y = a.y("Logback shutdown hook [");
        y.append(this.context.getName());
        y.append("]");
        Thread thread = new Thread(shutdownHookBase, y.toString());
        addInfo("Registering shutdown hook with JVM runtime");
        this.context.putObject(CoreConstants.SHUTDOWN_HOOK_THREAD, thread);
        Runtime.getRuntime().addShutdownHook(thread);
    }
}
