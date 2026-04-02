package com.amazon.aps.iva.de0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.h;
/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes4.dex */
public final class e extends c.i<Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l f;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, h.b bVar, h.c cVar2, h.d dVar) {
        super(cVar, bVar);
        this.f = cVar2;
        this.g = dVar;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i != 2) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i != 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // com.amazon.aps.iva.de0.c.f
    public final c.m<Object> c(boolean z) {
        com.amazon.aps.iva.xb0.l lVar = this.f;
        if (lVar == null) {
            c.m<Object> c = super.c(z);
            if (c != null) {
                return c;
            }
            a(0);
            throw null;
        }
        return new c.m<>(lVar.invoke(Boolean.valueOf(z)), false);
    }
}
