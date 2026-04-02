package com.amazon.aps.iva.lc0;
/* compiled from: UnsignedType.kt */
/* loaded from: classes4.dex */
public enum q {
    UBYTEARRAY(com.amazon.aps.iva.nd0.b.e("kotlin/UByteArray")),
    USHORTARRAY(com.amazon.aps.iva.nd0.b.e("kotlin/UShortArray")),
    UINTARRAY(com.amazon.aps.iva.nd0.b.e("kotlin/UIntArray")),
    ULONGARRAY(com.amazon.aps.iva.nd0.b.e("kotlin/ULongArray"));
    
    private final com.amazon.aps.iva.nd0.b classId;
    private final com.amazon.aps.iva.nd0.f typeName;

    q(com.amazon.aps.iva.nd0.b bVar) {
        this.classId = bVar;
        com.amazon.aps.iva.nd0.f j = bVar.j();
        com.amazon.aps.iva.yb0.j.e(j, "classId.shortClassName");
        this.typeName = j;
    }

    public final com.amazon.aps.iva.nd0.f getTypeName() {
        return this.typeName;
    }
}
