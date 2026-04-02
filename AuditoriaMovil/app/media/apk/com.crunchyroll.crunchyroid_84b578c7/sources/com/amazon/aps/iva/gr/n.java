package com.amazon.aps.iva.gr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Spanned;
import com.amazon.aps.iva.a6.i0;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.g8.t0;
import com.amazon.aps.iva.h2.k0;
import com.amazon.aps.iva.h8.e;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.r4.c2;
import com.amazon.aps.iva.r4.d2;
import com.amazon.aps.iva.r4.e2;
import com.amazon.aps.iva.r4.f2;
import com.amazon.aps.iva.r4.r1;
import com.amazon.aps.iva.r4.t1;
import com.amazon.aps.iva.r4.y0;
import com.amazon.aps.iva.u4.g;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xe0.s;
import com.amazon.aps.iva.y4.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
/* compiled from: NoOpTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class n implements o, com.amazon.aps.iva.ih.c, com.amazon.aps.iva.sq.g, com.amazon.aps.iva.tp.m {
    public static final n b = new n();
    public static final com.amazon.aps.iva.vs.d c = new com.amazon.aps.iva.vs.d();
    public static final s d = new s("NULL");
    public static final s e = new s("UNINITIALIZED");

    public static final void A(g0 g0Var, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        g0Var.setValue(lVar.invoke(g0Var.getValue()));
    }

    public static final com.amazon.aps.iva.u4.c B(com.amazon.aps.iva.b5.c cVar, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c2.a.a(cVar);
        }
        com.amazon.aps.iva.b5.c d2 = y0.d(cVar, context);
        if (d2 instanceof c.a) {
            return com.amazon.aps.iva.u4.c.EXACT;
        }
        if (d2 instanceof c.e) {
            return com.amazon.aps.iva.u4.c.WRAP;
        }
        if (d2 instanceof c.C0130c) {
            return com.amazon.aps.iva.u4.c.FILL;
        }
        if (d2 instanceof c.b) {
            return com.amazon.aps.iva.u4.c.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present".toString());
    }

    public static final com.amazon.aps.iva.u4.j C(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return com.amazon.aps.iva.u4.j.TOP;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return com.amazon.aps.iva.u4.j.CENTER_VERTICALLY;
        }
        if (i == 2) {
            z3 = true;
        }
        if (z3) {
            return com.amazon.aps.iva.u4.j.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) a.b.b(i))).toString());
    }

    public static final com.amazon.aps.iva.u4.d D(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return com.amazon.aps.iva.u4.d.START;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return com.amazon.aps.iva.u4.d.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            z3 = true;
        }
        if (z3) {
            return com.amazon.aps.iva.u4.d.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) a.C0884a.b(i))).toString());
    }

    public static final float E(Number number) {
        com.amazon.aps.iva.yb0.j.f(number, "<this>");
        return number.floatValue() / 1000;
    }

    public static final com.amazon.aps.iva.kj.e F(com.amazon.aps.iva.no.b bVar, long j) {
        t tVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
        PlayableAsset playableAsset = bVar.a;
        String id = playableAsset.getId();
        String channelId = playableAsset.getChannelId();
        String title = playableAsset.getTitle();
        if (playableAsset.getParentType() == t.SERIES) {
            tVar = t.EPISODE;
        } else {
            tVar = t.MOVIE;
        }
        t tVar2 = tVar;
        boolean isPremiumOnly = playableAsset.isPremiumOnly();
        boolean isMature = playableAsset.isMature();
        boolean isMatureBlocked = playableAsset.isMatureBlocked();
        boolean isSubbed = playableAsset.isSubbed();
        boolean isDubbed = playableAsset.isDubbed();
        long durationMs = playableAsset.getDurationMs();
        String parentId = playableAsset.getParentId();
        List<Image> thumbnails = playableAsset.getImages().getThumbnails();
        ArrayList arrayList = new ArrayList(r.Y(thumbnails));
        Iterator it = thumbnails.iterator();
        while (it.hasNext()) {
            Image image = (Image) it.next();
            arrayList.add(new Image(image.getUrl(), image.getWidth(), image.getHeight()));
            it = it;
            tVar2 = tVar2;
        }
        t tVar3 = tVar2;
        boolean z = playableAsset instanceof Episode;
        if (!z) {
            str = "";
        } else {
            str = ((Episode) playableAsset).getSeriesTitle();
        }
        if (!z) {
            str2 = "";
        } else {
            str2 = ((Episode) playableAsset).getEpisodeNumber();
        }
        if (!z) {
            str3 = "";
        } else {
            str3 = ((Episode) playableAsset).getSeasonNumber();
        }
        if (!z) {
            str4 = "";
        } else {
            str4 = ((Episode) playableAsset).getSeasonTitle();
        }
        String title2 = playableAsset.getTitle();
        String audioLocale = playableAsset.getAudioLocale();
        SkipEvents skipEvents = bVar.f;
        List<PlayableAssetVersion> versions = playableAsset.getVersions();
        ExtendedMaturityRating extendedMaturityRating = playableAsset.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str5 = extendedMaturityRating.getRating();
        } else {
            str5 = null;
        }
        ExtendedMaturityRating extendedMaturityRating2 = playableAsset.getExtendedMaturityRating();
        if (extendedMaturityRating2 != null) {
            str6 = extendedMaturityRating2.getSystem();
        } else {
            str6 = null;
        }
        return new com.amazon.aps.iva.kj.e(id, channelId, title, parentId, tVar3, title2, str2, str4, str3, str, Boolean.valueOf(isPremiumOnly), Boolean.valueOf(isMature), Boolean.valueOf(isMatureBlocked), Boolean.valueOf(isSubbed), Boolean.valueOf(isDubbed), Long.valueOf(durationMs), arrayList, audioLocale, playableAsset, j, skipEvents, versions, str5, str6, 32768);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList G(java.util.List r13, java.util.List r14, java.util.List r15) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            java.lang.String r1 = "states"
            com.amazon.aps.iva.yb0.j.f(r14, r1)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r13)
            r1.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L19:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lce
            java.lang.Object r2 = r13.next()
            boolean r3 = r2 instanceof com.amazon.aps.iva.qg.c
            if (r3 == 0) goto Lc9
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto Lb9
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.amazon.aps.iva.qg.b r6 = (com.amazon.aps.iva.qg.b) r6
            r7 = r2
            com.amazon.aps.iva.qg.c r7 = (com.amazon.aps.iva.qg.c) r7
            java.lang.String r7 = r7.b()
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            java.lang.String r8 = "assetId"
            com.amazon.aps.iva.yb0.j.f(r7, r8)
            java.lang.String r6 = r6.a
            boolean r8 = com.amazon.aps.iva.yb0.j.a(r6, r7)
            r9 = 1
            if (r8 != 0) goto Lb6
            r8 = 0
            if (r15 == 0) goto Lb1
            r10 = r15
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L5e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L76
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.ellation.crunchyroll.model.PlayableAsset r12 = (com.ellation.crunchyroll.model.PlayableAsset) r12
            java.lang.String r12 = r12.getId()
            boolean r12 = com.amazon.aps.iva.yb0.j.a(r12, r7)
            if (r12 == 0) goto L5e
            r5 = r11
        L76:
            com.ellation.crunchyroll.model.PlayableAsset r5 = (com.ellation.crunchyroll.model.PlayableAsset) r5
            if (r5 == 0) goto Lb1
            java.util.List r5 = r5.getVersions()
            if (r5 == 0) goto Lb1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r7 = r5 instanceof java.util.Collection
            if (r7 == 0) goto L90
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L90
            goto Lac
        L90:
            java.util.Iterator r5 = r5.iterator()
        L94:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lac
            java.lang.Object r7 = r5.next()
            com.ellation.crunchyroll.model.PlayableAssetVersion r7 = (com.ellation.crunchyroll.model.PlayableAssetVersion) r7
            java.lang.String r7 = r7.getAssetId()
            boolean r7 = com.amazon.aps.iva.yb0.j.a(r7, r6)
            if (r7 == 0) goto L94
            r5 = r9
            goto Lad
        Lac:
            r5 = r8
        Lad:
            if (r5 != r9) goto Lb1
            r5 = r9
            goto Lb2
        Lb1:
            r5 = r8
        Lb2:
            if (r5 == 0) goto Lb5
            goto Lb6
        Lb5:
            r9 = r8
        Lb6:
            if (r9 == 0) goto L2e
            r5 = r4
        Lb9:
            com.amazon.aps.iva.qg.b r5 = (com.amazon.aps.iva.qg.b) r5
            if (r5 == 0) goto Lc9
            r3 = r2
            com.amazon.aps.iva.qg.c r3 = (com.amazon.aps.iva.qg.c) r3
            com.crunchyroll.downloading.presentation.download.button.DownloadButtonState r4 = r5.b
            java.lang.Object r3 = r3.a(r4)
            if (r3 == 0) goto Lc9
            r2 = r3
        Lc9:
            r1.add(r2)
            goto L19
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gr.n.G(java.util.List, java.util.List, java.util.List):java.util.ArrayList");
    }

    public static final com.amazon.aps.iva.o2.d i(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        return new com.amazon.aps.iva.o2.d(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static float j(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final long k(int i) {
        long j = (i << 32) | (0 & 4294967295L);
        int i2 = com.amazon.aps.iva.n1.a.l;
        return j;
    }

    public static float l(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void m(float[] fArr, float[] fArr2) {
        float r = r(0, 0, fArr2, fArr);
        float r2 = r(0, 1, fArr2, fArr);
        float r3 = r(0, 2, fArr2, fArr);
        float r4 = r(0, 3, fArr2, fArr);
        float r5 = r(1, 0, fArr2, fArr);
        float r6 = r(1, 1, fArr2, fArr);
        float r7 = r(1, 2, fArr2, fArr);
        float r8 = r(1, 3, fArr2, fArr);
        float r9 = r(2, 0, fArr2, fArr);
        float r10 = r(2, 1, fArr2, fArr);
        float r11 = r(2, 2, fArr2, fArr);
        float r12 = r(2, 3, fArr2, fArr);
        float r13 = r(3, 0, fArr2, fArr);
        float r14 = r(3, 1, fArr2, fArr);
        float r15 = r(3, 2, fArr2, fArr);
        float r16 = r(3, 3, fArr2, fArr);
        fArr[0] = r;
        fArr[1] = r2;
        fArr[2] = r3;
        fArr[3] = r4;
        fArr[4] = r5;
        fArr[5] = r6;
        fArr[6] = r7;
        fArr[7] = r8;
        fArr[8] = r9;
        fArr[9] = r10;
        fArr[10] = r11;
        fArr[11] = r12;
        fArr[12] = r13;
        fArr[13] = r14;
        fArr[14] = r15;
        fArr[15] = r16;
    }

    public static final void n(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    public static final void o(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", i2));
    }

    public static final void p(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException(j0.e("fromIndex: ", i, " > toIndex: ", i2));
        }
        StringBuilder a = x.a("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
        a.append(i3);
        throw new IndexOutOfBoundsException(a.toString());
    }

    public static final com.amazon.aps.iva.u4.g q(Context context, com.amazon.aps.iva.p4.i iVar) {
        com.amazon.aps.iva.u4.h hVar;
        com.amazon.aps.iva.b5.c cVar;
        com.amazon.aps.iva.b5.c cVar2;
        com.amazon.aps.iva.p4.k kVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.u4.b bVar;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(iVar, "element");
        g.a u = com.amazon.aps.iva.u4.g.u();
        boolean z3 = iVar instanceof com.amazon.aps.iva.y4.g;
        if (z3) {
            hVar = com.amazon.aps.iva.u4.h.BOX;
        } else if (iVar instanceof com.amazon.aps.iva.p4.j) {
            hVar = com.amazon.aps.iva.u4.h.BUTTON;
        } else if (iVar instanceof com.amazon.aps.iva.y4.i) {
            if (r1.a(iVar.a())) {
                hVar = com.amazon.aps.iva.u4.h.RADIO_ROW;
            } else {
                hVar = com.amazon.aps.iva.u4.h.ROW;
            }
        } else if (iVar instanceof com.amazon.aps.iva.y4.h) {
            if (r1.a(iVar.a())) {
                hVar = com.amazon.aps.iva.u4.h.RADIO_COLUMN;
            } else {
                hVar = com.amazon.aps.iva.u4.h.COLUMN;
            }
        } else if (iVar instanceof com.amazon.aps.iva.a5.a) {
            hVar = com.amazon.aps.iva.u4.h.TEXT;
        } else if (iVar instanceof com.amazon.aps.iva.t4.c) {
            hVar = com.amazon.aps.iva.u4.h.LIST_ITEM;
        } else if (iVar instanceof com.amazon.aps.iva.t4.a) {
            hVar = com.amazon.aps.iva.u4.h.LAZY_COLUMN;
        } else if (iVar instanceof com.amazon.aps.iva.r4.o) {
            hVar = com.amazon.aps.iva.u4.h.ANDROID_REMOTE_VIEWS;
        } else if (iVar instanceof com.amazon.aps.iva.r4.p) {
            hVar = com.amazon.aps.iva.u4.h.CHECK_BOX;
        } else if (iVar instanceof com.amazon.aps.iva.y4.j) {
            hVar = com.amazon.aps.iva.u4.h.SPACER;
        } else if (iVar instanceof com.amazon.aps.iva.r4.t) {
            hVar = com.amazon.aps.iva.u4.h.SWITCH;
        } else if (iVar instanceof com.amazon.aps.iva.p4.k) {
            hVar = com.amazon.aps.iva.u4.h.IMAGE;
        } else if (iVar instanceof com.amazon.aps.iva.r4.r) {
            hVar = com.amazon.aps.iva.u4.h.LINEAR_PROGRESS_INDICATOR;
        } else if (iVar instanceof com.amazon.aps.iva.r4.q) {
            hVar = com.amazon.aps.iva.u4.h.CIRCULAR_PROGRESS_INDICATOR;
        } else if (iVar instanceof com.amazon.aps.iva.t4.d) {
            hVar = com.amazon.aps.iva.u4.h.LAZY_VERTICAL_GRID;
        } else if (iVar instanceof com.amazon.aps.iva.t4.e) {
            hVar = com.amazon.aps.iva.u4.h.LIST_ITEM;
        } else if (iVar instanceof t1) {
            hVar = com.amazon.aps.iva.u4.h.REMOTE_VIEWS_ROOT;
        } else if (iVar instanceof com.amazon.aps.iva.r4.s) {
            hVar = com.amazon.aps.iva.u4.h.RADIO_BUTTON;
        } else {
            throw new IllegalArgumentException("Unknown element type " + iVar.getClass().getCanonicalName());
        }
        u.e();
        com.amazon.aps.iva.u4.g.l((com.amazon.aps.iva.u4.g) u.c, hVar);
        com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) iVar.a().a(null, e2.h);
        if (rVar == null || (cVar = rVar.b) == null) {
            cVar = c.e.a;
        }
        com.amazon.aps.iva.u4.c B = B(cVar, context);
        u.e();
        com.amazon.aps.iva.u4.g.m((com.amazon.aps.iva.u4.g) u.c, B);
        com.amazon.aps.iva.y4.k kVar2 = (com.amazon.aps.iva.y4.k) iVar.a().a(null, f2.h);
        if (kVar2 == null || (cVar2 = kVar2.b) == null) {
            cVar2 = c.e.a;
        }
        com.amazon.aps.iva.u4.c B2 = B(cVar2, context);
        u.e();
        com.amazon.aps.iva.u4.g.n((com.amazon.aps.iva.u4.g) u.c, B2);
        if (iVar.a().a(null, d2.h) != null) {
            com.amazon.aps.iva.u4.i iVar2 = com.amazon.aps.iva.u4.i.BACKGROUND_NODE;
            u.e();
            com.amazon.aps.iva.u4.g.r((com.amazon.aps.iva.u4.g) u.c, iVar2);
        }
        boolean z4 = false;
        if (iVar instanceof com.amazon.aps.iva.p4.k) {
            int i = ((com.amazon.aps.iva.p4.k) iVar).d;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar = com.amazon.aps.iva.u4.b.FIT;
            } else {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    bVar = com.amazon.aps.iva.u4.b.CROP;
                } else {
                    if (i == 2) {
                        z4 = true;
                    }
                    if (z4) {
                        bVar = com.amazon.aps.iva.u4.b.FILL_BOUNDS;
                    } else {
                        throw new IllegalStateException(("Unknown content scale " + ((Object) com.amazon.aps.iva.y4.f.a(kVar.d))).toString());
                    }
                }
            }
            u.e();
            com.amazon.aps.iva.u4.g.q((com.amazon.aps.iva.u4.g) u.c, bVar);
        } else if (iVar instanceof com.amazon.aps.iva.y4.h) {
            com.amazon.aps.iva.u4.d D = D(((com.amazon.aps.iva.y4.h) iVar).f);
            u.e();
            com.amazon.aps.iva.u4.g.o((com.amazon.aps.iva.u4.g) u.c, D);
        } else if (iVar instanceof com.amazon.aps.iva.y4.i) {
            com.amazon.aps.iva.u4.j C = C(((com.amazon.aps.iva.y4.i) iVar).f);
            u.e();
            com.amazon.aps.iva.u4.g.p((com.amazon.aps.iva.u4.g) u.c, C);
        } else if (z3) {
            com.amazon.aps.iva.y4.g gVar = (com.amazon.aps.iva.y4.g) iVar;
            com.amazon.aps.iva.u4.d D2 = D(gVar.e.a);
            u.e();
            com.amazon.aps.iva.u4.g.o((com.amazon.aps.iva.u4.g) u.c, D2);
            com.amazon.aps.iva.u4.j C2 = C(gVar.e.b);
            u.e();
            com.amazon.aps.iva.u4.g.p((com.amazon.aps.iva.u4.g) u.c, C2);
        } else if (iVar instanceof com.amazon.aps.iva.t4.a) {
            com.amazon.aps.iva.t4.a aVar = (com.amazon.aps.iva.t4.a) iVar;
            com.amazon.aps.iva.u4.d D3 = D(0);
            u.e();
            com.amazon.aps.iva.u4.g.o((com.amazon.aps.iva.u4.g) u.c, D3);
        }
        if ((iVar instanceof com.amazon.aps.iva.p4.l) && !(iVar instanceof com.amazon.aps.iva.t4.b)) {
            ArrayList arrayList = ((com.amazon.aps.iva.p4.l) iVar).c;
            ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(q(context, (com.amazon.aps.iva.p4.i) it.next()));
            }
            u.e();
            com.amazon.aps.iva.u4.g.s((com.amazon.aps.iva.u4.g) u.c, arrayList2);
        }
        return u.c();
    }

    public static final float r(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        float f = (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 0] * fArr2[0 + i2]);
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + f;
    }

    public static int s(int i, float f, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float j = j(((i >> 16) & 255) / 255.0f);
        float j2 = j(((i >> 8) & 255) / 255.0f);
        float j3 = j((i & 255) / 255.0f);
        float j4 = j(((i2 >> 16) & 255) / 255.0f);
        float j5 = j(((i2 >> 8) & 255) / 255.0f);
        float j6 = j((i2 & 255) / 255.0f);
        float a = t0.a(((i2 >> 24) & 255) / 255.0f, f2, f, f2);
        float a2 = t0.a(j4, j, f, j);
        float a3 = t0.a(j5, j2, f, j2);
        float a4 = t0.a(j6, j3, f, j3);
        int round = Math.round(l(a2) * 255.0f) << 16;
        return Math.round(l(a4) * 255.0f) | round | (Math.round(a * 255.0f) << 24) | (Math.round(l(a3) * 255.0f) << 8);
    }

    public static String t(ArrayList arrayList, String str, k0 k0Var, int i) {
        CharSequence charSequence;
        int i2;
        String str2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i & 2) != 0) {
            charSequence = "";
        } else {
            charSequence = null;
        }
        if ((i & 4) == 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            str2 = "...";
        } else {
            str2 = null;
        }
        k0 k0Var2 = k0Var;
        if ((i & 32) != 0) {
            k0Var2 = null;
        }
        com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "separator");
        com.amazon.aps.iva.yb0.j.f(charSequence, "prefix");
        com.amazon.aps.iva.yb0.j.f(str3, "postfix");
        com.amazon.aps.iva.yb0.j.f(str2, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            i3++;
            boolean z = true;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (k0Var2 != null) {
                sb.append((CharSequence) k0Var2.invoke(obj));
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(obj));
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) str2);
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static boolean u(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "callableMemberDescriptor");
        if (!com.amazon.aps.iva.xc0.j.d.contains(bVar.getName())) {
            return false;
        }
        if (!com.amazon.aps.iva.lb0.x.m0(com.amazon.aps.iva.xc0.j.c, com.amazon.aps.iva.ud0.b.c(bVar)) || !bVar.f().isEmpty()) {
            if (!com.amazon.aps.iva.lc0.k.A(bVar)) {
                return false;
            }
            Collection<? extends com.amazon.aps.iva.oc0.b> k = bVar.k();
            com.amazon.aps.iva.yb0.j.e(k, "overriddenDescriptors");
            Collection<? extends com.amazon.aps.iva.oc0.b> collection = k;
            if (collection.isEmpty()) {
                return false;
            }
            for (com.amazon.aps.iva.oc0.b bVar2 : collection) {
                com.amazon.aps.iva.yb0.j.e(bVar2, "it");
                if (u(bVar2)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean v(Spanned spanned, Class cls) {
        com.amazon.aps.iva.yb0.j.f(spanned, "<this>");
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final boolean w(Intent intent) {
        if (intent == null || !intent.hasExtra("should_animate")) {
            return false;
        }
        return true;
    }

    public static final long x(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(j);
    }

    public static final void y(com.amazon.aps.iva.g8.k0 k0Var, com.amazon.aps.iva.vi.a aVar, com.amazon.aps.iva.v0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(k0Var, "<this>");
        String a = aVar.a();
        com.amazon.aps.iva.v0.a c2 = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(aVar2), true);
        com.amazon.aps.iva.g8.t0 t0Var = k0Var.g;
        t0Var.getClass();
        e.a aVar3 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c2);
        aVar3.l(a);
        aVar3.l = null;
        aVar3.m = null;
        aVar3.n = null;
        aVar3.o = null;
        k0Var.i.add(aVar3);
    }

    public static final long z(long j) {
        return TimeUnit.SECONDS.toMillis(j);
    }

    @Override // com.amazon.aps.iva.gr.o
    public void a(Context context) {
    }

    @Override // com.amazon.aps.iva.tp.m
    public File b() {
        return null;
    }

    @Override // com.amazon.aps.iva.tp.m
    public File c(int i) {
        return null;
    }

    @Override // com.amazon.aps.iva.gr.o
    public void d(Context context) {
    }

    @Override // com.amazon.aps.iva.sq.g
    public void e(Request request) {
    }

    @Override // com.amazon.aps.iva.ih.c
    public void f(final Activity activity, final com.amazon.aps.iva.ch.e eVar, final com.amazon.aps.iva.ch.f fVar) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        final ReviewManager create = ReviewManagerFactory.create(activity);
        com.amazon.aps.iva.yb0.j.e(create, "create(activity)");
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        com.amazon.aps.iva.yb0.j.e(requestReviewFlow, "manager.requestReviewFlow()");
        requestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.amazon.aps.iva.ih.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReviewManager reviewManager = ReviewManager.this;
                j.f(reviewManager, "$manager");
                Activity activity2 = activity;
                j.f(activity2, "$activity");
                final l lVar = fVar;
                j.f(lVar, "$onFailure");
                com.amazon.aps.iva.xb0.a aVar = eVar;
                j.f(aVar, "$onComplete");
                j.f(task, "task");
                if (task.isSuccessful()) {
                    reviewManager.launchReviewFlow(activity2, (ReviewInfo) task.getResult()).addOnCompleteListener(new i0(aVar, 6)).addOnFailureListener(new OnFailureListener() { // from class: com.amazon.aps.iva.ih.b
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            l lVar2 = l.this;
                            j.f(lVar2, "$tmp0");
                            j.f(exc, "p0");
                            lVar2.invoke(exc);
                        }
                    });
                } else {
                    lVar.invoke(task.getException());
                }
            }
        });
    }

    @Override // com.amazon.aps.iva.tp.m
    public File h(Set set) {
        return null;
    }
}
