package com.ellation.crunchyroll.cast.expanded.mature;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ChromecastMatureFlowViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1", f = "ChromecastMatureFlowViewModel.kt", l = {32, Encoder.DEFAULT_EC_PERCENT, 36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ PlayableAsset $currentAsset;
    int label;
    final /* synthetic */ ChromecastMatureFlowViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1(ChromecastMatureFlowViewModelImpl chromecastMatureFlowViewModelImpl, PlayableAsset playableAsset, d<? super ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1> dVar) {
        super(2, dVar);
        this.this$0 = chromecastMatureFlowViewModelImpl;
        this.$currentAsset = playableAsset;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1(this.this$0, this.$currentAsset, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((ChromecastMatureFlowViewModelImpl$onEnableMatureContent$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        ChromecastMaturePreferenceInteractor chromecastMaturePreferenceInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (IOException e) {
            f0<g<PlayableAsset>> matureFlowStatus = this.this$0.getMatureFlowStatus();
            g.a aVar2 = new g.a(null, e);
            this.label = 3;
            if (matureFlowStatus.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        x.i0(obj);
                        this.this$0.getMatureFlowProcessing().setValue(Boolean.FALSE);
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
                this.this$0.getMatureFlowProcessing().setValue(Boolean.FALSE);
                return q.a;
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            chromecastMaturePreferenceInteractor = this.this$0.maturePreferenceInteractor;
            PlayableAsset playableAsset = this.$currentAsset;
            this.label = 1;
            obj = chromecastMaturePreferenceInteractor.enableMatureContent(playableAsset, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        f0<g<PlayableAsset>> matureFlowStatus2 = this.this$0.getMatureFlowStatus();
        g.c cVar = new g.c((PlayableAsset) obj, null);
        this.label = 2;
        if (matureFlowStatus2.a(cVar, this) == aVar) {
            return aVar;
        }
        this.this$0.getMatureFlowProcessing().setValue(Boolean.FALSE);
        return q.a;
    }
}
