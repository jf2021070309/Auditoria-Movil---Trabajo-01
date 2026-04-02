package com.amazon.aps.iva.i4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class k extends g {
    public TextPaint e;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint3 = this.e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint2);
                        }
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (textPaint2 != null && textPaint2.bgColor != 0) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.c, i5, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        androidx.emoji2.text.d.a().getClass();
        float f2 = i4;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        j jVar = this.b;
        androidx.emoji2.text.h hVar = jVar.b;
        Typeface typeface = hVar.d;
        Typeface typeface2 = textPaint.getTypeface();
        textPaint.setTypeface(typeface);
        canvas.drawText(hVar.b, jVar.a * 2, 2, f, f2, textPaint);
        textPaint.setTypeface(typeface2);
    }
}
