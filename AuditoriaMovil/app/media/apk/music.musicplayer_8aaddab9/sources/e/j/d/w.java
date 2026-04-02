package e.j.d;

import android.app.Activity;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.SkuDetails;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e.j.d.c0.a0;
import h.g;
import h.m.e;
import h.m.f;
import i.a.c2;
import i.a.d0;
import i.a.e;
import i.a.e0;
import i.a.f0;
import i.a.g1;
import i.a.i0;
import i.a.j0;
import i.a.j1;
import i.a.k0;
import i.a.l0;
import i.a.m0;
import i.a.m1;
import i.a.n0;
import i.a.n1;
import i.a.o1;
import i.a.p0;
import i.a.v1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes2.dex */
public final class w {
    public static volatile f.a.g.b<? super Throwable> a;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.p<h.m.f, f.a, h.m.f> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // h.o.b.p
        public h.m.f i(h.m.f fVar, f.a aVar) {
            h.m.c cVar;
            h.m.f fVar2 = fVar;
            f.a aVar2 = aVar;
            h.o.c.j.e(fVar2, "acc");
            h.o.c.j.e(aVar2, "element");
            h.m.f minusKey = fVar2.minusKey(aVar2.getKey());
            h.m.g gVar = h.m.g.a;
            if (minusKey == gVar) {
                return aVar2;
            }
            int i2 = h.m.e.R;
            e.a aVar3 = e.a.a;
            h.m.e eVar = (h.m.e) minusKey.get(aVar3);
            if (eVar == null) {
                cVar = new h.m.c(minusKey, aVar2);
            } else {
                h.m.f minusKey2 = minusKey.minusKey(aVar3);
                if (minusKey2 == gVar) {
                    return new h.m.c(aVar2, eVar);
                }
                cVar = new h.m.c(new h.m.c(minusKey2, aVar2), eVar);
            }
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.g {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.m.d f8853b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h.o.b.l f8854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h.m.d dVar, h.o.b.l lVar) {
            super(dVar);
            this.f8853b = dVar;
            this.f8854c = lVar;
        }

        @Override // h.m.i.a.a
        public Object invokeSuspend(Object obj) {
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.a = 2;
                    w.E0(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            w.E0(obj);
            h.o.b.l lVar = this.f8854c;
            h.o.c.t.a(lVar, 1);
            return lVar.invoke(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.m.d f8855b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h.m.f f8856c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h.o.b.l f8857d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h.m.d dVar, h.m.f fVar, h.o.b.l lVar) {
            super(dVar, fVar);
            this.f8855b = dVar;
            this.f8856c = fVar;
            this.f8857d = lVar;
        }

        @Override // h.m.i.a.a
        public Object invokeSuspend(Object obj) {
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.a = 2;
                    w.E0(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            w.E0(obj);
            h.o.b.l lVar = this.f8857d;
            h.o.c.t.a(lVar, 1);
            return lVar.invoke(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends h.m.i.a.g {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.m.d f8858b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h.o.b.p f8859c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f8860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h.m.d dVar, h.o.b.p pVar, Object obj) {
            super(dVar);
            this.f8858b = dVar;
            this.f8859c = pVar;
            this.f8860d = obj;
        }

        @Override // h.m.i.a.a
        public Object invokeSuspend(Object obj) {
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.a = 2;
                    w.E0(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            w.E0(obj);
            h.o.b.p pVar = this.f8859c;
            h.o.c.t.a(pVar, 2);
            return pVar.i(this.f8860d, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends h.m.i.a.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.m.d f8861b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h.m.f f8862c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h.o.b.p f8863d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f8864e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h.m.d dVar, h.m.f fVar, h.o.b.p pVar, Object obj) {
            super(dVar, fVar);
            this.f8861b = dVar;
            this.f8862c = fVar;
            this.f8863d = pVar;
            this.f8864e = obj;
        }

        @Override // h.m.i.a.a
        public Object invokeSuspend(Object obj) {
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.a = 2;
                    w.E0(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            w.E0(obj);
            h.o.b.p pVar = this.f8863d;
            h.o.c.t.a(pVar, 2);
            return pVar.i(this.f8864e, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class f<T> implements h.s.b<T> {
        public final /* synthetic */ Iterator a;

        public f(Iterator it) {
            this.a = it;
        }

        @Override // h.s.b
        public Iterator<T> iterator() {
            return this.a;
        }
    }

    @h.m.i.a.e(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {100, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH}, m = "yieldAndThrow")
    /* loaded from: classes2.dex */
    public static final class g extends h.m.i.a.c {
        public /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f8865b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8866c;

        public g(h.m.d dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f8865b |= Level.ALL_INT;
            return w.L0(null, this);
        }
    }

    public static final void A(h.m.f fVar) {
        int i2 = g1.T;
        g1 g1Var = (g1) fVar.get(g1.a.a);
        if (g1Var != null && !g1Var.a()) {
            throw g1Var.v();
        }
    }

    public static final String A0(String str) {
        int i2 = i.a.i2.r.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean B(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c2);
            char upperCase2 = Character.toUpperCase(c3);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static int B0(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) z0(str, i2, i3, i4);
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    public static /* synthetic */ long C0(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return z0(str, j2, j5, j4);
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        stringBuffer.append("\\b");
                        continue;
                    case '\t':
                        stringBuffer.append("\\t");
                        continue;
                    case '\n':
                        stringBuffer.append("\\n");
                        continue;
                    default:
                        if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                            stringBuffer.append(charAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i3 = 0; i3 < 4 - hexString.length(); i3++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase(Locale.US));
                            continue;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
        return stringBuffer.toString();
    }

    public static void D0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object E(i.a.h2.b<? extends T> r4, h.m.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof i.a.h2.g
            if (r0 == 0) goto L13
            r0 = r5
            i.a.h2.g r0 = (i.a.h2.g) r0
            int r1 = r0.f9012d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9012d = r1
            goto L18
        L13:
            i.a.h2.g r0 = new i.a.h2.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9011c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f9012d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f9010b
            i.a.h2.e r4 = (i.a.h2.e) r4
            java.lang.Object r0 = r0.a
            h.o.c.q r0 = (h.o.c.q) r0
            E0(r5)     // Catch: i.a.h2.w.a -> L2f
            goto L63
        L2f:
            r5 = move-exception
            goto L5f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            E0(r5)
            h.o.c.q r5 = new h.o.c.q
            r5.<init>()
            i.a.i2.q r2 = i.a.h2.w.g.a
            r5.a = r2
            i.a.h2.e r2 = new i.a.h2.e
            r2.<init>(r5)
            r0.a = r5     // Catch: i.a.h2.w.a -> L5b
            r0.f9010b = r2     // Catch: i.a.h2.w.a -> L5b
            r0.f9012d = r3     // Catch: i.a.h2.w.a -> L5b
            i.a.h2.i r4 = (i.a.h2.i) r4     // Catch: i.a.h2.w.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: i.a.h2.w.a -> L5b
            if (r4 != r1) goto L59
            goto L69
        L59:
            r0 = r5
            goto L63
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            i.a.h2.c<?> r1 = r5.a
            if (r1 != r4) goto L72
        L63:
            T r1 = r0.a
            i.a.i2.q r4 = i.a.h2.w.g.a
            if (r1 == r4) goto L6a
        L69:
            return r1
        L6a:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L72:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.w.E(i.a.h2.b, h.m.d):java.lang.Object");
    }

    public static final void E0(Object obj) {
        if (obj instanceof g.a) {
            throw ((g.a) obj).a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r5.a(r2, r0) == r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object F(i.a.h2.b<? extends T> r5, h.o.b.p<? super T, ? super h.m.d<? super java.lang.Boolean>, ? extends java.lang.Object> r6, h.m.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof i.a.h2.h
            if (r0 == 0) goto L13
            r0 = r7
            i.a.h2.h r0 = (i.a.h2.h) r0
            int r1 = r0.f9016e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9016e = r1
            goto L18
        L13:
            i.a.h2.h r0 = new i.a.h2.h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9015d
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f9016e
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f9014c
            i.a.h2.f r5 = (i.a.h2.f) r5
            java.lang.Object r6 = r0.f9013b
            h.o.c.q r6 = (h.o.c.q) r6
            java.lang.Object r0 = r0.a
            h.o.b.p r0 = (h.o.b.p) r0
            E0(r7)     // Catch: i.a.h2.w.a -> L33
            goto L6a
        L33:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L64
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            E0(r7)
            h.o.c.q r7 = new h.o.c.q
            r7.<init>()
            i.a.i2.q r2 = i.a.h2.w.g.a
            r7.a = r2
            i.a.h2.f r2 = new i.a.h2.f
            r2.<init>(r6, r7)
            r0.a = r6     // Catch: i.a.h2.w.a -> L61
            r0.f9013b = r7     // Catch: i.a.h2.w.a -> L61
            r0.f9014c = r2     // Catch: i.a.h2.w.a -> L61
            r0.f9016e = r3     // Catch: i.a.h2.w.a -> L61
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: i.a.h2.w.a -> L61
            if (r5 != r1) goto L68
            goto L70
        L61:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L64:
            i.a.h2.c<?> r1 = r0.a
            if (r1 != r5) goto L7d
        L68:
            r0 = r6
            r6 = r7
        L6a:
            T r1 = r6.a
            i.a.i2.q r5 = i.a.h2.w.g.a
            if (r1 == r5) goto L71
        L70:
            return r1
        L71:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate "
            java.lang.String r6 = h.o.c.j.i(r6, r0)
            r5.<init>(r6)
            throw r5
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.w.F(i.a.h2.b, h.o.b.p, h.m.d):java.lang.Object");
    }

    public static final String F0(h.m.d<?> dVar) {
        String str;
        if (dVar instanceof i.a.i2.e) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + M(dVar);
        } catch (Throwable th) {
            str = y(th);
        }
        Throwable a2 = h.g.a(str);
        String str2 = str;
        if (a2 != null) {
            str2 = ((Object) dVar.getClass().getName()) + '@' + M(dVar);
        }
        return (String) str2;
    }

    public static long G(long j2, long j3) {
        return j2 >= 0 ? j2 / j3 : ((j2 + 1) / j3) - 1;
    }

    public static final Double G0(String str) {
        h.o.c.j.e(str, "<this>");
        try {
            h.t.c cVar = h.t.d.a;
            Objects.requireNonNull(cVar);
            h.o.c.j.e(str, "input");
            if (cVar.a.matcher(str).matches()) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static int H(long j2, int i2) {
        long j3 = i2;
        return (int) (((j2 % j3) + j3) % j3);
    }

    public static final <T> List<T> H0(h.s.b<? extends T> bVar) {
        h.o.c.j.e(bVar, "<this>");
        h.o.c.j.e(bVar, "<this>");
        ArrayList arrayList = new ArrayList();
        h.o.c.j.e(bVar, "<this>");
        h.o.c.j.e(arrayList, "destination");
        for (T t : bVar) {
            arrayList.add(t);
        }
        return h.l.c.f(arrayList);
    }

    public static long I(long j2, long j3) {
        return ((j2 % j3) + j3) % j3;
    }

    public static final <T> Object I0(Object obj, h.o.b.l<? super Throwable, h.k> lVar) {
        Throwable a2 = h.g.a(obj);
        return a2 == null ? lVar != null ? new i.a.x(obj, lVar) : obj : new i.a.w(a2, false, 2);
    }

    public static final String J(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final <T> Object J0(h.m.f fVar, h.o.b.p<? super e0, ? super h.m.d<? super T>, ? extends Object> pVar, h.m.d<? super T> dVar) {
        Object g0;
        h.m.f context = dVar.getContext();
        h.m.f plus = context.plus(fVar);
        A(plus);
        if (plus == context) {
            i.a.i2.o oVar = new i.a.i2.o(plus, dVar);
            g0 = y0(oVar, oVar, pVar);
        } else {
            int i2 = h.m.e.R;
            e.a aVar = e.a.a;
            if (h.o.c.j.a(plus.get(aVar), context.get(aVar))) {
                c2 c2Var = new c2(plus, dVar);
                Object b2 = i.a.i2.s.b(plus, null);
                try {
                    Object y0 = y0(c2Var, c2Var, pVar);
                    i.a.i2.s.a(plus, b2);
                    g0 = y0;
                } catch (Throwable th) {
                    i.a.i2.s.a(plus, b2);
                    throw th;
                }
            } else {
                m0 m0Var = new m0(plus, dVar);
                x0(pVar, m0Var, m0Var, null, 4);
                g0 = m0Var.g0();
            }
        }
        if (g0 == h.m.h.a.COROUTINE_SUSPENDED) {
            h.o.c.j.e(dVar, "frame");
        }
        return g0;
    }

    public static final int K(Activity activity) {
        h.o.c.j.e(activity, "<this>");
        if (activity instanceof e.j.d.c0.h) {
            return ((e.j.d.c0.h) activity).a();
        }
        return -1;
    }

    public static void K0(Object obj, Writer writer) throws IOException {
        if (obj == null) {
            writer.write("null");
        } else if (obj instanceof String) {
            writer.write(34);
            writer.write(D((String) obj));
            writer.write(34);
        } else if (obj instanceof Double) {
            Double d2 = (Double) obj;
            if (d2.isInfinite() || d2.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Float) {
            Float f2 = (Float) obj;
            if (f2.isInfinite() || f2.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Number) {
            writer.write(obj.toString());
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof l.a.a.d) {
            ((l.a.a.d) obj).a(writer);
        } else if (obj instanceof l.a.a.b) {
            writer.write(((l.a.a.b) obj).b());
        } else if (obj instanceof Map) {
            l.a.a.c.f((Map) obj, writer);
        } else if (obj instanceof Collection) {
            l.a.a.a.f((Collection) obj, writer);
        } else {
            int i2 = 1;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int i3 = l.a.a.a.a;
                if (bArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf((int) bArr[0]));
                while (i2 < bArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf((int) bArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int i4 = l.a.a.a.a;
                if (sArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf((int) sArr[0]));
                while (i2 < sArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf((int) sArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int i5 = l.a.a.a.a;
                if (iArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf(iArr[0]));
                while (i2 < iArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf(iArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int i6 = l.a.a.a.a;
                if (jArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf(jArr[0]));
                while (i2 < jArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf(jArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int i7 = l.a.a.a.a;
                if (fArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf(fArr[0]));
                while (i2 < fArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf(fArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int i8 = l.a.a.a.a;
                if (dArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf(dArr[0]));
                while (i2 < dArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf(dArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int i9 = l.a.a.a.a;
                if (zArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                writer.write(String.valueOf(zArr[0]));
                while (i2 < zArr.length) {
                    writer.write(",");
                    writer.write(String.valueOf(zArr[i2]));
                    i2++;
                }
                writer.write("]");
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int i10 = l.a.a.a.a;
                if (cArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[\"");
                writer.write(String.valueOf(cArr[0]));
                while (i2 < cArr.length) {
                    writer.write("\",\"");
                    writer.write(String.valueOf(cArr[i2]));
                    i2++;
                }
                writer.write("\"]");
            } else if (!(obj instanceof Object[])) {
                writer.write(obj.toString());
            } else {
                Object[] objArr = (Object[]) obj;
                int i11 = l.a.a.a.a;
                if (objArr.length == 0) {
                    writer.write("[]");
                    return;
                }
                writer.write("[");
                K0(objArr[0], writer);
                while (i2 < objArr.length) {
                    writer.write(",");
                    K0(objArr[i2], writer);
                    i2++;
                }
                writer.write("]");
            }
        }
    }

    public static final l0 L(h.m.f fVar) {
        int i2 = h.m.e.R;
        f.a aVar = fVar.get(e.a.a);
        l0 l0Var = aVar instanceof l0 ? (l0) aVar : null;
        return l0Var == null ? i0.a : l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(java.lang.Exception r8, h.m.d<?> r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.w.L0(java.lang.Exception, h.m.d):java.lang.Object");
    }

    public static final String M(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final <T> Class<T> N(h.r.b<T> bVar) {
        h.o.c.j.e(bVar, "<this>");
        Class<T> cls = (Class<T>) ((h.o.c.c) bVar).a();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? cls : Double.class;
                case 104431:
                    return !name.equals("int") ? cls : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? cls : Byte.class;
                case 3052374:
                    return !name.equals("char") ? cls : Character.class;
                case 3327612:
                    return !name.equals("long") ? cls : Long.class;
                case 3625364:
                    return !name.equals("void") ? cls : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? cls : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? cls : Float.class;
                case 109413500:
                    return !name.equals("short") ? cls : Short.class;
                default:
                    return cls;
            }
        }
        return cls;
    }

    public static final void O(h.m.f fVar, Throwable th) {
        try {
            int i2 = CoroutineExceptionHandler.S;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.a.a);
            if (coroutineExceptionHandler == null) {
                d0.a(fVar, th);
            } else {
                coroutineExceptionHandler.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                f(runtimeException, th);
                th = runtimeException;
            }
            d0.a(fVar, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h.m.d<T> P(h.m.d<? super T> dVar) {
        h.o.c.j.e(dVar, "<this>");
        h.m.i.a.c cVar = dVar instanceof h.m.i.a.c ? (h.m.i.a.c) dVar : null;
        return cVar == null ? dVar : (h.m.d<T>) cVar.intercepted();
    }

    public static /* synthetic */ p0 Q(g1 g1Var, boolean z, boolean z2, h.o.b.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return g1Var.u(z, z2, lVar);
    }

    public static p0 R(long j2, Runnable runnable, h.m.f fVar) {
        return i0.a.H(j2, runnable, fVar);
    }

    public static final boolean S(AssertionError assertionError) {
        Logger logger = k.o.a;
        h.o.c.j.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message == null ? false : h.t.g.a(message, "getsockname failed", false, 2);
        }
        return false;
    }

    public static final boolean T(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean U(e.a.a.a.j jVar) {
        h.o.c.j.e(jVar, "<this>");
        return jVar.a == 0;
    }

    public static final boolean V(e.a.a.a.s sVar) {
        h.o.c.j.e(sVar, "<this>");
        if (sVar.a.a == 0) {
            List<SkuDetails> list = sVar.f5018b;
            return !(list == null || list.isEmpty());
        }
        return false;
    }

    public static final <T> boolean W(a0<? extends T> a0Var) {
        h.o.c.j.e(a0Var, "<this>");
        return a0Var instanceof a0.c;
    }

    public static final boolean X(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static g1 Y(e0 e0Var, h.m.f fVar, f0 f0Var, h.o.b.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = h.m.g.a;
        }
        f0 f0Var2 = (i2 & 2) != 0 ? f0.DEFAULT : null;
        h.m.f a2 = i.a.a0.a(e0Var, fVar);
        g1 o1Var = f0Var2.isLazy() ? new o1(a2, pVar) : new v1(a2, true);
        f0Var2.invoke(pVar, o1Var, o1Var);
        return o1Var;
    }

    public static final <T> h.d<T> Z(h.o.b.a<? extends T> aVar) {
        h.o.c.j.e(aVar, "initializer");
        return new h.h(aVar, null, 2);
    }

    public static i.a.s a(g1 g1Var, int i2) {
        int i3 = i2 & 1;
        return new i.a.t(null);
    }

    public static final <T> List<T> a0(T t) {
        List<T> singletonList = Collections.singletonList(t);
        h.o.c.j.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final e0 b(h.m.f fVar) {
        int i2 = g1.T;
        if (fVar.get(g1.a.a) == null) {
            fVar = fVar.plus(c(null, 1, null));
        }
        return new i.a.i2.d(fVar);
    }

    public static final int b0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static i.a.u c(g1 g1Var, int i2, Object obj) {
        int i3 = i2 & 1;
        return new j1(null);
    }

    public static final int c0(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static final void d(h.m.d dVar, Throwable th) {
        dVar.resumeWith(y(th));
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> a0<T> d0(a0<? extends T> a0Var, h.o.b.l<? super a0.b, h.k> lVar) {
        h.o.c.j.e(a0Var, "<this>");
        h.o.c.j.e(lVar, "action");
        if (!(a0Var instanceof a0.c)) {
            if (!(a0Var instanceof a0.b)) {
                throw new h.e();
            }
            lVar.invoke((a0.b) a0Var);
        }
        return a0Var;
    }

    public static final <T> boolean e(Collection<? super T> collection, Iterable<? extends T> iterable) {
        h.o.c.j.e(collection, "<this>");
        h.o.c.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static void e0(Throwable th) {
        f.a.g.b<? super Throwable> bVar = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof f.a.f.a)) {
                z = false;
            }
            if (!z) {
                th = new f.a.f.c(th);
            }
        }
        if (bVar != null) {
            try {
                bVar.a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void f(Throwable th, Throwable th2) {
        h.o.c.j.e(th, "<this>");
        h.o.c.j.e(th2, "exception");
        if (th != th2) {
            h.n.b.a.a(th, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> a0<T> f0(a0<? extends T> a0Var, h.o.b.l<? super T, h.k> lVar) {
        h.o.c.j.e(a0Var, "<this>");
        h.o.c.j.e(lVar, "action");
        if (a0Var instanceof a0.c) {
            lVar.invoke((T) ((a0.c) a0Var).f8619b);
        } else if (!(a0Var instanceof a0.b)) {
            throw new h.e();
        }
        return a0Var;
    }

    public static final <T> h.s.b<T> g(Iterator<? extends T> it) {
        h.o.c.j.e(it, "<this>");
        f fVar = new f(it);
        h.o.c.j.e(fVar, "<this>");
        return fVar instanceof h.s.a ? fVar : new h.s.a(fVar);
    }

    public static boolean g0(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final <T> i.a.h2.r<T> h(i.a.h2.k<T> kVar) {
        return new i.a.h2.m(kVar, null);
    }

    public static h.m.f h0(h.m.f fVar, h.m.f fVar2) {
        h.o.c.j.e(fVar, "this");
        h.o.c.j.e(fVar2, CoreConstants.CONTEXT_SCOPE_VALUE);
        return fVar2 == h.m.g.a ? fVar : (h.m.f) fVar2.fold(fVar, a.a);
    }

    public static j0 i(e0 e0Var, h.m.f fVar, f0 f0Var, h.o.b.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = h.m.g.a;
        }
        f0 f0Var2 = (i2 & 2) != 0 ? f0.DEFAULT : null;
        h.m.f a2 = i.a.a0.a(e0Var, fVar);
        j0 n1Var = f0Var2.isLazy() ? new n1(a2, pVar) : new k0(a2, true);
        f0Var2.invoke(pVar, n1Var, n1Var);
        return n1Var;
    }

    public static final <T> Object i0(Object obj, h.m.d<? super T> dVar) {
        return obj instanceof i.a.w ? y(((i.a.w) obj).f9177b) : obj;
    }

    public static final <T> Object j(j0<? extends T>[] j0VarArr, h.m.d<? super List<? extends T>> dVar) {
        if (j0VarArr.length == 0) {
            return h.l.e.a;
        }
        i.a.e eVar = new i.a.e(j0VarArr);
        i.a.k kVar = new i.a.k(P(dVar), 1);
        kVar.p();
        int length = j0VarArr.length;
        e.a[] aVarArr = new e.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            j0<T> j0Var = eVar.f8973b[i2];
            j0Var.start();
            e.a aVar = new e.a(kVar);
            aVar.f8975f = j0Var.I(aVar);
            aVarArr[i2] = aVar;
        }
        i.a.e<T>.b bVar = new e.b(eVar, aVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            aVarArr[i3].q(bVar);
        }
        if (kVar.s()) {
            bVar.b();
        } else {
            kVar.r(bVar);
        }
        Object o = kVar.o();
        if (o == h.m.h.a.COROUTINE_SUSPENDED) {
            h.o.c.j.e(dVar, "frame");
        }
        return o;
    }

    public static String j0(j.s sVar) {
        String f2 = sVar.f();
        String h2 = sVar.h();
        if (h2 != null) {
            return f2 + '?' + h2;
        }
        return f2;
    }

    public static final k.f k(k.v vVar) {
        h.o.c.j.e(vVar, "<this>");
        return new k.q(vVar);
    }

    public static <T> T k0(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(e.a.d.a.a.k(str, " must not be null"));
    }

    public static final k.g l(k.x xVar) {
        h.o.c.j.e(xVar, "<this>");
        return new k.r(xVar);
    }

    public static final <T> void l0(n0<? super T> n0Var, h.m.d<? super T> dVar, boolean z) {
        Object g2 = n0Var.g();
        Throwable d2 = n0Var.d(g2);
        Object y = d2 != null ? y(d2) : n0Var.e(g2);
        if (!z) {
            dVar.resumeWith(y);
            return;
        }
        i.a.i2.e eVar = (i.a.i2.e) dVar;
        h.m.d<T> dVar2 = eVar.f9062f;
        Object obj = eVar.f9064h;
        h.m.f context = dVar2.getContext();
        Object b2 = i.a.i2.s.b(context, obj);
        c2<?> b3 = b2 != i.a.i2.s.a ? i.a.a0.b(dVar2, context, b2) : null;
        try {
            eVar.f9062f.resumeWith(y);
        } finally {
            if (b3 == null || b3.g0()) {
                i.a.i2.s.a(context, b2);
            }
        }
    }

    public static void m(h.m.f fVar, CancellationException cancellationException, int i2, Object obj) {
        int i3 = i2 & 1;
        int i4 = g1.T;
        g1 g1Var = (g1) fVar.get(g1.a.a);
        if (g1Var == null) {
            return;
        }
        g1Var.W(null);
    }

    public static int m0(int i2, int i3) {
        int i4 = i2 + i3;
        if ((i2 ^ i4) >= 0 || (i2 ^ i3) < 0) {
            return i4;
        }
        throw new ArithmeticException(e.a.d.a.a.g("Addition overflows an int: ", i2, " + ", i3));
    }

    public static /* synthetic */ void n(g1 g1Var, CancellationException cancellationException, int i2, Object obj) {
        int i3 = i2 & 1;
        g1Var.W(null);
    }

    public static long n0(long j2, long j3) {
        long j4 = j2 + j3;
        if ((j2 ^ j4) >= 0 || (j2 ^ j3) < 0) {
            return j4;
        }
        throw new ArithmeticException("Addition overflows a long: " + j2 + " + " + j3);
    }

    public static final int o(int i2) {
        boolean z = false;
        if (2 <= i2 && i2 < 37) {
            z = true;
        }
        if (z) {
            return i2;
        }
        StringBuilder z2 = e.a.d.a.a.z("radix ", i2, " was not in valid range ");
        z2.append(new h.q.c(2, 36));
        throw new IllegalArgumentException(z2.toString());
    }

    public static int o0(int i2, int i3) {
        long j2 = i2 * i3;
        if (j2 < -2147483648L || j2 > 2147483647L) {
            throw new ArithmeticException(e.a.d.a.a.g("Multiplication overflows an int: ", i2, " * ", i3));
        }
        return (int) j2;
    }

    public static final void p(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            f(th, th2);
        }
    }

    public static long p0(long j2, int i2) {
        if (i2 == -1) {
            if (j2 != Long.MIN_VALUE) {
                return -j2;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i2);
        } else if (i2 != 0) {
            if (i2 != 1) {
                long j3 = i2;
                long j4 = j2 * j3;
                if (j4 / j3 == j2) {
                    return j4;
                }
                throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + i2);
            }
            return j2;
        } else {
            return 0L;
        }
    }

    public static final long q(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static long q0(long j2, long j3) {
        if (j3 == 1) {
            return j2;
        }
        if (j2 == 1) {
            return j3;
        }
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        long j4 = j2 * j3;
        if (j4 / j3 != j2 || ((j2 == Long.MIN_VALUE && j3 == -1) || (j3 == Long.MIN_VALUE && j2 == -1))) {
            throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + j3);
        }
        return j4;
    }

    public static final int r(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + CoreConstants.DOT);
    }

    public static long r0(long j2, long j3) {
        long j4 = j2 - j3;
        if ((j2 ^ j4) >= 0 || (j2 ^ j3) >= 0) {
            return j4;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j2 + " - " + j3);
    }

    public static final <T> int s(Iterable<? extends T> iterable, int i2) {
        h.o.c.j.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static int s0(long j2) {
        if (j2 > 2147483647L || j2 < -2147483648L) {
            throw new ArithmeticException(e.a.d.a.a.h("Calculation overflows an int: ", j2));
        }
        return (int) j2;
    }

    public static int t(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    public static final int t0(k.u uVar, int i2) {
        int i3;
        h.o.c.j.e(uVar, "<this>");
        int[] iArr = uVar.f9649g;
        int i4 = i2 + 1;
        int length = uVar.f9648f.length;
        h.o.c.j.e(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : i3 ^ (-1);
    }

    public static int u(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    public static final char u0(char[] cArr) {
        h.o.c.j.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <R> Object v(h.o.b.p<? super e0, ? super h.m.d<? super R>, ? extends Object> pVar, h.m.d<? super R> dVar) {
        i.a.i2.o oVar = new i.a.i2.o(dVar.getContext(), dVar);
        Object y0 = y0(oVar, oVar, pVar);
        if (y0 == h.m.h.a.COROUTINE_SUSPENDED) {
            h.o.c.j.e(dVar, "frame");
        }
        return y0;
    }

    public static final k.v v0(Socket socket) throws IOException {
        Logger logger = k.o.a;
        h.o.c.j.e(socket, "<this>");
        k.w wVar = new k.w(socket);
        OutputStream outputStream = socket.getOutputStream();
        h.o.c.j.d(outputStream, "getOutputStream()");
        k.p pVar = new k.p(outputStream, wVar);
        h.o.c.j.e(pVar, "sink");
        return new k.b(wVar, pVar);
    }

    public static final <T> h.m.d<h.k> w(h.o.b.l<? super h.m.d<? super T>, ? extends Object> lVar, h.m.d<? super T> dVar) {
        h.o.c.j.e(lVar, "<this>");
        h.o.c.j.e(dVar, "completion");
        h.o.c.j.e(dVar, "completion");
        if (lVar instanceof h.m.i.a.a) {
            return ((h.m.i.a.a) lVar).create(dVar);
        }
        h.m.f context = dVar.getContext();
        return context == h.m.g.a ? new b(dVar, lVar) : new c(dVar, context, lVar);
    }

    public static final k.x w0(Socket socket) throws IOException {
        Logger logger = k.o.a;
        h.o.c.j.e(socket, "<this>");
        k.w wVar = new k.w(socket);
        InputStream inputStream = socket.getInputStream();
        h.o.c.j.d(inputStream, "getInputStream()");
        k.n nVar = new k.n(inputStream, wVar);
        h.o.c.j.e(nVar, "source");
        return new k.c(wVar, nVar);
    }

    public static final <R, T> h.m.d<h.k> x(h.o.b.p<? super R, ? super h.m.d<? super T>, ? extends Object> pVar, R r, h.m.d<? super T> dVar) {
        h.o.c.j.e(pVar, "<this>");
        h.o.c.j.e(dVar, "completion");
        h.o.c.j.e(dVar, "completion");
        if (pVar instanceof h.m.i.a.a) {
            return ((h.m.i.a.a) pVar).create(r, dVar);
        }
        h.m.f context = dVar.getContext();
        return context == h.m.g.a ? new d(dVar, pVar, r) : new e(dVar, context, pVar, r);
    }

    public static void x0(h.o.b.p pVar, Object obj, h.m.d dVar, h.o.b.l lVar, int i2) {
        int i3 = i2 & 4;
        try {
            i.a.i2.f.a(P(x(pVar, obj, dVar)), h.k.a, null);
        } catch (Throwable th) {
            d(dVar, th);
            throw null;
        }
    }

    public static final Object y(Throwable th) {
        h.o.c.j.e(th, "exception");
        return new g.a(th);
    }

    public static final <T, R> Object y0(i.a.i2.o<? super T> oVar, R r, h.o.b.p<? super R, ? super h.m.d<? super T>, ? extends Object> pVar) {
        Object wVar;
        Object H;
        try {
        } catch (Throwable th) {
            wVar = new i.a.w(th, false, 2);
        }
        if (pVar != null) {
            h.o.c.t.a(pVar, 2);
            wVar = pVar.i(r, oVar);
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            if (wVar == aVar || (H = oVar.H(wVar)) == m1.f9146b) {
                return aVar;
            }
            if (H instanceof i.a.w) {
                throw ((i.a.w) H).f9177b;
            }
            return m1.a(H);
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final Object z(long j2, h.m.d<? super h.k> dVar) {
        if (j2 <= 0) {
            return h.k.a;
        }
        i.a.k kVar = new i.a.k(P(dVar), 1);
        kVar.p();
        if (j2 < Long.MAX_VALUE) {
            L(kVar.f9094g).m(j2, kVar);
        }
        Object o = kVar.o();
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        if (o == aVar) {
            h.o.c.j.e(dVar, "frame");
        }
        return o == aVar ? o : h.k.a;
    }

    public static final long z0(String str, long j2, long j3, long j4) {
        String A0 = A0(str);
        if (A0 == null) {
            return j2;
        }
        Long u = h.t.g.u(A0);
        if (u == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + A0 + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        long longValue = u.longValue();
        boolean z = false;
        if (j3 <= longValue && longValue <= j4) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        e.a.d.a.a.K(sb, CallerDataConverter.DEFAULT_RANGE_DELIMITER, j4, ", but is '");
        sb.append(longValue);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new IllegalStateException(sb.toString().toString());
    }
}
