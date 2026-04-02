package com.amazon.aps.iva.m70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LoadingState.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: LoadingState.kt */
    /* renamed from: com.amazon.aps.iva.m70.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0505a extends a {
        public final int a = R.drawable.ic_no_comments;
        public final int b;
        public final int c;

        public C0505a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }
    }

    /* compiled from: LoadingState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public final int a;
        public final int b;
        public final com.amazon.aps.iva.xb0.a<q> c;

        public b(int i, com.amazon.aps.iva.xb0.a aVar) {
            j.f(aVar, "onRetry");
            this.a = i;
            this.b = R.string.commenting_comments_error_retry_button_text;
            this.c = aVar;
        }
    }

    /* compiled from: LoadingState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public static final c a = new c();
    }
}
