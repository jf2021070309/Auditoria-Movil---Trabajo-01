package com.fyber.inneractive.sdk.player.c.b;
/* loaded from: classes.dex */
public abstract class a {
    public int a;

    public void a() {
        this.a = 0;
    }

    public final boolean b() {
        return a(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return a(4);
    }

    public final boolean d() {
        return a(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(int i) {
        return (this.a & i) == i;
    }
}
