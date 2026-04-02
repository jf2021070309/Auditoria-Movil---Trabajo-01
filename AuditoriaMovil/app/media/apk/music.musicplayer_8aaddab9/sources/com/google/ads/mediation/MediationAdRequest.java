package com.google.ads.mediation;

import android.location.Location;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
@Deprecated
/* loaded from: classes.dex */
public class MediationAdRequest {
    public final Date a;

    /* renamed from: b  reason: collision with root package name */
    public final AdRequest.Gender f4494b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f4495c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4496d;

    /* renamed from: e  reason: collision with root package name */
    public final Location f4497e;

    public MediationAdRequest(@RecentlyNonNull Date date, @RecentlyNonNull AdRequest.Gender gender, @RecentlyNonNull Set<String> set, boolean z, @RecentlyNonNull Location location) {
        this.a = date;
        this.f4494b = gender;
        this.f4495c = set;
        this.f4496d = z;
        this.f4497e = location;
    }

    @RecentlyNonNull
    public Integer getAgeInYears() {
        if (this.a != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(this.a);
            Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
            return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
        }
        return null;
    }

    @RecentlyNonNull
    public Date getBirthday() {
        return this.a;
    }

    @RecentlyNonNull
    public AdRequest.Gender getGender() {
        return this.f4494b;
    }

    @RecentlyNonNull
    public Set<String> getKeywords() {
        return this.f4495c;
    }

    @RecentlyNonNull
    public Location getLocation() {
        return this.f4497e;
    }

    public boolean isTesting() {
        return this.f4496d;
    }
}
