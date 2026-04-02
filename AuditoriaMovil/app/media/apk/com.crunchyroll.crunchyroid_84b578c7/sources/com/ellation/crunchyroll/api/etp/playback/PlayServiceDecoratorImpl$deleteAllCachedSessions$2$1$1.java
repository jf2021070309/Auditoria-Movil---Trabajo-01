package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData;
import kotlin.Metadata;
/* compiled from: PlayServiceDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1", f = "PlayServiceDecorator.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ boolean $ignoreFailures;
    final /* synthetic */ PlaybackSessionData $session;
    int label;
    final /* synthetic */ PlayServiceDecoratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1(PlayServiceDecoratorImpl playServiceDecoratorImpl, PlaybackSessionData playbackSessionData, boolean z, d<? super PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = playServiceDecoratorImpl;
        this.$session = playbackSessionData;
        this.$ignoreFailures = z;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1(this.this$0, this.$session, this.$ignoreFailures, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((PlayServiceDecoratorImpl$deleteAllCachedSessions$2$1$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object deleteCachedSession;
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
            PlayServiceDecoratorImpl playServiceDecoratorImpl = this.this$0;
            PlaybackSessionData playbackSessionData = this.$session;
            boolean z = this.$ignoreFailures;
            this.label = 1;
            deleteCachedSession = playServiceDecoratorImpl.deleteCachedSession(playbackSessionData, z, this);
            if (deleteCachedSession == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
