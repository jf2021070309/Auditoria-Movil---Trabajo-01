package androidx.compose.ui.graphics;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.b1;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.h0;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;
/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class a {
    public static final f a(f fVar, l<? super g0, q> lVar) {
        j.f(fVar, "<this>");
        j.f(lVar, "block");
        return fVar.o(new BlockGraphicsLayerElement(lVar));
    }

    public static f b(f fVar, float f, float f2, float f3, u0 u0Var, boolean z, int i) {
        float f4;
        float f5;
        float f6;
        float f7;
        long j;
        u0 u0Var2;
        boolean z2;
        long j2;
        long j3;
        if ((i & 1) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f;
        }
        if ((i & 2) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f2;
        }
        if ((i & 4) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f3;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            f7 = 8.0f;
        } else {
            f7 = 0.0f;
        }
        float f8 = f7;
        if ((i & 1024) != 0) {
            j = b1.b;
        } else {
            j = 0;
        }
        if ((i & 2048) != 0) {
            u0Var2 = p0.a;
        } else {
            u0Var2 = u0Var;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            j2 = h0.a;
        } else {
            j2 = 0;
        }
        if ((i & 32768) != 0) {
            j3 = h0.a;
        } else {
            j3 = 0;
        }
        j.f(fVar, "$this$graphicsLayer");
        j.f(u0Var2, "shape");
        return fVar.o(new GraphicsLayerElement(f4, f5, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f8, j, u0Var2, z2, j2, j3, 0));
    }
}
