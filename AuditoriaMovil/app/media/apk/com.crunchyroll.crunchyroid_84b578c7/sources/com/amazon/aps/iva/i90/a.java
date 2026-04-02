package com.amazon.aps.iva.i90;

import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Predicate {
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((ClassPath.ClassInfo) obj).isTopLevel();
    }
}
