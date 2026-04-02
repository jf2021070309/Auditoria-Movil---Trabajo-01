package com.amazon.aps.iva.jk;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener", f = "PlayerSessionHeartbeatListener.kt", l = {329}, m = "startEndOfVideoTimer")
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.qb0.c {
    public j h;
    public /* synthetic */ Object i;
    public final /* synthetic */ j j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j jVar, com.amazon.aps.iva.ob0.d<? super w> dVar) {
        super(dVar);
        this.j = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return j.G(this.j, this);
    }
}
