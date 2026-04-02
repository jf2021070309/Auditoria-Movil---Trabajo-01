package com.amazon.aps.iva.s3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: EditorInfoCompat.java */
    /* renamed from: com.amazon.aps.iva.s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0694a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C0694a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i4 >= 30) {
            C0694a.a(editorInfo, charSequence);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        if (i5 > i6) {
            i = i6 + 0;
        } else {
            i = i5 + 0;
        }
        if (i5 > i6) {
            i2 = i5 - 0;
        } else {
            i2 = i6 + 0;
        }
        int length = charSequence.length();
        if (i >= 0 && i2 <= length) {
            int i7 = editorInfo.inputType & 4095;
            if (i7 != 129 && i7 != 225 && i7 != 18) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                b(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                b(editorInfo, charSequence, i, i2);
                return;
            } else {
                int i8 = i2 - i;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(charSequence.length() - i2, i9 - Math.min(i, (int) (i9 * 0.8d)));
                int min2 = Math.min(i, i9 - min);
                int i10 = i - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i3 + min;
                if (i3 != i8) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i2, min + i2));
                } else {
                    subSequence = charSequence.subSequence(i10, i11 + i10);
                }
                int i12 = min2 + 0;
                b(editorInfo, subSequence, i12, i3 + i12);
                return;
            }
        }
        b(editorInfo, null, 0, 0);
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
