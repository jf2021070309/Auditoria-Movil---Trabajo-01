package com.fyber.inneractive.sdk.g.a;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.util.ap;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public final class q {
    public String a;
    public String b;

    private q() {
    }

    public static q a(Node node) {
        if (node == null) {
            return null;
        }
        q qVar = new q();
        qVar.a = ap.c(node, NotificationCompat.CATEGORY_EVENT);
        qVar.b = ap.a(node);
        return qVar;
    }

    public final String toString() {
        return "VTracking:  name:" + this.a + " url:" + this.b;
    }
}
