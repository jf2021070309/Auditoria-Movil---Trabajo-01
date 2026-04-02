package com.amazon.aps.iva.at;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.music.MusicAvailability;
import com.ellation.crunchyroll.model.music.MusicVideo;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: MusicContentAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public final class f implements d {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<Date> b;

    public f(com.amazon.aps.iva.xb0.a aVar) {
        j.f(aVar, "isUserPremium");
        e eVar = e.h;
        j.f(eVar, "currentDate");
        this.a = aVar;
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.at.d
    public final ArrayList a(MusicAsset musicAsset) {
        boolean z;
        j.f(musicAsset, "asset");
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if ((musicAsset instanceof MusicVideo) && musicAsset.isMature()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add("matureBlocked");
        }
        if (!musicAsset.isPremiumOnly() || this.a.invoke().booleanValue()) {
            z2 = false;
        }
        if (z2) {
            arrayList.add("premium");
        }
        if (d(musicAsset)) {
            arrayList.add("unavailable");
        }
        if (c(musicAsset)) {
            arrayList.add("comingSoon");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("available");
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.at.d
    public final String b(MusicAsset musicAsset) {
        boolean z;
        j.f(musicAsset, "asset");
        boolean z2 = true;
        if ((musicAsset instanceof MusicVideo) && musicAsset.isMature()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "matureBlocked";
        }
        if (!musicAsset.isPremiumOnly() || this.a.invoke().booleanValue()) {
            z2 = false;
        }
        if (z2) {
            return "premium";
        }
        if (d(musicAsset)) {
            return "unavailable";
        }
        if (c(musicAsset)) {
            return "comingSoon";
        }
        return "available";
    }

    public final boolean c(MusicAsset musicAsset) {
        Date date;
        MusicAvailability availability = musicAsset.getAvailability();
        if (availability != null) {
            date = availability.getStartDate();
        } else {
            date = null;
        }
        if (date != null && this.b.invoke().before(date)) {
            return true;
        }
        return false;
    }

    public final boolean d(MusicAsset musicAsset) {
        Date date;
        MusicAvailability availability = musicAsset.getAvailability();
        if (availability != null) {
            date = availability.getEndDate();
        } else {
            date = null;
        }
        if (date != null && date.before(this.b.invoke())) {
            return true;
        }
        return false;
    }
}
