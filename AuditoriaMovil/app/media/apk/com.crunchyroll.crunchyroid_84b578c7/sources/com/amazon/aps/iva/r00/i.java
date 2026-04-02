package com.amazon.aps.iva.r00;

import android.view.View;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.p00.c;
import com.amazon.aps.iva.r00.q;
import com.amazon.aps.iva.sv.g2;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import java.util.ArrayList;
/* compiled from: DownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<p> {
    public final g2 b;
    public final com.amazon.aps.iva.mt.n c;
    public final com.amazon.aps.iva.og.a d;

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayableAsset playableAsset) {
            super(0);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            i iVar = i.this;
            iVar.b.Z0(this.i, new h(iVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadActionsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PlayableAsset playableAsset) {
            super(0);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            i.this.b.S0(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public i(c.C0590c c0590c, com.amazon.aps.iva.sv.n nVar, com.amazon.aps.iva.mt.o oVar, e eVar) {
        super(c0590c, new com.amazon.aps.iva.wy.j[0]);
        this.b = nVar;
        this.c = oVar;
        this.d = eVar;
    }

    public static final void q6(i iVar, PlayableAsset playableAsset, String str) {
        iVar.getView().l2(playableAsset.getVersions(), str, new o(iVar, playableAsset, str));
    }

    public final void r6(PlayableAsset playableAsset, DownloadButtonState downloadButtonState, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList<q> O;
        boolean z6 = downloadButtonState instanceof DownloadButtonState.NotStarted;
        com.amazon.aps.iva.og.a aVar = this.d;
        if (z6) {
            aVar.j2(playableAsset, new a(playableAsset));
        } else if (downloadButtonState instanceof DownloadButtonState.Paused) {
            aVar.j2(playableAsset, new b(playableAsset));
        } else {
            boolean z7 = true;
            if (downloadButtonState instanceof DownloadButtonState.InProgress) {
                z = true;
            } else {
                z = downloadButtonState instanceof DownloadButtonState.Waiting;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = downloadButtonState instanceof DownloadButtonState.Failed;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = downloadButtonState instanceof DownloadButtonState.Expired;
            }
            if (z3) {
                z4 = true;
            } else {
                z4 = downloadButtonState instanceof DownloadButtonState.Finished;
            }
            if (z4) {
                p view2 = getView();
                com.amazon.aps.iva.yb0.j.f(downloadButtonState, "state");
                com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
                if (downloadButtonState instanceof DownloadButtonState.InProgress) {
                    O = com.amazon.aps.iva.lb0.o.O(new q[]{q.d.e, q.c.a(playableAsset), q.a.e});
                } else if (downloadButtonState instanceof DownloadButtonState.Waiting) {
                    O = com.amazon.aps.iva.lb0.o.O(new q[]{q.c.a(playableAsset), q.a.e});
                } else if (downloadButtonState instanceof DownloadButtonState.Expired) {
                    O = com.amazon.aps.iva.lb0.o.O(new q[]{q.e.e, q.c.a(playableAsset), q.f.e});
                } else if (downloadButtonState instanceof DownloadButtonState.Failed) {
                    O = com.amazon.aps.iva.lb0.o.O(new q[]{q.g.e, q.c.a(playableAsset), q.e.e});
                } else if (downloadButtonState instanceof DownloadButtonState.Finished) {
                    O = com.amazon.aps.iva.lb0.o.O(new q[]{q.c.a(playableAsset), q.e.e});
                } else {
                    if (downloadButtonState instanceof DownloadButtonState.Paused) {
                        z5 = true;
                    } else {
                        z5 = downloadButtonState instanceof DownloadButtonState.NotStarted;
                    }
                    if (!z5) {
                        z7 = downloadButtonState instanceof DownloadButtonState.Inactive;
                    }
                    if (!z7) {
                        if (downloadButtonState instanceof DownloadButtonState.Manage) {
                            O = com.amazon.aps.iva.lb0.o.O(new q[0]);
                        } else {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                    } else {
                        throw new IllegalArgumentException("There is no corresponding dialog for " + downloadButtonState.getClass() + " state");
                    }
                }
                ArrayList arrayList = new ArrayList(r.Y(O));
                for (q qVar : O) {
                    arrayList.add(new com.amazon.aps.iva.a70.a(qVar, null));
                }
                view2.nd(playableAsset, new com.amazon.aps.iva.a70.c<>(arrayList, this.c.b(playableAsset)), view);
            }
        }
    }

    public final void s6(PlayableAsset playableAsset, DownloadButtonState downloadButtonState, DownloadButton downloadButton) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "state");
        String id = playableAsset.getId();
        String str = downloadButtonState.a;
        if (!com.amazon.aps.iva.yb0.j.a(str, id) && !com.amazon.aps.iva.oe0.m.b0(str)) {
            this.b.W0(str, new n(this, downloadButtonState, downloadButton));
            return;
        }
        r6(playableAsset, downloadButtonState, downloadButton);
    }
}
