package ch.qos.logback.core.subst;
/* loaded from: classes.dex */
public class Node {
    public Object defaultPart;
    public Node next;
    public Object payload;
    public a type;

    /* loaded from: classes.dex */
    public enum a {
        LITERAL,
        VARIABLE
    }

    public Node(a aVar, Object obj) {
        this.type = aVar;
        this.payload = obj;
    }

    public Node(a aVar, Object obj, Object obj2) {
        this.type = aVar;
        this.payload = obj;
        this.defaultPart = obj2;
    }

    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        System.out.print(toString());
        System.out.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            System.out.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type != node.type) {
            return false;
        }
        Object obj2 = this.payload;
        if (obj2 == null ? node.payload == null : obj2.equals(node.payload)) {
            Object obj3 = this.defaultPart;
            if (obj3 == null ? node.defaultPart == null : obj3.equals(node.defaultPart)) {
                Node node2 = this.next;
                Node node3 = node.next;
                return node2 == null ? node3 == null : node2.equals(node3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.type;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Object obj = this.payload;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.defaultPart;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.next;
        return hashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void recursive(Node node, StringBuilder sb) {
        while (node != null) {
            sb.append(node.toString());
            sb.append(" --> ");
            node = node.next;
        }
        sb.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int ordinal = this.type.ordinal();
        if (ordinal == 0) {
            StringBuilder y = e.a.d.a.a.y("Node{type=");
            y.append(this.type);
            y.append(", payload='");
            y.append(this.payload);
            y.append("'}");
            return y.toString();
        } else if (ordinal != 1) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Object obj = this.defaultPart;
            if (obj != null) {
                recursive((Node) obj, sb2);
            }
            recursive((Node) this.payload, sb);
            String str = "Node{type=" + this.type + ", payload='" + sb.toString() + "'";
            if (this.defaultPart != null) {
                StringBuilder A = e.a.d.a.a.A(str, ", defaultPart=");
                A.append(sb2.toString());
                str = A.toString();
            }
            return str + '}';
        }
    }
}
