package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class o extends c {
    public a d;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a("STATE_UNKNOWN", 0);
        public static final a b = new a("STATE_INIT", 1);
        public static final a c = new a("STATE_PLAY", 2);

        private a(String str, int i) {
        }
    }

    public o(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = a.a;
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        String type = tVar.getType();
        type.getClass();
        char c = 65535;
        switch (type.hashCode()) {
            case 3443508:
                if (type.equals("play")) {
                    c = 0;
                    break;
                }
                break;
            case 1196475701:
                if (type.equals("viewinit")) {
                    c = 1;
                    break;
                }
                break;
            case 1651552038:
                if (type.equals("adbreakstart")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                if (this.d == a.b) {
                    this.d = a.c;
                    c(new com.amazon.aps.iva.fa0.l(tVar.d, 2));
                    return;
                }
                return;
            case 1:
                this.d = a.b;
                return;
            default:
                return;
        }
    }
}
