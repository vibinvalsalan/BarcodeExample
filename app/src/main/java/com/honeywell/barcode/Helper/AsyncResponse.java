package com.honeywell.barcode.Helper;

import com.honeywell.barcode.Response.CMSLabelResponse;

public interface AsyncResponse {
    void processFinish(String output);
    void processFinish(CMSLabelResponse label);
    void processStart();
}
