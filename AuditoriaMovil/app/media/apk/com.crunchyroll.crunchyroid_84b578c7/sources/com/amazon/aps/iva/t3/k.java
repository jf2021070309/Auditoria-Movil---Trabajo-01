package com.amazon.aps.iva.t3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.n3.h;
import java.lang.reflect.Method;
import java.util.Locale;
/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {
        public final ActionMode.Callback a;
        public final TextView b;
        public Class<?> c;
        public Method d;
        public boolean e;
        public boolean f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t3.k.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static h.a a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new h.a(e.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = c.a(textView);
        int d2 = c.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(e.b(d.a(b.d(textView)))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (b.b(textView) != 1) {
                    z = false;
                }
                switch (b.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        return new h.a(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void b(TextView textView, int i) {
        int i2;
        com.amazon.aps.iva.cq.b.w(i);
        if (Build.VERSION.SDK_INT >= 28) {
            e.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i) {
        int i2;
        com.amazon.aps.iva.cq.b.w(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void d(TextView textView, com.amazon.aps.iva.n3.h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            hVar.getClass();
            textView.setText(e.a(null));
            return;
        }
        h.a a2 = a(textView);
        hVar.getClass();
        a2.a(null);
        throw null;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback) {
        if (callback instanceof f) {
            return ((f) callback).a;
        }
        return callback;
    }

    public static ActionMode.Callback f(ActionMode.Callback callback, TextView textView) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof f) && callback != null) {
            return new f(callback, textView);
        }
        return callback;
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
