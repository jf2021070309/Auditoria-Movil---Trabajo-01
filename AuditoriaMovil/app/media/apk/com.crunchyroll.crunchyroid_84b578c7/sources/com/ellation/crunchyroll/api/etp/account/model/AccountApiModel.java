package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: AccountApiModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/AccountApiModel;", "Ljava/io/Serializable;", "numeric", "", "guid", "created", "Ljava/util/Date;", Scopes.EMAIL, "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/util/Date;", "getEmail", "()Ljava/lang/String;", "getGuid", "getNumeric", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccountApiModel implements Serializable {
    public static final int $stable = 8;
    @SerializedName("created")
    private final Date created;
    @SerializedName(Scopes.EMAIL)
    private final String email;
    @SerializedName("account_id")
    private final String guid;
    @SerializedName("external_id")
    private final String numeric;
    @SerializedName("phone")
    private final String phoneNumber;

    public AccountApiModel() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AccountApiModel copy$default(AccountApiModel accountApiModel, String str, String str2, Date date, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountApiModel.numeric;
        }
        if ((i & 2) != 0) {
            str2 = accountApiModel.guid;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            date = accountApiModel.created;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            str3 = accountApiModel.email;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = accountApiModel.phoneNumber;
        }
        return accountApiModel.copy(str, str5, date2, str6, str4);
    }

    public final String component1() {
        return this.numeric;
    }

    public final String component2() {
        return this.guid;
    }

    public final Date component3() {
        return this.created;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneNumber;
    }

    public final AccountApiModel copy(String str, String str2, Date date, String str3, String str4) {
        j.f(str, "numeric");
        j.f(str2, "guid");
        j.f(date, "created");
        j.f(str3, Scopes.EMAIL);
        j.f(str4, "phoneNumber");
        return new AccountApiModel(str, str2, date, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountApiModel)) {
            return false;
        }
        AccountApiModel accountApiModel = (AccountApiModel) obj;
        if (j.a(this.numeric, accountApiModel.numeric) && j.a(this.guid, accountApiModel.guid) && j.a(this.created, accountApiModel.created) && j.a(this.email, accountApiModel.email) && j.a(this.phoneNumber, accountApiModel.phoneNumber)) {
            return true;
        }
        return false;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getNumeric() {
        return this.numeric;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int b = a.b(this.guid, this.numeric.hashCode() * 31, 31);
        return this.phoneNumber.hashCode() + a.b(this.email, (this.created.hashCode() + b) * 31, 31);
    }

    public String toString() {
        String str = this.numeric;
        String str2 = this.guid;
        Date date = this.created;
        String str3 = this.email;
        String str4 = this.phoneNumber;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("AccountApiModel(numeric=", str, ", guid=", str2, ", created=");
        b.append(date);
        b.append(", email=");
        b.append(str3);
        b.append(", phoneNumber=");
        return b.c(b, str4, ")");
    }

    public AccountApiModel(String str, String str2, Date date, String str3, String str4) {
        j.f(str, "numeric");
        j.f(str2, "guid");
        j.f(date, "created");
        j.f(str3, Scopes.EMAIL);
        j.f(str4, "phoneNumber");
        this.numeric = str;
        this.guid = str2;
        this.created = date;
        this.email = str3;
        this.phoneNumber = str4;
    }

    public /* synthetic */ AccountApiModel(String str, String str2, Date date, String str3, String str4, int i, e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Date() : date, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
