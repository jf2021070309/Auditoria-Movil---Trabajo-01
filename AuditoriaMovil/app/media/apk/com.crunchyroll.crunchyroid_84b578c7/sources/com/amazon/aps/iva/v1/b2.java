package com.amazon.aps.iva.v1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
public final class b2 implements f1 {
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public b2(AndroidComposeView androidComposeView) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "ownerView");
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        com.amazon.aps.iva.yb0.j.e(create, "create(\"Compose\", ownerView)");
        this.a = create;
        if (g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                g2 g2Var = g2.a;
                g2Var.c(create, g2Var.a(create));
                g2Var.d(create, g2Var.b(create));
            }
            f2.a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            g = false;
        }
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int A() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void B(float f) {
        this.a.setPivotX(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void C(float f) {
        this.a.setPivotY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void D(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void E(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            g2.a.c(this.a, i);
        }
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int F() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void G(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void H(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            g2.a.d(this.a, i);
        }
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void I(com.amazon.aps.iva.p0.e eVar, com.amazon.aps.iva.f1.m0 m0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.u, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "canvasHolder");
        int i = this.d - this.b;
        int i2 = this.e - this.c;
        RenderNode renderNode = this.a;
        DisplayListCanvas start = renderNode.start(i, i2);
        com.amazon.aps.iva.yb0.j.e(start, "renderNode.start(width, height)");
        Canvas w = eVar.m().w();
        eVar.m().x((Canvas) start);
        com.amazon.aps.iva.f1.g m = eVar.m();
        if (m0Var != null) {
            m.n();
            m.h(m0Var, 1);
        }
        lVar.invoke(m);
        if (m0Var != null) {
            m.g();
        }
        eVar.m().x(w);
        renderNode.end(start);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final float J() {
        return this.a.getElevation();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final float a() {
        return this.a.getAlpha();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void b(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.a);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void d(boolean z) {
        this.f = z;
        this.a.setClipToBounds(z);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean e(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this.a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void f() {
        f2.a.a(this.a);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void g(float f) {
        this.a.setAlpha(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int getHeight() {
        return this.e - this.c;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int getWidth() {
        return this.d - this.b;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void h(float f) {
        this.a.setElevation(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void i(int i) {
        this.c += i;
        this.e += i;
        this.a.offsetTopAndBottom(i);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean j() {
        return this.a.isValid();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void k(float f) {
        this.a.setTranslationY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean l() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean m() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void n(int i) {
        boolean m = com.amazon.aps.iva.ab.t.m(i, 1);
        RenderNode renderNode = this.a;
        if (m) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (com.amazon.aps.iva.ab.t.m(i, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void o(float f) {
        this.a.setScaleX(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void p(float f) {
        this.a.setCameraDistance(-f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void q(float f) {
        this.a.setRotationX(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void r(float f) {
        this.a.setRotationY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void t(float f) {
        this.a.setRotation(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void u(float f) {
        this.a.setScaleY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int v() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean w() {
        return this.a.getClipToOutline();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void x(Matrix matrix) {
        com.amazon.aps.iva.yb0.j.f(matrix, "matrix");
        this.a.getMatrix(matrix);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void y(float f) {
        this.a.setTranslationX(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void z(int i) {
        this.b += i;
        this.d += i;
        this.a.offsetLeftAndRight(i);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void s() {
    }
}
