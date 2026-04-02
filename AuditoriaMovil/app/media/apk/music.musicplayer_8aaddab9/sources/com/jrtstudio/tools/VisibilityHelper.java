package com.jrtstudio.tools;

import c.p.j;
import c.p.o;
import c.p.y;
import com.jrtstudio.tools.VisibilityHelper;
import e.h.g.j0;
import e.h.g.s1;
import java.util.Objects;
/* loaded from: classes.dex */
public class VisibilityHelper implements o {
    public static VisibilityHelper a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4885b;

    public VisibilityHelper() {
        j0.i(new j0.c() { // from class: e.h.g.h0
            @Override // e.h.g.j0.c
            public final void a() {
                VisibilityHelper visibilityHelper = VisibilityHelper.this;
                Objects.requireNonNull(visibilityHelper);
                c.p.b0.a.f2438g.a(visibilityHelper);
            }
        });
    }

    @y(j.a.ON_STOP)
    public void onApplicationRemovedFromForeground() {
        s1.b("Removed from foreground");
        this.f4885b = false;
    }

    @y(j.a.ON_START)
    public void onBroughtToForeground() {
        s1.b("Brought to foreground");
        this.f4885b = true;
    }
}
