package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e implements v.c {
    private final int a;
    private final List<com.fyber.inneractive.sdk.player.c.h> b;

    public e() {
        this(0);
    }

    public e(int i) {
        this(i, Collections.emptyList());
    }

    private e(int i, List<com.fyber.inneractive.sdk.player.c.h> list) {
        this.a = i;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.c.h.a((String) null, "application/cea-608", 0, (String) null, (com.fyber.inneractive.sdk.player.c.c.a) null));
        }
        this.b = list;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v.c
    public final SparseArray<v> a() {
        return new SparseArray<>();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.v.c
    public final v a(int i, v.b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new o(new m(bVar.b));
            }
            if (i == 15) {
                if (a(2)) {
                    return null;
                }
                return new o(new d(false, bVar.b));
            } else if (i != 21) {
                if (i == 27) {
                    if (a(4)) {
                        return null;
                    }
                    return new o(new j(a(bVar), a(1), a(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (i == 134) {
                                        if (a(16)) {
                                            return null;
                                        }
                                        return new r(new t());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new o(new b(bVar.b));
                        }
                        return new o(new f(bVar.b));
                    }
                    return new o(new g(bVar.c));
                } else {
                    return new o(new k(a(bVar)));
                }
            } else {
                return new o(new l());
            }
        }
        return new o(new i());
    }

    private s a(v.b bVar) {
        String str;
        if (a(32)) {
            return new s(this.b);
        }
        com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(bVar.d);
        List<com.fyber.inneractive.sdk.player.c.h> list = this.b;
        while (kVar.b() > 0) {
            int d = kVar.d();
            int d2 = kVar.b + kVar.d();
            if (d == 134) {
                list = new ArrayList<>();
                int d3 = kVar.d() & 31;
                for (int i = 0; i < d3; i++) {
                    String e = kVar.e(3);
                    int d4 = kVar.d();
                    int i2 = 1;
                    if ((d4 & 128) != 0) {
                        i2 = d4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                    }
                    list.add(com.fyber.inneractive.sdk.player.c.h.a((String) null, str, 0, e, i2));
                    kVar.d(2);
                }
            }
            kVar.c(d2);
        }
        return new s(list);
    }

    private boolean a(int i) {
        return (i & this.a) != 0;
    }
}
