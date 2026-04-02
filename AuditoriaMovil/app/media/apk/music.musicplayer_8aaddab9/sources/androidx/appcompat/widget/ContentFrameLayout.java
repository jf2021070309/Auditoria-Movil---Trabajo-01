package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import c.b.c.o;
import c.b.c.r;
import c.b.h.i.g;
import c.b.i.c0;
import java.util.Objects;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f214b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f215c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f216d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f217e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f218f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f219g;

    /* renamed from: h  reason: collision with root package name */
    public a f220h;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f219g = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f217e == null) {
            this.f217e = new TypedValue();
        }
        return this.f217e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f218f == null) {
            this.f218f = new TypedValue();
        }
        return this.f218f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f215c == null) {
            this.f215c = new TypedValue();
        }
        return this.f215c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f216d == null) {
            this.f216d = new TypedValue();
        }
        return this.f216d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f214b == null) {
            this.f214b = new TypedValue();
        }
        return this.f214b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f220h;
        if (aVar != null) {
            Objects.requireNonNull((r) aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f220h;
        if (aVar != null) {
            o oVar = ((r) aVar).a;
            c0 c0Var = oVar.r;
            if (c0Var != null) {
                c0Var.j();
            }
            if (oVar.w != null) {
                oVar.f829l.getDecorView().removeCallbacks(oVar.x);
                if (oVar.w.isShowing()) {
                    try {
                        oVar.w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                oVar.w = null;
            }
            oVar.J();
            g gVar = oVar.O(0).f846h;
            if (gVar != null) {
                gVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f220h = aVar;
    }
}
