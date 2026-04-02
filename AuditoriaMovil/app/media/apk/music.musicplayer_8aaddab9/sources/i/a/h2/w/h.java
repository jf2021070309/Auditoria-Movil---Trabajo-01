package i.a.h2.w;

import e.j.d.w;
import h.k;
import h.m.f;
import h.o.b.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class h<T> extends h.m.i.a.c implements i.a.h2.c<T>, h.m.i.a.d {
    public final i.a.h2.c<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final h.m.f f9053b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9054c;

    /* renamed from: d  reason: collision with root package name */
    public h.m.f f9055d;

    /* renamed from: e  reason: collision with root package name */
    public h.m.d<? super k> f9056e;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements p<Integer, f.a, Integer> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // h.o.b.p
        public Integer i(Integer num, f.a aVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    public h(i.a.h2.c<? super T> cVar, h.m.f fVar) {
        super(f.a, h.m.g.a);
        this.a = null;
        this.f9053b = fVar;
        this.f9054c = ((Number) fVar.fold(0, a.a)).intValue();
    }

    @Override // i.a.h2.c
    public Object b(T t, h.m.d<? super k> dVar) {
        try {
            Object t2 = t(dVar, t);
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            if (t2 == aVar) {
                h.o.c.j.e(dVar, "frame");
            }
            return t2 == aVar ? t2 : k.a;
        } catch (Throwable th) {
            this.f9055d = new e(th);
            throw th;
        }
    }

    @Override // h.m.i.a.a, h.m.i.a.d
    public h.m.i.a.d getCallerFrame() {
        h.m.d<? super k> dVar = this.f9056e;
        if (dVar instanceof h.m.i.a.d) {
            return (h.m.i.a.d) dVar;
        }
        return null;
    }

    @Override // h.m.i.a.c, h.m.d
    public h.m.f getContext() {
        h.m.d<? super k> dVar = this.f9056e;
        h.m.f context = dVar == null ? null : dVar.getContext();
        return context == null ? h.m.g.a : context;
    }

    @Override // h.m.i.a.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h.m.i.a.a
    public Object invokeSuspend(Object obj) {
        Throwable a2 = h.g.a(obj);
        if (a2 != null) {
            this.f9055d = new e(a2);
        }
        h.m.d<? super k> dVar = this.f9056e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return h.m.h.a.COROUTINE_SUSPENDED;
    }

    @Override // h.m.i.a.c, h.m.i.a.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    public final Object t(h.m.d<? super k> dVar, T t) {
        Comparable comparable;
        String str;
        h.m.f context = dVar.getContext();
        w.A(context);
        h.m.f fVar = this.f9055d;
        if (fVar != context) {
            int i2 = 0;
            if (fVar instanceof e) {
                StringBuilder y = e.a.d.a.a.y("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                y.append(((e) fVar).f9052b);
                y.append(", but then emission attempt of value '");
                y.append(t);
                y.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                String sb = y.toString();
                h.o.c.j.e(sb, "<this>");
                h.o.c.j.e(sb, "<this>");
                h.o.c.j.e("", "newIndent");
                h.o.c.j.e(sb, "<this>");
                h.o.c.j.e(sb, "<this>");
                String[] strArr = {"\r\n", "\n", "\r"};
                h.o.c.j.e(sb, "<this>");
                h.o.c.j.e(strArr, "delimiters");
                h.s.b k2 = h.t.g.k(sb, strArr, 0, false, 0, 2);
                h.t.i iVar = new h.t.i(sb);
                h.o.c.j.e(k2, "<this>");
                h.o.c.j.e(iVar, "transform");
                List H0 = w.H0(new h.s.d(k2, iVar));
                ArrayList arrayList = new ArrayList();
                for (T t2 : H0) {
                    if (true ^ h.t.g.i((String) t2)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int length = str2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        int i4 = i3 + 1;
                        if (!w.X(str2.charAt(i3))) {
                            break;
                        }
                        i3 = i4;
                    }
                    if (i3 == -1) {
                        i3 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(i3));
                }
                h.o.c.j.e(arrayList2, "<this>");
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num == null ? 0 : num.intValue();
                int size = (H0.size() * 0) + sb.length();
                h.t.f fVar2 = h.t.f.a;
                h.o.c.j.e(H0, "<this>");
                int size2 = H0.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                int i5 = 0;
                for (T t3 : H0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        h.l.c.h();
                        throw null;
                    }
                    String str3 = (String) t3;
                    if ((i5 == 0 || i5 == size2) && h.t.g.i(str3)) {
                        str = null;
                    } else {
                        h.o.c.j.e(str3, "<this>");
                        if (!(intValue >= 0)) {
                            throw new IllegalArgumentException(e.a.d.a.a.f("Requested character count ", intValue, " is less than zero.").toString());
                        }
                        int length2 = str3.length();
                        if (intValue <= length2) {
                            length2 = intValue;
                        }
                        String substring = str3.substring(length2);
                        h.o.c.j.d(substring, "this as java.lang.String).substring(startIndex)");
                        str = (String) fVar2.invoke(substring);
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i5 = i6;
                }
                StringBuilder sb2 = new StringBuilder(size);
                h.o.c.j.e(arrayList3, "<this>");
                h.o.c.j.e(sb2, "buffer");
                h.o.c.j.e("\n", "separator");
                h.o.c.j.e("", "prefix");
                h.o.c.j.e("", "postfix");
                h.o.c.j.e("...", "truncated");
                sb2.append((CharSequence) "");
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    i2++;
                    if (i2 > 1) {
                        sb2.append((CharSequence) "\n");
                    }
                    h.o.c.j.e(sb2, "<this>");
                    if (next == null ? true : next instanceof CharSequence) {
                        sb2.append((CharSequence) next);
                    } else if (next instanceof Character) {
                        sb2.append(((Character) next).charValue());
                    } else {
                        sb2.append((CharSequence) String.valueOf(next));
                    }
                }
                sb2.append((CharSequence) "");
                String sb3 = sb2.toString();
                h.o.c.j.d(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                throw new IllegalStateException(sb3.toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() != this.f9054c) {
                StringBuilder y2 = e.a.d.a.a.y("Flow invariant is violated:\n\t\tFlow was collected in ");
                y2.append(this.f9053b);
                y2.append(",\n\t\tbut emission happened in ");
                y2.append(context);
                y2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(y2.toString().toString());
            } else {
                this.f9055d = context;
            }
        }
        this.f9056e = dVar;
        return i.a.f(this.a, t, this);
    }
}
