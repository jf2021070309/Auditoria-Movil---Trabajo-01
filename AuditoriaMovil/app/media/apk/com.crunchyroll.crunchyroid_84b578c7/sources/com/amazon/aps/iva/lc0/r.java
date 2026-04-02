package com.amazon.aps.iva.lc0;
/* compiled from: UnsignedType.kt */
/* loaded from: classes4.dex */
public enum r {
    UBYTE(com.amazon.aps.iva.nd0.b.e("kotlin/UByte")),
    USHORT(com.amazon.aps.iva.nd0.b.e("kotlin/UShort")),
    UINT(com.amazon.aps.iva.nd0.b.e("kotlin/UInt")),
    ULONG(com.amazon.aps.iva.nd0.b.e("kotlin/ULong"));
    
    private final com.amazon.aps.iva.nd0.b arrayClassId;
    private final com.amazon.aps.iva.nd0.b classId;
    private final com.amazon.aps.iva.nd0.f typeName;

    r(com.amazon.aps.iva.nd0.b bVar) {
        this.classId = bVar;
        com.amazon.aps.iva.nd0.f j = bVar.j();
        com.amazon.aps.iva.yb0.j.e(j, "classId.shortClassName");
        this.typeName = j;
        com.amazon.aps.iva.nd0.c h = bVar.h();
        this.arrayClassId = new com.amazon.aps.iva.nd0.b(h, com.amazon.aps.iva.nd0.f.h(j.b() + "Array"));
    }

    public final com.amazon.aps.iva.nd0.b getArrayClassId() {
        return this.arrayClassId;
    }

    public final com.amazon.aps.iva.nd0.b getClassId() {
        return this.classId;
    }

    public final com.amazon.aps.iva.nd0.f getTypeName() {
        return this.typeName;
    }
}
