package com.amazon.aps.iva.rc;

import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface o<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {
        public final com.amazon.aps.iva.kc.f a;
        public final List<com.amazon.aps.iva.kc.f> b;
        public final com.amazon.aps.iva.lc.d<Data> c;

        public a() {
            throw null;
        }

        public a(com.amazon.aps.iva.kc.f fVar, com.amazon.aps.iva.lc.d<Data> dVar) {
            List<com.amazon.aps.iva.kc.f> emptyList = Collections.emptyList();
            defpackage.i.l(fVar);
            this.a = fVar;
            defpackage.i.l(emptyList);
            this.b = emptyList;
            defpackage.i.l(dVar);
            this.c = dVar;
        }
    }

    a<Data> buildLoadData(Model model, int i, int i2, com.amazon.aps.iva.kc.h hVar);

    boolean handles(Model model);
}
