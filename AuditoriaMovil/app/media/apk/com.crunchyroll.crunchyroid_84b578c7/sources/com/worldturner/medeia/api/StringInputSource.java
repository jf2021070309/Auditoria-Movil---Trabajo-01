package com.worldturner.medeia.api;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.worldturner.medeia.api.InputSource;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import kotlin.Metadata;
/* compiled from: InputSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/api/StringInputSource;", "Lcom/worldturner/medeia/api/InputSource;", "string", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "preference", "Lcom/worldturner/medeia/api/InputPreference;", "getPreference", "()Lcom/worldturner/medeia/api/InputPreference;", "reader", "Ljava/io/Reader;", "getReader", "()Ljava/io/Reader;", "getString", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class StringInputSource implements InputSource {
    private final String name;
    private final String string;

    public StringInputSource(String str) {
        this(str, null, 2, null);
    }

    @Override // com.worldturner.medeia.api.InputSource
    public String getName() {
        return this.name;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputPreference getPreference() {
        return InputPreference.READER;
    }

    @Override // com.worldturner.medeia.api.InputSource
    public Reader getReader() {
        return new StringReader(this.string);
    }

    @Override // com.worldturner.medeia.api.InputSource
    public InputStream getStream() {
        return InputSource.DefaultImpls.getStream(this);
    }

    public final String getString() {
        return this.string;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringInputSource(");
        String name = getName();
        if (name == null) {
            String str = this.string;
            int min = Math.min(str.length(), 40);
            if (str != null) {
                name = str.substring(0, min);
                j.b(name, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new o("null cannot be cast to non-null type java.lang.String");
            }
        }
        sb.append(name);
        sb.append(")");
        String sb2 = sb.toString();
        j.b(sb2, "builder.append(\")\").toString()");
        return sb2;
    }

    public StringInputSource(String str, String str2) {
        j.g(str, "string");
        this.string = str;
        this.name = str2;
    }

    public /* synthetic */ StringInputSource(String str, String str2, int i, e eVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
