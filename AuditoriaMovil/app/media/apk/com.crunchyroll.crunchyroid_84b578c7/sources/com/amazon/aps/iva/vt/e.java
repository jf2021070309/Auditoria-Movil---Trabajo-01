package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.ru.k0;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentsInteractor.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.a implements d {
    public final String b;
    public final TalkboxService c;

    /* compiled from: CommentsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.CommentsInteractorImpl", f = "CommentsInteractor.kt", l = {38}, m = "fetchComments")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public int h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return e.this.E0(null, 0, 0, this);
        }
    }

    public e(String str, TalkboxService talkboxService) {
        this.b = str;
        this.c = talkboxService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.amazon.aps.iva.vt.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E0(com.ellation.crunchyroll.api.etp.commenting.model.CommentsSortingType r11, int r12, int r13, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.vt.e.a
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.vt.e$a r0 = (com.amazon.aps.iva.vt.e.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.vt.e$a r0 = new com.amazon.aps.iva.vt.e$a
            r0.<init>(r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r7.k
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            int r12 = r7.h
            com.amazon.aps.iva.ab.x.i0(r14)
            goto L4b
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            com.amazon.aps.iva.ab.x.i0(r14)
            com.ellation.crunchyroll.api.etp.commenting.TalkboxService r1 = r10.c
            java.lang.String r14 = r10.b
            r4 = 0
            r8 = 4
            r9 = 0
            r7.h = r12
            r7.k = r2
            r2 = r14
            r3 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = com.ellation.crunchyroll.api.etp.commenting.TalkboxService.DefaultImpls.getComments$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L4b
            return r0
        L4b:
            com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview r14 = (com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview) r14
            com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview r11 = com.ellation.crunchyroll.api.etp.commenting.model.CommentPreviewKt.fixFirstPageTotalCount(r14, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vt.e.E0(com.ellation.crunchyroll.api.etp.commenting.model.CommentsSortingType, int, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.vt.d
    public final Object o0(String str, k0 k0Var) {
        return this.c.getComment(this.b, str, k0Var);
    }
}
