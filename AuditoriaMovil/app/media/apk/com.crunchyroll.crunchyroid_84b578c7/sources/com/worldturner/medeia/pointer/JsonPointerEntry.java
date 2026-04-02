package com.worldturner.medeia.pointer;

import kotlin.Metadata;
/* compiled from: JsonPointerBuilder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\bH&J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/pointer/JsonPointerEntry;", "", "", "propertyName", "Lcom/amazon/aps/iva/kb0/q;", "nextProperty", "incrementIfNecessary", "incrementOnNextRun", "", "stringLength", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "toString", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public interface JsonPointerEntry {
    void incrementIfNecessary();

    void incrementOnNextRun();

    /* renamed from: nextProperty */
    void mo63nextProperty(String str);

    int stringLength();

    void toString(StringBuilder sb);
}
