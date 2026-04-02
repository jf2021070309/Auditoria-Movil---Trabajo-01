package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CountryCodeProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "", "", "countryCode", "Lcom/amazon/aps/iva/kb0/q;", "updateCountryCode", "", "isUserCountryBrazil", "isUserCountryNewZealand", "getCountryCode", "()Ljava/lang/String;", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CountryCodeProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CountryCodeProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider$Companion;", "", "Lkotlin/Function1;", "", "Lcom/amazon/aps/iva/kb0/q;", "onCountrySet", "Lcom/ellation/crunchyroll/api/etp/auth/CountryCodeProvider;", "create", "<init>", "()V", "api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CountryCodeProvider create(l<? super String, q> lVar) {
            j.f(lVar, "onCountrySet");
            return new CountryCodeProviderImpl(lVar);
        }
    }

    String getCountryCode();

    boolean isUserCountryBrazil();

    boolean isUserCountryNewZealand();

    void updateCountryCode(String str);
}
