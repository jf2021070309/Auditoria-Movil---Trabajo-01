package androidx.compose.ui.draw;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.h1.c;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class a {
    public static final f a(f fVar, l<? super e, q> lVar) {
        j.f(fVar, "<this>");
        j.f(lVar, "onDraw");
        return fVar.o(new DrawBehindElement(lVar));
    }

    public static final f b(l lVar) {
        j.f(lVar, "onBuildDrawCache");
        return new DrawWithCacheElement(lVar);
    }

    public static final f c(f fVar, l<? super c, q> lVar) {
        j.f(fVar, "<this>");
        return fVar.o(new DrawWithContentElement(lVar));
    }
}
