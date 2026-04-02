package e.d.d.m.j.j;

import android.content.Context;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class b0 {
    public static final Map<String, Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f7148b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7149c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f7150d;

    /* renamed from: e  reason: collision with root package name */
    public final h f7151e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.m.j.q.d f7152f;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f7148b = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.8");
    }

    public b0(Context context, i0 i0Var, h hVar, e.d.d.m.j.q.d dVar) {
        this.f7149c = context;
        this.f7150d = i0Var;
        this.f7151e = hVar;
        this.f7152f = dVar;
    }

    public final e.d.d.m.j.l.b0<a0.e.d.a.b.AbstractC0154a> a() {
        a0.e.d.a.b.AbstractC0154a[] abstractC0154aArr = new a0.e.d.a.b.AbstractC0154a[1];
        Long l2 = 0L;
        Long l3 = 0L;
        String str = this.f7151e.f7167d;
        Objects.requireNonNull(str, "Null name");
        String str2 = this.f7151e.f7165b;
        String str3 = l2 == null ? " baseAddress" : "";
        if (l3 == null) {
            str3 = e.a.d.a.a.k(str3, " size");
        }
        if (str3.isEmpty()) {
            abstractC0154aArr[0] = new e.d.d.m.j.l.n(l2.longValue(), l3.longValue(), str, str2, null);
            return new e.d.d.m.j.l.b0<>(Arrays.asList(abstractC0154aArr));
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e.d.d.m.j.l.a0.e.d.c b(int r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.j.b0.b(int):e.d.d.m.j.l.a0$e$d$c");
    }

    public final a0.e.d.a.b.AbstractC0155b c(e.d.d.m.j.q.e eVar, int i2, int i3, int i4) {
        String str = eVar.f7538b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.f7539c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e.d.d.m.j.q.e eVar2 = eVar.f7540d;
        if (i4 >= i3) {
            e.d.d.m.j.q.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f7540d;
                i5++;
            }
        }
        a0.e.d.a.b.AbstractC0155b abstractC0155b = null;
        Objects.requireNonNull(str, "Null type");
        e.d.d.m.j.l.b0 b0Var = new e.d.d.m.j.l.b0(d(stackTraceElementArr, i2));
        Integer valueOf = Integer.valueOf(i5);
        if (eVar2 != null && i5 == 0) {
            abstractC0155b = c(eVar2, i2, i3, i4 + 1);
        }
        String str3 = valueOf == null ? " overflowCount" : "";
        if (str3.isEmpty()) {
            return new e.d.d.m.j.l.o(str, str2, b0Var, abstractC0155b, valueOf.intValue(), null);
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str3));
    }

    public final e.d.d.m.j.l.b0<a0.e.d.a.b.AbstractC0156d.AbstractC0157a> d(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            r.b bVar = new r.b();
            bVar.f7466e = Integer.valueOf(i2);
            long j2 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = stackTraceElement.getLineNumber();
            }
            bVar.a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            bVar.f7463b = str;
            bVar.f7464c = fileName;
            bVar.f7465d = Long.valueOf(j2);
            arrayList.add(bVar.a());
        }
        return new e.d.d.m.j.l.b0<>(arrayList);
    }

    public final a0.e.d.a.b.c e() {
        Long l2 = 0L;
        String str = l2 == null ? " address" : "";
        if (str.isEmpty()) {
            return new e.d.d.m.j.l.p("0", "0", l2.longValue(), null);
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
    }

    public final a0.e.d.a.b.AbstractC0156d f(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        Integer valueOf = Integer.valueOf(i2);
        e.d.d.m.j.l.b0 b0Var = new e.d.d.m.j.l.b0(d(stackTraceElementArr, i2));
        String str = valueOf == null ? " importance" : "";
        if (str.isEmpty()) {
            return new e.d.d.m.j.l.q(name, valueOf.intValue(), b0Var, null);
        }
        throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
    }
}
