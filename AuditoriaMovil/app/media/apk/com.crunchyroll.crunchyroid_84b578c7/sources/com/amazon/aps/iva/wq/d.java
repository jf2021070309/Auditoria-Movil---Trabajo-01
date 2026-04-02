package com.amazon.aps.iva.wq;

import com.amazon.aps.iva.fr.a;
import com.amazon.aps.iva.fr.b;
import com.amazon.aps.iva.fr.c;
import com.amazon.aps.iva.fr.d;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.ir.a;
import com.amazon.aps.iva.ir.b;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
/* compiled from: RumEventSourceProvider.kt */
/* loaded from: classes2.dex */
public final class d {
    public final m a;
    public final m b;
    public final m c;
    public final m d;
    public final m e;
    public final m f;
    public final m g;

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<a.u> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final a.u invoke() {
            String str = this.h;
            try {
                a.u.Companion.getClass();
                return a.u.C0271a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<b.o> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final b.o invoke() {
            String str = this.h;
            try {
                b.o.Companion.getClass();
                return b.o.a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<c.r> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c.r invoke() {
            String str = this.h;
            try {
                c.r.Companion.getClass();
                return c.r.a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* renamed from: com.amazon.aps.iva.wq.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0832d extends l implements com.amazon.aps.iva.xb0.a<d.z> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0832d(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d.z invoke() {
            String str = this.h;
            try {
                d.z.Companion.getClass();
                return d.z.a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<a.f> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final a.f invoke() {
            String str = this.h;
            try {
                a.f.Companion.getClass();
                return a.f.C0387a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<b.g> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final b.g invoke() {
            String str = this.h;
            try {
                b.g.Companion.getClass();
                return b.g.a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    /* compiled from: RumEventSourceProvider.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a<e.w> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e.w invoke() {
            String str = this.h;
            try {
                e.w.Companion.getClass();
                return e.w.a.a(str);
            } catch (NoSuchElementException e) {
                com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.b;
                String format = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.a(aVar, format, e, 4);
                return null;
            }
        }
    }

    public d(String str) {
        j.f(str, FirebaseAnalytics.Param.SOURCE);
        this.a = com.amazon.aps.iva.kb0.f.b(new g(str));
        this.b = com.amazon.aps.iva.kb0.f.b(new c(str));
        this.c = com.amazon.aps.iva.kb0.f.b(new b(str));
        this.d = com.amazon.aps.iva.kb0.f.b(new a(str));
        this.e = com.amazon.aps.iva.kb0.f.b(new C0832d(str));
        this.f = com.amazon.aps.iva.kb0.f.b(new e(str));
        this.g = com.amazon.aps.iva.kb0.f.b(new f(str));
    }
}
