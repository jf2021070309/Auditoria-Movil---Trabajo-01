package com.amazon.aps.iva.v1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: RenderNodeApi29.android.kt */
/* loaded from: classes.dex */
public final class c2 implements f1 {
    public final RenderNode a;

    public c2(AndroidComposeView androidComposeView) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "ownerView");
        this.a = com.amazon.aps.iva.c6.q.b();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int A() {
        int bottom;
        bottom = this.a.getBottom();
        return bottom;
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
        this.a.setAmbientShadowColor(i);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int F() {
        int right;
        right = this.a.getRight();
        return right;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void G(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void H(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void I(com.amazon.aps.iva.p0.e eVar, com.amazon.aps.iva.f1.m0 m0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.u, com.amazon.aps.iva.kb0.q> lVar) {
        RecordingCanvas beginRecording;
        com.amazon.aps.iva.yb0.j.f(eVar, "canvasHolder");
        RenderNode renderNode = this.a;
        beginRecording = renderNode.beginRecording();
        com.amazon.aps.iva.yb0.j.e(beginRecording, "renderNode.beginRecording()");
        com.amazon.aps.iva.f1.g gVar = (com.amazon.aps.iva.f1.g) eVar.b;
        Canvas canvas = gVar.a;
        gVar.getClass();
        gVar.a = beginRecording;
        if (m0Var != null) {
            gVar.n();
            gVar.h(m0Var, 1);
        }
        lVar.invoke(gVar);
        if (m0Var != null) {
            gVar.g();
        }
        gVar.x(canvas);
        renderNode.endRecording();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final float J() {
        float elevation;
        elevation = this.a.getElevation();
        return elevation;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final float a() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void b(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int c() {
        int left;
        left = this.a.getLeft();
        return left;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void d(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean e(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.a.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void f() {
        this.a.discardDisplayList();
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void g(float f) {
        this.a.setAlpha(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int getHeight() {
        int height;
        height = this.a.getHeight();
        return height;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int getWidth() {
        int width;
        width = this.a.getWidth();
        return width;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void h(float f) {
        this.a.setElevation(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void i(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean j() {
        boolean hasDisplayList;
        hasDisplayList = this.a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void k(float f) {
        this.a.setTranslationY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean l() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean m() {
        boolean clipToBounds;
        clipToBounds = this.a.getClipToBounds();
        return clipToBounds;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void n(int i) {
        boolean z;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        RenderNode renderNode = this.a;
        if (z) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (i == 2) {
            z2 = true;
        }
        if (z2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
            return;
        }
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void o(float f) {
        this.a.setScaleX(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void p(float f) {
        this.a.setCameraDistance(f);
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
    public final void s() {
        if (Build.VERSION.SDK_INT >= 31) {
            d2.a.a(this.a, null);
        }
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void t(float f) {
        this.a.setRotationZ(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final void u(float f) {
        this.a.setScaleY(f);
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final int v() {
        int top;
        top = this.a.getTop();
        return top;
    }

    @Override // com.amazon.aps.iva.v1.f1
    public final boolean w() {
        boolean clipToOutline;
        clipToOutline = this.a.getClipToOutline();
        return clipToOutline;
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
        this.a.offsetLeftAndRight(i);
    }
}
