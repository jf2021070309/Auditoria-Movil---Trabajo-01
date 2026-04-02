package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class b {
    private Map<c, List<a>> a = new HashMap();
    private Map<String, String> b = new HashMap();
    private final List<f> c;
    private final List<f> d;
    private g e;

    public b() {
        new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = null;
    }

    public List<f> a() {
        return this.d;
    }

    public List<a> a(c cVar) {
        return this.a.get(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar) {
        this.e = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Map<? extends String, ? extends String> map) {
        this.b.putAll(map);
    }

    public g b() {
        return this.e;
    }

    public List<f> c() {
        return this.c;
    }

    public Map<String, String> d() {
        return this.b;
    }
}
