package d.a.a.b.a.b;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.spi.ContextAwareImpl;
import org.xml.sax.Locator;
/* loaded from: classes.dex */
public class a extends ContextAwareImpl {
    public a(Context context, Interpreter interpreter) {
        super(context, interpreter);
    }

    @Override // ch.qos.logback.core.spi.ContextAwareImpl
    public Object getOrigin() {
        Locator locator = ((Interpreter) super.getOrigin()).locator;
        if (locator == null) {
            return Interpreter.class.getName() + "@NA:NA";
        }
        return Interpreter.class.getName() + "@" + locator.getLineNumber() + ":" + locator.getColumnNumber();
    }
}
