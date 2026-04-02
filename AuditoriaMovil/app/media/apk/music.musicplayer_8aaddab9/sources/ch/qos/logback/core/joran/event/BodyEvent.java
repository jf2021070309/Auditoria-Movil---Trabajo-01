package ch.qos.logback.core.joran.event;

import e.a.d.a.a;
import org.xml.sax.Locator;
/* loaded from: classes.dex */
public class BodyEvent extends SaxEvent {
    private String text;

    public BodyEvent(String str, Locator locator) {
        super(null, null, null, locator);
        this.text = str;
    }

    public void append(String str) {
        this.text = a.r(new StringBuilder(), this.text, str);
    }

    public String getText() {
        String str = this.text;
        return str != null ? str.trim() : str;
    }

    public String toString() {
        StringBuilder y = a.y("BodyEvent(");
        y.append(getText());
        y.append(")");
        y.append(this.locator.getLineNumber());
        y.append(",");
        y.append(this.locator.getColumnNumber());
        return y.toString();
    }
}
