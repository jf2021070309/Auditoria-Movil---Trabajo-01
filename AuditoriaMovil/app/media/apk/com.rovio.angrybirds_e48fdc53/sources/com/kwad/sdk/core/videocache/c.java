package com.kwad.sdk.core.videocache;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {
    public final File awp;
    public final com.kwad.sdk.core.videocache.a.c awq;
    public final com.kwad.sdk.core.videocache.a.a awr;
    public final com.kwad.sdk.core.videocache.d.b aws;
    public final com.kwad.sdk.core.videocache.b.b awt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(File file, com.kwad.sdk.core.videocache.a.c cVar, com.kwad.sdk.core.videocache.a.a aVar, com.kwad.sdk.core.videocache.d.b bVar, com.kwad.sdk.core.videocache.b.b bVar2) {
        this.awp = file;
        this.awq = cVar;
        this.awr = aVar;
        this.aws = bVar;
        this.awt = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File dK(String str) {
        return new File(this.awp, this.awq.generate(str));
    }
}
