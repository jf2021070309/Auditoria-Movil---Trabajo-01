package com.amazon.aps.iva.d2;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
/* compiled from: TextAndroidCanvas.kt */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class i0 extends Canvas {
    public Canvas a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        com.amazon.aps.iva.yb0.j.f(path, "path");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        com.amazon.aps.iva.yb0.j.f(path, "path");
        com.amazon.aps.iva.yb0.j.f(op, "op");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        com.amazon.aps.iva.yb0.j.f(op, "op");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawARGB(i, i2, i3, i4);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "oval");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawArc(rectF, f, f2, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        com.amazon.aps.iva.yb0.j.f(fArr, "verts");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawCircle(f, f2, f3, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "outer");
        com.amazon.aps.iva.yb0.j.f(rectF2, "inner");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(iArr, "glyphIds");
        com.amazon.aps.iva.yb0.j.f(fArr, "positions");
        com.amazon.aps.iva.yb0.j.f(font, "font");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLine(f, f2, f3, f4, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(fArr, "pts");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "oval");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(ninePatch, "patch");
        com.amazon.aps.iva.yb0.j.f(rect, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(path, "path");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        com.amazon.aps.iva.yb0.j.f(picture, "picture");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoint(f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(cArr, "text");
        com.amazon.aps.iva.yb0.j.f(fArr, "pos");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i2, fArr, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRGB(i, i2, i3);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        com.amazon.aps.iva.yb0.j.f(renderNode, "renderNode");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(cArr, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i2, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(cArr, "text");
        com.amazon.aps.iva.yb0.j.f(path, "path");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(cArr, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(vertexMode, "mode");
        com.amazon.aps.iva.yb0.j.f(fArr, "verts");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        com.amazon.aps.iva.yb0.j.f(rect, "bounds");
        Canvas canvas = this.a;
        if (canvas != null) {
            boolean clipBounds = canvas.getClipBounds(rect);
            if (clipBounds) {
                rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
            }
            return clipBounds;
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        com.amazon.aps.iva.yb0.j.f(matrix, "ctm");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        com.amazon.aps.iva.yb0.j.f(edgeType, "type");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.restore();
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.save();
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.scale(f, f2);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.skew(f, f2);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.translate(f, f2);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        com.amazon.aps.iva.yb0.j.f(rect, "rect");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        com.amazon.aps.iva.yb0.j.f(path, "path");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        com.amazon.aps.iva.yb0.j.f(rect, "rect");
        com.amazon.aps.iva.yb0.j.f(op, "op");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        com.amazon.aps.iva.yb0.j.f(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(j);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rectF, "outer");
        com.amazon.aps.iva.yb0.j.f(fArr, "outerRadii");
        com.amazon.aps.iva.yb0.j.f(rectF2, "inner");
        com.amazon.aps.iva.yb0.j.f(fArr2, "innerRadii");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(fArr, "pts");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawOval(f, f2, f3, f4, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(ninePatch, "patch");
        com.amazon.aps.iva.yb0.j.f(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        com.amazon.aps.iva.yb0.j.f(picture, "picture");
        com.amazon.aps.iva.yb0.j.f(rectF, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(fArr, "pts");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(fArr, "pos");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(rect, "r");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(str, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(path, "path");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas != null) {
            quickReject = canvas.quickReject(rectF);
            return quickReject;
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        com.amazon.aps.iva.yb0.j.f(rectF, "rect");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        com.amazon.aps.iva.yb0.j.f(rect2, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        com.amazon.aps.iva.yb0.j.f(mode, "mode");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        com.amazon.aps.iva.yb0.j.f(picture, "picture");
        com.amazon.aps.iva.yb0.j.f(rect, "dst");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(str, i, i2, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(measuredText, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        com.amazon.aps.iva.yb0.j.f(path, "path");
        com.amazon.aps.iva.yb0.j.f(edgeType, "type");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        com.amazon.aps.iva.yb0.j.f(rect, "rect");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(iArr, "colors");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        com.amazon.aps.iva.yb0.j.f(blendMode, "mode");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(i, blendMode);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        com.amazon.aps.iva.yb0.j.f(path, "path");
        Canvas canvas = this.a;
        if (canvas != null) {
            quickReject = canvas.quickReject(path);
            return quickReject;
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        com.amazon.aps.iva.yb0.j.f(op, "op");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(iArr, "colors");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        com.amazon.aps.iva.yb0.j.f(blendMode, "mode");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawColor(j, blendMode);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        com.amazon.aps.iva.yb0.j.f(edgeType, "type");
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, edgeType);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        com.amazon.aps.iva.yb0.j.f(matrix, "matrix");
        Canvas canvas = this.a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            com.amazon.aps.iva.yb0.j.m("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        boolean quickReject;
        Canvas canvas = this.a;
        if (canvas != null) {
            quickReject = canvas.quickReject(f, f2, f3, f4);
            return quickReject;
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        com.amazon.aps.iva.yb0.j.m("nativeCanvas");
        throw null;
    }
}
