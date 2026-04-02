package e.d.e.c0.z;

import ch.qos.logback.core.net.SyslogConstants;
import e.d.e.a0;
import e.d.e.c0.t;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class j implements a0 {
    public final e.d.e.c0.g a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.e.d f7859b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.e.c0.o f7860c;

    /* renamed from: d  reason: collision with root package name */
    public final d f7861d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.e.c0.a0.b f7862e = e.d.e.c0.a0.b.a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends z<T> {
        public final t<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f7863b;

        public a(t<T> tVar, Map<String, b> map) {
            this.a = tVar;
            this.f7863b = map;
        }

        @Override // e.d.e.z
        public T a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            T a = this.a.a();
            try {
                aVar.f();
                while (aVar.y()) {
                    b bVar = this.f7863b.get(aVar.Q());
                    if (bVar != null && bVar.f7865c) {
                        bVar.a(aVar, a);
                    }
                    aVar.l0();
                }
                aVar.r();
                return a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new w(e3);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.y();
                return;
            }
            cVar.h();
            try {
                for (b bVar : this.f7863b.values()) {
                    if (bVar.c(t)) {
                        cVar.u(bVar.a);
                        bVar.b(cVar, t);
                    }
                }
                cVar.r();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7864b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7865c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.f7864b = z;
            this.f7865c = z2;
        }

        public abstract void a(e.d.e.e0.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(e.d.e.e0.c cVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public j(e.d.e.c0.g gVar, e.d.e.d dVar, e.d.e.c0.o oVar, d dVar2) {
        this.a = gVar;
        this.f7859b = dVar;
        this.f7860c = oVar;
        this.f7861d = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // e.d.e.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> e.d.e.z<T> a(e.d.e.j r35, e.d.e.d0.a<T> r36) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.c0.z.j.a(e.d.e.j, e.d.e.d0.a):e.d.e.z");
    }

    public boolean b(Field field, boolean z) {
        boolean z2;
        e.d.e.c0.o oVar = this.f7860c;
        Class<?> type = field.getType();
        if (!(oVar.c(type) || oVar.b(type, z))) {
            if ((field.getModifiers() & SyslogConstants.LOG_LOCAL1) != 0 || field.isSynthetic() || oVar.c(field.getType())) {
                z2 = true;
                break;
            }
            List<e.d.e.a> list = z ? oVar.f7815b : oVar.f7816c;
            if (!list.isEmpty()) {
                e.d.e.b bVar = new e.d.e.b(field);
                for (e.d.e.a aVar : list) {
                    if (aVar.a(bVar)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
