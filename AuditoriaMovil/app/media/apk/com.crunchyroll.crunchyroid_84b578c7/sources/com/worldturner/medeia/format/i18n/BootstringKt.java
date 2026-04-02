package com.worldturner.medeia.format.i18n;

import com.amazon.aps.iva.xb0.l;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: Bootstring.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u001a/\u0010\b\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "min", "max", "restrictRange", "", "Lkotlin/Function1;", "", "filter", "minIf", "(Ljava/util/Collection;Lcom/amazon/aps/iva/xb0/l;)Ljava/lang/Integer;", "medeia-validator-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class BootstringKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer minIf(Collection<Integer> collection, l<? super Integer, Boolean> lVar) {
        if (collection.isEmpty()) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        boolean z = false;
        for (Integer num : collection) {
            int intValue = num.intValue();
            if (lVar.invoke(Integer.valueOf(intValue)).booleanValue() && intValue <= i) {
                z = true;
                i = intValue;
            }
        }
        if (!z) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int restrictRange(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }
}
