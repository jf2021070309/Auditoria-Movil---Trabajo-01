package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.o;
/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public final class w<Model> implements o<Model, Model> {
    public static final w<?> a = new w<>();

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<Model> buildLoadData(Model model, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        return new o.a<>(new com.amazon.aps.iva.gd.b(model), new b(model));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Model model) {
        return true;
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements p<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // com.amazon.aps.iva.rc.p
        public final o<Model, Model> build(s sVar) {
            return w.a;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class b<Model> implements com.amazon.aps.iva.lc.d<Model> {
        public final Model b;

        public b(Model model) {
            this.b = model;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final Class<Model> a() {
            return (Class<Model>) this.b.getClass();
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super Model> aVar) {
            aVar.f((Model) this.b);
        }

        @Override // com.amazon.aps.iva.lc.d
        public final com.amazon.aps.iva.kc.a e() {
            return com.amazon.aps.iva.kc.a.LOCAL;
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void b() {
        }

        @Override // com.amazon.aps.iva.lc.d
        public final void cancel() {
        }
    }
}
