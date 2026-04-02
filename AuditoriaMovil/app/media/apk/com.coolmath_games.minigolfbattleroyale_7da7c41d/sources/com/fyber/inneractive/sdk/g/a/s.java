package com.fyber.inneractive.sdk.g.a;

import com.fyber.inneractive.sdk.util.ap;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class s extends d {
    public String e;

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s b(Node node) {
        if (node == null) {
            return null;
        }
        s sVar = new s();
        sVar.a(node);
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.g.a.d
    protected final void a(Node node) {
        super.a(node);
        this.e = ap.a(ap.a(node, "VASTAdTagURI"));
    }
}
