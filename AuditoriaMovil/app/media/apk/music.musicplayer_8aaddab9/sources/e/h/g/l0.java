package e.h.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: e  reason: collision with root package name */
    public final e.e.a.b.c.a f8324e;

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f8325f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final e.e.a.c.b.n.b f8326g;

    /* renamed from: h  reason: collision with root package name */
    public e.e.a.c.a f8327h;
    public static final Map<String, l0> a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8322c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<b> f8323d = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final d f8321b = new d(null);

    /* loaded from: classes.dex */
    public interface b {
        void a(l0 l0Var, String str);
    }

    /* loaded from: classes.dex */
    public static class c {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public l0 f8328b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8329c;

        /* renamed from: d  reason: collision with root package name */
        public Object f8330d;

        public c() {
        }

        public c(a aVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class d extends b1<c> {
        public d(a aVar) {
        }

        @Override // e.h.g.b1
        public void a(c cVar) {
            c cVar2 = cVar;
            try {
                if (cVar2.f8329c) {
                    l0 l0Var = cVar2.f8328b;
                    String str = cVar2.a;
                    Objects.requireNonNull(l0Var);
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(new e.e.a.b.c.b(3, str, e.e.a.b.c.b.a));
                    l0Var.f8324e.a(linkedList);
                } else {
                    cVar2.f8328b.b(cVar2.a, cVar2.f8330d);
                }
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
    }

    public l0(Context context, String str) {
        FileInputStream fileInputStream;
        e.e.a.c.b.n.b bVar = new e.e.a.c.b.n.b();
        this.f8326g = bVar;
        this.f8327h = new e.e.a.c.a(bVar);
        e.e.a.b.a.b bVar2 = new e.e.a.b.a.b(new e.e.a.b.b.a(str, context.getFilesDir()));
        e.e.a.b.c.a aVar = new e.e.a.b.c.a(bVar2);
        this.f8324e = aVar;
        String[] list = bVar2.f7930c.list();
        list = list == null ? e.e.a.b.a.b.a : list;
        ArrayList arrayList = new ArrayList(list.length);
        for (String str2 : list) {
            e.e.a.b.a.b bVar3 = (e.e.a.b.a.b) aVar.a;
            Objects.requireNonNull(bVar3);
            File file = new File(bVar3.f7929b, e.a.d.a.a.k(str2, ".bak"));
            File file2 = new File(bVar3.f7930c, str2);
            if (file.exists()) {
                if (file2.exists()) {
                    file2.delete();
                }
                if (file.exists()) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.renameTo(file2);
                }
            }
            int length = (int) file2.length();
            byte[] bArr = new byte[length];
            byte[] bArr2 = new byte[length];
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(file2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            try {
                int read = fileInputStream.read(bArr, 0, length);
                if (read < length) {
                    int i2 = length - read;
                    while (i2 > 0) {
                        int read2 = fileInputStream.read(bArr2, 0, i2);
                        System.arraycopy(bArr2, 0, bArr, length - i2, read2);
                        i2 -= read2;
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                arrayList.add(new e.e.a.b.c.b(1, str2, bArr));
            } catch (IOException e3) {
                e = e3;
                fileInputStream2 = fileInputStream;
                throw new e.e.a.a.a(e);
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e.e.a.b.c.b bVar4 = (e.e.a.b.c.b) it.next();
            String str3 = bVar4.f7933c;
            try {
                this.f8325f.put(str3, this.f8327h.a(str3, bVar4.f7934d));
            } catch (Throwable th3) {
                s1.l(th3, true);
            }
        }
    }

    public static l0 a(Context context, String str, boolean z) {
        l0 l2;
        if (context == null) {
            return null;
        }
        if (str == null) {
            str = "shared";
        }
        try {
            Map<String, l0> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            System.nanoTime();
            if (j1.f() && !z) {
                s1.c("Don't Load Preferences on the main thread -> " + str);
            }
            if (z) {
                return l(context, str);
            }
            synchronized (f8322c) {
                l2 = l(context, str);
            }
            return l2;
        } catch (Throwable th) {
            s1.k(th);
            return null;
        }
    }

    public static l0 g() {
        return i(x0.f8405d, null);
    }

    public static l0 h(Context context) {
        return i(context, null);
    }

    public static l0 i(Context context, String str) {
        return j(context, str, false);
    }

    public static l0 j(Context context, String str, boolean z) {
        l0 a2 = a(context, str, z);
        if (a2 != null || j1.f()) {
            return a2;
        }
        r0 r0Var = new r0();
        int i2 = 0;
        while (true) {
            if (i2 > 0 && i2 % 100 == 0) {
                s1.c("Failing to init prefs");
            }
            j1.n(100, r0Var);
            l0 a3 = a(x0.f8405d, str, z);
            i2++;
            if (a3 != null && i2 < 200) {
                return a3;
            }
        }
    }

    public static l0 l(Context context, String str) {
        l0 l0Var = a.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(context, str);
        if (!l0Var2.d("33979", false)) {
            Map<String, ?> all = (str.equals("shared") ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0)).getAll();
            if (!all.isEmpty()) {
                for (String str2 : all.keySet()) {
                    Object obj = all.get(str2);
                    if (obj instanceof String) {
                        l0Var2.p(str2, (String) obj);
                    }
                    boolean z = obj instanceof Set;
                    if (z) {
                        Object obj2 = (Set) obj;
                        String r = l0Var2.r(str2);
                        if (obj2 == null) {
                            obj2 = new HashSet();
                        }
                        l0Var2.f8325f.put(r, obj2);
                        l0Var2.c(r, obj2);
                        l0Var2.t(r);
                    }
                    if (obj instanceof Integer) {
                        l0Var2.n(str2, ((Integer) obj).intValue());
                    }
                    if (obj instanceof Long) {
                        l0Var2.o(str2, ((Long) obj).longValue());
                    }
                    if (obj instanceof Float) {
                        float floatValue = ((Float) obj).floatValue();
                        String r2 = l0Var2.r(str2);
                        l0Var2.f8325f.put(r2, Float.valueOf(floatValue));
                        l0Var2.c(r2, Float.valueOf(floatValue));
                        l0Var2.t(r2);
                    }
                    if (obj instanceof Boolean) {
                        l0Var2.m(str2, ((Boolean) obj).booleanValue());
                    }
                    if (z) {
                        Object obj3 = (Set) obj;
                        String r3 = l0Var2.r(str2);
                        if (obj3 == null) {
                            obj3 = new HashSet();
                        }
                        l0Var2.f8325f.put(r3, obj3);
                        l0Var2.c(r3, obj3);
                        l0Var2.t(r3);
                    }
                }
            }
            l0Var2.m("33979", true);
        }
        a.put(str, l0Var2);
        return l0Var2;
    }

    public static void s(SharedPreferences.Editor editor, l0 l0Var, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, l0Var.d(str, ((Boolean) obj).booleanValue()));
        } else if (obj instanceof Integer) {
            editor.putInt(str, l0Var.e(str, ((Integer) obj).intValue()));
        } else if (obj instanceof String) {
            editor.putString(str, l0Var.k(str, (String) obj));
        }
    }

    public final void b(String str, Object obj) {
        e.e.a.c.c.a fVar = obj instanceof String ? new e.e.a.c.c.b.f((String) obj, this.f8327h) : obj instanceof Boolean ? new e.e.a.c.c.b.a(((Boolean) obj).booleanValue(), this.f8327h) : obj instanceof Integer ? new e.e.a.c.c.b.d(((Integer) obj).intValue(), this.f8327h) : obj instanceof Long ? new e.e.a.c.c.b.e(((Long) obj).longValue(), this.f8327h) : obj instanceof Float ? new e.e.a.c.c.b.b((float) ((Long) obj).longValue(), this.f8327h) : obj instanceof Set ? new e.e.a.c.c.b.g((Set) obj, this.f8327h) : obj instanceof HashMap ? new e.e.a.c.c.b.c((HashMap) obj, this.f8327h) : null;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new e.e.a.b.c.b(2, str, fVar.a()));
        this.f8324e.a(linkedList);
    }

    public void c(String str, Object obj) {
        c cVar = new c(null);
        cVar.f8328b = this;
        cVar.a = str;
        cVar.f8330d = obj;
        f8321b.b(cVar);
    }

    public boolean d(String str, boolean z) {
        Object obj = this.f8325f.get(r(str));
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public int e(String str, int i2) {
        Object obj = this.f8325f.get(r(str));
        return obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof Long ? (int) ((Long) obj).longValue() : i2;
    }

    public long f(String str, long j2) {
        Object obj = this.f8325f.get(r(str));
        return obj instanceof Long ? ((Long) obj).longValue() : obj instanceof Integer ? ((Integer) obj).intValue() : j2;
    }

    public String k(String str, String str2) {
        Object obj = this.f8325f.get(r(str));
        return obj instanceof String ? (String) obj : str2;
    }

    public void m(String str, boolean z) {
        String r = r(str);
        this.f8325f.put(r, Boolean.valueOf(z));
        c(r, Boolean.valueOf(z));
        t(r);
    }

    public void n(String str, int i2) {
        String r = r(str);
        this.f8325f.put(r, Integer.valueOf(i2));
        c(r, Integer.valueOf(i2));
        t(r);
    }

    public void o(String str, long j2) {
        String r = r(str);
        this.f8325f.put(r, Long.valueOf(j2));
        c(r, Long.valueOf(j2));
        t(r);
    }

    public void p(String str, String str2) {
        String r = r(str);
        if (str2 == null) {
            str2 = "";
        }
        this.f8325f.put(r, str2);
        c(r, str2);
        t(r);
    }

    public void q(String str) {
        String r = r(str);
        this.f8325f.remove(r);
        c cVar = new c(null);
        cVar.f8328b = this;
        cVar.a = r;
        cVar.f8329c = true;
        f8321b.b(cVar);
    }

    public final String r(String str) {
        boolean z;
        if (str == null) {
            return "null";
        }
        int i2 = r1.a;
        char[] charArray = "\u0000\"*?<>|\\:/".toCharArray();
        if (charArray == null) {
            str = "";
        } else {
            char[] charArray2 = str.toCharArray();
            int length = charArray.length;
            int i3 = 0;
            for (int i4 = 0; i4 < charArray2.length; i4++) {
                char charAt = str.charAt(i4);
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = true;
                        break;
                    } else if (charArray[i5] == charAt) {
                        z = false;
                        break;
                    } else {
                        i5++;
                    }
                }
                if (z) {
                    charArray2[i3] = charAt;
                    i3++;
                }
            }
            if (charArray2.length != i3) {
                str = new String(charArray2, 0, i3);
            }
        }
        return str.length() == 0 ? "null" : str;
    }

    public final void t(String str) {
        try {
            Iterator<b> it = f8323d.iterator();
            while (it.hasNext()) {
                it.next().a(this, str);
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }
}
