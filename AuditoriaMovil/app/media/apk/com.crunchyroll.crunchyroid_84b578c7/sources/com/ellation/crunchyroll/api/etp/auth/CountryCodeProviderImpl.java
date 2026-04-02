package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CountryCodeProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\"\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProviderImpl;", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "", "countryCode", "Lcom/amazon/aps/iva/kb0/q;", "updateCountryCode", "", "isUserCountryBrazil", "isUserCountryNewZealand", "Lkotlin/Function1;", "onCountrySet", "Lcom/amazon/aps/iva/xb0/l;", "<set-?>", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "<init>", "(Lcom/amazon/aps/iva/xb0/l;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CountryCodeProviderImpl implements CountryCodeProvider {
    private String countryCode;
    private final l<String, q> onCountrySet;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryCodeProviderImpl(l<? super String, q> lVar) {
        j.f(lVar, "onCountrySet");
        this.onCountrySet = lVar;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider
    public boolean isUserCountryBrazil() {
        return j.a(getCountryCode(), "BR");
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider
    public boolean isUserCountryNewZealand() {
        return j.a(getCountryCode(), "NZ");
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider
    public void updateCountryCode(String str) {
        this.countryCode = str;
        this.onCountrySet.invoke(str);
    }
}
