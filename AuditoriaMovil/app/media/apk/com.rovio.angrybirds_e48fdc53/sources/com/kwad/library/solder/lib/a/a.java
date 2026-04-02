package com.kwad.library.solder.lib.a;

import android.content.Context;
import com.kwad.library.solder.lib.i;
import java.io.File;
/* loaded from: classes.dex */
public abstract class a {
    protected File afZ;
    protected String aga;
    protected String agb;
    private final String age;
    protected com.kwad.library.solder.lib.c.b agf;
    protected String mVersion;
    private final byte[] agd = new byte[0];
    private boolean agc = false;
    protected com.kwad.library.solder.lib.ext.c afG = i.wi().wc();

    public a(String str) {
        this.age = str;
        this.aga = str;
    }

    private void wm() {
        if (this.agc) {
            return;
        }
        synchronized (this.agd) {
            this.agc = true;
        }
    }

    public final a a(com.kwad.library.solder.lib.c.b bVar) {
        this.agf = bVar;
        return this;
    }

    public final void bE(String str) {
        this.mVersion = str;
    }

    public final void bF(String str) {
        this.agb = str;
    }

    public final void bG(String str) {
        this.aga = str;
    }

    protected abstract void f(Context context, String str);

    public final String getId() {
        return this.agb;
    }

    public final String getVersion() {
        return this.mVersion;
    }

    public final void h(Context context, String str) {
        f(context, str);
        wm();
    }

    public final boolean isLoaded() {
        boolean z;
        if (this.agc) {
            return true;
        }
        synchronized (this.agd) {
            z = this.agc;
        }
        return z;
    }

    public String toString() {
        return "Plugin{, ApkPath = '" + this.age + "'}";
    }

    public final String wn() {
        return this.age;
    }

    public final String wo() {
        com.kwad.library.solder.lib.c.b bVar = this.agf;
        if (bVar != null) {
            return bVar.agM;
        }
        return null;
    }
}
