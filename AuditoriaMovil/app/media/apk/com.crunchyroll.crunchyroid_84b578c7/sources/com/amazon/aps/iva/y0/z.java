package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.y;
/* compiled from: SnapshotStateObserver.kt */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ y h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar) {
        super(0);
        this.h = yVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        do {
            y yVar = this.h;
            synchronized (yVar.f) {
                if (!yVar.c) {
                    yVar.c = true;
                    com.amazon.aps.iva.p0.f<y.a> fVar = yVar.f;
                    int i = fVar.d;
                    if (i > 0) {
                        y.a[] aVarArr = fVar.b;
                        int i2 = 0;
                        do {
                            y.a aVar = aVarArr[i2];
                            com.amazon.aps.iva.p0.c<Object> cVar = aVar.g;
                            Object[] objArr = cVar.c;
                            int i3 = cVar.b;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = objArr[i4];
                                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                aVar.a.invoke(obj);
                            }
                            cVar.clear();
                            i2++;
                        } while (i2 < i);
                        yVar.c = false;
                    } else {
                        yVar.c = false;
                    }
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        } while (y.a(this.h));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
