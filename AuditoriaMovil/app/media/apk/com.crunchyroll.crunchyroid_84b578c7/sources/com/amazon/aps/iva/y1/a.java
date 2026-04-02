package com.amazon.aps.iva.y1;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
/* compiled from: ContentCaptureSessionCompat.java */
/* loaded from: classes.dex */
public final class a {
    public final Object a;
    public final View b;

    /* compiled from: ContentCaptureSessionCompat.java */
    /* renamed from: com.amazon.aps.iva.y1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0880a {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public a(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0880a.a(com.amazon.aps.iva.c8.b.g(this.a), e.a(this.b), j);
        }
        return null;
    }
}
