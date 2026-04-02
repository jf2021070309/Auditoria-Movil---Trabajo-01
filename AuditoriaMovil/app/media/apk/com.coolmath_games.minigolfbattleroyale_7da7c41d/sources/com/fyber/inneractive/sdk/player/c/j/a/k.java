package com.fyber.inneractive.sdk.player.c.j.a;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.c.j.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class k implements a {
    final File a;
    final i b;
    a.C0064a c;
    private final f d;
    private final HashMap<String, g> e;
    private final HashMap<String, ArrayList<a.b>> f;
    private long g;

    public k(File file, f fVar) {
        this(file, fVar, (byte) 0);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.fyber.inneractive.sdk.player.c.j.a.k$1] */
    private k(File file, f fVar, byte b) {
        this.g = 0L;
        this.a = file;
        this.d = fVar;
        this.e = new HashMap<>();
        this.b = new i(file);
        this.f = new HashMap<>();
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("SimpleCache.initialize()") { // from class: com.fyber.inneractive.sdk.player.c.j.a.k.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                synchronized (k.this) {
                    conditionVariable.open();
                    try {
                        k kVar = k.this;
                        if (!kVar.a.exists()) {
                            kVar.a.mkdirs();
                        } else {
                            i iVar = kVar.b;
                            com.fyber.inneractive.sdk.player.c.k.a.b(!iVar.d);
                            if (!iVar.c()) {
                                com.fyber.inneractive.sdk.player.c.k.b bVar = iVar.c;
                                bVar.a.delete();
                                bVar.b.delete();
                                iVar.a.clear();
                                iVar.b.clear();
                            }
                            File[] listFiles = kVar.a.listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    if (!file2.getName().equals("cached_content_index.exi")) {
                                        l a = file2.length() > 0 ? l.a(file2, kVar.b) : null;
                                        if (a != null) {
                                            kVar.a(a);
                                        } else {
                                            file2.delete();
                                        }
                                    }
                                }
                                kVar.b.b();
                                kVar.b.a();
                            }
                        }
                    } catch (a.C0064a e) {
                        k.this.c = e;
                    }
                }
            }
        }.start();
        conditionVariable.block();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized long a() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    /* renamed from: d */
    public synchronized l a(String str, long j) throws InterruptedException, a.C0064a {
        l b;
        while (true) {
            b = b(str, j);
            if (b == null) {
                wait();
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    /* renamed from: e */
    public synchronized l b(String str, long j) throws a.C0064a {
        l a;
        l lVar;
        if (this.c != null) {
            throw this.c;
        }
        h b = this.b.b(str);
        if (b == null) {
            lVar = l.b(str, j);
        } else {
            while (true) {
                l a2 = l.a(b.b, j);
                l floor = b.c.floor(a2);
                if (floor == null || floor.b + floor.c <= j) {
                    l ceiling = b.c.ceiling(a2);
                    if (ceiling == null) {
                        a = l.b(b.b, j);
                    } else {
                        a = l.a(b.b, j, ceiling.b - j);
                    }
                } else {
                    a = floor;
                }
                if (!a.d || a.e.length() == a.c) {
                    break;
                }
                b();
            }
            lVar = a;
        }
        if (lVar.d) {
            h b2 = this.b.b(str);
            com.fyber.inneractive.sdk.player.c.k.a.b(b2.c.remove(lVar));
            int i = b2.a;
            com.fyber.inneractive.sdk.player.c.k.a.b(lVar.d);
            long currentTimeMillis = System.currentTimeMillis();
            l lVar2 = new l(lVar.a, lVar.b, lVar.c, currentTimeMillis, l.a(lVar.e.getParentFile(), i, lVar.b, currentTimeMillis));
            if (!lVar.e.renameTo(lVar2.e)) {
                throw new a.C0064a("Renaming of " + lVar.e + " to " + lVar2.e + " failed.");
            }
            b2.c.add(lVar2);
            a(lVar, lVar2);
            return lVar2;
        } else if (this.e.containsKey(str)) {
            return null;
        } else {
            this.e.put(str, lVar);
            return lVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized File a(String str, long j, long j2) throws a.C0064a {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.e.containsKey(str));
        if (!this.a.exists()) {
            b();
            this.a.mkdirs();
        }
        this.d.a(this, j2);
        return l.a(this.a, this.b.c(str), j, System.currentTimeMillis());
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized void a(File file) throws a.C0064a {
        l a = l.a(file, this.b);
        boolean z = true;
        com.fyber.inneractive.sdk.player.c.k.a.b(a != null);
        com.fyber.inneractive.sdk.player.c.k.a.b(this.e.containsKey(a.a));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            Long valueOf = Long.valueOf(a(a.a));
            if (valueOf.longValue() != -1) {
                if (a.b + a.c > valueOf.longValue()) {
                    z = false;
                }
                com.fyber.inneractive.sdk.player.c.k.a.b(z);
            }
            a(a);
            this.b.a();
            notifyAll();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized void a(g gVar) {
        com.fyber.inneractive.sdk.player.c.k.a.b(gVar == this.e.remove(gVar.a));
        notifyAll();
    }

    final void a(l lVar) {
        this.b.a(lVar.a).c.add(lVar);
        this.g += lVar.c;
        ArrayList<a.b> arrayList = this.f.get(lVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, lVar);
            }
        }
        this.d.a(this, lVar);
    }

    private void a(g gVar, boolean z) throws a.C0064a {
        boolean z2;
        h b = this.b.b(gVar.a);
        if (b != null) {
            if (b.c.remove(gVar)) {
                gVar.e.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.g -= gVar.c;
                if (z && b.c.isEmpty()) {
                    this.b.d(b.b);
                    this.b.a();
                }
                ArrayList<a.b> arrayList = this.f.get(gVar.a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).a(gVar);
                    }
                }
                this.d.a(gVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized void b(g gVar) throws a.C0064a {
        a(gVar, true);
    }

    private void b() throws a.C0064a {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.b.a.values()) {
            Iterator<l> it = hVar.c.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.e.length() != next.c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.b.b();
        this.b.a();
    }

    private void a(l lVar, g gVar) {
        ArrayList<a.b> arrayList = this.f.get(lVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, lVar, gVar);
            }
        }
        this.d.a(this, lVar, gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized void c(String str, long j) throws a.C0064a {
        i iVar = this.b;
        h b = iVar.b(str);
        if (b == null) {
            iVar.a(str, j);
        } else if (b.d != j) {
            b.d = j;
            iVar.d = true;
        }
        this.b.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.a.a
    public final synchronized long a(String str) {
        h b = this.b.b(str);
        if (b == null) {
            return -1L;
        }
        return b.d;
    }
}
