package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore;
import kotlin.Metadata;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: PlayServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.playback.PlayServiceDecoratorImpl$deleteToken$deleteJob$1", f = "PlayServiceDecorator.kt", l = {BaseNCodec.MIME_CHUNK_SIZE, 77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PlayServiceDecoratorImpl$deleteToken$deleteJob$1 extends i implements p<g0, d<? super a0<q>>, Object> {
    final /* synthetic */ String $contentId;
    final /* synthetic */ String $videoToken;
    Object L$0;
    int label;
    final /* synthetic */ PlayServiceDecoratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayServiceDecoratorImpl$deleteToken$deleteJob$1(PlayServiceDecoratorImpl playServiceDecoratorImpl, String str, String str2, d<? super PlayServiceDecoratorImpl$deleteToken$deleteJob$1> dVar) {
        super(2, dVar);
        this.this$0 = playServiceDecoratorImpl;
        this.$contentId = str;
        this.$videoToken = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new PlayServiceDecoratorImpl$deleteToken$deleteJob$1(this.this$0, this.$contentId, this.$videoToken, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super a0<q>> dVar) {
        return ((PlayServiceDecoratorImpl$deleteToken$deleteJob$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        PlayService playService;
        PlaybackSessionsStore playbackSessionsStore;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object obj2 = this.L$0;
                    x.i0(obj);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            playService = this.this$0.playService;
            String str = this.$contentId;
            String str2 = this.$videoToken;
            this.label = 1;
            obj = playService.deleteToken(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        PlayServiceDecoratorImpl playServiceDecoratorImpl = this.this$0;
        String str3 = this.$contentId;
        a0 a0Var = (a0) obj;
        playbackSessionsStore = playServiceDecoratorImpl.store;
        this.L$0 = obj;
        this.label = 2;
        if (playbackSessionsStore.deleteItem(str3, this) == aVar) {
            return aVar;
        }
        return obj;
    }
}
