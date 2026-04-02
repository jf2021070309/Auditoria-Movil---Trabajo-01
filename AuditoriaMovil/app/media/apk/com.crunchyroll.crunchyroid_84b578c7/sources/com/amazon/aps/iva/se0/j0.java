package com.amazon.aps.iva.se0;

import android.graphics.Rect;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: DebugStrings.kt */
/* loaded from: classes4.dex */
public final class j0 implements com.amazon.aps.iva.hb.j, com.amazon.aps.iva.jb.e, com.amazon.aps.iva.kc.d {
    public final /* synthetic */ int b;

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String g(com.amazon.aps.iva.ob0.d dVar) {
        String str;
        if (dVar instanceof com.amazon.aps.iva.xe0.e) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + e(dVar);
        } catch (Throwable th) {
            str = com.amazon.aps.iva.ab.x.H(th);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(str);
        String str2 = str;
        if (a != null) {
            str2 = dVar.getClass().getName() + '@' + e(dVar);
        }
        return (String) str2;
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f a() {
        return new com.amazon.aps.iva.da0.a();
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        switch (this.b) {
            case 1:
                int h = com.amazon.aps.iva.ab.a.h(aVar) / 2;
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Rect rect = ((com.amazon.aps.iva.ib.n) it.next()).a;
                    rect.left += h;
                    rect.right += h;
                }
                return;
            default:
                int h2 = com.amazon.aps.iva.ab.a.h(aVar) / aVar.i;
                Iterator it2 = linkedList.iterator();
                int i = h2;
                while (it2.hasNext()) {
                    Rect rect2 = ((com.amazon.aps.iva.ib.n) it2.next()).a;
                    if (rect2.right == aVar.d()) {
                        rect2.left += aVar.d() - rect2.right;
                        rect2.right = aVar.d();
                        rect2.left -= i;
                    } else {
                        rect2.right -= i;
                        i += h2;
                        rect2.left -= i;
                    }
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.kc.d
    public final boolean c(Object obj, File file, com.amazon.aps.iva.kc.h hVar) {
        try {
            com.amazon.aps.iva.hd.a.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    @Override // com.amazon.aps.iva.jb.e
    public final com.amazon.aps.iva.jb.f f() {
        return new com.amazon.aps.iva.o6.h(3);
    }
}
