package com.honeywell.barcode.Helper;

import android.app.Activity;
import android.os.AsyncTask;

import com.honeywell.barcode.Response.CMSLabelResponse;

public class ConnectionTask extends AsyncTask<Void, CMSLabelResponse, CMSLabelResponse> {
    public String hawb;
    public AsyncResponse delegate = null;


    public ConnectionTask(String HAWB,AsyncResponse Delegate){
        this.hawb = HAWB;
        this.delegate =Delegate;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        delegate.processStart();
    }

    @Override
    protected CMSLabelResponse doInBackground(Void... voids) {
        ConnectionManager c = new ConnectionManager();
        CMSLabelResponse cms = c.GetCMSLabelfromServer(hawb);
        return cms;
    }

    @Override
    protected void onPostExecute(CMSLabelResponse cmsLabelResponse) {
        super.onPostExecute(cmsLabelResponse);

        delegate.processFinish(cmsLabelResponse);
    }
}
