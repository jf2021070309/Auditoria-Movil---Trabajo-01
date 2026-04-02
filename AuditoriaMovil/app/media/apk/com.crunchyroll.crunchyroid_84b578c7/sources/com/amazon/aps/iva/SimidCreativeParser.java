package com.amazon.aps.iva;

import com.amazon.aps.iva.types.CreativeData;
import com.amazon.aps.iva.types.SimidCreative;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface SimidCreativeParser {
    Map<String, CreativeData> parse(List<SimidCreative> list);
}
