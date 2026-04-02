package com.amazon.aps.iva.ql;
/* compiled from: PlayerSettingsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.data.PlayerSettingsSynchronizerImpl", f = "PlayerSettingsSynchronizer.kt", l = {78, 83}, m = "synchronizeSubtitlesSetting")
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ i i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(dVar);
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return i.a(this.i, null, this);
    }
}
