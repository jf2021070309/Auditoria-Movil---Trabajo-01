package com.kwad.components.offline.c;

import android.content.Context;
/* loaded from: classes.dex */
public final class a implements com.kwad.components.core.n.a.c.b {
    @Override // com.kwad.components.core.n.a.c.b
    public final void a(com.kwad.components.core.n.a.c.a aVar) {
        c.sO().a(aVar);
    }

    @Override // com.kwad.components.core.n.a.c.b
    public final void b(com.kwad.components.core.n.a.c.a aVar) {
        c.sO().b(aVar);
    }

    @Override // com.kwad.sdk.components.a
    public final Class<?> getComponentsType() {
        return com.kwad.components.core.n.a.c.b.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.sdk.components.a
    public final int priority() {
        return 100;
    }
}
