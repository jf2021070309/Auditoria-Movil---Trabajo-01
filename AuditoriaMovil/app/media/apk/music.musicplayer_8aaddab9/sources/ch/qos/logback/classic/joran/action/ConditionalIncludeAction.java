package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.AbstractIncludeAction;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class ConditionalIncludeAction extends AbstractIncludeAction {

    /* loaded from: classes.dex */
    public class a {
        public URL a;

        public a(ConditionalIncludeAction conditionalIncludeAction) {
        }
    }

    private URL peekPath(InterpretationContext interpretationContext) {
        URL url;
        if (interpretationContext.isEmpty()) {
            return null;
        }
        Object peekObject = interpretationContext.peekObject();
        if (!(peekObject instanceof a) || (url = ((a) peekObject).a) == null) {
            return null;
        }
        return url;
    }

    private URL pushPath(InterpretationContext interpretationContext, URL url) {
        a aVar = new a(this);
        aVar.a = url;
        interpretationContext.pushObject(aVar);
        return url;
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        if (peekPath(interpretationContext) != null) {
            return;
        }
        super.begin(interpretationContext, str, attributes);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void handleError(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            addInfo(str);
        } else {
            addWarn(str, exc);
        }
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException {
        pushPath(interpretationContext, url);
    }
}
