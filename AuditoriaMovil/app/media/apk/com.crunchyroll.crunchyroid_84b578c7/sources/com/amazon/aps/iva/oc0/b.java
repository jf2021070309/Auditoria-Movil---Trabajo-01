package com.amazon.aps.iva.oc0;

import java.util.Collection;
/* compiled from: CallableMemberDescriptor.java */
/* loaded from: classes4.dex */
public interface b extends com.amazon.aps.iva.oc0.a, a0 {

    /* compiled from: CallableMemberDescriptor.java */
    /* loaded from: classes4.dex */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            if (this != FAKE_OVERRIDE) {
                return true;
            }
            return false;
        }
    }

    @Override // com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.k
    b a();

    b e0(k kVar, b0 b0Var, p pVar, a aVar);

    a getKind();

    @Override // com.amazon.aps.iva.oc0.a
    Collection<? extends b> k();

    void z0(Collection<? extends b> collection);
}
