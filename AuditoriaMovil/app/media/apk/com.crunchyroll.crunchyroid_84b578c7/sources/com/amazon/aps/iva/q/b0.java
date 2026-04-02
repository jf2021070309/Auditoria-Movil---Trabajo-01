package com.amazon.aps.iva.q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
public final class b0 {
    public final TextView a;
    public TextClassifier b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public b0(TextView textView) {
        textView.getClass();
        this.a = textView;
    }
}
