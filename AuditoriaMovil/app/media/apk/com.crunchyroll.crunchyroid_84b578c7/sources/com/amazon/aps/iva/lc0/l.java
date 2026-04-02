package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.e4.l1;
import java.util.Set;
/* compiled from: PrimitiveType.kt */
/* loaded from: classes4.dex */
public enum l {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final a Companion = new a();
    public static final Set<l> NUMBER_TYPES;
    private final com.amazon.aps.iva.kb0.e arrayTypeFqName$delegate;
    private final com.amazon.aps.iva.nd0.f arrayTypeName;
    private final com.amazon.aps.iva.kb0.e typeFqName$delegate;
    private final com.amazon.aps.iva.nd0.f typeName;

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nd0.c> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.nd0.c invoke() {
            return o.k.c(l.this.getArrayTypeName());
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nd0.c> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.nd0.c invoke() {
            return o.k.c(l.this.getTypeName());
        }
    }

    static {
        l lVar;
        l lVar2;
        l lVar3;
        NUMBER_TYPES = l1.I(r4, r5, r6, r7, lVar, lVar2, lVar3);
    }

    l(String str) {
        this.typeName = com.amazon.aps.iva.nd0.f.h(str);
        this.arrayTypeName = com.amazon.aps.iva.nd0.f.h(str.concat("Array"));
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.typeFqName$delegate = com.amazon.aps.iva.kb0.f.a(gVar, new c());
        this.arrayTypeFqName$delegate = com.amazon.aps.iva.kb0.f.a(gVar, new b());
    }

    public final com.amazon.aps.iva.nd0.c getArrayTypeFqName() {
        return (com.amazon.aps.iva.nd0.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final com.amazon.aps.iva.nd0.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final com.amazon.aps.iva.nd0.c getTypeFqName() {
        return (com.amazon.aps.iva.nd0.c) this.typeFqName$delegate.getValue();
    }

    public final com.amazon.aps.iva.nd0.f getTypeName() {
        return this.typeName;
    }
}
