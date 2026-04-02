package com.amazon.aps.iva.ka0;

import android.view.View;
/* compiled from: MuxPlayerAdapter.kt */
/* loaded from: classes4.dex */
public final class t<PlayerView extends View, Player> {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {defpackage.e.b(t.class, "player", "getPlayer()Ljava/lang/Object;", 0)};
    public final y a;
    public final a<Player> b;
    public final com.amazon.aps.iva.ba0.a c;

    /* compiled from: MuxPlayerAdapter.kt */
    /* loaded from: classes4.dex */
    public interface a<Player> {
        void a(Player player, y yVar);

        void b(Player player, y yVar);
    }

    public t(a aVar, y yVar, d0 d0Var, Object obj) {
        com.amazon.aps.iva.yb0.j.f(yVar, "collector");
        com.amazon.aps.iva.yb0.j.f(d0Var, "uiDelegate");
        com.amazon.aps.iva.yb0.j.f(aVar, "basicMetrics");
        this.a = yVar;
        this.b = aVar;
        this.c = new com.amazon.aps.iva.ba0.a(obj);
        aVar.a(obj, yVar);
    }
}
