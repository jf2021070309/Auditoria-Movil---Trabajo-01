package com.braze.ui.actions.brazeactions.steps;

import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke", "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$iterator$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContainerStep$getChildStepIterator$$inlined$iterator$1 extends l implements com.amazon.aps.iva.xb0.l<Integer, Boolean> {
    final /* synthetic */ a $this_iterator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerStep$getChildStepIterator$$inlined$iterator$1(a aVar) {
        super(1);
        this.$this_iterator = aVar;
    }

    public final Boolean invoke(int i) {
        return Boolean.valueOf(this.$this_iterator.f(i) instanceof c);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
