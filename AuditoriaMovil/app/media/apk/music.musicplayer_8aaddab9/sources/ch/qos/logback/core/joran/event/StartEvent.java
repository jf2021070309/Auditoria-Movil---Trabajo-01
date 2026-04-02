package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.joran.spi.ElementPath;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
/* loaded from: classes.dex */
public class StartEvent extends SaxEvent {
    public final Attributes attributes;
    public final ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.attributes = new AttributesImpl(attributes);
        this.elementPath = elementPath;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartEvent(");
        sb.append(getQName());
        if (this.attributes != null) {
            for (int i2 = 0; i2 < this.attributes.getLength(); i2++) {
                if (i2 > 0) {
                    sb.append(' ');
                }
                sb.append(this.attributes.getLocalName(i2));
                sb.append("=\"");
                sb.append(this.attributes.getValue(i2));
                sb.append("\"");
            }
        }
        sb.append(")  [");
        sb.append(this.locator.getLineNumber());
        sb.append(",");
        sb.append(this.locator.getColumnNumber());
        sb.append("]");
        return sb.toString();
    }
}
