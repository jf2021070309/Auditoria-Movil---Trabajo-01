package com.amazon.aps.iva.hb;

import android.graphics.Rect;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.hd.a;
import com.amazon.aps.iva.nc.w;
import com.amazon.aps.iva.se0.j0;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ColumnFillSpaceCenterDenseStrategy.java */
/* loaded from: classes.dex */
public final class d implements j, k, com.amazon.aps.iva.jb.e, com.amazon.aps.iva.zc.c {
    public final /* synthetic */ int b;

    public /* synthetic */ d(int i) {
        this.b = i;
    }

    public static /* synthetic */ void c(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean d(c1 c1Var, c1 c1Var2) {
        if (c1Var != null) {
            if (c1Var2 != null) {
                return c1Var.equals(c1Var2);
            }
            c(4);
            throw null;
        }
        c(3);
        throw null;
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f a() {
        return new t();
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        switch (this.b) {
            case 0:
                int i = com.amazon.aps.iva.ab.a.i(aVar) / 2;
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
                    rect.top += i;
                    rect.bottom += i;
                }
                return;
            default:
                int h = com.amazon.aps.iva.ab.a.h(aVar) / (aVar.i + 1);
                Iterator it2 = linkedList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Rect rect2 = ((com.amazon.aps.iva.ib.n) it2.next()).a;
                    i2 += h;
                    rect2.left += i2;
                    rect2.right += i2;
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.hb.k
    public final j e(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return new com.amazon.aps.iva.o6.h(1);
                    }
                    return new com.amazon.aps.iva.da0.a();
                }
                return new com.amazon.aps.iva.ob0.f();
            }
            return new com.amazon.aps.iva.o6.h(2);
        }
        return new j0(2);
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f f() {
        return new com.amazon.aps.iva.ob0.f();
    }

    @Override // com.amazon.aps.iva.zc.c
    public final w i(w wVar, com.amazon.aps.iva.kc.h hVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((com.amazon.aps.iva.yc.c) wVar.get()).b.a.a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = com.amazon.aps.iva.hd.a.a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.a == 0) {
            if (bVar.b == bVar.c.length) {
                bArr = asReadOnlyBuffer.array();
                return new com.amazon.aps.iva.vc.b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new com.amazon.aps.iva.vc.b(bArr);
    }
}
