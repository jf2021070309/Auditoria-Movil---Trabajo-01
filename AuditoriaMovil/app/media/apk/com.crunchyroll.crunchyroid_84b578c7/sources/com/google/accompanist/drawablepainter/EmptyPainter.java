package com.google.accompanist.drawablepainter;

import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.i1.c;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DrawablePainter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014R\u001d\u0010\b\u001a\u00020\u00058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lcom/google/accompanist/drawablepainter/EmptyPainter;", "Lcom/amazon/aps/iva/i1/c;", "Lcom/amazon/aps/iva/h1/e;", "Lcom/amazon/aps/iva/kb0/q;", "onDraw", "Lcom/amazon/aps/iva/e1/g;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "drawablepainter_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EmptyPainter extends c {
    public static final EmptyPainter INSTANCE = new EmptyPainter();

    private EmptyPainter() {
    }

    @Override // com.amazon.aps.iva.i1.c
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo16getIntrinsicSizeNHjbRc() {
        int i = g.d;
        return g.c;
    }

    @Override // com.amazon.aps.iva.i1.c
    public void onDraw(e eVar) {
        j.f(eVar, "<this>");
    }
}
