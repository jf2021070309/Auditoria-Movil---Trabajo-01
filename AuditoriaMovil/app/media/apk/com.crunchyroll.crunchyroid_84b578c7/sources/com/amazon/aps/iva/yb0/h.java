package com.amazon.aps.iva.yb0;
/* compiled from: FunctionReference.java */
/* loaded from: classes4.dex */
public class h extends b implements g, com.amazon.aps.iva.fc0.g {
    private final int arity;
    private final int flags;

    public h(int i) {
        this(i, b.NO_RECEIVER, null, null, null, 0);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.c computeReflected() {
        return e0.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.a(getBoundReceiver(), hVar.getBoundReceiver()) && j.a(getOwner(), hVar.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof com.amazon.aps.iva.fc0.g)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // com.amazon.aps.iva.yb0.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // com.amazon.aps.iva.fc0.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // com.amazon.aps.iva.fc0.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        com.amazon.aps.iva.fc0.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public h(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.g getReflected() {
        return (com.amazon.aps.iva.fc0.g) super.getReflected();
    }

    public h(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
