package c.i.i;

import android.os.Build;
import android.os.Trace;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import c.i.g.g;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public class b implements Spannable {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Executor f2113b;

    /* renamed from: c  reason: collision with root package name */
    public final Spannable f2114c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2115d;

    /* renamed from: e  reason: collision with root package name */
    public final PrecomputedText f2116e;

    /* loaded from: classes.dex */
    public static final class a {
        public final TextPaint a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f2117b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2118c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2119d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f2120e;

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f2117b = params.getTextDirection();
            this.f2118c = params.getBreakStrategy();
            this.f2119d = params.getHyphenationFrequency();
            this.f2120e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2120e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2120e = null;
            }
            this.a = textPaint;
            this.f2117b = textDirectionHeuristic;
            this.f2118c = i2;
            this.f2119d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 < 23 || (this.f2118c == aVar.f2118c && this.f2119d == aVar.f2119d)) && this.a.getTextSize() == aVar.a.getTextSize() && this.a.getTextScaleX() == aVar.a.getTextScaleX() && this.a.getTextSkewX() == aVar.a.getTextSkewX()) {
                if ((i2 < 21 || (this.a.getLetterSpacing() == aVar.a.getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.a.getFontFeatureSettings()))) && this.a.getFlags() == aVar.a.getFlags()) {
                    if (i2 >= 24) {
                        if (!this.a.getTextLocales().equals(aVar.a.getTextLocales())) {
                            return false;
                        }
                    } else if (!this.a.getTextLocale().equals(aVar.a.getTextLocale())) {
                        return false;
                    }
                    return this.a.getTypeface() == null ? aVar.a.getTypeface() == null : this.a.getTypeface().equals(aVar.a.getTypeface());
                }
                return false;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.f2117b == aVar.f2117b;
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            return i2 >= 24 ? Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2117b, Integer.valueOf(this.f2118c), Integer.valueOf(this.f2119d)) : i2 >= 21 ? Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f2117b, Integer.valueOf(this.f2118c), Integer.valueOf(this.f2119d)) : Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f2117b, Integer.valueOf(this.f2118c), Integer.valueOf(this.f2119d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder y = e.a.d.a.a.y("textSize=");
            y.append(this.a.getTextSize());
            sb.append(y.toString());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                StringBuilder y2 = e.a.d.a.a.y(", letterSpacing=");
                y2.append(this.a.getLetterSpacing());
                sb.append(y2.toString());
                sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i2 >= 24) {
                StringBuilder y3 = e.a.d.a.a.y(", textLocale=");
                y3.append(this.a.getTextLocales());
                sb.append(y3.toString());
            } else {
                StringBuilder y4 = e.a.d.a.a.y(", textLocale=");
                y4.append(this.a.getTextLocale());
                sb.append(y4.toString());
            }
            StringBuilder y5 = e.a.d.a.a.y(", typeface=");
            y5.append(this.a.getTypeface());
            sb.append(y5.toString());
            if (i2 >= 26) {
                StringBuilder y6 = e.a.d.a.a.y(", variationSettings=");
                y6.append(this.a.getFontVariationSettings());
                sb.append(y6.toString());
            }
            StringBuilder y7 = e.a.d.a.a.y(", textDir=");
            y7.append(this.f2117b);
            sb.append(y7.toString());
            sb.append(", breakStrategy=" + this.f2118c);
            sb.append(", hyphenationFrequency=" + this.f2119d);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: c.i.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038b extends FutureTask<b> {

        /* renamed from: c.i.i.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements Callable<b> {
            public a a;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f2121b;

            public a(a aVar, CharSequence charSequence) {
                this.a = aVar;
                this.f2121b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            public b call() throws Exception {
                return b.a(this.f2121b, this.a);
            }
        }

        public C0038b(a aVar, CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    public b(PrecomputedText precomputedText, a aVar) {
        this.f2114c = precomputedText;
        this.f2115d = aVar;
        this.f2116e = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public b(CharSequence charSequence, a aVar, int[] iArr) {
        this.f2114c = new SpannableString(charSequence);
        this.f2115d = aVar;
        this.f2116e = null;
    }

    public static b a(CharSequence charSequence, a aVar) {
        PrecomputedText.Params params;
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(aVar);
        try {
            int i2 = g.a;
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f2120e) != null) {
                b bVar = new b(PrecomputedText.create(charSequence, params), aVar);
                Trace.endSection();
                return bVar;
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i3 = 0;
            while (i3 < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i3, length);
                i3 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i3));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.a, Integer.MAX_VALUE).setBreakStrategy(aVar.f2118c).setHyphenationFrequency(aVar.f2119d).setTextDirection(aVar.f2117b).build();
            } else if (i5 >= 21) {
                new StaticLayout(charSequence, aVar.a, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            b bVar2 = new b(charSequence, aVar, iArr);
            Trace.endSection();
            return bVar2;
        } catch (Throwable th) {
            int i6 = g.a;
            Trace.endSection();
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f2114c.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2114c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2114c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2114c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2116e.getSpans(i2, i3, cls) : (T[]) this.f2114c.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2114c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2114c.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2116e.removeSpan(obj);
        } else {
            this.f2114c.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2116e.setSpan(obj, i2, i3, i4);
        } else {
            this.f2114c.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f2114c.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2114c.toString();
    }
}
