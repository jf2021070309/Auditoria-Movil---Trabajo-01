package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.oc0.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: ClassTypeConstructorImpl.java */
/* loaded from: classes4.dex */
public final class m extends b {
    public final com.amazon.aps.iva.oc0.e c;
    public final List<com.amazon.aps.iva.oc0.y0> d;
    public final Collection<e0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.oc0.e eVar, List<? extends com.amazon.aps.iva.oc0.y0> list, Collection<e0> collection, com.amazon.aps.iva.de0.l lVar) {
        super(lVar);
        if (eVar != null) {
            if (list != null) {
                if (collection != null) {
                    if (lVar != null) {
                        this.c = eVar;
                        this.d = Collections.unmodifiableList(new ArrayList(list));
                        this.e = Collections.unmodifiableCollection(collection);
                        return;
                    }
                    o(3);
                    throw null;
                }
                o(2);
                throw null;
            }
            o(1);
            throw null;
        }
        o(0);
        throw null;
    }

    public static /* synthetic */ void o(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    } else {
                        objArr[1] = "getSupertypeLoopChecker";
                    }
                } else {
                    objArr[1] = "computeSupertypes";
                }
            } else {
                objArr[1] = "getDeclarationDescriptor";
            }
        } else {
            objArr[1] = "getParameters";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.ee0.h
    public final Collection<e0> d() {
        Collection<e0> collection = this.e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<com.amazon.aps.iva.oc0.y0> getParameters() {
        List<com.amazon.aps.iva.oc0.y0> list = this.d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.h
    public final com.amazon.aps.iva.oc0.w0 h() {
        return w0.a.a;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.b
    public final com.amazon.aps.iva.oc0.e p() {
        com.amazon.aps.iva.oc0.e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        o(5);
        throw null;
    }

    public final String toString() {
        String str = com.amazon.aps.iva.qd0.i.g(this.c).a;
        if (str != null) {
            return str;
        }
        com.amazon.aps.iva.nd0.d.a(4);
        throw null;
    }
}
