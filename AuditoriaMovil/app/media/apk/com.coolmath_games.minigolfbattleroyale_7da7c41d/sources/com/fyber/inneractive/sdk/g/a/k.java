package com.fyber.inneractive.sdk.g.a;

import com.fyber.inneractive.sdk.util.ap;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class k extends d {
    private String e;
    private String f;

    private k() {
    }

    public static k b(Node node) {
        if (node == null) {
            return null;
        }
        k kVar = new k();
        kVar.a(node);
        return kVar;
    }

    @Override // com.fyber.inneractive.sdk.g.a.d
    protected final void a(Node node) {
        super.a(node);
        this.e = ap.a(ap.a(node, "AdTitle"));
        this.f = ap.a(ap.a(node, "Description"));
    }
}
