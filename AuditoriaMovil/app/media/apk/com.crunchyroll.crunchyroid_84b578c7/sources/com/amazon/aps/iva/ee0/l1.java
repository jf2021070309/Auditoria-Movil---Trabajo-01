package com.amazon.aps.iva.ee0;
/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes4.dex */
public final class l1 extends k1 {
    public final v1 a;
    public final e0 b;

    public l1(e0 e0Var, v1 v1Var) {
        if (v1Var == null) {
            d(0);
            throw null;
        } else if (e0Var != null) {
            this.a = v1Var;
            this.b = e0Var;
        } else {
            d(1);
            throw null;
        }
    }

    public static /* synthetic */ void d(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i != 4) {
            if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            } else {
                objArr[1] = "getType";
            }
        } else {
            objArr[1] = "getProjectionKind";
        }
        if (i != 3) {
            if (i != 4 && i != 5) {
                if (i != 6) {
                    objArr[2] = "<init>";
                } else {
                    objArr[2] = "refine";
                }
            }
        } else {
            objArr[2] = "replaceType";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final j1 a(com.amazon.aps.iva.fe0.f fVar) {
        if (fVar != null) {
            return new l1(fVar.w(this.b), this.a);
        }
        d(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final boolean b() {
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final v1 c() {
        v1 v1Var = this.a;
        if (v1Var != null) {
            return v1Var;
        }
        d(4);
        throw null;
    }

    @Override // com.amazon.aps.iva.ee0.j1
    public final e0 getType() {
        e0 e0Var = this.b;
        if (e0Var != null) {
            return e0Var;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(e0 e0Var) {
        this(e0Var, v1.INVARIANT);
        if (e0Var != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
