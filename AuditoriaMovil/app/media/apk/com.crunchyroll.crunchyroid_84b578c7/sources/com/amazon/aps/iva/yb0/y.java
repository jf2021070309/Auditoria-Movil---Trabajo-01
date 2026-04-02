package com.amazon.aps.iva.yb0;
/* compiled from: PropertyReference.java */
/* loaded from: classes4.dex */
public abstract class y extends b implements com.amazon.aps.iva.fc0.l {
    private final boolean syntheticJavaProperty;

    public y() {
        this.syntheticJavaProperty = false;
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.c compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (getOwner().equals(yVar.getOwner()) && getName().equals(yVar.getName()) && getSignature().equals(yVar.getSignature()) && j.a(getBoundReceiver(), yVar.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof com.amazon.aps.iva.fc0.l)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.fc0.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // com.amazon.aps.iva.fc0.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        com.amazon.aps.iva.fc0.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public com.amazon.aps.iva.fc0.l getReflected() {
        if (!this.syntheticJavaProperty) {
            return (com.amazon.aps.iva.fc0.l) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public y(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public y(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
