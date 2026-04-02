package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.n;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.n0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.model.PlayResponse;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
import com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlayServiceDecorator.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0003H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0003H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J1\u0010\u001b\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecoratorImpl;", "Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "", "contentId", "Lcom/ellation/crunchyroll/api/etp/playback/model/PlayResponse;", "response", "Lcom/amazon/aps/iva/kb0/q;", "storeSession", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/playback/model/PlayResponse;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/se0/j1;", "job", "registerRemoveJob", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "session", "", "ignoreFailures", "deleteCachedSession", "(Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;ZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "videoToken", "Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;", "activateToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/amazon/aps/iva/jf0/a0;", "deactivateToken", "", "position", "keepTokenAlive", "(Ljava/lang/String;Ljava/lang/String;JLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteAllCachedSessions", "(ZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "enableStreamLimit", "queue", "getPlayStream", "(Ljava/lang/String;ZZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "getMusicPlayStream", "deleteToken", "playService", "Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "Lcom/amazon/aps/iva/se0/g0;", "coroutineScope", "Lcom/amazon/aps/iva/se0/g0;", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "store", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "removeJobs", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/playback/PlayService;Lcom/amazon/aps/iva/se0/g0;Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayServiceDecoratorImpl implements PlayServiceDecorator, PlayService {
    private final g0 coroutineScope;
    private final PlayService playService;
    private final CopyOnWriteArrayList<j1> removeJobs;
    private final PlaybackSessionsStore store;

    /* compiled from: PlayServiceDecorator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$1", f = "PlayServiceDecorator.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends i implements p<g0, d<? super q>, Object> {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((AnonymousClass1) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                PlayServiceDecoratorImpl playServiceDecoratorImpl = PlayServiceDecoratorImpl.this;
                this.label = 1;
                if (playServiceDecoratorImpl.deleteAllCachedSessions(false, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public PlayServiceDecoratorImpl(PlayService playService, g0 g0Var, PlaybackSessionsStore playbackSessionsStore) {
        j.f(playService, "playService");
        j.f(g0Var, "coroutineScope");
        j.f(playbackSessionsStore, "store");
        this.playService = playService;
        this.coroutineScope = g0Var;
        this.store = playbackSessionsStore;
        this.removeJobs = new CopyOnWriteArrayList<>();
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteCachedSession(com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData r9, boolean r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteCachedSession$1
            if (r0 == 0) goto L13
            r0 = r11
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteCachedSession$1 r0 = (com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteCachedSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteCachedSession$1 r0 = new com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteCachedSession$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Lb9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.L$2
            java.lang.Object r10 = r0.L$1
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData r10 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData) r10
            java.lang.Object r2 = r0.L$0
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl r2 = (com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L9b
        L44:
            boolean r10 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData r9 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData) r9
            java.lang.Object r2 = r0.L$0
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl r2 = (com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl) r2
            com.amazon.aps.iva.ab.x.i0(r11)     // Catch: java.lang.Throwable -> L52
            goto L71
        L52:
            r11 = move-exception
            goto L76
        L54:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.ellation.crunchyroll.api.etp.playback.PlayService r11 = r8.playService     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r9.getContentId()     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r9.getToken()     // Catch: java.lang.Throwable -> L74
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L74
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L74
            r0.Z$0 = r10     // Catch: java.lang.Throwable -> L74
            r0.label = r5     // Catch: java.lang.Throwable -> L74
            java.lang.Object r11 = r11.deleteToken(r2, r6, r0)     // Catch: java.lang.Throwable -> L74
            if (r11 != r1) goto L70
            return r1
        L70:
            r2 = r8
        L71:
            com.amazon.aps.iva.jf0.a0 r11 = (com.amazon.aps.iva.jf0.a0) r11     // Catch: java.lang.Throwable -> L52
            goto L7a
        L74:
            r11 = move-exception
            r2 = r8
        L76:
            com.amazon.aps.iva.kb0.k$a r11 = com.amazon.aps.iva.ab.x.H(r11)
        L7a:
            r7 = r11
            r11 = r9
            r9 = r7
            java.lang.Throwable r6 = com.amazon.aps.iva.kb0.k.a(r9)
            if (r6 == 0) goto L9a
            if (r10 == 0) goto L9a
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore r10 = r2.store
            java.lang.String r6 = r11.getContentId()
            r0.L$0 = r2
            r0.L$1 = r11
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r10.deleteItem(r6, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            r10 = r11
        L9b:
            boolean r11 = r9 instanceof com.amazon.aps.iva.kb0.k.a
            r11 = r11 ^ r5
            if (r11 == 0) goto Lb9
            r11 = r9
            com.amazon.aps.iva.jf0.a0 r11 = (com.amazon.aps.iva.jf0.a0) r11
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore r11 = r2.store
            java.lang.String r10 = r10.getContentId()
            r0.L$0 = r9
            r9 = 0
            r0.L$1 = r9
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r9 = r11.deleteItem(r10, r0)
            if (r9 != r1) goto Lb9
            return r1
        Lb9:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.deleteCachedSession(com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRemoveJob(j1 j1Var) {
        this.removeJobs.add(j1Var);
        j1Var.s0(new PlayServiceDecoratorImpl$registerRemoveJob$1(this, j1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object storeSession(String str, PlayResponse playResponse, d<? super q> dVar) {
        Object saveItem;
        SessionState session = playResponse.getSession();
        if (session != null && (saveItem = this.store.saveItem(str, playResponse.getVideoToken(), session.getSessionExpirationInSeconds(), dVar)) == a.COROUTINE_SUSPENDED) {
            return saveItem;
        }
        return q.a;
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    @n("v1/token/{contentId}/{videoToken}/active")
    public Object activateToken(@s("contentId") String str, @s("videoToken") String str2, d<? super SessionState> dVar) {
        return this.playService.activateToken(str, str2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    @n("v1/token/{contentId}/{videoToken}/inactive")
    public Object deactivateToken(@s("contentId") String str, @s("videoToken") String str2, d<? super a0<q>> dVar) {
        return this.playService.deactivateToken(str, str2, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.PlayServiceDecorator
    public Object deleteAllCachedSessions(boolean z, d<? super q> dVar) {
        Object p = z.p(new PlayServiceDecoratorImpl$deleteAllCachedSessions$2(this, z, null), dVar);
        if (p == a.COROUTINE_SUSPENDED) {
            return p;
        }
        return q.a;
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    public Object deleteToken(String str, String str2, d<? super a0<q>> dVar) {
        n0 b = com.amazon.aps.iva.se0.i.b(this.coroutineScope, null, null, new PlayServiceDecoratorImpl$deleteToken$deleteJob$1(this, str, str2, null), 3);
        registerRemoveJob(b);
        return b.K(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMusicPlayStream(java.lang.String r10, boolean r11, boolean r12, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.playback.model.PlayResponse> r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.getMusicPlayStream(java.lang.String, boolean, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPlayStream(java.lang.String r10, boolean r11, boolean r12, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.playback.model.PlayResponse> r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.getPlayStream(java.lang.String, boolean, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.PlayService
    @n("v1/token/{contentId}/{videoToken}/keepAlive")
    public Object keepTokenAlive(@s("contentId") String str, @s("videoToken") String str2, @t("playhead") long j, d<? super SessionState> dVar) {
        return this.playService.keepTokenAlive(str, str2, j, dVar);
    }
}
