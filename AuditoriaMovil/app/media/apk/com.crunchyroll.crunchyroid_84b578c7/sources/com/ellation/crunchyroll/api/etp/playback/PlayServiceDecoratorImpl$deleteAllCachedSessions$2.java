package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PlayServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteAllCachedSessions$2", f = "PlayServiceDecorator.kt", l = {44, 45, 48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlayServiceDecoratorImpl$deleteAllCachedSessions$2 extends i implements p<g0, d<? super List<? extends q>>, Object> {
    final /* synthetic */ boolean $ignoreFailures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayServiceDecoratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayServiceDecoratorImpl$deleteAllCachedSessions$2(PlayServiceDecoratorImpl playServiceDecoratorImpl, boolean z, d<? super PlayServiceDecoratorImpl$deleteAllCachedSessions$2> dVar) {
        super(2, dVar);
        this.this$0 = playServiceDecoratorImpl;
        this.$ignoreFailures = z;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        PlayServiceDecoratorImpl$deleteAllCachedSessions$2 playServiceDecoratorImpl$deleteAllCachedSessions$2 = new PlayServiceDecoratorImpl$deleteAllCachedSessions$2(this.this$0, this.$ignoreFailures, dVar);
        playServiceDecoratorImpl$deleteAllCachedSessions$2.L$0 = obj;
        return playServiceDecoratorImpl$deleteAllCachedSessions$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(g0 g0Var, d<? super List<q>> dVar) {
        return ((PlayServiceDecoratorImpl$deleteAllCachedSessions$2) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[LOOP:0: B:20:0x0069->B:22:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[PHI: r10 
      PHI: (r10v10 java.lang.Object) = (r10v9 java.lang.Object), (r10v0 java.lang.Object) binds: [B:24:0x008e, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L91
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.L$0
            com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L56
        L24:
            java.lang.Object r1 = r9.L$0
            com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L45
        L2c:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.L$0
            com.amazon.aps.iva.se0.g0 r10 = (com.amazon.aps.iva.se0.g0) r10
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl r1 = r9.this$0
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore r1 = com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.access$getStore$p(r1)
            r9.L$0 = r10
            r9.label = r4
            java.lang.Object r1 = r1.deleteAllExpiredItems(r9)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r10
        L45:
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl r10 = r9.this$0
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore r10 = com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.access$getStore$p(r10)
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r10.readAllItems(r9)
            if (r10 != r0) goto L56
            return r0
        L56:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl r3 = r9.this$0
            boolean r4 = r9.$ignoreFailures
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = com.amazon.aps.iva.lb0.r.Y(r10)
            r5.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L69:
            boolean r6 = r10.hasNext()
            r7 = 0
            if (r6 == 0) goto L86
            java.lang.Object r6 = r10.next()
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData r6 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData) r6
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1 r8 = new com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1
            r8.<init>(r3, r6, r4, r7)
            com.amazon.aps.iva.se0.n0 r6 = com.amazon.aps.iva.se0.i.b(r1, r7, r7, r8, r2)
            com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl.access$registerRemoveJob(r3, r6)
            r5.add(r6)
            goto L69
        L86:
            r9.L$0 = r7
            r9.label = r2
            java.lang.Object r10 = com.amazon.aps.iva.se0.d.a(r5, r9)
            if (r10 != r0) goto L91
            return r0
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteAllCachedSessions$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ Object invoke(g0 g0Var, d<? super List<? extends q>> dVar) {
        return invoke2(g0Var, (d<? super List<q>>) dVar);
    }
}
