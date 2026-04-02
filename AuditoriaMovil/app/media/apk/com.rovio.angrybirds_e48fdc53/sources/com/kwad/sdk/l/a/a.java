package com.kwad.sdk.l.a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class a {
    private final List<b> aGG = new ArrayList();

    public final void addBackPressable(b bVar) {
        if (bVar != null) {
            this.aGG.add(bVar);
        }
    }

    public final void addBackPressable(b bVar, int i) {
        if (bVar != null) {
            this.aGG.add(i, bVar);
        }
    }

    public final boolean bQ() {
        for (b bVar : this.aGG) {
            if (bVar.bQ()) {
                return true;
            }
        }
        return false;
    }

    public final void removeBackPressable(b bVar) {
        if (bVar != null) {
            this.aGG.remove(bVar);
        }
    }
}
