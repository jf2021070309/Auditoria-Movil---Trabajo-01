package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.cj.y;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.i0;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicImages;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MusicHeroItemInteractor.kt */
/* loaded from: classes2.dex */
public final class t implements y, com.amazon.aps.iva.pc.a {
    public static com.amazon.aps.iva.kh.d a;
    public static final com.amazon.aps.iva.p1.b b = new com.amazon.aps.iva.p1.b(1000);
    public static com.amazon.aps.iva.y50.a c;
    public static final com.amazon.aps.iva.xe0.s d;
    public static final com.amazon.aps.iva.xe0.s e;
    public static final com.amazon.aps.iva.xe0.s f;
    public static final com.amazon.aps.iva.ze0.b g;
    public static final com.amazon.aps.iva.ze0.b h;

    static {
        new com.amazon.aps.iva.p1.b(1007);
        new com.amazon.aps.iva.p1.b(1008);
        new com.amazon.aps.iva.p1.b(1002);
        d = new com.amazon.aps.iva.xe0.s("UNLOCK_FAIL");
        com.amazon.aps.iva.xe0.s sVar = new com.amazon.aps.iva.xe0.s("LOCKED");
        e = sVar;
        com.amazon.aps.iva.xe0.s sVar2 = new com.amazon.aps.iva.xe0.s("UNLOCKED");
        f = sVar2;
        g = new com.amazon.aps.iva.ze0.b(sVar);
        h = new com.amazon.aps.iva.ze0.b(sVar2);
    }

    public static com.amazon.aps.iva.ze0.d d() {
        return new com.amazon.aps.iva.ze0.d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.amazon.aps.iva.xx.p e(MusicAsset musicAsset, com.amazon.aps.iva.yh.c cVar) {
        com.amazon.aps.iva.x50.t tVar;
        z zVar;
        String b2 = cVar.b(musicAsset);
        MusicImages images = musicAsset.getImages();
        String c2 = cVar.c(musicAsset);
        String id = musicAsset.getId();
        boolean z = musicAsset instanceof MusicVideo;
        if (z) {
            tVar = com.amazon.aps.iva.x50.t.MUSIC_VIDEO;
        } else {
            tVar = com.amazon.aps.iva.x50.t.CONCERT;
        }
        com.amazon.aps.iva.x50.t tVar2 = tVar;
        String description = musicAsset.getDescription();
        if (z) {
            List<MusicGenre> genres = ((MusicVideo) musicAsset).getGenres();
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(genres));
            for (MusicGenre musicGenre : genres) {
                arrayList.add(musicGenre.getDisplayValue());
            }
            zVar = arrayList;
        } else {
            zVar = z.b;
        }
        return new com.amazon.aps.iva.xx.p(b2, c2, images, id, tVar2, description, zVar, LabelUiModelKt.toLabelUiModel$default(musicAsset, false, 1, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(14:11|12|13|14|(1:16)(1:35)|17|(1:19)(1:34)|20|(2:23|21)|24|25|(1:33)(1:29)|30|31)(2:36|37))(15:38|39|40|14|(0)(0)|17|(0)(0)|20|(1:21)|24|25|(1:27)|33|30|31))(2:41|(15:43|(2:45|46)|40|14|(0)(0)|17|(0)(0)|20|(1:21)|24|25|(0)|33|30|31)(15:47|(2:49|50)|13|14|(0)(0)|17|(0)(0)|20|(1:21)|24|25|(0)|33|30|31))))|52|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[LOOP:0: B:41:0x00e8->B:43:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.ellation.crunchyroll.model.music.Artist r28, com.ellation.crunchyroll.api.etp.content.EtpContentService r29, com.amazon.aps.iva.ob0.d r30) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.t.f(com.ellation.crunchyroll.model.music.Artist, com.ellation.crunchyroll.api.etp.content.EtpContentService, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.cj.y
    public void a(i0 i0Var, i0 i0Var2, i0 i0Var3, g0 g0Var) {
    }

    @Override // com.amazon.aps.iva.pc.a
    public File b(com.amazon.aps.iva.kc.f fVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.pc.a
    public void c(com.amazon.aps.iva.kc.f fVar, com.amazon.aps.iva.nc.g gVar) {
    }
}
