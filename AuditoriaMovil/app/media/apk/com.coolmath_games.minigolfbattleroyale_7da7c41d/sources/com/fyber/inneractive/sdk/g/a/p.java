package com.fyber.inneractive.sdk.g.a;

import com.fyber.inneractive.sdk.util.ap;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class p {
    public List<c> a;
    private String b;

    private p() {
    }

    public static p a(Node node) {
        if (node == null) {
            return null;
        }
        p pVar = new p();
        pVar.b = ap.c(node, "version");
        List<Node> b = ap.b(node, "Ad");
        if (!b.isEmpty()) {
            pVar.a = new ArrayList();
            for (Node node2 : b) {
                pVar.a.add(c.a(node2));
            }
        }
        return pVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.b + "\nAds: ").toString();
    }
}
