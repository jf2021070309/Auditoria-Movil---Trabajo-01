package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.id0.n;
import com.amazon.aps.iva.id0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedList;
import java.util.List;
/* compiled from: NameResolverImpl.kt */
/* loaded from: classes4.dex */
public final class d implements c {
    public final o a;
    public final n b;

    /* compiled from: NameResolverImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.c.EnumC0374c.values().length];
            try {
                iArr[n.c.EnumC0374c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.c.EnumC0374c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.c.EnumC0374c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public d(o oVar, n nVar) {
        this.a = oVar;
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final boolean a(int i) {
        return c(i).d.booleanValue();
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final String b(int i) {
        com.amazon.aps.iva.kb0.n<List<String>, List<String>, Boolean> c = c(i);
        List<String> list = c.b;
        String B0 = x.B0(c.c, ".", null, null, null, 62);
        if (!list.isEmpty()) {
            return x.B0(list, "/", null, null, null, 62) + '/' + B0;
        }
        return B0;
    }

    public final com.amazon.aps.iva.kb0.n<List<String>, List<String>, Boolean> c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            n.c cVar = this.b.c.get(i);
            String str = (String) this.a.c.get(cVar.e);
            n.c.EnumC0374c enumC0374c = cVar.f;
            j.c(enumC0374c);
            int i2 = a.a[enumC0374c.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        linkedList2.addFirst(str);
                        z = true;
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i = cVar.d;
        }
        return new com.amazon.aps.iva.kb0.n<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final String getString(int i) {
        String str = (String) this.a.c.get(i);
        j.e(str, "strings.getString(index)");
        return str;
    }
}
