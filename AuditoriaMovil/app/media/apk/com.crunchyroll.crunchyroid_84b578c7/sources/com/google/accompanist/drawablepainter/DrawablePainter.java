package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.i1.c;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.v2;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DrawablePainter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0011H\u0014R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010'\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lcom/amazon/aps/iva/i1/c;", "Lcom/amazon/aps/iva/o0/v2;", "Lcom/amazon/aps/iva/kb0/q;", "onRemembered", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "Lcom/amazon/aps/iva/f1/y;", "colorFilter", "applyColorFilter", "Lcom/amazon/aps/iva/o2/l;", "layoutDirection", "applyLayoutDirection", "Lcom/amazon/aps/iva/h1/e;", "onDraw", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "drawInvalidateTick$delegate", "Lcom/amazon/aps/iva/o0/q1;", "getDrawInvalidateTick", "()I", "setDrawInvalidateTick", "(I)V", "drawInvalidateTick", "Lcom/amazon/aps/iva/e1/g;", "drawableIntrinsicSize$delegate", "getDrawableIntrinsicSize-NH-jbRc", "()J", "setDrawableIntrinsicSize-uvyYCjk", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "drawablepainter_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DrawablePainter extends c implements v2 {
    public static final int $stable = 8;
    private final e callback$delegate;
    private final q1 drawInvalidateTick$delegate;
    private final Drawable drawable;
    private final q1 drawableIntrinsicSize$delegate;

    /* compiled from: DrawablePainter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.Ltr.ordinal()] = 1;
            iArr[l.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(Drawable drawable) {
        long intrinsicSize;
        j.f(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick$delegate = b.c0(0);
        intrinsicSize = DrawablePainterKt.getIntrinsicSize(drawable);
        this.drawableIntrinsicSize$delegate = b.c0(new g(intrinsicSize));
        this.callback$delegate = f.b(new DrawablePainter$callback$2(this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback) this.callback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawInvalidateTick() {
        return ((Number) this.drawInvalidateTick$delegate.getValue()).intValue();
    }

    /* renamed from: getDrawableIntrinsicSize-NH-jbRc  reason: not valid java name */
    private final long m37getDrawableIntrinsicSizeNHjbRc() {
        return ((g) this.drawableIntrinsicSize$delegate.getValue()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateTick(int i) {
        this.drawInvalidateTick$delegate.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk  reason: not valid java name */
    public final void m38setDrawableIntrinsicSizeuvyYCjk(long j) {
        this.drawableIntrinsicSize$delegate.setValue(new g(j));
    }

    @Override // com.amazon.aps.iva.i1.c
    public boolean applyAlpha(float f) {
        this.drawable.setAlpha(com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.ob0.f.a(f * 255), 0, 255));
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    public boolean applyColorFilter(y yVar) {
        ColorFilter colorFilter;
        Drawable drawable = this.drawable;
        if (yVar != null) {
            colorFilter = yVar.a;
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    public boolean applyLayoutDirection(l lVar) {
        j.f(lVar, "layoutDirection");
        Drawable drawable = this.drawable;
        int i = WhenMappings.$EnumSwitchMapping$0[lVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new h();
            }
        } else {
            i2 = 0;
        }
        return drawable.setLayoutDirection(i2);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // com.amazon.aps.iva.i1.c
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo16getIntrinsicSizeNHjbRc() {
        return m37getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public void onAbandoned() {
        onForgotten();
    }

    @Override // com.amazon.aps.iva.i1.c
    public void onDraw(com.amazon.aps.iva.h1.e eVar) {
        j.f(eVar, "<this>");
        u a = eVar.R0().a();
        getDrawInvalidateTick();
        this.drawable.setBounds(0, 0, com.amazon.aps.iva.ob0.f.a(g.d(eVar.h())), com.amazon.aps.iva.ob0.f.a(g.b(eVar.h())));
        try {
            a.n();
            Drawable drawable = this.drawable;
            Canvas canvas = com.amazon.aps.iva.f1.h.a;
            drawable.draw(((com.amazon.aps.iva.f1.g) a).a);
        } finally {
            a.g();
        }
    }

    @Override // com.amazon.aps.iva.o0.v2
    public void onForgotten() {
        Drawable drawable = this.drawable;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // com.amazon.aps.iva.o0.v2
    public void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        Drawable drawable = this.drawable;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
