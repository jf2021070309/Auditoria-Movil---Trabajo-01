package com.amazon.aps.iva.f1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class w0 extends f.c implements com.amazon.aps.iva.u1.x {
    public boolean A;
    public long B;
    public long C;
    public int D;
    public final v0 E;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public u0 z;

    /* compiled from: GraphicsLayerModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ w0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var, w0 w0Var) {
            super(1);
            this.h = u0Var;
            this.i = w0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            u0.a.i(aVar2, this.h, 0, 0, this.i.E, 4);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public w0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, u0 u0Var, boolean z, long j2, long j3, int i) {
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        this.o = f;
        this.p = f2;
        this.q = f3;
        this.r = f4;
        this.s = f5;
        this.t = f6;
        this.u = f7;
        this.v = f8;
        this.w = f9;
        this.x = f10;
        this.y = j;
        this.z = u0Var;
        this.A = z;
        this.B = j2;
        this.C = j3;
        this.D = i;
        this.E = new v0(this);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V, this));
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final boolean j1() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.o);
        sb.append(", scaleY=");
        sb.append(this.p);
        sb.append(", alpha = ");
        sb.append(this.q);
        sb.append(", translationX=");
        sb.append(this.r);
        sb.append(", translationY=");
        sb.append(this.s);
        sb.append(", shadowElevation=");
        sb.append(this.t);
        sb.append(", rotationX=");
        sb.append(this.u);
        sb.append(", rotationY=");
        sb.append(this.v);
        sb.append(", rotationZ=");
        sb.append(this.w);
        sb.append(", cameraDistance=");
        sb.append(this.x);
        sb.append(", transformOrigin=");
        sb.append((Object) b1.b(this.y));
        sb.append(", shape=");
        sb.append(this.z);
        sb.append(", clip=");
        sb.append(this.A);
        sb.append(", renderEffect=null, ambientShadowColor=");
        sb.append((Object) x.i(this.B));
        sb.append(", spotShadowColor=");
        sb.append((Object) x.i(this.C));
        sb.append(", compositingStrategy=");
        int i = this.D;
        sb.append((Object) ("CompositingStrategy(value=" + i + ')'));
        sb.append(')');
        return sb.toString();
    }
}
