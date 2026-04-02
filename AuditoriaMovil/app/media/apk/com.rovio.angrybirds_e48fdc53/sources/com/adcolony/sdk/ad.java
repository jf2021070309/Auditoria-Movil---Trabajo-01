package com.adcolony.sdk;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ad {
    String a;
    private HashMap<Integer, Boolean> b = new HashMap<>();
    private l c;
    private c d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(String str, int i) {
        this.a = str;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        if (this.c == null) {
            this.c = new l(this.a, this.e);
            this.d = new c(this.a, this.e);
        }
        int c = as.c(dVar.b(), "id");
        if (as.d(dVar.b(), "use_sound_pool")) {
            this.b.put(Integer.valueOf(c), true);
            this.c.a(dVar);
            return;
        }
        this.b.put(Integer.valueOf(c), false);
        this.d.a(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c.a().autoPause();
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.c.a().autoResume();
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        if (this.b.get(Integer.valueOf(as.c(dVar.b(), "id"))).booleanValue()) {
            this.c.d(dVar);
        } else {
            this.d.b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(d dVar) {
        if (this.b.get(Integer.valueOf(as.c(dVar.b(), "id"))).booleanValue()) {
            this.c.c(dVar);
        } else {
            this.d.c(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(d dVar) {
        if (this.b.get(Integer.valueOf(as.c(dVar.b(), "id"))).booleanValue()) {
            this.c.b(dVar);
        } else {
            this.d.d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d dVar) {
        if (this.b.get(Integer.valueOf(as.c(dVar.b(), "id"))).booleanValue()) {
            this.c.e(dVar);
        } else {
            this.d.e(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l d() {
        return this.c;
    }
}
