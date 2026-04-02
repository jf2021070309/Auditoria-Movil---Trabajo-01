package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.nf.c;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: RestrictionOverlayMapperImpl.kt */
/* loaded from: classes2.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final com.amazon.aps.iva.nf.c a(String str, List list) {
        boolean z;
        PlayableAssetVersion playableAssetVersion;
        Object obj;
        String assetId;
        ?? r1;
        boolean z2;
        if (!list.isEmpty()) {
            List<PlayableAssetVersion> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (PlayableAssetVersion playableAssetVersion2 : list2) {
                    if (!playableAssetVersion2.isPremiumOnly()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                Iterator it = list2.iterator();
                while (true) {
                    playableAssetVersion = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        PlayableAssetVersion playableAssetVersion3 = (PlayableAssetVersion) obj;
                        if (playableAssetVersion3.getOriginal() && !playableAssetVersion3.isPremiumOnly()) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PlayableAssetVersion playableAssetVersion4 = (PlayableAssetVersion) obj;
                if (playableAssetVersion4 == null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            r1 = it2.next();
                            if (!((PlayableAssetVersion) r1).isPremiumOnly()) {
                                break;
                            }
                        } else {
                            r1 = 0;
                            break;
                        }
                    }
                    playableAssetVersion4 = r1;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next = it3.next();
                    if (com.amazon.aps.iva.yb0.j.a(((PlayableAssetVersion) next).getAudioLocale(), str)) {
                        playableAssetVersion = next;
                        break;
                    }
                }
                PlayableAssetVersion playableAssetVersion5 = playableAssetVersion;
                String str2 = "";
                String str3 = (playableAssetVersion5 == null || (str3 = playableAssetVersion5.getAudioLocale()) == null) ? "" : "";
                String str4 = (playableAssetVersion4 == null || (str4 = playableAssetVersion4.getAudioLocale()) == null) ? "" : "";
                if (playableAssetVersion4 != null && (assetId = playableAssetVersion4.getAssetId()) != null) {
                    str2 = assetId;
                }
                return new c.g(new com.amazon.aps.iva.rf.f(str3, str4, str2));
            }
        }
        return new c.f(false);
    }
}
