package com.fyber.inneractive.sdk.player.a;
/* loaded from: classes.dex */
final class i extends b {
    private final boolean a;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[Catch: all -> 0x00ca, TryCatch #5 {all -> 0x00ca, blocks: (B:38:0x009b, B:39:0x00a6, B:41:0x00ac, B:43:0x00b8), top: B:73:0x009b }] */
    @Override // com.fyber.inneractive.sdk.player.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.a.a r9) {
        /*
            r8 = this;
            int r0 = com.fyber.inneractive.sdk.player.a.b.a.c
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            boolean r2 = r9.b()
            r3 = 0
            if (r2 == 0) goto L7e
            r2 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64
            java.io.File r5 = r9.a()     // Catch: java.lang.Throwable -> L64
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L64
            java.io.File r2 = r9.a()     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L62
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L62
            r1.prepare()     // Catch: java.lang.Throwable -> L62
            int r2 = r1.getDuration()     // Catch: java.lang.Throwable -> L62
            if (r2 <= 0) goto L75
            int r0 = com.fyber.inneractive.sdk.player.a.b.a.a     // Catch: java.lang.Throwable -> L62
            int r2 = r1.getVideoWidth()     // Catch: java.lang.Throwable -> L62
            if (r2 <= 0) goto L54
            int r2 = r1.getVideoHeight()     // Catch: java.lang.Throwable -> L62
            if (r2 <= 0) goto L54
            java.lang.String r2 = "video.width"
            int r5 = r1.getVideoWidth()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L62
            r8.a(r2, r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "video.height"
            int r5 = r1.getVideoHeight()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L62
            r8.a(r2, r5)     // Catch: java.lang.Throwable -> L62
        L54:
            java.lang.String r2 = "video.duration"
            int r5 = r1.getDuration()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L62
            r8.a(r2, r5)     // Catch: java.lang.Throwable -> L62
            goto L75
        L62:
            r2 = move-exception
            goto L68
        L64:
            r4 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L68:
            java.lang.String r5 = "Exception raised while trying to open a cache candidate"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L79
            com.fyber.inneractive.sdk.util.IAlog.a(r5, r2, r6)     // Catch: java.lang.Throwable -> L79
            boolean r2 = r9.c     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L75
            int r0 = com.fyber.inneractive.sdk.player.a.b.a.b     // Catch: java.lang.Throwable -> L79
        L75:
            com.fyber.inneractive.sdk.player.a.m.a(r4)
            goto L7e
        L79:
            r9 = move-exception
            com.fyber.inneractive.sdk.player.a.m.a(r4)
            throw r9
        L7e:
            r1.release()     // Catch: java.lang.Throwable -> L81
        L81:
            boolean r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L8f
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r1 >= r4) goto L8d
            goto L8f
        L8d:
            r1 = r3
            goto L90
        L8f:
            r1 = r2
        L90:
            if (r1 != 0) goto Lcd
            int r4 = com.fyber.inneractive.sdk.player.a.b.a.a
            if (r0 != r4) goto Lcd
            android.media.MediaExtractor r4 = new android.media.MediaExtractor
            r4.<init>()
            java.io.File r5 = r9.a()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Lca
            r4.setDataSource(r5)     // Catch: java.lang.Throwable -> Lca
        La6:
            int r5 = r4.getTrackCount()     // Catch: java.lang.Throwable -> Lca
            if (r3 >= r5) goto Lc4
            android.media.MediaFormat r5 = r4.getTrackFormat(r3)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = "mime"
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto Lc1
            java.lang.String r6 = "video/"
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto Lc1
            goto Lc5
        Lc1:
            int r3 = r3 + 1
            goto La6
        Lc4:
            r2 = r1
        Lc5:
            r4.release()     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            r1 = r2
            goto Lcd
        Lca:
            r4.release()     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            int r2 = com.fyber.inneractive.sdk.player.a.b.a.a
            if (r0 != r2) goto Ldd
            if (r1 != 0) goto Ldd
            boolean r9 = r9.c
            if (r9 == 0) goto Lda
            int r9 = com.fyber.inneractive.sdk.player.a.b.a.b
            goto Ldc
        Lda:
            int r9 = com.fyber.inneractive.sdk.player.a.b.a.c
        Ldc:
            r0 = r9
        Ldd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.a.i.a(com.fyber.inneractive.sdk.player.a.a):int");
    }
}
