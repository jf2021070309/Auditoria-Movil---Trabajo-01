package com.amazon.aps.iva.if0;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: JSONArray.java */
/* loaded from: classes4.dex */
public final class a implements Iterable<Object> {
    public final ArrayList<Object> b;

    public a() {
        this.b = new ArrayList<>();
    }

    public final c b(int i) throws b {
        Object obj = get(i);
        if (obj instanceof c) {
            return (c) obj;
        }
        throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] is not a JSONObject."));
    }

    public final String d(int i) throws b {
        Object obj = get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] not a string."));
    }

    public final int e() {
        return this.b.size();
    }

    public final Object f(int i) {
        if (i >= 0 && i < e()) {
            return this.b.get(i);
        }
        return null;
    }

    public final int g(int i) {
        Object f = f(i);
        if (c.NULL.equals(f)) {
            return 0;
        }
        if (f instanceof Number) {
            return ((Number) f).intValue();
        }
        if (!(f instanceof String)) {
            return 0;
        }
        try {
            return new BigDecimal(f.toString()).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final Object get(int i) throws b {
        Object f = f(i);
        if (f != null) {
            return f;
        }
        throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] not found."));
    }

    public final long getLong(int i) throws b {
        Object obj = get(i);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] is not a number."), e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.b.iterator();
    }

    public final c j(int i) {
        Object f = f(i);
        if (f instanceof c) {
            return (c) f;
        }
        return null;
    }

    public final long k(int i) {
        Object f = f(i);
        if (c.NULL.equals(f)) {
            return 0L;
        }
        if (f instanceof Number) {
            return ((Number) f).longValue();
        }
        if (!(f instanceof String)) {
            return 0L;
        }
        try {
            return new BigDecimal(f.toString()).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final String l(int i) {
        return n(i);
    }

    public final String n(int i) {
        Object f = f(i);
        if (c.NULL.equals(f)) {
            return "";
        }
        return f.toString();
    }

    public final void o(int i, Object obj) throws b {
        c.testValidity(obj);
        if (i >= 0) {
            int e = e();
            ArrayList<Object> arrayList = this.b;
            if (i < e) {
                arrayList.set(i, obj);
                return;
            } else if (i == e()) {
                put(obj);
                return;
            } else {
                arrayList.ensureCapacity(i + 1);
                while (i != e()) {
                    put(c.NULL);
                }
                put(obj);
                return;
            }
        }
        throw new b(com.amazon.aps.iva.c80.a.d("JSONArray[", i, "] not found."));
    }

    public final boolean p(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        int e = e();
        a aVar = (a) obj;
        if (e != aVar.e()) {
            return false;
        }
        for (int i = 0; i < e; i++) {
            Object obj2 = this.b.get(i);
            Object obj3 = aVar.b.get(i);
            if (obj2 != obj3) {
                if (obj2 == null) {
                    return false;
                }
                if (obj2 instanceof c) {
                    if (!((c) obj2).similar(obj3)) {
                        return false;
                    }
                } else if (obj2 instanceof a) {
                    if (!((a) obj2).p(obj3)) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void put(Object obj) {
        this.b.add(obj);
    }

    public final ArrayList q() {
        ArrayList<Object> arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && !c.NULL.equals(next)) {
                if (next instanceof a) {
                    arrayList2.add(((a) next).q());
                } else if (next instanceof c) {
                    arrayList2.add(((c) next).toMap());
                } else {
                    arrayList2.add(next);
                }
            } else {
                arrayList2.add(null);
            }
        }
        return arrayList2;
    }

    public final void r(Writer writer, int i, int i2) throws b {
        try {
            int e = e();
            writer.write(91);
            ArrayList<Object> arrayList = this.b;
            int i3 = 0;
            if (e == 1) {
                try {
                    c.writeValue(writer, arrayList.get(0), i, i2);
                    writer.write(93);
                } catch (Exception e2) {
                    throw new b("Unable to write JSONArray value at index: 0", e2);
                }
            }
            if (e != 0) {
                int i4 = i2 + i;
                boolean z = false;
                while (i3 < e) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    c.indent(writer, i4);
                    try {
                        c.writeValue(writer, arrayList.get(i3), i, i4);
                        i3++;
                        z = true;
                    } catch (Exception e3) {
                        throw new b("Unable to write JSONArray value at index: " + i3, e3);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                c.indent(writer, i2);
            }
            writer.write(93);
        } catch (IOException e4) {
            throw new b(e4);
        }
    }

    public final String toString() {
        String obj;
        try {
            StringWriter stringWriter = new StringWriter();
            synchronized (stringWriter.getBuffer()) {
                r(stringWriter, 0, 0);
                obj = stringWriter.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(g gVar) throws b {
        this();
        if (gVar.c() == '[') {
            char c = gVar.c();
            if (c == 0) {
                throw gVar.e("Expected a ',' or ']'");
            }
            if (c == ']') {
                return;
            }
            gVar.a();
            while (true) {
                if (gVar.c() == ',') {
                    gVar.a();
                    this.b.add(c.NULL);
                } else {
                    gVar.a();
                    this.b.add(gVar.d());
                }
                char c2 = gVar.c();
                if (c2 == 0) {
                    throw gVar.e("Expected a ',' or ']'");
                }
                if (c2 != ',') {
                    if (c2 != ']') {
                        throw gVar.e("Expected a ',' or ']'");
                    }
                    return;
                }
                char c3 = gVar.c();
                if (c3 == 0) {
                    throw gVar.e("Expected a ',' or ']'");
                }
                if (c3 == ']') {
                    return;
                }
                gVar.a();
            }
        } else {
            throw gVar.e("A JSONArray text must start with '['");
        }
    }

    public a(String str) throws b {
        this(new g(str));
    }

    public a(Collection<?> collection) {
        if (collection == null) {
            this.b = new ArrayList<>();
            return;
        }
        this.b = new ArrayList<>(collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            this.b.add(c.wrap(it.next()));
        }
    }

    public a(Object obj) throws b {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            this.b.ensureCapacity(length);
            for (int i = 0; i < length; i++) {
                put(c.wrap(Array.get(obj, i)));
            }
            return;
        }
        throw new b("JSONArray initial value should be a string or collection or array.");
    }
}
