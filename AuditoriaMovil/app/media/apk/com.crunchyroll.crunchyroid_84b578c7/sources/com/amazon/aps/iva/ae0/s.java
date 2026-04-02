package com.amazon.aps.iva.ae0;

import java.util.ArrayList;
/* compiled from: ErrorReporter.java */
/* loaded from: classes4.dex */
public interface s {
    public static final a a = new a();

    /* compiled from: ErrorReporter.java */
    /* loaded from: classes4.dex */
    public static class a implements s {
        public static /* synthetic */ void c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.amazon.aps.iva.ae0.s
        public final void a(com.amazon.aps.iva.oc0.b bVar) {
            if (bVar != null) {
                return;
            }
            c(2);
            throw null;
        }

        @Override // com.amazon.aps.iva.ae0.s
        public final void b(com.amazon.aps.iva.rc0.b bVar, ArrayList arrayList) {
            if (bVar != null) {
                return;
            }
            c(0);
            throw null;
        }
    }

    void a(com.amazon.aps.iva.oc0.b bVar);

    void b(com.amazon.aps.iva.rc0.b bVar, ArrayList arrayList);
}
