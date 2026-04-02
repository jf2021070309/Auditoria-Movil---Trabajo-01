package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.nk.g;
import com.amazon.aps.iva.se0.g0;
import com.google.android.gms.cast.MediaError;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$retryKeepSessionAliveRequest$1", f = "PlayerSessionHeartbeatListener.kt", l = {MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
        public final /* synthetic */ com.amazon.aps.iva.nk.g h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nk.g gVar) {
            super(1);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.nk.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            return com.amazon.aps.iva.nk.h.a(hVar2, ((g.a) this.h).a, null, null, 6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j jVar, String str, String str2, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(2, dVar);
        this.l = jVar;
        this.m = str;
        this.n = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        q qVar = new q(this.l, this.m, this.n, dVar);
        qVar.k = obj;
        return qVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c0 -> B:31:0x00c4). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
