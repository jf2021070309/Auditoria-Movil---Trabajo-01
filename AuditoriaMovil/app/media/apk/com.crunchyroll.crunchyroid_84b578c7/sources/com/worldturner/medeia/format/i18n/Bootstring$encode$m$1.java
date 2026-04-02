package com.worldturner.medeia.format.i18n;

import com.amazon.aps.iva.yb0.b0;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: Bootstring.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class Bootstring$encode$m$1 extends l implements com.amazon.aps.iva.xb0.l<Integer, Boolean> {
    final /* synthetic */ b0 $n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bootstring$encode$m$1(b0 b0Var) {
        super(1);
        this.$n = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return Boolean.valueOf(invoke(num.intValue()));
    }

    public final boolean invoke(int i) {
        return i >= this.$n.b;
    }
}
