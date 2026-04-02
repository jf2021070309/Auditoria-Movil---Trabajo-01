package com.amazon.aps.iva.qs;

import com.worldturner.medeia.api.JsonSchemaVersion;
import com.worldturner.medeia.api.StringSchemaSource;
import com.worldturner.medeia.api.gson.MedeiaGsonApi;
import java.io.StringReader;
/* compiled from: AppConfigValidatorImpl.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final String b;
    public final MedeiaGsonApi c = new MedeiaGsonApi(false, 1, null);

    public b(String str) {
        this.b = str;
    }

    @Override // com.amazon.aps.iva.qs.a
    public final void d(String str) {
        StringSchemaSource stringSchemaSource = new StringSchemaSource(this.b, JsonSchemaVersion.DRAFT07, null, null, 12, null);
        MedeiaGsonApi medeiaGsonApi = this.c;
        medeiaGsonApi.parseAll(medeiaGsonApi.createJsonReader(medeiaGsonApi.loadSchema(stringSchemaSource), new StringReader(str)));
    }
}
