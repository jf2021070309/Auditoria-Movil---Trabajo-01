package ch.qos.logback.core.pattern.parser;

import e.a.d.a.a;
import java.util.List;
/* loaded from: classes.dex */
public class SimpleKeywordNode extends FormattingNode {
    public List<String> optionList;

    public SimpleKeywordNode(int i2, Object obj) {
        super(i2, obj);
    }

    public SimpleKeywordNode(Object obj) {
        super(1, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof SimpleKeywordNode)) {
            List<String> list = this.optionList;
            List<String> list2 = ((SimpleKeywordNode) obj).optionList;
            return list != null ? list.equals(list2) : list2 == null;
        }
        return false;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder y;
        Object obj;
        StringBuilder sb = new StringBuilder();
        if (this.optionList == null) {
            y = a.y("KeyWord(");
            y.append(this.value);
            y.append(",");
            obj = this.formatInfo;
        } else {
            y = a.y("KeyWord(");
            y.append(this.value);
            y.append(", ");
            y.append(this.formatInfo);
            y.append(",");
            obj = this.optionList;
        }
        y.append(obj);
        y.append(")");
        sb.append(y.toString());
        sb.append(printNext());
        return sb.toString();
    }
}
