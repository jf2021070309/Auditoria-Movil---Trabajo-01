package com.amazon.aps.iva.f00;

import android.content.Context;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import java.util.List;
import java.util.Map;
/* compiled from: ShowPagePlayableAssetUiModelFactory.kt */
/* loaded from: classes2.dex */
public final class a0 extends r {
    public final com.amazon.aps.iva.fg.b h;

    /* compiled from: ShowPagePlayableAssetUiModelFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.assets.list.item.ShowPagePlayableAssetUiModelFactory", f = "ShowPagePlayableAssetUiModelFactory.kt", l = {40, 44}, m = "createFromAssetsSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public List i;
        public Map j;
        public Map k;
        public /* synthetic */ Object l;
        public int n;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return a0.this.d(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, com.amazon.aps.iva.sv.n nVar, InternalDownloadsManager internalDownloadsManager, com.amazon.aps.iva.at.c cVar, com.amazon.aps.iva.mt.m mVar, DurationFormatter durationFormatter, SmallDurationFormatter smallDurationFormatter) {
        super(context, cVar, mVar, durationFormatter, smallDurationFormatter, internalDownloadsManager, true, 64);
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        com.amazon.aps.iva.yb0.j.f(durationFormatter, "durationFormatter");
        com.amazon.aps.iva.yb0.j.f(smallDurationFormatter, "smallDurationFormatter");
        this.h = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    @Override // com.amazon.aps.iva.f00.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r10, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead> r11, java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.commenting.model.Guestbook> r12, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.f00.a>> r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f00.a0.d(java.util.List, java.util.Map, java.util.Map, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
