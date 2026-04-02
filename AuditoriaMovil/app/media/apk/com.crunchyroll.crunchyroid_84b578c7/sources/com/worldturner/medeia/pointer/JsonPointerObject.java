package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: JsonPointerBuilder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/pointer/JsonPointerObject;", "Lcom/worldturner/medeia/pointer/JsonPointerEntry;", "Lcom/amazon/aps/iva/kb0/q;", "incrementIfNecessary", "incrementOnNextRun", "", "propertyName", "nextProperty", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "toString", "", "stringLength", "Ljava/lang/String;", "getPropertyName", "()Ljava/lang/String;", "setPropertyName", "(Ljava/lang/String;)V", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonPointerObject implements JsonPointerEntry {
    private String propertyName;

    public final String getPropertyName() {
        return this.propertyName;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    /* renamed from: nextProperty */
    public void mo63nextProperty(String str) {
        j.g(str, "propertyName");
        this.propertyName = str;
    }

    public final void setPropertyName(String str) {
        this.propertyName = str;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public int stringLength() {
        String str = this.propertyName;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '~' && charAt != '/') {
                i++;
            } else {
                i += 2;
            }
        }
        return i;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void toString(StringBuilder sb) {
        j.g(sb, "b");
        String str = this.propertyName;
        if (str != null) {
            sb.append('/');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '/') {
                    if (charAt != '~') {
                        sb.append(charAt);
                    } else {
                        sb.append("~0");
                    }
                } else {
                    sb.append("~1");
                }
            }
        }
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void incrementIfNecessary() {
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void incrementOnNextRun() {
    }
}
