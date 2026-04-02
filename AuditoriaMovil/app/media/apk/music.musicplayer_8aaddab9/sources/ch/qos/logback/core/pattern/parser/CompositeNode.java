package ch.qos.logback.core.pattern.parser;

import e.a.d.a.a;
/* loaded from: classes.dex */
public class CompositeNode extends SimpleKeywordNode {
    public Node childNode;

    public CompositeNode(String str) {
        super(2, str);
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof CompositeNode)) {
            Node node = this.childNode;
            Node node2 = ((CompositeNode) obj).childNode;
            return node != null ? node.equals(node2) : node2 == null;
        }
        return false;
    }

    public Node getChildNode() {
        return this.childNode;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setChildNode(Node node) {
        this.childNode = node;
    }

    @Override // ch.qos.logback.core.pattern.parser.SimpleKeywordNode, ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.childNode != null) {
            StringBuilder y = a.y("CompositeNode(");
            y.append(this.childNode);
            y.append(")");
            str = y.toString();
        } else {
            str = "CompositeNode(no child)";
        }
        sb.append(str);
        sb.append(printNext());
        return sb.toString();
    }
}
