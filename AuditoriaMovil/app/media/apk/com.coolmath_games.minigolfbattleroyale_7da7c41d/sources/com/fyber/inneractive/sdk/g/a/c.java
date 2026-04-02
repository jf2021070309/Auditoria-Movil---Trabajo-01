package com.fyber.inneractive.sdk.g.a;

import com.fyber.inneractive.sdk.util.ap;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class c {
    private static String d = "Wrapper";
    private static String e = "InLine";
    private static String f = "id";
    public String a;
    public s b;
    public k c;

    private c() {
    }

    public static c a(Node node) {
        if (node == null) {
            return null;
        }
        c cVar = new c();
        cVar.a = ap.c(node, f);
        Node a = ap.a(node, d);
        if (a != null) {
            cVar.b = s.b(a);
        }
        Node a2 = ap.a(node, e);
        if (a2 != null) {
            cVar.c = k.b(a2);
        }
        return cVar;
    }

    public final String toString() {
        return "Ad: id = " + this.a + "\n";
    }
}
