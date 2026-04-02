package com.kwad.library.solder.lib;

import com.kwad.library.solder.lib.a.a;
import com.kwad.library.solder.lib.a.e;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
/* loaded from: classes.dex */
public class b<P extends com.kwad.library.solder.lib.a.a, R extends com.kwad.library.solder.lib.a.e<P>> extends b.C0240b<P, R> {
    com.kwad.library.solder.lib.ext.b<P, R> afC;
    com.kwad.library.solder.lib.ext.b<P, R> afD;

    public b(com.kwad.library.solder.lib.ext.b<P, R> bVar, com.kwad.library.solder.lib.ext.b<P, R> bVar2) {
        this.afC = bVar;
        this.afD = bVar2;
    }

    @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
    public final void a(R r) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.afC;
        if (bVar != null) {
            bVar.a(r);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
    public final void a(R r, P p) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.afC;
        if (bVar != null) {
            bVar.a((com.kwad.library.solder.lib.ext.b<P, R>) r, (R) p);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
    public void a(R r, PluginError pluginError) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.afC;
        if (bVar != null) {
            bVar.a((com.kwad.library.solder.lib.ext.b<P, R>) r, pluginError);
        }
        com.kwad.library.solder.lib.ext.b<P, R> bVar2 = this.afD;
        if (bVar2 != null) {
            bVar2.a((com.kwad.library.solder.lib.ext.b<P, R>) r, pluginError);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
    public final void b(R r) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.afC;
        if (bVar != null) {
            bVar.b(r);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
    public final void c(R r) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.afC;
        if (bVar != null) {
            bVar.c(r);
        }
    }
}
