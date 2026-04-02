package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes2.dex */
class av {
    static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ");
    private Date a;
    protected String c;
    private int d;
    private ar e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ar arVar) {
        this.e = arVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        switch (this.d) {
            case -1:
                return "Fatal";
            case 0:
                return "Error";
            case 1:
                return "Warn";
            case 2:
                return "Info";
            case 3:
                return "Debug";
            default:
                return "UNKNOWN LOG LEVEL";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return b.format(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar e() {
        return this.e;
    }

    public String toString() {
        return d() + " " + b() + "/" + e().c() + ": " + c();
    }

    /* loaded from: classes2.dex */
    static class a {
        protected av b = new av();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i) {
            this.b.d = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(ar arVar) {
            this.b.e = arVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(String str) {
            this.b.c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(Date date) {
            this.b.a = date;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public av a() {
            if (this.b.a == null) {
                this.b.a = new Date(System.currentTimeMillis());
            }
            return this.b;
        }
    }
}
