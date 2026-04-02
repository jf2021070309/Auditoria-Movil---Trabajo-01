package com.amazon.aps.iva.jk;
/* compiled from: PlayerEventListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerEventListener", f = "PlayerEventListener.kt", l = {280}, m = "startTimer")
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public com.amazon.aps.iva.xb0.a h;
    public /* synthetic */ Object i;
    public final /* synthetic */ b j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return b.G(this.j, null, this);
    }
}
