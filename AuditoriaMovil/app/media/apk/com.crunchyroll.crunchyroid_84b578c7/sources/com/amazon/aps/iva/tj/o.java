package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.b8.q;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class o implements q.a {
    public final /* synthetic */ ExoplayerComponent a;

    public o(ExoplayerComponent exoplayerComponent) {
        this.a = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.b8.q.a
    public final void b(com.amazon.aps.iva.b8.q qVar, q.d dVar, int i) {
        com.amazon.aps.iva.yb0.j.f(qVar, "session");
        com.amazon.aps.iva.yb0.j.f(dVar, "controller");
        ExoplayerComponent exoplayerComponent = this.a;
        defpackage.i.C(exoplayerComponent.k, new n(i));
        if (exoplayerComponent.j != null) {
            return;
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }

    @Override // com.amazon.aps.iva.b8.q.a
    public final q.b g(com.amazon.aps.iva.b8.q qVar, q.d dVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "session");
        q.b g = super.g(qVar, dVar);
        return new q.b(g.b, g.c);
    }
}
