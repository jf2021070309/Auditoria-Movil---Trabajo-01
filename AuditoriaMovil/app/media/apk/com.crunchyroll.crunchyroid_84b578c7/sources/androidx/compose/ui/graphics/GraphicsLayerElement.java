package androidx.compose.ui.graphics;

import androidx.compose.ui.node.o;
import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.b1;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.f1.w0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/f1/w0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends f0<w0> {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final long m;
    public final u0 n;
    public final boolean o;
    public final long p;
    public final long q;
    public final int r;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, u0 u0Var, boolean z, long j2, long j3, int i) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.m = j;
        this.n = u0Var;
        this.o = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.c, graphicsLayerElement.c) != 0 || Float.compare(this.d, graphicsLayerElement.d) != 0 || Float.compare(this.e, graphicsLayerElement.e) != 0 || Float.compare(this.f, graphicsLayerElement.f) != 0 || Float.compare(this.g, graphicsLayerElement.g) != 0 || Float.compare(this.h, graphicsLayerElement.h) != 0 || Float.compare(this.i, graphicsLayerElement.i) != 0 || Float.compare(this.j, graphicsLayerElement.j) != 0 || Float.compare(this.k, graphicsLayerElement.k) != 0 || Float.compare(this.l, graphicsLayerElement.l) != 0) {
            return false;
        }
        int i = b1.c;
        if (this.m == graphicsLayerElement.m) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !j.a(this.n, graphicsLayerElement.n) || this.o != graphicsLayerElement.o || !j.a(null, null) || !x.c(this.p, graphicsLayerElement.p) || !x.c(this.q, graphicsLayerElement.q)) {
            return false;
        }
        if (this.r == graphicsLayerElement.r) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int b = t0.b(this.l, t0.b(this.k, t0.b(this.j, t0.b(this.i, t0.b(this.h, t0.b(this.g, t0.b(this.f, t0.b(this.e, t0.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = b1.c;
        int hashCode = (this.n.hashCode() + i.a(this.m, b, 31)) * 31;
        boolean z = this.o;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = x.h;
        return Integer.hashCode(this.r) + i.a(this.q, i.a(this.p, (((hashCode + i2) * 31) + 0) * 31, 31), 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final w0 l() {
        return new w0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(w0 w0Var) {
        w0 w0Var2 = w0Var;
        j.f(w0Var2, "node");
        w0Var2.o = this.c;
        w0Var2.p = this.d;
        w0Var2.q = this.e;
        w0Var2.r = this.f;
        w0Var2.s = this.g;
        w0Var2.t = this.h;
        w0Var2.u = this.i;
        w0Var2.v = this.j;
        w0Var2.w = this.k;
        w0Var2.x = this.l;
        w0Var2.y = this.m;
        u0 u0Var = this.n;
        j.f(u0Var, "<set-?>");
        w0Var2.z = u0Var;
        w0Var2.A = this.o;
        w0Var2.B = this.p;
        w0Var2.C = this.q;
        w0Var2.D = this.r;
        o oVar = com.amazon.aps.iva.u1.i.d(w0Var2, 2).j;
        if (oVar != null) {
            oVar.J1(w0Var2.E, true);
        }
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.c + ", scaleY=" + this.d + ", alpha=" + this.e + ", translationX=" + this.f + ", translationY=" + this.g + ", shadowElevation=" + this.h + ", rotationX=" + this.i + ", rotationY=" + this.j + ", rotationZ=" + this.k + ", cameraDistance=" + this.l + ", transformOrigin=" + ((Object) b1.b(this.m)) + ", shape=" + this.n + ", clip=" + this.o + ", renderEffect=null, ambientShadowColor=" + ((Object) x.i(this.p)) + ", spotShadowColor=" + ((Object) x.i(this.q)) + ", compositingStrategy=" + ((Object) ("CompositingStrategy(value=" + this.r + ')')) + ')';
    }
}
