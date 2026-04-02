package ch.qos.logback.core.pattern.parser;

import e.a.d.a.a;
/* loaded from: classes.dex */
public class Node {
    public static final int COMPOSITE_KEYWORD = 2;
    public static final int LITERAL = 0;
    public static final int SIMPLE_KEYWORD = 1;
    public Node next;
    public final int type;
    public final Object value;

    public Node(int i2) {
        this(i2, null);
    }

    public Node(int i2, Object obj) {
        this.type = i2;
        this.value = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Node) {
            Node node = (Node) obj;
            if (this.type == node.type && ((obj2 = this.value) == null ? node.value == null : obj2.equals(node.value))) {
                Node node2 = this.next;
                Node node3 = node.next;
                if (node2 != null) {
                    if (node2.equals(node3)) {
                        return true;
                    }
                } else if (node3 == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Node getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i2 = this.type * 31;
        Object obj = this.value;
        return i2 + (obj != null ? obj.hashCode() : 0);
    }

    public String printNext() {
        if (this.next != null) {
            StringBuilder y = a.y(" -> ");
            y.append(this.next);
            return y.toString();
        }
        return "";
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        String sb;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.type != 0) {
            sb = super.toString();
        } else {
            StringBuilder y = a.y("LITERAL(");
            y.append(this.value);
            y.append(")");
            sb = y.toString();
        }
        stringBuffer.append(sb);
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }
}
