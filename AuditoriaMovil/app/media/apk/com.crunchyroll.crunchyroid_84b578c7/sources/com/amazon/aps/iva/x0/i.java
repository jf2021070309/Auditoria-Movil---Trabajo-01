package com.amazon.aps.iva.x0;

import java.util.List;
import java.util.Map;
/* compiled from: SaveableStateRegistry.kt */
/* loaded from: classes.dex */
public interface i {

    /* compiled from: SaveableStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface a {
        void unregister();
    }

    boolean a(Object obj);

    a b(String str, com.amazon.aps.iva.xb0.a<? extends Object> aVar);

    Map<String, List<Object>> d();

    Object e(String str);
}
