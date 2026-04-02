package l.a.a.e;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class b {
    public d a = new d(null);

    /* renamed from: b  reason: collision with root package name */
    public int f9654b = 0;

    /* renamed from: c  reason: collision with root package name */
    public e f9655c = null;

    public final List a(a aVar) {
        List b2;
        return (aVar == null || (b2 = aVar.b()) == null) ? new l.a.a.a() : b2;
    }

    public final Map b(a aVar) {
        Map a;
        return (aVar == null || (a = aVar.a()) == null) ? new l.a.a.c() : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01db, code lost:
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
        r19.f9655c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f3, code lost:
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f5, code lost:
        r19.f9655c = new l.a.a.e.e(r13, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws l.a.a.e.c, java.io.IOException {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.e.b.c():void");
    }

    public Object d(Reader reader, a aVar) throws IOException, c {
        d dVar = this.a;
        dVar.p = reader;
        dVar.f9666j = false;
        dVar.q = 0;
        dVar.f9669m = 0;
        dVar.o = 0;
        dVar.f9668l = 0;
        dVar.f9665i = 0;
        dVar.f9670n = 0;
        this.f9655c = null;
        this.f9654b = 0;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            try {
                c();
                int i2 = this.f9654b;
                if (i2 == -1) {
                    throw new c(this.a.f9665i, 1, this.f9655c);
                }
                if (i2 == 0) {
                    int i3 = this.f9655c.a;
                    if (i3 == 0) {
                        this.f9654b = 1;
                        linkedList.addFirst(1);
                        linkedList2.addFirst(this.f9655c.f9671b);
                    } else if (i3 == 1) {
                        this.f9654b = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(b(aVar));
                    } else if (i3 != 3) {
                        this.f9654b = -1;
                    } else {
                        this.f9654b = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(a(aVar));
                    }
                } else if (i2 == 1) {
                    if (this.f9655c.a == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new c(this.a.f9665i, 1, this.f9655c);
                } else if (i2 == 2) {
                    e eVar = this.f9655c;
                    int i4 = eVar.a;
                    if (i4 == 0) {
                        Object obj = eVar.f9671b;
                        if (obj instanceof String) {
                            linkedList2.addFirst((String) obj);
                            this.f9654b = 4;
                            linkedList.addFirst(4);
                        } else {
                            this.f9654b = -1;
                        }
                    } else if (i4 != 2) {
                        if (i4 != 5) {
                            this.f9654b = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.f9654b = f(linkedList);
                    } else {
                        this.f9654b = 1;
                    }
                } else if (i2 == 3) {
                    int i5 = this.f9655c.a;
                    if (i5 == 0) {
                        ((List) linkedList2.getFirst()).add(this.f9655c.f9671b);
                    } else if (i5 == 1) {
                        Map b2 = b(aVar);
                        ((List) linkedList2.getFirst()).add(b2);
                        this.f9654b = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(b2);
                    } else if (i5 == 3) {
                        List a = a(aVar);
                        ((List) linkedList2.getFirst()).add(a);
                        this.f9654b = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(a);
                    } else if (i5 != 4) {
                        if (i5 != 5) {
                            this.f9654b = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.f9654b = f(linkedList);
                    } else {
                        this.f9654b = 1;
                    }
                } else if (i2 == 4) {
                    int i6 = this.f9655c.a;
                    if (i6 == 0) {
                        linkedList.removeFirst();
                        ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.f9655c.f9671b);
                        this.f9654b = f(linkedList);
                    } else if (i6 == 1) {
                        linkedList.removeFirst();
                        Map map = (Map) linkedList2.getFirst();
                        Map b3 = b(aVar);
                        map.put((String) linkedList2.removeFirst(), b3);
                        this.f9654b = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(b3);
                    } else if (i6 == 3) {
                        linkedList.removeFirst();
                        Map map2 = (Map) linkedList2.getFirst();
                        List a2 = a(aVar);
                        map2.put((String) linkedList2.removeFirst(), a2);
                        this.f9654b = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(a2);
                    } else if (i6 != 6) {
                        this.f9654b = -1;
                    }
                }
                if (this.f9654b == -1) {
                    throw new c(this.a.f9665i, 1, this.f9655c);
                }
            } catch (IOException e2) {
                throw e2;
            }
        } while (this.f9655c.a != -1);
        throw new c(this.a.f9665i, 1, this.f9655c);
    }

    public Object e(String str) throws c {
        try {
            return d(new StringReader(str), null);
        } catch (IOException e2) {
            throw new c(-1, 2, e2);
        }
    }

    public final int f(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }
}
