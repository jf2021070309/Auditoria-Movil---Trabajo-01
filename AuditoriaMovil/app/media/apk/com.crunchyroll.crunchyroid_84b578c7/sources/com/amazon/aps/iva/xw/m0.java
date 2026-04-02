package com.amazon.aps.iva.xw;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.List;
/* compiled from: SpannableUtil.kt */
/* loaded from: classes2.dex */
public final class m0 {

    /* compiled from: SpannableUtil.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ClickableSpan {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super View, com.amazon.aps.iva.kb0.q> lVar, boolean z) {
            this.a = lVar;
            this.b = z;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "widget");
            this.a.invoke(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            com.amazon.aps.iva.yb0.j.f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(this.b);
        }
    }

    /* compiled from: SpannableUtil.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(1);
            this.h = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "view");
            p pVar = this.h;
            pVar.b.invoke(view2, pVar.a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(SpannableString spannableString, String str, boolean z, com.amazon.aps.iva.xb0.l<? super View, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "clickablePart");
        a aVar = new a(lVar, z);
        int r0 = com.amazon.aps.iva.oe0.q.r0(spannableString, str, 0, false, 6);
        if (r0 >= 0) {
            spannableString.setSpan(aVar, r0, str.length() + r0, 33);
        }
    }

    public static final SpannableStringBuilder b(int i, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "subString");
        int r0 = com.amazon.aps.iva.oe0.q.r0(str, str2, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), r0, str2.length() + r0, 18);
        return spannableStringBuilder;
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, int i, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(spannableStringBuilder, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "builderAction");
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i, true);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 17);
    }

    public static final SpannableStringBuilder d(String str, Typeface typeface, List<String> list) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(list, "subStrings");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : list) {
            int r0 = com.amazon.aps.iva.oe0.q.r0(str, str2, 0, false, 6);
            int length = str2.length() + r0;
            if (r0 >= 0) {
                spannableStringBuilder.setSpan(new r(typeface), r0, length, 18);
            }
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder e(String str, String str2, int i, Typeface typeface) {
        int r0 = com.amazon.aps.iva.oe0.q.r0(str, str2, 0, false, 6);
        if (r0 < 0) {
            return new SpannableStringBuilder(str);
        }
        int length = str2.length() + r0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), r0, length, 18);
        spannableStringBuilder.setSpan(new r(typeface), r0, length, 18);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder f(String str, String str2, int i, Typeface typeface, int i2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "subString");
        com.amazon.aps.iva.yb0.j.f(typeface, "typeFace");
        int r0 = com.amazon.aps.iva.oe0.q.r0(str, str2, 0, false, 6);
        int length = str2.length() + r0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), r0, length, 18);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i2, z), r0, length, 18);
        spannableStringBuilder.setSpan(new r(typeface), r0, length, 18);
        return spannableStringBuilder;
    }

    public static final SpannableString g(String str, p... pVarArr) {
        SpannableString spannableString = new SpannableString(str);
        for (p pVar : pVarArr) {
            a(spannableString, pVar.a, pVar.c, new b(pVar));
        }
        return spannableString;
    }
}
