package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.MutableTypeToInstanceMap;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return MutableTypeToInstanceMap.UnmodifiableEntry.b((Map.Entry) obj);
    }
}
