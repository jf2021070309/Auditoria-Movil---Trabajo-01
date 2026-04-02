package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public final class d {
    public final Map<Class<?>, Object> a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final HashMap a = new HashMap();
    }

    public d(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
