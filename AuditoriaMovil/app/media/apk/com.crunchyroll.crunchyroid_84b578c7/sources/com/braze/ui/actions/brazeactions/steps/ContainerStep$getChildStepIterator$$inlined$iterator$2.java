package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke", "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$iterator$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContainerStep$getChildStepIterator$$inlined$iterator$2 extends l implements com.amazon.aps.iva.xb0.l<Integer, c> {
    final /* synthetic */ a $this_iterator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerStep$getChildStepIterator$$inlined$iterator$2(a aVar) {
        super(1);
        this.$this_iterator = aVar;
    }

    public final c invoke(int i) {
        return (c) this.$this_iterator.get(i);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.amazon.aps.iva.if0.c] */
    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ c invoke(Integer num) {
        return invoke(num.intValue());
    }
}
