package ch.qos.logback.core.joran.event;

import e.a.d.a.a;
import org.xml.sax.Locator;
/* loaded from: classes.dex */
public class EndEvent extends SaxEvent {
    public EndEvent(String str, String str2, String str3, Locator locator) {
        super(str, str2, str3, locator);
    }

    public String toString() {
        StringBuilder y = a.y("  EndEvent(");
        y.append(getQName());
        y.append(")  [");
        y.append(this.locator.getLineNumber());
        y.append(",");
        y.append(this.locator.getColumnNumber());
        y.append("]");
        return y.toString();
    }
}
