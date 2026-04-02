package com.amazon.aps.iva.f5;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.leanback.widget.SearchEditText;
import com.crunchyroll.crunchyroid.R;
import java.util.Random;
import java.util.regex.Pattern;
/* compiled from: StreamingTextView.java */
/* loaded from: classes.dex */
public class z extends EditText {
    public static final Pattern g = Pattern.compile("\\S+");
    public static final a h = new a();
    public final Random b;
    public Bitmap c;
    public Bitmap d;
    public int e;
    public ObjectAnimator f;

    /* compiled from: StreamingTextView.java */
    /* loaded from: classes.dex */
    public static class a extends Property<z, Integer> {
        public a() {
            super(Integer.class, "streamPosition");
        }

        @Override // android.util.Property
        public final Integer get(z zVar) {
            return Integer.valueOf(zVar.getStreamPosition());
        }

        @Override // android.util.Property
        public final void set(z zVar, Integer num) {
            zVar.setStreamPosition(num.intValue());
        }
    }

    /* compiled from: StreamingTextView.java */
    /* loaded from: classes.dex */
    public class b extends ReplacementSpan {
        public final int a;
        public final int b;
        public final /* synthetic */ z c;

        public b(SearchEditText searchEditText, int i, int i2) {
            this.c = searchEditText;
            this.a = i;
            this.b = i2;
        }

        @Override // android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            boolean z;
            float f2;
            Bitmap bitmap;
            Bitmap bitmap2;
            int measureText = (int) paint.measureText(charSequence, i, i2);
            z zVar = this.c;
            int width = zVar.c.getWidth();
            int i6 = width * 2;
            int i7 = measureText / i6;
            int i8 = (measureText % i6) / 2;
            if (1 == zVar.getLayoutDirection()) {
                z = true;
            } else {
                z = false;
            }
            zVar.b.setSeed(this.a);
            int alpha = paint.getAlpha();
            for (int i9 = 0; i9 < i7 && this.b + i9 < zVar.e; i9++) {
                float f3 = (width / 2) + (i9 * i6) + i8;
                if (z) {
                    f2 = ((f + measureText) - f3) - width;
                } else {
                    f2 = f + f3;
                }
                paint.setAlpha((zVar.b.nextInt(4) + 1) * 63);
                if (zVar.b.nextBoolean()) {
                    canvas.drawBitmap(zVar.d, f2, i4 - bitmap2.getHeight(), paint);
                } else {
                    canvas.drawBitmap(zVar.c, f2, i4 - bitmap.getHeight(), paint);
                }
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i, i2);
        }
    }

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Random();
    }

    public int getStreamPosition() {
        return this.e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_one);
        this.c = Bitmap.createScaledBitmap(decodeResource, (int) (decodeResource.getWidth() * 1.3f), (int) (decodeResource.getHeight() * 1.3f), false);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_two);
        this.d = Bitmap.createScaledBitmap(decodeResource2, (int) (decodeResource2.getWidth() * 1.3f), (int) (decodeResource2.getHeight() * 1.3f), false);
        this.e = -1;
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(z.class.getCanonicalName());
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.amazon.aps.iva.t3.k.f(callback, this));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setStreamPosition(int i) {
        this.e = i;
        invalidate();
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 2132083624);
        this.b = new Random();
    }
}
