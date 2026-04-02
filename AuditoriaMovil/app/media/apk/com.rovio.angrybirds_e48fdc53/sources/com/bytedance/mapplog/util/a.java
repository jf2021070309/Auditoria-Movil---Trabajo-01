package com.bytedance.mapplog.util;
/* loaded from: classes.dex */
public class a {
    private final String a;
    private final String b;
    private final String[] c;
    private final String d;
    private final String e;

    /* loaded from: classes.dex */
    public static class b {
        private String a;
        private String b;
        private String[] c;
        private String[] d;
        private String e;
        private String f;
        private String g;
        private String h;

        public b a(String str) {
            this.a = str;
            return this;
        }

        public b a(String[] strArr) {
            this.c = strArr;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public b b(String str) {
            this.b = str;
            return this;
        }

        public b b(String[] strArr) {
            this.d = strArr;
            return this;
        }

        public b c(String str) {
            this.e = str;
            return this;
        }

        public b d(String str) {
            this.f = str;
            return this;
        }

        public b e(String str) {
            this.h = str;
            return this;
        }
    }

    private a(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        String[] unused = bVar.d;
        this.d = bVar.e;
        this.e = bVar.f;
        String unused2 = bVar.g;
        String unused3 = bVar.h;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String[] d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }
}
