package com.amazon.aps.iva.w5;

import com.google.common.base.Predicate;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        if (((Map.Entry) obj).getKey() != null) {
            return true;
        }
        return false;
    }
}
