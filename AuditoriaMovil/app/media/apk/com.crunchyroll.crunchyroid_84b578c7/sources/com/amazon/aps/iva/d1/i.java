package com.amazon.aps.iva.d1;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.LinkedHashSet;
/* compiled from: FocusInvalidationManager.kt */
/* loaded from: classes.dex */
public final class i {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final h e = new h(this);

    public i(AndroidComposeView.e eVar) {
        this.a = eVar;
    }

    public final void a(LinkedHashSet linkedHashSet, Object obj) {
        if (linkedHashSet.add(obj)) {
            if (this.d.size() + this.c.size() + this.b.size() == 1) {
                this.a.invoke(this.e);
            }
        }
    }
}
