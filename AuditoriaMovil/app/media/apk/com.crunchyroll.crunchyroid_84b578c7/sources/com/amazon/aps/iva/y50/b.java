package com.amazon.aps.iva.y50;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
/* compiled from: CrashlyticsProxy.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.y50.a {
    public static final b a = new b();

    /* compiled from: CrashlyticsProxy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            String str;
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            String str2 = this.h;
            if (str2 != null) {
                int length = str2.length();
                int i = 1024;
                if (1024 > length) {
                    i = length;
                }
                str = str2.substring(length - i);
                j.e(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "";
            }
            firebaseCrashlytics.log(str);
            return q.a;
        }
    }

    /* compiled from: CrashlyticsProxy.kt */
    /* renamed from: com.amazon.aps.iva.y50.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0887b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ Throwable h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0887b(Throwable th) {
            super(0);
            this.h = th;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            FirebaseCrashlytics.getInstance().recordException(this.h);
            return q.a;
        }
    }

    /* compiled from: CrashlyticsProxy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.h = str;
            this.i = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            String str;
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            String str2 = this.i;
            if (str2 != null) {
                int length = str2.length();
                int i = 1024;
                if (1024 > length) {
                    i = length;
                }
                str = str2.substring(length - i);
                j.e(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "";
            }
            firebaseCrashlytics.setCustomKey(this.h, str);
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.y50.a
    public final void a(String str, String str2) {
        new c(str, str2).invoke();
    }

    @Override // com.amazon.aps.iva.y50.a
    public final void b(Throwable th) {
        j.f(th, "throwable");
        new C0887b(th).invoke();
    }

    @Override // com.amazon.aps.iva.y50.a
    public final void log(String str) {
        j.f(str, "message");
        new a(str).invoke();
    }
}
