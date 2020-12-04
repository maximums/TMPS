package com.utm.adapter;

import com.utm.adapter.AdapterUtil;
import com.utm.technique.Technique;

public class TechniqueAdapter extends AdapterUtil {

    private final Technique object;

    public TechniqueAdapter(Technique technique){
        this.object =  technique;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
