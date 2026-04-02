package com.amazon.aps.iva.vj;

import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.nk.g;
import com.ellation.crunchyroll.api.etp.error.HttpException;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import java.io.IOException;
/* compiled from: SessionHeartbeatInteractor.kt */
/* loaded from: classes.dex */
public final class h implements g {
    public final PlayService a;

    /* compiled from: SessionHeartbeatInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.di.SessionHeartbeatInteractorImpl", f = "SessionHeartbeatInteractor.kt", l = {39}, m = "keepSessionAlive")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.c(null, null, 0L, this);
        }
    }

    /* compiled from: SessionHeartbeatInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.di.SessionHeartbeatInteractorImpl", f = "SessionHeartbeatInteractor.kt", l = {51}, m = "removeSession")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.b(null, null, this);
        }
    }

    /* compiled from: SessionHeartbeatInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.di.SessionHeartbeatInteractorImpl", f = "SessionHeartbeatInteractor.kt", l = {63}, m = "setSessionActive")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.d(null, null, this);
        }
    }

    /* compiled from: SessionHeartbeatInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.di.SessionHeartbeatInteractorImpl", f = "SessionHeartbeatInteractor.kt", l = {75}, m = "setSessionInactive")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.a(null, null, this);
        }
    }

    public h(PlayService playService) {
        this.a = playService;
    }

    public static com.amazon.aps.iva.nk.g e(IOException iOException) {
        if (iOException instanceof HttpException) {
            HttpException httpException = (HttpException) iOException;
            return new g.b(q.b(httpException.getRequestPath(), " ", iOException.getMessage()), Integer.valueOf(httpException.getHttpStatusCode()));
        }
        return g.d.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.vj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.nk.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.vj.h.d
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.vj.h$d r0 = (com.amazon.aps.iva.vj.h.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vj.h$d r0 = new com.amazon.aps.iva.vj.h$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.vj.h r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.playback.PlayService r7 = r4.a     // Catch: java.io.IOException -> L47
            r0.h = r4     // Catch: java.io.IOException -> L47
            r0.k = r3     // Catch: java.io.IOException -> L47
            java.lang.Object r5 = r7.deactivateToken(r5, r6, r0)     // Catch: java.io.IOException -> L47
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.amazon.aps.iva.nk.g$c r5 = com.amazon.aps.iva.nk.g.c.a     // Catch: java.io.IOException -> L29
            goto L51
        L47:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4a:
            r5.getClass()
            com.amazon.aps.iva.nk.g r5 = e(r6)
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vj.h.a(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.vj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.nk.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.vj.h.b
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.vj.h$b r0 = (com.amazon.aps.iva.vj.h.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vj.h$b r0 = new com.amazon.aps.iva.vj.h$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.vj.h r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.playback.PlayService r7 = r4.a     // Catch: java.io.IOException -> L47
            r0.h = r4     // Catch: java.io.IOException -> L47
            r0.k = r3     // Catch: java.io.IOException -> L47
            java.lang.Object r5 = r7.deleteToken(r5, r6, r0)     // Catch: java.io.IOException -> L47
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.amazon.aps.iva.nk.g$c r5 = com.amazon.aps.iva.nk.g.c.a     // Catch: java.io.IOException -> L29
            goto L51
        L47:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4a:
            r5.getClass()
            com.amazon.aps.iva.nk.g r5 = e(r6)
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vj.h.b(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // com.amazon.aps.iva.vj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, java.lang.String r9, long r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.nk.g> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.vj.h.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.vj.h$a r0 = (com.amazon.aps.iva.vj.h.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vj.h$a r0 = new com.amazon.aps.iva.vj.h$a
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.k
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            com.amazon.aps.iva.vj.h r8 = r6.h
            com.amazon.aps.iva.ab.x.i0(r12)     // Catch: java.io.IOException -> L2a
            goto L48
        L2a:
            r9 = move-exception
            goto L57
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.ellation.crunchyroll.api.etp.playback.PlayService r1 = r7.a     // Catch: java.io.IOException -> L54
            r6.h = r7     // Catch: java.io.IOException -> L54
            r6.k = r2     // Catch: java.io.IOException -> L54
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r12 = r1.keepTokenAlive(r2, r3, r4, r6)     // Catch: java.io.IOException -> L54
            if (r12 != r0) goto L47
            return r0
        L47:
            r8 = r7
        L48:
            com.ellation.crunchyroll.api.etp.playback.model.SessionState r12 = (com.ellation.crunchyroll.api.etp.playback.model.SessionState) r12     // Catch: java.io.IOException -> L2a
            com.amazon.aps.iva.nk.g$a r9 = new com.amazon.aps.iva.nk.g$a     // Catch: java.io.IOException -> L2a
            com.amazon.aps.iva.qj.u r10 = com.amazon.aps.iva.vj.i.a(r12)     // Catch: java.io.IOException -> L2a
            r9.<init>(r10)     // Catch: java.io.IOException -> L2a
            goto L5e
        L54:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L57:
            r8.getClass()
            com.amazon.aps.iva.nk.g r9 = e(r9)
        L5e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vj.h.c(java.lang.String, java.lang.String, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.vj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.nk.g> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.vj.h.c
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.vj.h$c r0 = (com.amazon.aps.iva.vj.h.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vj.h$c r0 = new com.amazon.aps.iva.vj.h$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.vj.h r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.etp.playback.PlayService r7 = r4.a     // Catch: java.io.IOException -> L50
            r0.h = r4     // Catch: java.io.IOException -> L50
            r0.k = r3     // Catch: java.io.IOException -> L50
            java.lang.Object r7 = r7.activateToken(r5, r6, r0)     // Catch: java.io.IOException -> L50
            if (r7 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.ellation.crunchyroll.api.etp.playback.model.SessionState r7 = (com.ellation.crunchyroll.api.etp.playback.model.SessionState) r7     // Catch: java.io.IOException -> L29
            com.amazon.aps.iva.nk.g$a r6 = new com.amazon.aps.iva.nk.g$a     // Catch: java.io.IOException -> L29
            com.amazon.aps.iva.qj.u r7 = com.amazon.aps.iva.vj.i.a(r7)     // Catch: java.io.IOException -> L29
            r6.<init>(r7)     // Catch: java.io.IOException -> L29
            goto L5a
        L50:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L53:
            r5.getClass()
            com.amazon.aps.iva.nk.g r6 = e(r6)
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vj.h.d(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
