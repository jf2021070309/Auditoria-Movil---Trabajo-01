package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AllProfilesResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÂ\u0003J,\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/AllProfilesResponse;", "", "_maxProfiles", "", "_profiles", "", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileApiModel;", "(Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "maxProfilesCount", "getMaxProfilesCount", "()I", "profiles", "getProfiles", "()Ljava/util/List;", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/ellation/crunchyroll/api/etp/account/model/AllProfilesResponse;", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AllProfilesResponse {
    public static final int $stable = 8;
    @SerializedName("max_profiles")
    private final Integer _maxProfiles;
    @SerializedName("profiles")
    private final List<ProfileApiModel> _profiles;

    public AllProfilesResponse() {
        this(null, null, 3, null);
    }

    private final Integer component1() {
        return this._maxProfiles;
    }

    private final List<ProfileApiModel> component2() {
        return this._profiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllProfilesResponse copy$default(AllProfilesResponse allProfilesResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = allProfilesResponse._maxProfiles;
        }
        if ((i & 2) != 0) {
            list = allProfilesResponse._profiles;
        }
        return allProfilesResponse.copy(num, list);
    }

    public final AllProfilesResponse copy(Integer num, List<ProfileApiModel> list) {
        return new AllProfilesResponse(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllProfilesResponse)) {
            return false;
        }
        AllProfilesResponse allProfilesResponse = (AllProfilesResponse) obj;
        if (j.a(this._maxProfiles, allProfilesResponse._maxProfiles) && j.a(this._profiles, allProfilesResponse._profiles)) {
            return true;
        }
        return false;
    }

    public final int getMaxProfilesCount() {
        Integer num = this._maxProfiles;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final List<ProfileApiModel> getProfiles() {
        List<ProfileApiModel> list = this._profiles;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this._maxProfiles;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        List<ProfileApiModel> list = this._profiles;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        Integer num = this._maxProfiles;
        List<ProfileApiModel> list = this._profiles;
        return "AllProfilesResponse(_maxProfiles=" + num + ", _profiles=" + list + ")";
    }

    public AllProfilesResponse(Integer num, List<ProfileApiModel> list) {
        this._maxProfiles = num;
        this._profiles = list;
    }

    public /* synthetic */ AllProfilesResponse(Integer num, List list, int i, e eVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
