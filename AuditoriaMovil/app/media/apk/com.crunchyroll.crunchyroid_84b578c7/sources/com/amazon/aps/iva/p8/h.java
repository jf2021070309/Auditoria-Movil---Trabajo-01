package com.amazon.aps.iva.p8;

import androidx.work.impl.WorkDatabase_Impl;
import com.amazon.aps.iva.u8.b;
/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public final class h extends b.a {
    public com.amazon.aps.iva.p8.a b;
    public final a c;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a = 12;

        public abstract void a(com.amazon.aps.iva.v8.a aVar);

        public abstract b b(com.amazon.aps.iva.v8.a aVar);
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(String str, boolean z) {
            this.a = z;
            this.b = str;
        }
    }

    public h(com.amazon.aps.iva.p8.a aVar, WorkDatabase_Impl.a aVar2) {
        super(aVar2.a);
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0160 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076 A[EDGE_INSN: B:90:0x0076->B:37:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // com.amazon.aps.iva.u8.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.amazon.aps.iva.v8.a r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p8.h.b(com.amazon.aps.iva.v8.a, int, int):void");
    }

    public final void c(com.amazon.aps.iva.v8.a aVar) {
        aVar.f("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
