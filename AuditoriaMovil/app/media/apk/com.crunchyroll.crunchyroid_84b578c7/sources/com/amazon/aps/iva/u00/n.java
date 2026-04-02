package com.amazon.aps.iva.u00;

import com.amazon.aps.iva.lb0.x;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: BulkDownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public abstract class n extends com.amazon.aps.iva.a70.b {

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends n {
        public a(boolean z) {
            super(R.string.action_change_preferences, 0, 2, z);
        }
    }

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static a a(com.amazon.aps.iva.hg.g gVar) {
            boolean z = true;
            if (((PlayableAsset) x.t0(gVar.d)).getVersions().size() <= 1) {
                z = false;
            }
            return new a(z);
        }

        public static e b(com.amazon.aps.iva.hg.d dVar) {
            boolean z;
            int i = dVar.b;
            boolean z2 = true;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i > 0) {
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
            }
            return e.e;
        }

        public static f c(com.amazon.aps.iva.hg.d dVar) {
            boolean z;
            boolean z2 = true;
            if (dVar.a > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (dVar.b <= 0) {
                    z2 = false;
                }
                if (z2) {
                    return f.e;
                }
            }
            return null;
        }
    }

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends n {
        public static final c e = new c();

        public c() {
            super(R.string.action_remove_all, R.color.cr_red_orange, 4, false);
        }
    }

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends n {
        public static final d e = new d();

        public d() {
            super(R.string.action_stop_all, 0, 6, false);
        }
    }

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends n {
        public static final e e = new e();

        public e() {
            super(R.string.action_sync_all, 0, 6, false);
        }
    }

    /* compiled from: BulkDownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends n {
        public static final f e = new f();

        public f() {
            super(R.string.action_sync_unwatched, 0, 6, false);
        }
    }

    public n(int i, int i2, int i3, boolean z) {
        super(i, Integer.valueOf((i3 & 2) != 0 ? R.color.color_white : i2), (i3 & 4) != 0 ? true : z, Integer.valueOf((int) R.color.cr_scarpa_flow));
    }
}
