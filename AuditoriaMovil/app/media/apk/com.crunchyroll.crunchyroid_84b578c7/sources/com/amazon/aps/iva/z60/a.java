package com.amazon.aps.iva.z60;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.widgets.CollapsibleTextView;
/* compiled from: CollapsibleTextView.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ CollapsibleTextView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CollapsibleTextView collapsibleTextView) {
        super(0);
        this.h = collapsibleTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.TextView, com.ellation.widgets.CollapsibleTextView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        ?? r0 = this.h;
        boolean S7 = r0.S7();
        boolean z = true;
        ?? r4 = r0.c;
        if (S7) {
            if (r0.k) {
                CollapsibleTextView.U2(r0);
            } else {
                if (r4.length() != 0) {
                    z = false;
                }
                if (z) {
                    r4 = r0.b;
                }
                r0.setText(r4);
            }
        } else {
            if (r4.length() != 0) {
                z = false;
            }
            if (z) {
                r4 = r0.b;
            }
            r0.setText(r4);
        }
        return q.a;
    }
}
