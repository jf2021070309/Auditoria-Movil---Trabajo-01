package com.google.accompanist.drawablepainter;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.i1.a;
import com.amazon.aps.iva.i1.b;
import com.amazon.aps.iva.i1.c;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.g;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DrawablePainter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lcom/amazon/aps/iva/i1/c;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;Lcom/amazon/aps/iva/o0/i;I)Lcom/amazon/aps/iva/i1/c;", "Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER", "Lcom/amazon/aps/iva/e1/g;", "getIntrinsicSize", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "drawablepainter_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DrawablePainterKt {
    private static final e MAIN_HANDLER$delegate = f.a(g.NONE, DrawablePainterKt$MAIN_HANDLER$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return r.d(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        int i = com.amazon.aps.iva.e1.g.d;
        return com.amazon.aps.iva.e1.g.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    public static final c rememberDrawablePainter(Drawable drawable, i iVar, int i) {
        Object drawablePainter;
        iVar.s(1756822313);
        e0.b bVar = e0.a;
        iVar.s(1157296644);
        boolean H = iVar.H(drawable);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            if (drawable == null) {
                t = EmptyPainter.INSTANCE;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    j.e(bitmap, "drawable.bitmap");
                    drawablePainter = new a(new com.amazon.aps.iva.f1.i(bitmap));
                } else if (drawable instanceof ColorDrawable) {
                    drawablePainter = new b(i.d(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable mutate = drawable.mutate();
                    j.e(mutate, "drawable.mutate()");
                    drawablePainter = new DrawablePainter(mutate);
                }
                t = drawablePainter;
            }
            iVar.n(t);
        }
        iVar.G();
        c cVar = (c) t;
        iVar.G();
        return cVar;
    }
}
