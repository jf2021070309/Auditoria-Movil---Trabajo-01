package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class AddressBookAUResultParser extends ResultParser {
    private static String[] matchMultipleValuePrefix(String str, String str2) {
        ArrayList arrayList = null;
        for (int i = 1; i <= 3; i++) {
            String matchSinglePrefixedField = ResultParser.matchSinglePrefixedField(str + i + ':', str2, '\r', true);
            if (matchSinglePrefixedField == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(matchSinglePrefixedField);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(ResultParser.EMPTY_STR_ARRAY);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.contains("MEMORY") && massagedText.contains("\r\n")) {
            String matchSinglePrefixedField = ResultParser.matchSinglePrefixedField("NAME1:", massagedText, '\r', true);
            String matchSinglePrefixedField2 = ResultParser.matchSinglePrefixedField("NAME2:", massagedText, '\r', true);
            String[] matchMultipleValuePrefix = matchMultipleValuePrefix("TEL", massagedText);
            String[] matchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", massagedText);
            String matchSinglePrefixedField3 = ResultParser.matchSinglePrefixedField("MEMORY:", massagedText, '\r', false);
            String matchSinglePrefixedField4 = ResultParser.matchSinglePrefixedField("ADD:", massagedText, '\r', true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(matchSinglePrefixedField), null, matchSinglePrefixedField2, matchMultipleValuePrefix, null, matchMultipleValuePrefix2, null, null, matchSinglePrefixedField3, matchSinglePrefixedField4 != null ? new String[]{matchSinglePrefixedField4} : null, null, null, null, null, null, null);
        }
        return null;
    }
}
