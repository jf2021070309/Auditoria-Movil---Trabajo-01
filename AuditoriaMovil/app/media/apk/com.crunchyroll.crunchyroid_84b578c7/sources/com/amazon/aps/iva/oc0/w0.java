package com.amazon.aps.iva.oc0;

import java.util.Collection;
/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes4.dex */
public interface w0 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* loaded from: classes4.dex */
    public static final class a implements w0 {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.oc0.w0
        public final Collection a(com.amazon.aps.iva.ee0.h hVar, Collection collection, com.amazon.aps.iva.ee0.i iVar, com.amazon.aps.iva.ee0.j jVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "currentTypeConstructor");
            com.amazon.aps.iva.yb0.j.f(collection, "superTypes");
            return collection;
        }
    }

    Collection a(com.amazon.aps.iva.ee0.h hVar, Collection collection, com.amazon.aps.iva.ee0.i iVar, com.amazon.aps.iva.ee0.j jVar);
}
