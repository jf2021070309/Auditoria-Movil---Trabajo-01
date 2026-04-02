package com.amazon.aps.iva.r00;

import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public abstract class q extends com.amazon.aps.iva.a70.b {

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends q {
        public static final a e = new a();

        public a() {
            super(R.string.action_cancel_download, 0, 6, false);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public b(boolean z) {
            super(R.string.action_change_preferences, 0, 2, z);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public static b a(PlayableAsset playableAsset) {
            boolean z = true;
            if (playableAsset.getVersions().size() <= 1) {
                z = false;
            }
            return new b(z);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends q {
        public static final d e = new d();

        public d() {
            super(R.string.action_pause_download, 0, 6, false);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends q {
        public static final e e = new e();

        public e() {
            super(R.string.action_remove_download, R.color.cr_red_orange, 4, false);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends q {
        public static final f e = new f();

        public f() {
            super(R.string.action_renew_download, 0, 6, false);
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends q {
        public static final g e = new g();

        public g() {
            super(R.string.action_retry_download, 0, 6, false);
        }
    }

    public q(int i, int i2, int i3, boolean z) {
        super(i, Integer.valueOf((i3 & 2) != 0 ? R.color.color_white : i2), (i3 & 4) != 0 ? true : z, Integer.valueOf((int) R.color.cr_scarpa_flow));
    }
}
