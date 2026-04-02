package com.adcolony.sdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class au {
    static au a = new au(3, false);
    static au b = new au(3, true);
    static au c = new au(2, false);
    static au d = new au(2, true);
    static au e = new au(1, false);
    static au f = new au(1, true);
    static au g = new au(0, false);
    static au h = new au(0, true);
    int i;
    boolean j;
    StringBuilder k = new StringBuilder();

    au(int i, boolean z) {
        this.i = i;
        this.j = z;
    }

    synchronized au a(char c2) {
        this.k.append(c2);
        if (c2 == '\n') {
            b.a(this.i, this.k.toString(), this.j);
            this.k.setLength(0);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized au a(String str) {
        if (str == null) {
            this.k.append("null");
        } else {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                a(str.charAt(i));
            }
        }
        return this;
    }

    synchronized au a(Object obj) {
        if (obj == null) {
            a("null");
        } else {
            a(obj.toString());
        }
        return this;
    }

    synchronized au a(double d2) {
        q.a(d2, 2, this.k);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized au a(int i) {
        this.k.append(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized au b(Object obj) {
        a(obj);
        return a('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized au b(double d2) {
        a(d2);
        return a('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized au b(int i) {
        a(i);
        return a('\n');
    }
}
