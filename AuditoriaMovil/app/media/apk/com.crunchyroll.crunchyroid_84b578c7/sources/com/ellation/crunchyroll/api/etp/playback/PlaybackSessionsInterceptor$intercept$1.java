package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.p;
import kotlin.Metadata;
/* compiled from: PlaybackSessionsInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.playback.PlaybackSessionsInterceptor$intercept$1", f = "PlaybackSessionsInterceptor.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlaybackSessionsInterceptor$intercept$1 extends i implements p<g0, d<? super q>, Object> {
    int label;
    final /* synthetic */ PlaybackSessionsInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackSessionsInterceptor$intercept$1(PlaybackSessionsInterceptor playbackSessionsInterceptor, d<? super PlaybackSessionsInterceptor$intercept$1> dVar) {
        super(2, dVar);
        this.this$0 = playbackSessionsInterceptor;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new PlaybackSessionsInterceptor$intercept$1(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((PlaybackSessionsInterceptor$intercept$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            aVar = this.this$0.playService;
            this.label = 1;
            if (((PlayServiceDecorator) aVar.invoke()).deleteAllCachedSessions(true, this) == aVar2) {
                return aVar2;
            }
        }
        return q.a;
    }
}
