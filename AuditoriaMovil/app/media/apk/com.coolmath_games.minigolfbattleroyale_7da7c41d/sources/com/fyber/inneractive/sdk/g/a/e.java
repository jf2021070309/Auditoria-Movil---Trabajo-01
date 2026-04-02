package com.fyber.inneractive.sdk.g.a;

import com.fyber.inneractive.sdk.util.ap;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class e {
    private static String a = "version";
    private String b;
    private String c;

    private e() {
    }

    public static e a(Node node) {
        if (node == null) {
            return null;
        }
        e eVar = new e();
        eVar.b = ap.c(node, a);
        eVar.c = ap.a(node);
        return eVar;
    }
}
